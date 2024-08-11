package com.zyhl.yun.liteflow.external.controller;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.domain.entity.UserDomainEntity;
import com.zyhl.yun.liteflow.external.client.req.UserInfoReq;
import com.zyhl.yun.liteflow.external.client.resp.UserInfoRsp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/yun/user")
public class UserInfoController {

    @PostMapping("/userGet")
    public BaseResult<UserInfoRsp> userInfo(@RequestBody @Validated UserInfoReq req){
        UserInfoRsp rsp = new UserInfoRsp();
        if ( req.getUserDomainId() == null ){
            rsp.setData(new UserDomainEntity(123456L, req.getPhoneNumber()));
        } else {
            rsp.setData(new UserDomainEntity(req.getUserDomainId(), "P13681954999"));
        }
        return BaseResult.success(rsp);
    }
}
