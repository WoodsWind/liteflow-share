package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeComponent;
import com.zyhl.yun.liteflow.application.context.OprContext;
import com.zyhl.yun.liteflow.application.context.OutLinkContext;
import com.zyhl.yun.liteflow.application.context.UserContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
/**
 * @author 25538
 */
@Slf4j
@Component
public class LinkPermitCheckNode extends NodeComponent {
    @Override
    public void process() throws Exception {
        log.info("Link Permit Check Node");
        UserContext userContext = this.getContextBean(UserContext.class);
        OprContext opContext = this.getContextBean(OprContext.class);
        OutLinkContext linkContext = this.getContextBean(OutLinkContext.class);


    }
}
