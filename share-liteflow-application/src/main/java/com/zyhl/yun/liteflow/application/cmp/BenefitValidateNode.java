package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeSwitchComponent;
import com.zyhl.yun.liteflow.application.context.OprContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author 25538
 */
@Slf4j
@Component("benefitValidate")
public class BenefitValidateNode extends NodeSwitchComponent {
    //OprContext opr = this.getContextBean(OprContext.class);
    @Override
    public String processSwitch() throws Exception {
        log.info("===Benefit Validate Node===");
        // OprContext 通过行为，对应映射用户的权益项，基于权益项查询会员中心，获取相关权益
        return null;
    }
}
