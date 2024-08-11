package com.zyhl.yun.liteflow.external.service;

import com.zyhl.yun.liteflow.domain.entity.OutLinkCaInfo;
import com.zyhl.yun.liteflow.domain.entity.OutLinkCoInfo;
import com.zyhl.yun.liteflow.domain.entity.OutLinkEntity;
import com.zyhl.yun.liteflow.domain.entity.OutLinkSnapshotInfo;

/**
 * @author 25538
 */
public interface GetOutLinkService {
    /**
     * 确定外链基本信息
     * @param userDomainId
     * @return
     */
    OutLinkSnapshotInfo getOutLinkInfo(Long userDomainId);

    /**
     * 确定外链的内容信息
     * @param userDomainId
     * @return
     */
    OutLinkCoInfo[] getOutLinkCoInfo(Long userDomainId);

    /**
     * 确定外链的文件夹信息
     * @param userDomainId
     * @return
     */
    OutLinkCaInfo[] getOutLinkCaInfo(Long userDomainId);

    /**
     * 创建外链
     * @param userDomainId
     * @return
     */
    OutLinkEntity getOutLink(Long userDomainId);
}
