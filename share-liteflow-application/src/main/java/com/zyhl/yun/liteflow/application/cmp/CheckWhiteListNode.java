package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeBooleanComponent;
import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;
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
        return true;
    }
}
