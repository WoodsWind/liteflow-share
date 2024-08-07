package com.zyhl.yun.liteflow.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 外链详细信息中的目录信息
 * @author 25538
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutLinkCaInfo {
    private String caID;
    private String caName;
    private String ctTime;
    private String udTime;
    private Integer dlTimes;
    private String path;
    private Integer illegalType;
    private Integer illegalResult;
}
