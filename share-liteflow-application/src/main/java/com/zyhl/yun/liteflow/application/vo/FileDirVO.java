package com.zyhl.yun.liteflow.application.vo;

import com.zyhl.yun.liteflow.domain.entity.FileDirEntity;
import com.zyhl.yun.liteflow.domain.entity.SimpleFileInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 25538
 * 展示文件目录（一个目录下的全部文件）
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileDirVO {

    private FileDirEntity fileDirEntity;

    /** 本打算直接这么写：
     * private SimpleFileInfo[] simpleFileInfos;
     * 后来发现封装这么写结构应该会更清晰
        private List<SimpleAssetsVO> fileDirVO;
        private Integer totalRecords;
        private Integer currentPage;
        private Integer pageSize;*/
}
