package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeComponent;
import com.zyhl.yun.liteflow.application.context.UserContext;
import com.zyhl.yun.liteflow.external.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author 25538
 */
@Slf4j
@Component("userInfo")
public class UserInfoNode extends NodeComponent {

    @Resource
    UserInfoService userInfoService;

    @Override
    public void process() throws Exception {
        // ForkUserContext context = null;
        // UserDomainEntity target = userInfoService.queryInfo(context.getUserDomain().getPhoneNumber());
        log.info("UserInfoNode");
        UserContext userContext = getContextBean(UserContext.class);
        log.info("phone " + userContext.getUserDomain().getPhoneNumber());
        userContext.change("123456");
        log.info("phone " + userContext.getUserDomain().getPhoneNumber());
    }
}
