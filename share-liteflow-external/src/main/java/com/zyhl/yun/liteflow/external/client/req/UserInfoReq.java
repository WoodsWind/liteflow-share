package com.zyhl.yun.liteflow.external.client.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoReq {
    private Long userDomainId;
    private String phoneNumber;
}
