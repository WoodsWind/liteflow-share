package com.zyhl.yun.liteflow.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
