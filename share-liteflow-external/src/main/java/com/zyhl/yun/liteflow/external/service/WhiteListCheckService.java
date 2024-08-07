package com.zyhl.yun.liteflow.external.service;

import com.zyhl.yun.liteflow.external.client.vo.ShareWhiteListVO;

/**
 * @author 25538
 */
public interface WhiteListCheckService {
    /**
     * 查询白名单
     * @param limitType
     * @param limitValue
     * @return
     */
    ShareWhiteListVO queryWhiteList(Integer limitType, String limitValue);
}
