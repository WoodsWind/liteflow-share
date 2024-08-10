package com.zyhl.yun.liteflow.domain.entity;

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
public class UserDomainEntity {
    private Long userDomainId;
    private String userServiceType;
    private String phoneNumber;
    private Integer cutoverStatus;
    private Integer belongsPlatform;
    private String bmpUserId;
    private String siteCode;
    private Integer serviceStatus;
    private String  createTime;
    private String updateTime;

    public UserDomainEntity(Long userId, String phone){
        this.userDomainId = userId;
        this.phoneNumber = phone;
    }

    /**
     *  private String nationCode;
     *  private Integer userAssetFlag;
     *  userProfileInfo;
     *  userExtendInfo;
     */
}
