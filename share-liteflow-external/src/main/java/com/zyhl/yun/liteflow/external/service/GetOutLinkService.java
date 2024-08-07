package com.zyhl.yun.liteflow.external.service;

import com.zyhl.yun.liteflow.domain.entity.OutLinkEntity;

/**
 * @author 25538
 */
public interface GetOutLinkService {
    /**
     * 创建外链
     * @param userDomainId
     * @return
     */
    OutLinkEntity getOutLink(Long userDomainId);
}
