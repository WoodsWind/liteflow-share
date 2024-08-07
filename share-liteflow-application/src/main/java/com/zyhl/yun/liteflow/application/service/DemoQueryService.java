package com.zyhl.yun.liteflow.application.service;

import com.zyhl.yun.liteflow.application.dto.DemoQueryDTO;
import com.zyhl.yun.liteflow.datahelper.vo.DemoQueryVO;

import java.util.List;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * TODO (用一句话描述该文件做什么)
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/7/25 11:15
 */
public interface DemoQueryService {

    /***
     * 查询列表
     * @param queryDto
     * @return
     */
    List<DemoQueryVO> queryList(DemoQueryDTO queryDto);
}
