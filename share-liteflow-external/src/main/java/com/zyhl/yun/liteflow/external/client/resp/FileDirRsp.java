package com.zyhl.yun.liteflow.external.client.resp;

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
public class FileDirRsp {
    private Long totalSize;
    private Long subDirCount;
    private Long subFileCount;
}
