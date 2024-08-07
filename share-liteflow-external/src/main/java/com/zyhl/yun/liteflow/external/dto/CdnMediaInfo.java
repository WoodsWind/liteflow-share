package com.zyhl.yun.liteflow.external.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CdnMediaInfo {
    private String type;
    private String cdnUrl;
}
