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
public class GetOutLinkReq {
    private String account;
    private Long userDomainId;
    private Integer subLinkType;
    private Integer encrypt;
    private String[] coIDLst;
    private String[] caIDLst;
    private Integer pubType;
    private String desc;
    private String[] viewerLst;
    private String dedicatedName;
    private String path;
    private Integer period;
    private Integer periodUnit;
    private Integer isSendSMS;
    private Integer isUnlimitedTimes;
    private Integer passwdAutoFill;
    private Integer filterIllegal;
    private Integer isReturnLinkCode;
    //private String extInfo;
}
