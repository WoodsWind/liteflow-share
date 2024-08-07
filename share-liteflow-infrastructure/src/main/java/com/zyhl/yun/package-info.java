/**
 * Copyright © 2021 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * TODO (用一句话描述该文件做什么)
 *
 * @author: <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date: 2021/11/9 10:30
 */
package com.zyhl.yun;

/***
 * 基础设施层，数据的持久化、缓存、文件IO操作。
 * PO：数据库持久化对象，与数据库表一一对应。使用mybatis-plus
 * 1、实现domain层的respository，在repository/impl目录中实现数据库具体操作
 * 2、repository层，入参entity/dto，出参可以为entity/dto；不允许返回PO对象
 * 3、datahelper层级，只允许存在查询的操作。用于兼容常用的数据库查询操作。入参为query，出参为vo，属于将application层query和vo，下放至infrastructure层。
 *   为避免出现多次对象转换，此种业务应尽量少。
 *
 */