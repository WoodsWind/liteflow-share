package com.zyhl.yun.liteflow.enums;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <P>
 * 错误码
 * @author  <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date  2022/2/16 16:03
 */
public interface AbstractResultCode {
	/**
	 * 获得错误码
	 * @return
	 */
	String getResultCode();

	/**
	 * 获得错误信息
	 * @return
	 */
	String getResultMsg();
}
