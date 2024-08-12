package com.zyhl.yun.liteflow.application.context;

import com.zyhl.yun.liteflow.domain.entity.AssetsEntity;
import com.zyhl.yun.liteflow.domain.entity.FileEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 支持批量的资产查询能力，并且能够根据不同的资产内容补充附加信息，比如视频补充播放地址
 * @author 25538
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssetsContext {
    /** 分享的文件 */
    private List<FileEntity> shareFileList;

    public String[] getCaIDLst(){
        List<String> caIDList = new ArrayList<>();
        for (FileEntity file : shareFileList) {
            if(file.getType().equals("folder")){
                caIDList.add(file.getFileId());
            }
        }
        return caIDList.toArray(new String[caIDList.size()]);
    }
    public String[] getCoIDLst(){
        List<String> coIDList = new ArrayList<>();
        for (FileEntity file : shareFileList) {
            if(file.getType().equals("file")){
                coIDList.add(file.getFileId());
            }
        }
        return coIDList.toArray(new String[coIDList.size()]);
    }
}
