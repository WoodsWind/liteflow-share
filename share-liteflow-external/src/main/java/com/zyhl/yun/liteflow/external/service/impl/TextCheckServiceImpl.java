package com.zyhl.yun.liteflow.external.service.impl;

import cn.hutool.json.JSONUtil;
import com.zyhl.hcy.commons.enums.CommonResultCode;
import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.enums.DemoErrorCodeEnum;
import com.zyhl.yun.liteflow.exception.DemoErrorException;
import com.zyhl.yun.liteflow.external.client.DemoFileRemoteClient;
import com.zyhl.yun.liteflow.external.client.req.DemoSensitiveWordReq;
import com.zyhl.yun.liteflow.external.client.resp.DemoSensitiveWordRsp;
import com.zyhl.yun.liteflow.external.client.resultcode.ResultCode;
import com.zyhl.yun.liteflow.external.service.TextCheckService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * 敏感词校验
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/7/25 10:13
 */
@Service
@Slf4j
public class TextCheckServiceImpl implements TextCheckService {
   @Resource
   DemoFileRemoteClient fileRemoteClient;

   /***
    * 敏感词校验
    * @param account
    * @param text
    */
   @Override
   public void sensitiveTextCheck(Long account, String text) {
      DemoSensitiveWordReq textReq = DemoSensitiveWordReq.builder().text(text).build();
      BaseResult<DemoSensitiveWordRsp> textResult = null;
      try {
         // 调用校验敏感词接口
         textResult = fileRemoteClient.sensitiveText(textReq);
      } catch (Exception e) {
         log.error("文件服务模块远程调用异常，请求入参：{}, 出参：{}", JSONUtil.parse(textReq), JSONUtil.parse(textResult), e);
         throw new DemoErrorException(CommonResultCode.ERROR_SERVER_INTERNAL);
      }
      if (textResult == null || ResultCode.SENSITIVE_FAILED.equals(textResult.getCode())) {
         log.info("当前发布内容包含敏感词，敏感词校验不通过");
         throw new DemoErrorException(DemoErrorCodeEnum.TEXT_ILLEGAL);
      }
      log.info("发布内容敏感词校验通过");
   }
}
