package com.zyhl.yun.liteflow.external.service.impl;

import com.zyhl.yun.liteflow.domain.entity.AssetsEntity;
import com.zyhl.yun.liteflow.external.client.FileRemoteClient;
import com.zyhl.yun.liteflow.external.service.AssetsInfoService;

import javax.annotation.Resource;

public class AssetsInfoServiceImpl implements AssetsInfoService {
    AssetsEntity assetsEntity;

    @Resource
    FileRemoteClient fileRemoteClient;

    @Override
    public AssetsEntity queryAssetsInfo(String assetsId) {
        return null;
    }
}
