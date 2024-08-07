package com.zyhl.yun.liteflow.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * 实体
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/7/25 14:17
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DemoEntity {

	private Long id;

	private String account;

	private Integer type;
	private Date createTime;

}
