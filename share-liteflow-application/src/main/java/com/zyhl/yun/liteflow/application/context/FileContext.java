package com.zyhl.yun.liteflow.application.context;

import com.zyhl.yun.liteflow.domain.entity.FileEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileContext {
    private FileEntity fileInfo;

    public FileEntity updataFileInfo(FileEntity fileEntity){
        fileInfo = fileEntity;
        return fileInfo;
    }
    public FileEntity changeUpdateAt(String updatedAt){
        fileInfo.setUpdatedAt(updatedAt);
        return fileInfo;
    }
}
