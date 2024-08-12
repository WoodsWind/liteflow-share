package com.zyhl.yun.liteflow.external.service.impl;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.conventor.CaIDLstConventor;
import com.zyhl.yun.liteflow.conventor.CoIDLstConvertor;
import com.zyhl.yun.liteflow.domain.entity.OutLinkCaInfo;
import com.zyhl.yun.liteflow.domain.entity.OutLinkCoInfo;
import com.zyhl.yun.liteflow.domain.entity.OutLinkEntity;
import com.zyhl.yun.liteflow.domain.entity.OutLinkSnapshotInfo;
import com.zyhl.yun.liteflow.external.client.OutLinkRemoteClient;
import com.zyhl.yun.liteflow.external.client.req.GetOutLinkInfoReq;
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

    @Resource
    CoIDLstConvertor coConvertor;

    @Resource
    CaIDLstConventor caConvertor;

    /** 创建外链 */
    @Override
    public OutLinkEntity getOutLink(String account, Long userDomainId, String [] coIDLst, String [] caIDLst) {

        GetOutLinkReq getOutLinkReq = new GetOutLinkReq(account, userDomainId, coIDLst, caIDLst);

        BaseResult<GetOutLinkResOne[]> outLinkResult;
        OutLinkEntity outLinkEntity = null;
        try {
            GetOutLinkResOne[] res = outLinkInfoController.outLinkGet(getOutLinkReq).getData();
            GetOutLinkResOne outLinkResOne = res[0];

            OutLinkSnapshotInfo snapshotInfo = OutLinkSnapshotInfo.builder().linkID(outLinkResOne.getLinkID()).url(outLinkResOne.getLinkUrl()).build();
            OutLinkCaInfo[] caInfos = caConvertor.convertToEntity(caIDLst);
            OutLinkCoInfo[] caoInfos = coConvertor.convertToEntity(coIDLst);

            outLinkEntity = OutLinkEntity.builder().outLinkSnapshotInfo(snapshotInfo).outLinkCaInfo(caInfos).outLinkCoInfo(caoInfos).build();
        }catch (Exception e){
            log.error(e.getMessage());
        }

        return outLinkEntity;
    }

    @Override
    public OutLinkEntity getOutLinkInfo(Long userDomainId, String outLinkId) {
        GetOutLinkInfoReq getOutLinkInfoReq = GetOutLinkInfoReq.builder().userDomainId(userDomainId).linkID(outLinkId).build();
        BaseResult<GetOutLinkResOne[]> outLinkResult;
        try{

        } catch (Exception e){
            log.error(e.getMessage());
        }
        return null;
    }
}