
package com.zyhl.yun.liteflow.config;

import com.zyhl.hcy.plugin.redis.HcyRedisTemplate;
import com.zyhl.hcy.plugin.uidgenerator.UidGenerator;
import com.zyhl.hcy.plugin.uidgenerator.config.UidGeneratorProperties;
import com.zyhl.hcy.plugin.uidgenerator.impl.CachedUidGenerator;
import com.zyhl.hcy.plugin.uidgenerator.worker.WorkerIdAssigner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <P>
 * 用于雪花算法，通过自增位移，保证id唯一
 * @author: <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date: 2022/7/14 16:57
 */
@Slf4j
@Configuration
public class CacheUidGeneratorConfig {

    @Value(value = "${spring.application.name}")
    String applicationName;


    @Bean("demoWorkerIdAssigner")
    @Primary
    public WorkerIdAssigner workerIdAssigner(UidGeneratorProperties uidGeneratorProperties, HcyRedisTemplate hcyRedisTemplate) {
        final int workerBits = uidGeneratorProperties.getWorkerBits();
        final String key = "hcy:plugin:uidgenerator:" + applicationName;

        return new WorkerIdAssigner() {
            @Override
            public long assignWorkerId() {
                long maxWorkId = ~(-1L << workerBits);
                return (hcyRedisTemplate.opsForValue().increment(key) & maxWorkId);
            }
        };
    }

    @Bean
    @DependsOn("demoWorkerIdAssigner")
    @Primary
    UidGenerator uidGenerator(WorkerIdAssigner workerIdAssigner, UidGeneratorProperties uidGeneratorProperties) {
        CachedUidGenerator uidGenerator = new CachedUidGenerator();
        uidGenerator.setEpochStr(uidGeneratorProperties.getEpochStr());
        uidGenerator.setWorkerBits(uidGeneratorProperties.getWorkerBits());
        uidGenerator.setTimeBits(uidGeneratorProperties.getTimeBits());
        uidGenerator.setSeqBits(uidGeneratorProperties.getSeqBits());
        uidGenerator.setPaddingFactor(uidGeneratorProperties.getPaddingFactor());
        uidGenerator.setWorkerIdAssigner(workerIdAssigner);

        try {
            uidGenerator.init();
        } catch (Exception e) {
            log.error("Fail to init UidGenerator: ", e);
        }

        return uidGenerator;
    }
}