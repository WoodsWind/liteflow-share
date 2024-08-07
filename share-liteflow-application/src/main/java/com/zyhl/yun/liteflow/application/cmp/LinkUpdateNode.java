package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

@Component
public class LinkUpdateNode extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("LinkUpdateNode");
    }
}
