package com.zyhl.yun.liteflow.external.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilePreviewItem {
    private String fileId;
    /**文件类别，目前仅支持音频、视频*/
    private String category;
}
