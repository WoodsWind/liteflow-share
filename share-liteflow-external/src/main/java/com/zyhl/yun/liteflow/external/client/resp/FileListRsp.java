package com.zyhl.yun.liteflow.external.client.resp;

import com.zyhl.yun.liteflow.external.dto.SimpleFileInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileListRsp {
    private SimpleFileInfo[] items;
    /** private String nextPageCursor;*/
}
