package com.zyhl.yun.liteflow.external.service;

import com.zyhl.yun.liteflow.domain.entity.FileEntity;

/**
 * @author 25538
 */
public interface FileInfoService {
    /**
     * 查找文件信息
     * @param assetsId
     * @return
     */
    FileEntity queryFileInfo(String assetsId);

    /**
     * 批量获得文件信息
     * @param fileIds
     * @return
     */
    FileEntity[] queryFileBatchInfo(String[] fileIds);
}
