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
public class FilePreviewInfo {
    private String fileId;
    private String errorCode;
    private String message;
    private Boolean cdnSwitch;
    private Long cdnExpiredAt;

    /** private MediaMetaInfo meta;
     private MediaPreviewInfo previewInfo;
     private List<CdnMediaInfo> cdnMediaInfos;*/
}
