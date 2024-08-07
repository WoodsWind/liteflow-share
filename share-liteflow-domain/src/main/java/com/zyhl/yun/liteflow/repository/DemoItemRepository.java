package com.zyhl.yun.liteflow.repository;

import com.zyhl.yun.liteflow.domain.entity.DemoItemEntity;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 *
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/7/25 10:24
 */
public interface DemoItemRepository {

    /**
     * 内容入库
     * @param itemEn
     * @return
     */
    DemoItemEntity insertItem(DemoItemEntity itemEn);
}
