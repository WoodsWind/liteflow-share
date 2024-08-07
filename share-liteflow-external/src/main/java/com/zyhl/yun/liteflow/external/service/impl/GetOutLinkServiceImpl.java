package com.zyhl.yun.liteflow.external.service.impl;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.domain.entity.OutLinkEntity;
import com.zyhl.yun.liteflow.domain.entity.UserDomainEntity;
import com.zyhl.yun.liteflow.external.client.OutLinkRemoteClient;
import com.zyhl.yun.liteflow.external.client.UserRemoteClient;
import com.zyhl.yun.liteflow.external.client.req.GetOutLinkReq;
import com.zyhl.yun.liteflow.external.client.req.UserInfoReq;
import com.zyhl.yun.liteflow.external.client.resp.GetOutLinkRes;
import com.zyhl.yun.liteflow.external.client.resp.UserInfoRsp;
import com.zyhl.yun.liteflow.external.service.GetOutLinkService;
import com.zyhl.yun.liteflow.external.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class GetOutLinkServiceImpl implements GetOutLinkService {
    @Resource
    OutLinkRemoteClient linkRemoteClient;

    @Override
    public OutLinkEntity getOutLink(Long account) {
        GetOutLinkReq getOutLinkReq = GetOutLinkReq.builder().userDomainId(account).build();
        BaseResult<GetOutLinkRes> outLinkResult = null;
        try {
            outLinkResult = linkRemoteClient.outLinkInfo(getOutLinkReq);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        OutLinkEntity outLinkEntity = null;
        return outLinkEntity;
    }
}