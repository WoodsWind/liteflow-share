package com.zyhl.yun.liteflow.external.client;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.external.client.req.FileInfoReq;
import com.zyhl.yun.liteflow.external.client.req.GetOutLinkReq;
import com.zyhl.yun.liteflow.external.client.resp.FileInfoRsp;
import com.zyhl.yun.liteflow.external.client.resp.GetOutLinkRes;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface OutLinkRemoteClient {
    /**
     * 创建外链
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/outlink", method = RequestMethod.POST)
    BaseResult<GetOutLinkRes> outLinkInfo(@RequestBody GetOutLinkReq req);
}
