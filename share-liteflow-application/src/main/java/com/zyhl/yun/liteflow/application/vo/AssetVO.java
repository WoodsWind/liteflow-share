package com.zyhl.yun.liteflow.application.vo;

import com.zyhl.yun.liteflow.domain.entity.FileEntity;
import com.zyhl.yun.liteflow.domain.entity.audit.FileAuditInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author 25538
 * 展示文件详情
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AssetVO {
    private FileEntity fileEntity;
}
