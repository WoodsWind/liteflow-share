package com.zyhl.yun.liteflow.controller;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.external.client.req.UserInfoReq;
import com.zyhl.yun.liteflow.external.client.resp.UserInfoRsp;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/yun/user")
public class UserInfoController {

    @PostMapping("/getUser")
    public BaseResult<String> getUser(@RequestBody @Validated UserInfoReq req) {
        String rsp = "这是一个回复";
        return BaseResult.success(rsp);
    }
}
