package com.zyhl.yun.liteflow.external.client;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.external.client.req.GetOutLinkInfoReq;
import com.zyhl.yun.liteflow.external.client.req.GetOutLinkReq;
import com.zyhl.yun.liteflow.external.client.resp.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 25538
 */
@FeignClient(name = "link-server")
public interface OutLinkRemoteClient {
    /**
     * 创建外链
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/outlink/get", method = RequestMethod.POST)
    BaseResult<GetOutLinkResOne[]> outLink(@RequestBody GetOutLinkReq req);

    /**
     * 获取外链详情
     * @param req
     * @return
     */
    @RequestMapping(value = "/outlink/info", method = RequestMethod.POST)
    BaseResult<GetOutLinkInfoRes> outLinkInfo(@RequestBody GetOutLinkInfoReq req);
}
