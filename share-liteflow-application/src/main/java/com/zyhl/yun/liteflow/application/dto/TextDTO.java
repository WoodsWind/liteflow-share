package com.zyhl.yun.liteflow.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TextDTO {
    private String outLinkTitle;
    private String outLinkDescription;
    private String fileName;
}
