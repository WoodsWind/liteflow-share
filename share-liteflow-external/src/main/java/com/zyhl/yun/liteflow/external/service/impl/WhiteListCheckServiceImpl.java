package com.zyhl.yun.liteflow.external.service.impl;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.domain.entity.UserDomainEntity;
import com.zyhl.yun.liteflow.external.client.WhiteListRemoteClient;
import com.zyhl.yun.liteflow.external.client.req.UserInfoReq;
import com.zyhl.yun.liteflow.external.client.req.WhiteListReq;
import com.zyhl.yun.liteflow.external.client.resp.UserInfoRsp;
import com.zyhl.yun.liteflow.external.client.resp.WhiteListRsp;
import com.zyhl.yun.liteflow.external.client.vo.ShareWhiteListVO;
import com.zyhl.yun.liteflow.external.service.WhiteListCheckService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
@Slf4j
public class WhiteListCheckServiceImpl implements WhiteListCheckService {
    @Resource
    WhiteListRemoteClient whiteListRemoteClient;

    @Override
    public ShareWhiteListVO queryWhiteList(Integer limitType, String limitValue) {
        WhiteListReq whiteListReq = WhiteListReq.builder().limitType(limitType).limitValue(limitValue).build();
        BaseResult<WhiteListRsp> whiteListResult;
        try {
            whiteListResult = whiteListRemoteClient.whiteList(whiteListReq);
        } catch (Exception e) {
            log.error(e.getMessage());
            // throw new Exception;
        }
        ShareWhiteListVO shareWhiteListVO = new ShareWhiteListVO();
        return shareWhiteListVO;
    }
}
