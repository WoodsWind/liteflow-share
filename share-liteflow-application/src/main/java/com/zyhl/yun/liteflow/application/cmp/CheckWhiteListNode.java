package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeBooleanComponent;
import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;
import org.springframework.stereotype.Component;

/**
 * @author 25538
 */
@Component("checkWhiteList")
public class CheckWhiteListNode extends NodeBooleanComponent {

    @Override
    public boolean processBoolean() throws Exception {
        return true;
    }
}
