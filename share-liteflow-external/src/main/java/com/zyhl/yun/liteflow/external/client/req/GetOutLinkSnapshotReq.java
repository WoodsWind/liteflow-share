package com.zyhl.yun.liteflow.external.client.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetOutLinkSnapshotReq {
    private String account;
    private Long userDomainId;
    private String linkID;
    private String passwd;
    private String pCaID;
    private Integer caSrt;
    private Integer coSrt;
    private Integer srtDr;
    private Integer bNum;
    private Integer eNum;
    private String linkCode;
}
