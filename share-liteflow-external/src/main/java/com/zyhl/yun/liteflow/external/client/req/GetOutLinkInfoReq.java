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
public class GetOutLinkInfoReq {
    private String account;
    private Long userDomainId;
    private String linkID;
    private String passwd;
    private String pCaID;
    private Integer caSrt = 0;
    private Integer coSrt = 0;
    private Integer srtDr = 0;
    //private Integer bNum = -1;
    //private Integer eNum;
    private String linkCode;

    public GetOutLinkInfoReq(String pCaID) {
        this.pCaID = pCaID;
    }
}
