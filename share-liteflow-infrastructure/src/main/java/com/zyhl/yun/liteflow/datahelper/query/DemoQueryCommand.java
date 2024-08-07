package com.zyhl.yun.liteflow.datahelper.query;

import cn.hutool.core.util.NumberUtil;
import com.zyhl.hcy.commons.enums.CommonResultCode;
import com.zyhl.yun.liteflow.exception.DemoErrorException;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DemoQueryCommand {

	private Long id;

	private String account;

	private Integer pageNum;

	private Integer pageSize;

	public void validate() {
		if (StringUtils.isBlank(account) || NumberUtil.isNumber(account)) {
			throw new DemoErrorException(CommonResultCode.ERROR_PARAMS);
		}
	}
}
