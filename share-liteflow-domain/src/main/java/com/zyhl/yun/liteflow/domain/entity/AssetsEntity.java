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
public class AssetsEntity {
    private String assetsId;
    private String assetsName;
    private String assetsPath;
    private String assetsSuffix;
    private Integer assetsContentType;
    private String thumbnailUrl;
    private Integer parentId;
    private String md5;
    private Integer driveId;
    private String  crc64;
    private String shareType;
    private String assetsSource;
    private String createTime;
    private String updateTime;
}
