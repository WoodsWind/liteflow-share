package com.zyhl.yun.liteflow.external.client.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 * 统计目录信息
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FileDirReq {
    private String userId;
    private String fileId;
}
