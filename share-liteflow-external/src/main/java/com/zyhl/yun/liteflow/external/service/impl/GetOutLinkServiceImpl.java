package com.zyhl.yun.liteflow.external.service.impl;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.domain.entity.OutLinkCaInfo;
import com.zyhl.yun.liteflow.domain.entity.OutLinkCoInfo;
import com.zyhl.yun.liteflow.domain.entity.OutLinkEntity;
import com.zyhl.yun.liteflow.domain.entity.OutLinkSnapshotInfo;
import com.zyhl.yun.liteflow.external.client.OutLinkRemoteClient;
import com.zyhl.yun.liteflow.external.client.req.GetOutLinkReq;
import com.zyhl.yun.liteflow.external.client.resp.GetOutLinkResOne;
import com.zyhl.yun.liteflow.external.controller.OutLinkInfoController;
import com.zyhl.yun.liteflow.external.service.GetOutLinkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 25538
 */
@Service
@Slf4j
public class GetOutLinkServiceImpl implements GetOutLinkService {

    @Resource
    OutLinkRemoteClient linkRemoteClient;

    @Resource
    OutLinkInfoController outLinkInfoController;

    @Override
    public OutLinkSnapshotInfo getOutLinkInfo(Long userDomainId) {
        return null;
    }

    @Override
    public OutLinkCoInfo[] getOutLinkCoInfo(Long userDomainId) {
        ;
        return new OutLinkCoInfo[m];
    }

    @Override
    public OutLinkCaInfo[] getOutLinkCaInfo(Long userDomainId) {
        return new OutLinkCaInfo[m];
    }

    @Override
    public OutLinkEntity getOutLink(Long account) {
        GetOutLinkReq getOutLinkReq = GetOutLinkReq.builder().userDomainId(account).build();
        BaseResult<GetOutLinkResOne[]> outLinkResult;
        try {
            outLinkResult = outLinkInfoController.outLinkGet(getOutLinkReq);
            //outLinkResult = linkRemoteClient.outLink(getOutLinkReq);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        OutLinkSnapshotInfo outLinkSnapshotInfo = null;
        return outLinkSnapshotInfo;
    }
}