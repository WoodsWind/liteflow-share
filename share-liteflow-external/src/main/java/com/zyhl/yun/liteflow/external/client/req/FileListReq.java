package com.zyhl.yun.liteflow.external.client.req;

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
public class FileListReq {
    private String userId;
    private String parentFileId;
    private String orderBy;
    private String orderDirection;
    private String[] imageThumbnailStyleList;
    private String type;
    private String category;
    /**private PageInfo pageInfo; // 分页信息*/
}
