package com.zyhl.yun.liteflow.controller;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.domain.entity.UserDomainEntity;
import com.zyhl.yun.liteflow.external.client.req.UserInfoReq;
import com.zyhl.yun.liteflow.external.client.resp.UserInfoRsp;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @PostMapping("/yun/user/getUser")
    public BaseResult<UserInfoRsp> getUser(@RequestBody @Validated UserInfoReq req) {
        UserInfoRsp rsp = new UserInfoRsp();
        rsp.setData(new UserDomainEntity(111111L,"ccc"));
        return BaseResult.success(rsp);
    }
}
