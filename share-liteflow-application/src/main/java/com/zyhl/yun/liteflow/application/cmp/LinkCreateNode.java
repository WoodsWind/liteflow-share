package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

@Component("linkCreate")
public class LinkCreateNode extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("LinkCreateNode");
    }
}
