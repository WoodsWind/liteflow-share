package com.zyhl.yun.liteflow.external.service;

import com.zyhl.yun.liteflow.domain.entity.FileEntity;
import com.zyhl.yun.liteflow.external.dto.SimpleFileInfo;
import com.zyhl.yun.liteflow.domain.entity.FileDirEntity;

/**
 * @author 25538
 */
public interface FileInfoService {
    /**
     * 查找文件信息
     * @param fileId
     * @return
     */
    FileEntity queryFileInfo(String fileId);

    /**
     * 批量获得文件信息
     * 不超过100个文件
     * @param fileIds
     * @return
     */
    FileEntity[] queryFileBatchInfo(String[] fileIds);

    /**
     * 列举文件
     * @param parentFileId
     * @return
     */
    SimpleFileInfo[] querySimpleFileInfo(String parentFileId);

    /**
     * 统计目录
     * @param fileId
     * @return
     */
    FileDirEntity queryStatsDir(String fileId);

}
