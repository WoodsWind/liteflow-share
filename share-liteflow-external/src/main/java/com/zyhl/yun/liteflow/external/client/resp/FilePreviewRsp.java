package com.zyhl.yun.liteflow.external.client.resp;

import com.zyhl.yun.liteflow.external.dto.FilePreviewInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilePreviewRsp
{
    private FilePreviewInfo[] items;
}
