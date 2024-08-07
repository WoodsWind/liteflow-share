package com.zyhl.yun.liteflow.application.context;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通常为外链标题、外链祝福语、心情、文件名称等内容集合，支持复合送审。
 * 基于业务，实现可选内容送审，支持并发调用。
 * @author 25538
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TextContext {
    private String outLinkTitle;
    private String outLinkDescription;
    private String fileName;
}
