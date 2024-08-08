package com.zyhl.yun.liteflow.external.service.impl;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.domain.entity.FileEntity;
import com.zyhl.yun.liteflow.external.client.FileRemoteClient;
import com.zyhl.yun.liteflow.external.client.req.FileBatchInfoReq;
import com.zyhl.yun.liteflow.external.client.req.FileDirReq;
import com.zyhl.yun.liteflow.external.client.req.FileInfoReq;
import com.zyhl.yun.liteflow.external.client.req.FileListReq;
import com.zyhl.yun.liteflow.external.client.resp.FileBatchInfoRsp;
import com.zyhl.yun.liteflow.external.client.resp.FileDirRsp;
import com.zyhl.yun.liteflow.external.client.resp.FileInfoRsp;
import com.zyhl.yun.liteflow.external.client.resp.FileListRsp;
import com.zyhl.yun.liteflow.external.dto.SimpleFileInfo;
import com.zyhl.yun.liteflow.domain.entity.FileDirEntity;
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
        BaseResult<FileInfoRsp> fileResult;
        FileEntity file = null;
        try {
            fileResult = fileRemoteClient.fileInfo(fileInfoReq);
            file = fileResult.getData().getData();
        } catch (Exception e) {
            log.error(e.getMessage());
            // throw new Exception;
        }
        return file;
    }

    @Override
    public FileEntity[] queryFileBatchInfo(String[] fileIds) {
        FileBatchInfoReq fileBatchInfoReq = FileBatchInfoReq.builder().fileIds(fileIds).build();
        BaseResult<FileBatchInfoRsp> fileBatchInfoResult;
        FileEntity[] files = null;
        try {
            fileBatchInfoResult = fileRemoteClient.batchGet(fileBatchInfoReq);
            FileBatchInfoRsp fileBatchInfoRsp = fileBatchInfoResult.getData();
            files = fileBatchInfoRsp.getBatchFileResults();

        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return files;
    }

    @Override
    public SimpleFileInfo[] querySimpleFileInfo(String parentFileId) {
        FileListReq fileListReq = FileListReq.builder().parentFileId(parentFileId).build();
        BaseResult<FileListRsp> fileListResult;
        SimpleFileInfo[] files = null;
        try{
            fileListResult = fileRemoteClient.fileList(fileListReq);
            FileListRsp fileListRsp = fileListResult.getData();
            files = fileListRsp.getItems();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return files;
    }

    @Override
    public FileDirEntity queryStatsDir(String fileId) {
        FileDirReq fileDirReq = FileDirReq.builder().fileId(fileId).build();
        BaseResult<FileDirRsp> fileDirResult;
        FileDirEntity dirInfo = null;
        try{
            fileDirResult= fileRemoteClient.fileStatsDir(fileDirReq);
            dirInfo.setTotalSize(fileDirResult.getData().getTotalSize());
            dirInfo.setSubDirCount(fileDirResult.getData().getSubDirCount());
            dirInfo.setSubFileCount(fileDirResult.getData().getSubFileCount());
        } catch (NullPointerException e) {
            log.error(e.getMessage());
        }
        return dirInfo;
    }
}
