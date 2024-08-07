package com.zyhl.yun.liteflow.persistence.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@AllArgsConstructor
@NoArgsConstructor
@TableName("item")
public class DemoItemPO {

	@TableField("id")
	@TableId(value = "id", type = IdType.ASSIGN_ID)
	private Long id;
	@TableField(value = "info_id")
	private Long infoId;
	@TableField(value = "content")
	private String content;

}
