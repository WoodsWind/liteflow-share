package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeBooleanComponent;
import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

@Component("assetsValidate")
public class AssetsValidateNode extends NodeBooleanComponent {

    @Override
    public boolean processBoolean() throws Exception {
        // 检查文件的状态
        return true;
    }
}
