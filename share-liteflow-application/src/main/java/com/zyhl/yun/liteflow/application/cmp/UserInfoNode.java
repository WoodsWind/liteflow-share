package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeComponent;
import com.zyhl.yun.liteflow.application.context.UserContext;
import com.zyhl.yun.liteflow.external.service.UserInfoService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("userInfo")
public class UserInfoNode extends NodeComponent {

    @Resource
    UserInfoService userInfoService;

    @Override
    public void process() throws Exception {
        // ForkUserContext context = null;
        // UserDomainEntity target = userInfoService.queryInfo(context.getUserDomain().getPhoneNumber());
        UserContext userContext = getContextBean(UserContext.class);
        System.out.println("phone " + userContext.getUserDomain().getPhoneNumber());
        userContext.change("123456");
        System.out.println("and phone " + userContext.getUserDomain().getPhoneNumber());
    }
}
