package com.zyhl.yun.liteflow.domain.entity;


import com.zyhl.yun.liteflow.domain.entity.audit.FileAuditInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileEntity {
    private String fileId;
    private String parentFileId;
    private String name;
    private String description;
    /**类型，枚举值file/folder*/
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

    public FileEntity(String fileId){
        this.fileId = fileId;
    }
    /**
     * private Tag[] userTags;
     * private MediaMetaInfo mediaMetaInfo;
     * private AddressDtail addressDetail;
     * private ThumbnailInfo[] thumbnailUrls;
     */
}
