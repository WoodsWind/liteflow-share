package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;
import com.zyhl.yun.liteflow.application.context.BenefitContext;
import com.zyhl.yun.liteflow.application.context.OprContext;
import com.zyhl.yun.liteflow.application.context.UserContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author 25538
 */
@Slf4j
@Component("benefitValidate")
public class BenefitValidateNode extends NodeComponent {
    @Override
    public void process() throws Exception {
        log.info("===Benefit Validate Node===");
        /** OprContext 通过行为，对应映射用户的权益项，基于权益项查询会员中心，获取相关权益*/
        UserContext userContext = this.getContextBean(UserContext.class);
        OprContext opContext = this.getContextBean(OprContext.class);
        BenefitContext benefitContext = this.getContextBean(BenefitContext.class);

    }
}
