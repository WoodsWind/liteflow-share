package com.zyhl.yun.liteflow.external.client.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建外链响应
 * @author 25538
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetOutLinkResOne {
    private String objID;
    private String passwd;
    private String linkID;
    private String linkUrl;
    private String linkUrlMin;
    private String linkCode;
}
