package com.zyhl.yun.liteflow.external.client.resp;

import cn.hutool.system.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoRsp {
    private UserInfo data;
}
