package com.zyhl.yun.liteflow.external.client.req;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author 25538
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetOutLinkReq {
    @NonNull
    private String account;
    @NonNull
    private Long userDomainId;
    private Integer subLinkType;
    private Integer encrypt;
    private String[] coIDLst;
    private String[] caIDLst;
    private Integer pubType = 1;
    private String desc;
    private String[] viewerLst;
    private String dedicatedName;
    private String path;
    private Integer period;
    private Integer periodUnit = 0;
    private Integer isSendSMS;
    private Integer isUnlimitedTimes;
    private Integer passwdAutoFill = 0;
    private Integer filterIllegal;
    private Integer isReturnLinkCode;
    //private String extInfo;

    public GetOutLinkReq(@NonNull String account, @NonNull Long userDomainId, String[] coIDLst, String[] caIDLst) {
        this.account = account;
        this.userDomainId = userDomainId;
        this.coIDLst = coIDLst == null ? new String[0] : coIDLst;
        this.caIDLst = caIDLst == null ? new String[0] : caIDLst;
    }
}
