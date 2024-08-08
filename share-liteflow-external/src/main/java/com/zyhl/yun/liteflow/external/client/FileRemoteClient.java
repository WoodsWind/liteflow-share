package com.zyhl.yun.liteflow.external.client;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.external.client.req.FileBatchInfoReq;
import com.zyhl.yun.liteflow.external.client.req.FileDirReq;
import com.zyhl.yun.liteflow.external.client.req.FileInfoReq;
import com.zyhl.yun.liteflow.external.client.req.FileListReq;
import com.zyhl.yun.liteflow.external.client.resp.FileBatchInfoRsp;
import com.zyhl.yun.liteflow.external.client.resp.FileDirRsp;
import com.zyhl.yun.liteflow.external.client.resp.FileInfoRsp;
import com.zyhl.yun.liteflow.external.client.resp.FileListRsp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 25538
 */
@FeignClient(name = "file-server")
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

    /**
     * 列举文件，应用场景是外链详情
     * @param req
     * @return
     */
    @RequestMapping(value = "/file/list", method = RequestMethod.POST)
    BaseResult<FileListRsp> fileList(@RequestBody FileListReq req);

    /**
     * 统计目录 文件总大小、目录总数、子文件总数
     * @param req
     * @return
     */
    @RequestMapping(value = "/file/statsDir", method = RequestMethod.POST)
    BaseResult<FileDirRsp> fileStatsDir(@RequestBody FileDirReq req);
}

