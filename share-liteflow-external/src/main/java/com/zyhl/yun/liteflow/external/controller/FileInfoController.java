package com.zyhl.yun.liteflow.external.controller;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.conventor.FileEntityConvertor;
import com.zyhl.yun.liteflow.domain.entity.FileEntity;
import com.zyhl.yun.liteflow.domain.entity.SimpleFileInfo;
import com.zyhl.yun.liteflow.external.client.req.*;
import com.zyhl.yun.liteflow.external.client.resp.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 25538
 */
@Slf4j
@RestController
@RequestMapping("/yun/file")
public class FileInfoController {
    /**
     * 获得文件概要信息
     */
    @Resource
    private FileEntityConvertor fileEntityConvertor;

    /**
     * 获得文件信息
     */
    @PostMapping("/get")
    public BaseResult<FileInfoRsp> fileInfo(@RequestBody FileInfoReq req) {

        String fileId = req.getFileId();
        log.info("\n获取文件：{}", fileId);

        FileInfoRsp rsp = new FileInfoRsp();

        if (fileId == "fileA") {
            rsp = new FileInfoRsp(demoFileEntityA);
        } else if (fileId == "folderB") {
            rsp = new FileInfoRsp(demoFileEntityB);
        } else if (fileId == "fileC") {
            rsp = new FileInfoRsp(demoFileEntityC);
        } else {
            log.error("目前仅支持获得三个文件的信息");
        }

        return BaseResult.success(rsp);
    }

    /**
     * 批量获得文件信息
     */
    @PostMapping("/batchGet")
    public BaseResult<FileBatchInfoRsp> batchGet(@RequestBody FileBatchInfoReq req) {

        String[] fileIds = req.getFileIds();
        log.info("\n批量获取文件：{}", Arrays.toString(fileIds));
        log.info("\n目前就批量展示AB两个demo文件");

        FileBatchInfoRsp rsp = new FileBatchInfoRsp();
        List<FileEntity> files = new ArrayList<FileEntity>();
        // for ( FileEntity file : fileEntityList ) { 文件处理操作 }
        files.add(demoFileEntityA);
        files.add(demoFileEntityB);
        rsp.setData(files);

        return BaseResult.success(rsp);
    }

    /**
     * 列举文件，应用场景是外链详情
     */
    @PostMapping(value = "/list")
    public BaseResult<FileListRsp> fileList(@RequestBody FileListReq req) {

        String parentId = req.getParentFileId();
        log.info("\n展示文件夹" + parentId + "下的文件：");

        List<SimpleFileInfo> simpleFiles = new ArrayList<>();

        if (parentId == "/") {
            for (FileEntity demoFile : demoFileEntityList) {
                if(demoFile.getParentFileId()=="/"){
                    simpleFiles.add(fileEntityConvertor.toSimpleFileEntity(demoFile));
                }
            }
        } else if (parentId == "folderB") {
            for (FileEntity demoFile : demoFileEntityList) {
                if(demoFile.getParentFileId()=="folderB"){
                    simpleFiles.add(fileEntityConvertor.toSimpleFileEntity(demoFile));
                }
            }
        } else{
            log.info("\n目前仅支持根目录'/'和文件夹'folderB'");
        }

        FileListRsp rsp = new FileListRsp(simpleFiles);
        return BaseResult.success(rsp);
    }

    /**
     * 统计目录：文件总大小、目录总数、子文件总数
     */
    @PostMapping(value = "/statsDir")
    public BaseResult<FileDirRsp> fileStatsDir(@RequestBody FileDirReq req) {

        Long totalSize = 0L;
        Long subDirCount = 0L;
        Long subFileCount = 0L;

        // 计数操作

        FileDirRsp rsp = FileDirRsp.builder().totalSize(totalSize).subDirCount(subDirCount).subFileCount(subFileCount).build();
        return BaseResult.success(rsp);
    }

    /**
     * 获得当前时间
     * @return
     */
    private static String currentDateTime() {
        return ZonedDateTime.now(ZoneOffset.UTC).toString();
    }

    /**
     * 实例a：a.txt 文件; 实例b：b 文件夹; 实例c：test.json 文件，parent 是 b
     */
    private FileEntity demoFileEntityA = FileEntity.builder()
            .fileId("fileA")
            .parentFileId("/")
            .name("a.txt")
            .type("file")
            .category("doc")
            .description("Example text file")
            .createdAt(currentDateTime())
            .size(1024L)
            .fileExtension("txt")
            .build();

    private FileEntity demoFileEntityB = FileEntity.builder()
            .fileId("folderB")
            .parentFileId("/")
            .name("b")
            .type("folder")
            .category("folder")
            .description("Example folder")
            .createdAt(currentDateTime())
            .build();

    private FileEntity demoFileEntityC = FileEntity.builder()
            .fileId("fileC")
            .parentFileId("folderB")
            .name("test.json")
            .type("file")
            .category("doc")
            .description("Example JSON file")
            .createdAt(currentDateTime())
            .size(2048L)
            .fileExtension("json")
            .build();

    private FileEntity[] demoFileEntityList = {demoFileEntityA, demoFileEntityB, demoFileEntityC};
}
