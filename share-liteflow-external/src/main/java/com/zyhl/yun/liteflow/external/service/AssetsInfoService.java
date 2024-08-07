package com.zyhl.yun.liteflow.external.service;

import com.zyhl.yun.liteflow.domain.entity.AssetsEntity;

public interface AssetsInfoService {
    AssetsEntity queryAssetsInfo(String assetsId);
}
