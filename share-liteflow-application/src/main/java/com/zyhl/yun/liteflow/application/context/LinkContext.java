package com.zyhl.yun.liteflow.application.context;

import com.zyhl.yun.liteflow.domain.entity.LinkEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinkContext {
    private LinkEntity linkEntity;
}
