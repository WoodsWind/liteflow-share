package com.zyhl.yun.liteflow.application.service;

import com.zyhl.yun.liteflow.application.dto.FileDirDTO;
import com.zyhl.yun.liteflow.application.vo.FileDirVO;

/**
 * @author 25538
 */
public interface FileDirDisplayService {
    /**
     * 获取文件目录列表
     * @param fileDirDTO
     * @return
     */
    FileDirVO display(FileDirDTO fileDirDTO);
}
