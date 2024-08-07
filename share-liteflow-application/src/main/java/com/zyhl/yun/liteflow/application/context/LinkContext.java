package com.zyhl.yun.liteflow.application.context;

import com.zyhl.yun.liteflow.domain.entity.OutLinkEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinkContext {
    private OutLinkEntity outLinkEntity;
}
