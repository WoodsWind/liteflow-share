package com.zyhl.yun.liteflow.external.client.resp;

import com.zyhl.yun.liteflow.domain.entity.UserDomainEntity;
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
    private UserDomainEntity data;
}
