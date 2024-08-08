package com.zyhl.yun.liteflow.application.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShareWhiteListVO {
    private Long id;
    private Integer type;
    private Integer limitType;
    private String limitValue;
    private String modifier;
    private String  description;
    private String startTime;
    private String endTime;
    private String createTime;
    private String updateTime;
}
