package com.zyhl.yun.liteflow.external.service;

import com.zyhl.yun.liteflow.domain.entity.DemoEntity;
import com.zyhl.yun.liteflow.domain.entity.DemoItemEntity;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * TODO (用一句话描述该文件做什么)
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/7/25 11:15
 */
public interface DemoMessageService {

    /***
     * 推送消息
     * @param info
     */
    void sendPublishMsg(DemoEntity info);

}
