package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeComponent;
import com.zyhl.yun.liteflow.application.context.AssetsContext;
import com.zyhl.yun.liteflow.application.context.FileContext;
import com.zyhl.yun.liteflow.domain.entity.FileEntity;
import com.zyhl.yun.liteflow.external.service.FileInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.File;

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
        log.info("\n===Assets Info Node===");
        FileContext fileContext = getContextBean(FileContext.class);
        FileEntity fileEntity = fileInfoService.queryFileInfo(fileContext.getFileInfo().getFileId());
        fileContext.setFileInfo(fileEntity);
        log.info("\n=== 文件信息: ===\nfile id: "+ fileContext.getFileInfo().getFileId() + "\nfile name: "+ fileContext.getFileInfo().getName());
        // get file info
        // display

    }
}
