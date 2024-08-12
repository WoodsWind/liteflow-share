package com.zyhl.yun.liteflow.external.service;

import com.zyhl.yun.liteflow.domain.entity.OutLinkCaInfo;
import com.zyhl.yun.liteflow.domain.entity.OutLinkCoInfo;
import com.zyhl.yun.liteflow.domain.entity.OutLinkEntity;
import com.zyhl.yun.liteflow.domain.entity.OutLinkSnapshotInfo;
import com.zyhl.yun.liteflow.external.client.resp.GetOutLinkResOne;

/**
 * @author 25538
 */
public interface GetOutLinkService {

    /**
     * 创建外链
     * @param account
     * @param userDomainId
     * @param coIDLst
     * @param caIDLst
     * @return
     */
    OutLinkEntity getOutLink(String account, Long userDomainId, String [] coIDLst, String [] caIDLst);

    /**
     * 访问外链
     * @param userDomainId
     * @param outLinkId
     * @return
     */
    OutLinkEntity getOutLinkInfo(Long userDomainId, String outLinkId);
}
