package com.zyhl.yun.liteflow.enums;

import lombok.Getter;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <P>
 * 通用错误码
 * <br>
 * 错误码格式
 * <br>
 * [AAAA] [BB] [XX]
 * <br>
 * [应用标识] [功能域] [错误码，从01开始]
 * @author: <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date: 2022/2/16 16:22
 */
public enum CommonResultCode implements AbstractResultCode {
	/**
	 * 成功码 0000
	 */
	SUCCESS("0000", "请求成功"),
	ERROR_PARAMS("99999995", "参数错误"),

	ERROR_NOT_FOUND("99999996", "资源不存在"),

	ERROR_MIME_NOT_SUPPORT("99999997", "请求体媒体格式不支持"),

	UNKNOWN_ERROR("99999998", "未知错误"),
	ERROR_SERVER_INTERNAL("99999999", "服务器响应异常"),
	;



	CommonResultCode(String resultCode, String resultMsg) {
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
	}

	@Getter
	private final String resultCode;

	@Getter
	private final String resultMsg;

}
