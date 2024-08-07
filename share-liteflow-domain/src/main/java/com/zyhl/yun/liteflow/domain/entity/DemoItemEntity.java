package com.zyhl.yun.liteflow.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * 圈子动态实体
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/7/25 10:24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DemoItemEntity {

	private Long id;

	private Long infoId;

	private String content;

}
