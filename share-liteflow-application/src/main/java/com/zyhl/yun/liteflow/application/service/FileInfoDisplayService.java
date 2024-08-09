package com.zyhl.yun.liteflow.application.service;

import com.zyhl.yun.liteflow.application.dto.AssetDTO;
import com.zyhl.yun.liteflow.application.vo.AssetVO;
import org.apache.tomcat.jni.FileInfo;

/**
 * @author 25538
 */
public interface FileInfoDisplayService {
    /**
     * 展示文件详情
     * @param assetDTO
     * @return
     */
    AssetVO display(AssetDTO assetDTO);
}
