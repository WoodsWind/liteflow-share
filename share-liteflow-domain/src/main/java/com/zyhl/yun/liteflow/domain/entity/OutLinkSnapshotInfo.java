package com.zyhl.yun.liteflow.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OutLinkSnapshotInfo {
    private String linkID;
    private Integer encrypt;
    private String passwd;
    private String url;
    private String lkName;
    private String ctTime;
    private Integer fNum = 0;
    private Long tolSize = 0L;
    private String audRes = "0";
    private String audDesc;
    private Integer linkType;
    private Integer objType;
    private Integer coType;
    private String coSuffix;
    private String desc;
    private Integer pubType = 1;
    private Integer dlTimes = 0;
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

    public OutLinkSnapshotInfo(String linkID, String url, String lkName, String ctTime) {
        this.linkID = linkID;
        this.url = url;
        this.lkName = lkName;
        this.ctTime = ctTime;
    }

    /**private String linkUrlMin;
     private String lastUdTime;
     private String lastAudTime;*/
}
