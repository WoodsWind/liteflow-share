package com.zyhl.yun.liteflow.external.client;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.external.client.req.FileBatchInfoReq;
import com.zyhl.yun.liteflow.external.client.req.FileInfoReq;
import com.zyhl.yun.liteflow.external.client.resp.FileBatchInfoRsp;
import com.zyhl.yun.liteflow.external.client.resp.FileInfoRsp;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 25538
 */
public interface FileRemoteClient {
    /**
     * 获得文件信息
     * @param req
     * @return
     */
    @RequestMapping(value = "/file/get", method = RequestMethod.POST)
    BaseResult<FileInfoRsp> fileInfo(@RequestBody FileInfoReq req);

    /**
     * 批量获得文件信息
     * @param req
     * @return
     */
    @RequestMapping(value = "/file/batchGet", method = RequestMethod.POST)
    BaseResult<FileBatchInfoRsp> batchGet(@RequestBody FileBatchInfoReq req);
}

