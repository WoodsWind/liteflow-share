package com.zyhl.yun.liteflow.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 * 不确定是DTO还是Entity。但标准里这些层是Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileDirEntity {
    SimpleFileInfo[] simpleFileInfos;
    private Long totalSize;
    private Long subDirCount;
    private Long subFileCount;
}
