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
public class GetOutLinkSnapshotReq {
    /** 好像不对呢 这个接口来自另一个文档，撞车了**/
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
