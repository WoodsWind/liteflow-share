package com.zyhl.yun.liteflow.external.service.impl;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.domain.entity.UserDomainEntity;
import com.zyhl.yun.liteflow.external.client.UserRemoteClient;
import com.zyhl.yun.liteflow.external.client.req.UserInfoReq;
import com.zyhl.yun.liteflow.external.client.resp.UserInfoRsp;
import com.zyhl.yun.liteflow.external.controller.UserInfoController;
import com.zyhl.yun.liteflow.external.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 25538
 */
@Service
@Slf4j
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    UserRemoteClient userRemoteClient;

    @Resource
    UserInfoController userInfoController;

    @Override
    public UserDomainEntity queryUserInfo(Long account) {
        UserInfoReq userInfoReq = UserInfoReq.builder().userDomainId(account).build();
        return getUserDomainEntity(userInfoReq);
    }

    @Override
    public UserDomainEntity queryUserInfo(String phoneNumber) {
        UserInfoReq userInfoReq = UserInfoReq.builder().phoneNumber(phoneNumber).build();
        return getUserDomainEntity(userInfoReq);
    }

    /**
     * 通用的请求获得userInfo
     * @param userInfoReq
     * @return
     */
    @Nullable
    private UserDomainEntity getUserDomainEntity(UserInfoReq userInfoReq) {
        BaseResult<UserInfoRsp> userResult;
        UserDomainEntity user = null;
        try {
            userResult = userResult = userInfoController.userInfo(userInfoReq);
            log.info("~~~~~~~~~~~" + userResult.getData().getData() + "~~~~~~~~~~~~");
            user = userResult.getData().getData();
        } catch (Exception e) {
            log.error(e.getMessage());
            // throw new Exception;
        }
        return user;
    }
}
