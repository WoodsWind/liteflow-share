package com.zyhl.yun.liteflow.external.service.impl;

import com.zyhl.yun.liteflow.enums.DemoErrorCodeEnum;
import com.zyhl.yun.liteflow.exception.DemoErrorException;
import com.zyhl.yun.liteflow.external.service.DemoPermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * 权限校验
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/7/25 10:13
 */
@Slf4j
@Service
public class DemoPermissionServiceImpl implements DemoPermissionService {


    @Override
    public void validatePermission(String account){
        if (! "test".equalsIgnoreCase(account)) {
            throw new DemoErrorException(DemoErrorCodeEnum.ACCOUNT_ILLEGAL);
        }
    }
}
