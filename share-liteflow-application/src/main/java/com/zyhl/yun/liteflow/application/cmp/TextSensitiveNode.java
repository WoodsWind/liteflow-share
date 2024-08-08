package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeBooleanComponent;
import com.zyhl.yun.liteflow.application.context.TextContext;
import com.zyhl.yun.liteflow.application.context.UserContext;
import com.zyhl.yun.liteflow.domain.entity.UserDomainEntity;
import com.zyhl.yun.liteflow.external.service.TextCheckService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author 25538
 */
@Slf4j
@Component("textSensitive")
public class TextSensitiveNode extends NodeBooleanComponent {
    @Override
    public boolean processBoolean() throws Exception {
        log.info("textSensitive processBoolean");
        UserContext userContext = this.getContextBean(UserContext.class);
        TextContext textContext = this.getContextBean(TextContext.class);
        UserDomainEntity userDomainEntity = userContext.getUserInfo();
        String checkConent = "Link Title: " + textContext.getOutLinkTitle()+"\n"
                + "Link Description: " + textContext.getOutLinkDescription()+"\n"
                + "File Name: " + textContext.getFileName()+"\n";
        TextCheckService textCheckService = null;
        textCheckService.sensitiveTextCheck(userDomainEntity.getUserDomainId(),checkConent);
        //textCheckService.sensitiveTextCheck();
        return true;
    }
}
