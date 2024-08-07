package com.zyhl.yun.liteflow.repository;

import com.zyhl.yun.liteflow.domain.entity.DemoEntity;

import java.util.Date;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * TODO (用一句话描述该文件做什么)
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/7/25 11:15
 */
public interface DemoRepository {

    /**
     * 持久化
     * @param demoEntity
     * @return
     */
    DemoEntity insertInfo(DemoEntity demoEntity);
}
