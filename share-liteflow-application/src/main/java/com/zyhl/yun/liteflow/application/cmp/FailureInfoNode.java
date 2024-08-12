package com.zyhl.yun.liteflow.application.cmp;

import ch.qos.logback.core.joran.node.ComponentNode;
import com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultNode;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author 25538
 * 具体失败具体通知
 */
@Slf4j
@Component("failInfo")
public class FailureInfoNode extends NodeComponent {
    @Override
    public void process(){
        log.error("创建失败");
    }
}
