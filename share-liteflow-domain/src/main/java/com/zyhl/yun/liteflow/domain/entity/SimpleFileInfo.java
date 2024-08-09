package com.zyhl.yun.liteflow.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SimpleFileInfo {

    private String fileId;
    private String parentFileId;
    private String name;
    private String type;

    /** simple不了一点。和file一样啊，故重写了一种
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
