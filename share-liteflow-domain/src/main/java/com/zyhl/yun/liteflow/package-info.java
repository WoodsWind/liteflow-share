/**
 * Copyright © 2021 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * TODO (用一句话描述该文件做什么)
 *
 * @author: <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date: 2021/11/9 10:50
 */
package com.zyhl.yun.liteflow;

/***
 /***
 * 1、此处存放具体的领域对象
 * 2、exception目录存放业务exception。domain层的业务，中断条件通过抛出exception结束。
 * 3、Exception往上抛，如application层需要捕捉进行事务操作，则在application层捕捉；如非业务操作，则具体业务exception由web层统一拦截处理
 * 4、其他层级与domain层的交互，必须都通过entity进行。domain层只存在查询需要使用的DTO
 * 5、可以通过依赖反转调用External和Infrastructure层的能力
 */