package com.zyhl.yun.liteflow.external.service;

import com.zyhl.yun.liteflow.external.client.vo.ShareWhiteListVO;

public interface WhiteListCheckService {
    ShareWhiteListVO queryWhiteList(Integer limitType, String limitValue);
}
