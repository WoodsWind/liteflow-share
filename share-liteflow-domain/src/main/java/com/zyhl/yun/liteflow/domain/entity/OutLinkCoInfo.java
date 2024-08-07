package com.zyhl.yun.liteflow.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * 外链详细信息中的内容信息
 * @author 25538
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutLinkCoInfo {
    private String coID;
    private String coName;
    private Integer coType;
    private String coSuffix;
    private Long coSize;
    private String udTime;
    private String thumbnailURL;
    private String bthumbnailURL;
    private String presentURL;
    private String presentLURL;
    private String presentHURL;
    private Integer safestate;
    private Integer auditResult;
    private Integer flvState;
    private Integer dlTimes;
    private String path;
    private String cdnDownLoadUrl;
    private Integer ifCdn;
    private Map<String, String> extInfo;
    private Integer illegalType;
    private Integer illegalResult;
}
