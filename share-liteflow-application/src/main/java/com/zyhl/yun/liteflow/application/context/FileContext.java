package com.zyhl.yun.liteflow.application.context;

import com.zyhl.yun.liteflow.domain.entity.FileEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author 25538
 */
@Data
@Builder
@AllArgsConstructor
public class FileContext {
    private FileEntity fileInfo;
    private List<FileEntity> allFiles;

    public FileContext(){
        fileInfo = FileEntity.builder().build();
    }
    public FileEntity updataFileInfo(FileEntity fileEntity){
        fileInfo = fileEntity;
        return fileInfo;
    }
    public FileEntity setUpdateAt(String updatedAt){
        fileInfo.setUpdatedAt(updatedAt);
        return fileInfo;
    }
}
