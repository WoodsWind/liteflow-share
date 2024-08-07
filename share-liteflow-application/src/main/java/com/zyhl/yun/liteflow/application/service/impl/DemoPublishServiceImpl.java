package com.zyhl.yun.liteflow.application.service.impl;

import com.zyhl.yun.liteflow.application.convertor.DemoDTOConvertor;
import com.zyhl.yun.liteflow.application.dto.DemoPublishDTO;
import com.zyhl.yun.liteflow.application.service.DemoPublishService;
import com.zyhl.yun.liteflow.application.vo.DemoPublishVO;
import com.zyhl.yun.liteflow.domain.entity.DemoEntity;
import com.zyhl.yun.liteflow.domain.entity.DemoItemEntity;
import com.zyhl.yun.liteflow.domainservice.InfoPublisher;
import com.zyhl.yun.liteflow.external.service.DemoMessageService;
import com.zyhl.yun.liteflow.external.service.TextCheckService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * TODO (用一句话描述该文件做什么)
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/7/25 11:15
 */
@Service
@Slf4j
public class DemoPublishServiceImpl implements DemoPublishService {

    @Resource
    DemoDTOConvertor dtoConvertor;


    @Resource
    TextCheckService textCheckService;

    @Resource
    InfoPublisher infoPublisher;

    @Resource
    DemoMessageService messageService;

    @Override
    public DemoPublishVO publish(DemoPublishDTO publishDTO) {
        textCheckService.sensitiveTextCheck(Long.valueOf(publishDTO.getAccount()), publishDTO.getContent());
        DemoEntity demoEntity = dtoConvertor.toDemoEntity(publishDTO);
        DemoItemEntity demoItemEntity = dtoConvertor.toDemoItemEntity(publishDTO);
        infoPublisher.publish(demoEntity, demoItemEntity);
        // 推送mq
        messageService.sendPublishMsg(demoEntity);
        return DemoPublishVO.builder().id(demoEntity.getId()).build();
    }
}
