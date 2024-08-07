package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeSwitchComponent;
import com.zyhl.yun.liteflow.application.context.OprContext;
import org.springframework.stereotype.Component;

@Component("benefitValidate")
public class BenefitValidateNode extends NodeSwitchComponent {
    OprContext opr = this.getContextBean(OprContext.class);
    @Override
    public String processSwitch() throws Exception {
        // OprContext 通过行为，对应映射用户的权益项，基于权益项查询会员中心，获取相关权益
        return null;
    }
}
