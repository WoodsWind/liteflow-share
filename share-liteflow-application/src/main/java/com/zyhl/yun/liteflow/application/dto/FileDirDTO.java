package com.zyhl.yun.liteflow.application.dto;

import com.zyhl.yun.liteflow.domain.entity.FileDirEntity;
import com.zyhl.yun.liteflow.domain.entity.SimpleFileInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 * 一个目录下的全部文件概览
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileDirDTO {

    FileDirEntity fileDirEntity;
}
