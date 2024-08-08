package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeBooleanComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author 25538
 */
@Slf4j
@Component("assetsValidate")
public class AssetsValidateNode extends NodeBooleanComponent {

    @Override
    public boolean processBoolean() throws Exception {
        log.info("===Assets Validate Node===");
        // 检查文件的状态
        return true;
    }
}
