package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeBooleanComponent;
import com.yomahub.liteflow.core.NodeComponent;
import com.zyhl.yun.liteflow.application.context.TextContext;
import com.zyhl.yun.liteflow.application.context.UserContext;
import com.zyhl.yun.liteflow.domain.entity.UserDomainEntity;
import com.zyhl.yun.liteflow.external.service.TextCheckService;
import org.omg.CORBA.UserException;
import org.springframework.stereotype.Component;

@Component("textSensitive")
public class TextSensitiveNode extends NodeBooleanComponent {
    @Override
    public boolean processBoolean() throws Exception {
        System.out.println("TextSensitiveNode");
        UserContext userContext = this.getContextBean(UserContext.class);
        TextContext textContext = this.getContextBean(TextContext.class);
        UserDomainEntity userDomainEntity;
        TextCheckService textCheckService;
        //textCheckService.sensitiveTextCheck();
        return true;
    }
}
