package com.zyhl.yun.liteflow.application.dto;

import com.zyhl.yun.liteflow.domain.entity.FileEntity;
import com.zyhl.yun.liteflow.domain.entity.audit.FileAuditInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 * 一个文件的详细信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssetDTO {
    private FileEntity fileEntity;
}