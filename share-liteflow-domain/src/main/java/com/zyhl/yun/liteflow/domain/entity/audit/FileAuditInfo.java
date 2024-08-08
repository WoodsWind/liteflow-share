package com.zyhl.yun.liteflow.domain.entity.audit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileAuditInfo {
    /**
     * Status 0代表未审核，1代表已审核
     */
    private Integer auditStatus;
    private Integer auditLevel;
    private Integer auditResult;
}
