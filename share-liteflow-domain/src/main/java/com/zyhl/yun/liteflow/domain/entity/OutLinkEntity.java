package com.zyhl.yun.liteflow.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OutLinkEntity {
    private OutLinkSnapshotInfo outLinkSnapshotInfo;
    private OutLinkCaInfo[] outLinkCaInfo;
    private OutLinkCoInfo[] outLinkCoInfo;
}
