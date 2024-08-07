package com.zyhl.yun.liteflow.external.client;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.external.client.req.WhiteListReq;
import com.zyhl.yun.liteflow.external.client.resp.WhiteListRsp;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 25538
 */
public interface WhiteListRemoteClient {
    /**
     * 获取白名单
     * @param req
     * @return
     */
    @RequestMapping(value = "/outlink/queryWhiteList", method = RequestMethod.POST)
    BaseResult<WhiteListRsp> whiteList(@RequestBody WhiteListReq req);
}
