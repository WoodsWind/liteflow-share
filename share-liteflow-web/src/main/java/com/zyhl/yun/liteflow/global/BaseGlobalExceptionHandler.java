

package com.zyhl.yun.liteflow.global;


import com.zyhl.yun.liteflow.application.base.BaseExceptionResultVO;
import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.hcy.commons.enums.CommonResultCode;
import com.zyhl.yun.liteflow.exception.DemoErrorException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Component;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.validation.ConstraintViolationException;
import java.util.Arrays;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <P>
 * TODO (用一句话描述该文件做什么)
 * @author: <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date: 2022/7/13 10:08
 */
@Slf4j
@Component
@RestControllerAdvice
public class BaseGlobalExceptionHandler {

    /**
     * 处理 Post 请求参数格式错误： @RequestBody 注解的请求参数校验失败后抛出的异常是 MethodArgumentNotValidException
     *
     * @param e MethodArgumentNotValidException
     * @return BaseResult
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public BaseResult<BaseExceptionResultVO> validExceptionHandler (MethodArgumentNotValidException e) {
        log.error(e.getMessage(), e);
        String errorMsg = CommonResultCode. ERROR_PARAMS . getResultMsg ();
        FieldError filedError;
        if ((filedError = e.getBindingResult().getFieldError()) != null) {
            errorMsg = filedError.getDefaultMessage();
        }
        return BaseResult.error(CommonResultCode.ERROR_PARAMS.getResultCode(), errorMsg, null);
    }

    /**
     * 处理 Get 请求参数格式错误： @PathVariable 或 @RequestParam 注解的请求参数校验失败后抛出的异常是 ConstraintViolationException
     *
     * @param e ConstraintViolationException
     * @return BaseResult
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public BaseResult<BaseExceptionResultVO> validExceptionHandler1 (ConstraintViolationException e) {
        String message = e . getMessage ();
        int index = message . indexOf (":");
        if (index > 0) {
            message = message.substring(index + 2);
            log.error(message, e);
            return BaseResult.error(CommonResultCode.ERROR_PARAMS.getResultCode(), message, null);
        }
        log.error(message, e);
        return BaseResult.error(CommonResultCode.ERROR_PARAMS, null);
    }

    /**
     * Http请求的媒体格式相关异常
     *
     * @param e HttpMediaTypeNotSupportedException
     * @return BaseResult
     */
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public BaseResult<BaseExceptionResultVO> handleHttpMediaTypeNotSupportedException (HttpMediaTypeNotSupportedException e) {
        log.error(e.getMessage(), e);
        return BaseResult.error(CommonResultCode.ERROR_MIME_NOT_SUPPORT, null);
    }

    /**
     * Http请求相关异常
     *
     * @param e handleHttpMessageNotReadableException
     * @return BaseResult
     */
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public BaseResult<BaseExceptionResultVO> handleHttpMessageNotReadableException (HttpMessageNotReadableException e) {
        log.error(e.getMessage(), e);
        return BaseResult.error(CommonResultCode.ERROR_PARAMS, null);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
            public BaseResult<BaseExceptionResultVO> handleNoHandlerFoundException (NoHandlerFoundException e) {
        log.error(e.getMessage(), e);
        return BaseResult.error(CommonResultCode.ERROR_NOT_FOUND, null);
    }

    /**
     * 其余异常
     *
     * @param e Exception
     * @return BaseResult
     */
    @ExceptionHandler(Exception.class)
            public BaseResult<BaseExceptionResultVO> handleException (Exception e) {
        log.error(e.getMessage(), e);
        return BaseResult.error(CommonResultCode.ERROR_SERVER_INTERNAL);
    }


    /**
     * 其余异常
     *
     * @param e Exception
     * @return BaseResult
     */
    @ExceptionHandler(DemoErrorException.class)
    public BaseResult<BaseExceptionResultVO> handleDemoErrorException (DemoErrorException e) {
        log.error("业务逻辑, code: {}, msg:{}, stack:{}", e.getCode(), e.getMessage(), Arrays.stream(e.getStackTrace()).findFirst());
        return BaseResult.error(e.getCode(), e.getMessage());
    }
}