package com.zyhl.yun.liteflow.application.context;

import com.zyhl.yun.liteflow.domain.entity.OutLinkEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 25538
 */
@Data
@AllArgsConstructor
public class OutLinkContext {
    private OutLinkEntity outLinkEntity;
    public OutLinkContext(){
        outLinkEntity = new OutLinkEntity();
    }
}
