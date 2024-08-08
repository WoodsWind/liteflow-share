package com.zyhl.yun.liteflow.application.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 * 【注意】 这个类是管理端来的，估计还是得删
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutLinkSnapshotVO {
    private String shareCode;
    private String shareAccount;
    private String shareUserId;
    private Integer auditState;
    private String shareChannelID;
    private Integer shareChannel;
    private String shareChannelName;
    private Integer encryptType;
    private Integer pubType;
    private Integer linkType;
    private Integer extraLinkType;
    private String accessCode;
    private String title;
    private String description;
    private Integer unLimitType;
    private String picUrl;
    private String intro;
    private Long browseTimes;
    private Long downloadTimes;
    private Long saveTimes;
    private Integer isValid;
    private String expireTime;
    private String createTime;
    private String updateTime;
    private String objectID;
    private String count;
    private String virtualObjectId;
    private Integer auditStatus;
}
