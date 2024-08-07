package com.zyhl.yun.liteflow.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LinkEntity {
    private String linkID;
    private Integer encrypt;
    private String passwd;
    private String url;
    private String linkUrlMin;
    private String lkName;
    private String ctTime;
    private String lastUdTime;
    private String lastAudTime;
    private Integer fNum;
    private Long tolSize;
    private String audRes;
    private String audDesc;
    private Integer linkType;
    private Integer objType;
    private Integer coType;
    private String coSuffix;
    private String desc;
    private Integer pubType;
    private Integer dlTimes;
    private String smallThumbnail;
    private String creator;
    private String owner;
    private String ownerUserId;
    private Integer brwTimes;
    private Integer svTimes;
    private Integer isOutLinkInvalid;
    private String expireTime;
    private String auditResult;
    private Integer isunlimitedTimes;
    private Integer unlimitbrowsetimes;
    private String objectID;
    private String linkCode;
}
