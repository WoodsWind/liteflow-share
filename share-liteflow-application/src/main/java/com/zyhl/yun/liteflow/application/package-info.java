/**
 * Copyright © 2021 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * TODO (用一句话描述该文件做什么)
 *
 * @author: <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date: 2021/11/9 10:27
 */
package com.zyhl.yun.liteflow.application;

/****
 * application模块定义原则
 * 1、事务性操作放于此层
 * 2、只做业务流程的封装，不处理具体的业务逻辑
 * 3、入参为Command，出参为VO
 * 5、application不做任何决策（也就是不要写 if/else）, 除非仅仅是运行中断条件。把所有决策交给DomainService或 Entity，把跟外部交互的交给External接口
 * 6、不要有任何计算，计算都应放在 Entity 里
 * 7、不统一捕捉异常，可以随意抛异常。
 * 8、此处进行entity对象的组装。且repository、external的操作都放于此处，获取到相关内容后，再通过组装entity，将具体业务逻辑放于domain层
 */

