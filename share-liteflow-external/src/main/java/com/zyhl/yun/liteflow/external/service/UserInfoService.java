package com.zyhl.yun.liteflow.external.service;

import com.zyhl.yun.liteflow.domain.entity.UserDomainEntity;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * 敏感词校验
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/7/25 10:13
 */
public interface UserInfoService {

   /***
    * 敏感词校验
    * @param account
    * @param content
    */
   UserDomainEntity queryInfo(Long account);
}
