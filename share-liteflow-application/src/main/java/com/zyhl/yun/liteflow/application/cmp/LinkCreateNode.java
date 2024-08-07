package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component("linkCreate")
public class LinkCreateNode extends NodeComponent {
    @Override
    public void process() throws Exception {
        log.info("linkCreateNode");
    }
}
