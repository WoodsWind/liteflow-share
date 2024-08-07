package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeComponent;
import com.zyhl.yun.liteflow.application.context.AssetsContext;
import com.zyhl.yun.liteflow.domain.entity.AssetsEntity;
import com.zyhl.yun.liteflow.external.service.FileInfoService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("assets")
public class AssetsInfoNode extends NodeComponent {

    @Resource
    private FileInfoService fileInfoService;

    @Override
    public void process() throws Exception {
        AssetsContext assetsContext = null;
        AssetsEntity assetsEntity = fileInfoService.queryAssetsInfo(assetsContext.getAssetsEntity().getAssetsId());

        System.out.println("AssetsInfoNode");
    }
}
