package com.zyhl.yun.liteflow.external.service.impl;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.domain.entity.FileEntity;
import com.zyhl.yun.liteflow.external.client.FileRemoteClient;
import com.zyhl.yun.liteflow.external.client.req.FileBatchInfoReq;
import com.zyhl.yun.liteflow.external.client.req.FileInfoReq;
import com.zyhl.yun.liteflow.external.client.req.UserInfoReq;
import com.zyhl.yun.liteflow.external.client.resp.FileBatchInfoRsp;
import com.zyhl.yun.liteflow.external.client.resp.FileInfoRsp;
import com.zyhl.yun.liteflow.external.client.resp.UserInfoRsp;
import com.zyhl.yun.liteflow.external.service.FileInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 25538
 */
@Slf4j
@Service
public class FileInfoServiceImpl implements FileInfoService {

    @Resource
    FileRemoteClient fileRemoteClient;

    @Override
    public FileEntity queryFileInfo(String fileId) {
        FileInfoReq fileInfoReq = FileInfoReq.builder().fileId(fileId).build();
        BaseResult<FileInfoRsp> fileResult = null;
        try{
            fileResult = fileRemoteClient.fileInfo(fileInfoReq);
        } catch (Exception e) {
            log.error(e.getMessage());
            // throw new Exception;
        }
        FileEntity fileEntity = null;
        return fileEntity;

    }

    @Override
    public FileEntity[] queryFileBatchInfo(String[] fileIds) {
        FileBatchInfoReq fileBatchInfoReq = FileBatchInfoReq.builder().fileIds(fileIds).build();
        BaseResult<FileBatchInfoRsp> fileBatchInfoResult = null;
        try{
            fileBatchInfoResult = fileRemoteClient.batchGet(fileBatchInfoReq);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        FileEntity[] fileEntity = null;
        return fileEntity;
    }
}
