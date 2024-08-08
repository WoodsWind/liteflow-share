package com.zyhl.yun.liteflow.external.client;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.external.client.req.UserInfoReq;
import com.zyhl.yun.liteflow.external.client.resp.UserInfoRsp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 25538
 */
@FeignClient(name = "user-server")
public interface UserRemoteClient {
    /**
     *获得用户信息
     * @param req
     * @return
     */
    @RequestMapping(value = "/user/getUser", method = RequestMethod.POST)
    BaseResult<UserInfoRsp> userInfo(@RequestBody UserInfoReq req);
}