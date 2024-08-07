package com.zyhl.yun.liteflow.datahelper.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * TODO (用一句话描述该文件做什么)
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/7/25 11:15
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DemoQueryVO {
    private Long id;

    private List<DemoItemVO> itemVos;





}