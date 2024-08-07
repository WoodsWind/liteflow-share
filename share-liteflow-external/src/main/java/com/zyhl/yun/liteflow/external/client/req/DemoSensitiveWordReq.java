package com.zyhl.yun.liteflow.external.client.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * 文字合法性校验
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/7/25 10:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DemoSensitiveWordReq {

    /***
     * 要检查的文本
     */
    private String text;

}
