package com.zyhl.yun.liteflow.enums;

import com.zyhl.hcy.commons.enums.AbstractResultCode;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * 分享类型
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/2/28 14:56
 */
public enum DemoErrorCodeEnum implements AbstractResultCode {
	/** 默认错误码*/

	TEXT_ILLEGAL("01000001", "内容敏感校验不通过"),
	ACCOUNT_ILLEGAL("01000002", "用户权限校验不通过"),
	;


	private String resultCode;
	private String resultMsg;

	private DemoErrorCodeEnum(String resultCode, String resultMsg) {
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
	}

	@Override
	public String getResultCode() {
		return resultCode;
	}

	@Override
	public String getResultMsg() {
		return resultMsg;
	}
}
