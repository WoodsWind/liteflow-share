
package com.zyhl.yun.liteflow.external.client.feignconfig;
import feign.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <P>
 * feign请求配置初始化
 * @author: <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date: 2022/7/15 8:52
 */
@Slf4j
@Configuration
public class FeignConfiguration {

    @Bean
    Logger.Level feignLoggerLevel() {
        //这里记录所有，根据实际情况选择合适的日志level
        return Logger.Level.FULL;
    }
}