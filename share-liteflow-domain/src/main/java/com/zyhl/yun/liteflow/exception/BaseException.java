package com.zyhl.yun.liteflow.exception;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * 基础业务异常
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/2/28 15:52
 */
public class BaseException extends RuntimeException{

	private final String code;
	private final String message;

	public BaseException(String code, String message) {
		super(message);
		this.code = code;
		this.message = message;
	}

	public BaseException(String code, String message, Throwable e) {
		super(message, e);
		this.code = code;
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

	public String getCode() {
		return this.code;
	}
}
