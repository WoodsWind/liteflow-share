package com.zyhl.yun.liteflow.external.client;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.external.client.req.FileInfoReq;
import com.zyhl.yun.liteflow.external.client.req.GetOutLinkInfoReq;
import com.zyhl.yun.liteflow.external.client.req.GetOutLinkReq;
import com.zyhl.yun.liteflow.external.client.req.GetOutLinkSnapshotReq;
import com.zyhl.yun.liteflow.external.client.resp.FileInfoRsp;
import com.zyhl.yun.liteflow.external.client.resp.GetOutLinkInfoRes;
import com.zyhl.yun.liteflow.external.client.resp.GetOutLinkRes;
import com.zyhl.yun.liteflow.external.client.resp.GetOutLinkSnapshotRes;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 25538
 */
public interface OutLinkRemoteClient {
    /**
     * 创建外链
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/outlink", method = RequestMethod.POST)
    BaseResult<GetOutLinkRes> outLink(@RequestBody GetOutLinkReq req);

    /**
     * 获取外链概要
     * @param req
     * @return
     */
    @RequestMapping(value = "/outlink/snapshot", method = RequestMethod.POST)
    BaseResult<GetOutLinkSnapshotRes> outLinkInfoSnapshot(@RequestBody GetOutLinkSnapshotReq req);

    /**
     * 获取外链详情
     * @param req
     * @return
     */
    @RequestMapping(value = "/outlink/info", method = RequestMethod.POST)
    BaseResult<GetOutLinkInfoRes> outLinkInfo(@RequestBody GetOutLinkInfoReq req);
}
