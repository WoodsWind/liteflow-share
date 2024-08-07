package com.zyhl.yun.liteflow.external.client.resp;

import com.zyhl.yun.liteflow.external.client.vo.ShareWhiteListVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WhiteListRsp {
    private String code;
    private String message;
    private boolean success;
    private ShareWhiteListVO data;
}
