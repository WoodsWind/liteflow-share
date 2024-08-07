package com.zyhl.yun.liteflow.application.context;

import com.zyhl.yun.liteflow.domain.entity.AssetsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 支持批量的资产查询能力，并且能够根据不同的资产内容补充附加信息，比如视频补充播放地址
 * @author 25538
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssetsContext {
    private AssetsEntity assetsEntity;
}
