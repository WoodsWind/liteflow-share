package com.zyhl.yun.liteflow.external.client;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.external.client.req.FileInfoReq;
import com.zyhl.yun.liteflow.external.client.resp.FileInfoRsp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 25538
 */
public interface AssetsRemoteClient {

    /**
     * 获得文件信息
     * @param req
     * @return
     */
    @RequestMapping(value = "/file", method = RequestMethod.POST)
    BaseResult<FileInfoRsp> fileInfo(FileInfoReq req);
}
