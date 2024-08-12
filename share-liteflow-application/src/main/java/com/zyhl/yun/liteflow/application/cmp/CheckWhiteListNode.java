package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeBooleanComponent;
import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;
import com.zyhl.yun.liteflow.application.context.OprContext;
import com.zyhl.yun.liteflow.application.context.UserContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author 25538
 */
@Slf4j
@Component("checkWhiteList")
public class CheckWhiteListNode extends NodeBooleanComponent {

    @Override
    public boolean processBoolean() throws Exception {
        log.info("===Check White List Node===");
        UserContext userContext = this.getContextBean(UserContext.class);
        OprContext opContext = this.getContextBean(OprContext.class);

        return true;
    }
}
