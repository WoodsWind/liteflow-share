package com.zyhl.yun.liteflow.external.client.resp;

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
public class FileInfoRsp {
    private FileEntity data;
}
