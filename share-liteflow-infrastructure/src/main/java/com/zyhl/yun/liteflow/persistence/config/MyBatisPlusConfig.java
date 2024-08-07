

package com.zyhl.yun.liteflow.persistence.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Copyright © 2021 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <P>
 * TODO (用一句话描述该文件做什么)
 * @author: <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date: 2021/11/22 9:49
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.zyhl.yun.liteflow.persistence.mapper")
public class MyBatisPlusConfig {

}