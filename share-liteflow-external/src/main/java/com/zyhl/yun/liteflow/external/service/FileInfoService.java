package com.zyhl.yun.liteflow.external.service;

import com.zyhl.yun.liteflow.domain.entity.AssetsEntity;
import com.zyhl.yun.liteflow.domain.entity.FileEntity;

/**
 * @author 25538
 */
public interface FileInfoService {
    FileEntity queryAssetsInfo(String assetsId);
    FileEntity[] queryFileBatchInfo(String[] fileIds);
}
