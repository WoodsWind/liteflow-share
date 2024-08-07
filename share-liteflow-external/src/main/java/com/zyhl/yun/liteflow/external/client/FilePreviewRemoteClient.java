package com.zyhl.yun.liteflow.external.client;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.external.client.req.FileBatchInfoReq;
import com.zyhl.yun.liteflow.external.client.req.FileInfoReq;
import com.zyhl.yun.liteflow.external.client.req.FilePreviewReq;
import com.zyhl.yun.liteflow.external.client.resp.FileBatchInfoRsp;
import com.zyhl.yun.liteflow.external.client.resp.FileInfoRsp;
import com.zyhl.yun.liteflow.external.client.resp.FilePreviewRsp;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface FilePreviewRemoteClient {
    /**
     * 批量获取媒体播放信息
     * @param filePreviewReq
     * @return
     */
    @RequestMapping(value = "/videoPreview/getPreviewInfo", method = RequestMethod.POST)
    BaseResult<FilePreviewRsp> getPreviewInfo(@RequestBody FilePreviewReq filePreviewReq);
}
