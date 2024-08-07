package com.zyhl.yun.liteflow.exception;

import com.zyhl.hcy.commons.enums.AbstractResultCode;
import com.zyhl.hcy.commons.enums.CommonResultCode;
import com.zyhl.yun.liteflow.enums.DemoErrorCodeEnum;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * 动态业务异常
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/2/28 14:08
 */
public class DemoErrorException extends BaseException {

    public DemoErrorException() {
        super(CommonResultCode.UNKNOWN_ERROR.getResultCode(), CommonResultCode.UNKNOWN_ERROR.getResultMsg());
    }

    public DemoErrorException(AbstractResultCode errorCodeEnum) {
        super(errorCodeEnum.getResultCode(), errorCodeEnum.getResultMsg());
    }

    public DemoErrorException(String resultCode, String resultMessage) {
        super(resultCode, resultMessage);
    }
}
