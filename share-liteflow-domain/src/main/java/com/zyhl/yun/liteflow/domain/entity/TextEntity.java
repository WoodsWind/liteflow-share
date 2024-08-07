package com.zyhl.yun.liteflow.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通常为外链标题、外链祝福语、心情、文件名称等内容集合
 * ? 需要独立为一类实体吗
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TextEntity {
    private String outLinkTitle;
    private String outLinkDescription;
    private String fileName;
}
