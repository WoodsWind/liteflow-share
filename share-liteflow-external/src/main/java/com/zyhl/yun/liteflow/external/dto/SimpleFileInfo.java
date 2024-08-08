package com.zyhl.yun.liteflow.external.dto;

import com.zyhl.yun.liteflow.domain.entity.audit.FileAuditInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimpleFileInfo {
    private String fileId;
    private String parentFileId;
    private String name;
    private String description;
    private String type;
    private String category;
    private String createdAt;
    private String updatedAt;
    private String trashedAt;
    private String starredAt;
    private Boolean starred;
    private Boolean systemDir;
    private FileAuditInfo metadataAuditInfo;
    //private Tag[] userTags;

    /**普通文件专有信息*/
    private String localCreatedAt;
    private String localUpdatedAt;
    private String fileExtension;
    private Long size;
    private String revisionId;
    private FileAuditInfo contentAuditInfo;

    /** private ThumbnailInfo[] thumbnailUrls;
     *  private MediaMetaInfo mediaMetaInfo;
     *  private AddressDetail addressDetail;
     */
}
