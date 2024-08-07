package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeComponent;
import com.zyhl.yun.liteflow.application.context.AssetsContext;
import com.zyhl.yun.liteflow.domain.entity.AssetsEntity;
import com.zyhl.yun.liteflow.domain.entity.FileEntity;
import com.zyhl.yun.liteflow.external.service.FileInfoService;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.index.qual.SameLen;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
/**
 * @author 25538
 */
@Slf4j
@Component("assetsInfo")
public class AssetsInfoNode extends NodeComponent {

    @Resource
    private FileInfoService fileInfoService;

    @Override
    public void process() throws Exception {
        AssetsContext assetsContext = null;
        FileEntity assetsEntity = fileInfoService.queryAssetsInfo(assetsContext.getAssetsEntity().getAssetsId());

        log.info("AssetsInfoNode");
    }
}
