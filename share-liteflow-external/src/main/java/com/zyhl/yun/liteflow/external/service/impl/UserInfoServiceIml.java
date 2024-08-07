package com.zyhl.yun.liteflow.external.service.impl;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.domain.entity.UserDomainEntity;
import com.zyhl.yun.liteflow.external.client.UserRemoteClient;
import com.zyhl.yun.liteflow.external.client.req.UserInfoReq;
import com.zyhl.yun.liteflow.external.client.resp.UserInfoRsp;
import com.zyhl.yun.liteflow.external.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class UserInfoServiceIml implements UserInfoService {
    @Resource
    UserRemoteClient userRemoteClient;


    @Override
    public UserDomainEntity queryInfo(String account) {
        UserInfoReq userInfoReq = UserInfoReq.builder().userDomainId(account).build();
        BaseResult<UserInfoRsp> userResult = null;
        try {
            userResult = userRemoteClient.userInfo(userInfoReq);
        } catch (Exception e) {
            log.error(e.getMessage());
            // throw new Exception;
        }
        UserDomainEntity userDomainEntity = null;
        return userDomainEntity;
    }
}
