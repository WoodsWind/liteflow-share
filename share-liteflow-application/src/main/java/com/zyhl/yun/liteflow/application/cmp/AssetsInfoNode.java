package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeComponent;
import com.zyhl.yun.liteflow.application.context.AssetsContext;
import com.zyhl.yun.liteflow.application.context.FileContext;
import com.zyhl.yun.liteflow.domain.entity.FileEntity;
import com.zyhl.yun.liteflow.domain.entity.SimpleFileInfo;
import com.zyhl.yun.liteflow.external.service.FileInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

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

        // get file info
        // display
        String[] fils = {"aa", "bb", "cc"};
        List<FileEntity> fileEntityList = fileInfoService.queryFileBatchInfo(fils);
        fileContext.setAllFiles(fileEntityList);
        log.info("\n=== 全部文件: ===");
        for (FileEntity f : fileEntityList) {
            log.info("\n" + f.getFileId() + ":" + f.getName());
        }

        List<String> fileShareList = new ArrayList<>();
        if (fileEntityList.size() > 50) {
            log.error("分享文件数量不能超过50");
        }
        log.info("\n=== 批量分享: ===");
        AssetsContext assetsContext = getContextBean(AssetsContext.class);
        assetsContext.setShareFileList(fileEntityList);

        /*log.info("\n=== 文件信息: ===" +
                "\nfile id: " + fileContext.getFileInfo().getFileId() +
                "\nfile name: " + fileContext.getFileInfo().getName());*/




        /*log.info("\n=== 列举: ===");
        List<SimpleFileInfo> simpleFiles = fileInfoService.querySimpleFileInfo("/");
        if (simpleFiles == null || simpleFiles.isEmpty()) {
            log.info("\n（空）");
        } else {
            for (SimpleFileInfo f : simpleFiles) {
                log.info("\n" + f.toString());
            }
        }*/

    }
}