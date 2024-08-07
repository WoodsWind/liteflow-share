package com.zyhl.yun.liteflow.domain.entity;


import com.zyhl.yun.liteflow.domain.entity.audit.FileAuditInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileEntity {
    private String fileId;
    private String parentFileId;
    private String name;
    private String description;
    private String type;
    private String category;
    private String createdAt;
    private String updatedAt;
    private String trashedAt;
    private boolean starred;
    private boolean systemDir;
    private FileAuditInfo metadataAuditInfo;
    private Long size;
    private String fileExtension;
    private String localCreatedAt;
    private String localUpdatedAt;
    private String contentHash;
    private String contentHashAlgorithm;
    private String revisionId;
    private FileAuditInfo contentAuditInfo;
    /**
     * private Tag[] userTags;
     * private MediaMetaInfo mediaMetaInfo;
     * private AddressDtail addressDetail;
     * private ThumbnailInfo[] thumbnailUrls;
     */
}
