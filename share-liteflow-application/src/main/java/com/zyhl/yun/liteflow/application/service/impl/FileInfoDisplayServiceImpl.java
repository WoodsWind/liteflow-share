package com.zyhl.yun.liteflow.application.service.impl;

import com.zyhl.yun.liteflow.application.convertor.DemoDTOConvertor;
import com.zyhl.yun.liteflow.application.dto.AssetDTO;
import com.zyhl.yun.liteflow.application.dto.FileDirDTO;
import com.zyhl.yun.liteflow.application.service.FileInfoDisplayService;
import com.zyhl.yun.liteflow.application.vo.AssetVO;
import com.zyhl.yun.liteflow.application.vo.DemoPublishVO;
import com.zyhl.yun.liteflow.application.vo.FileDirVO;
import com.zyhl.yun.liteflow.domain.entity.FileEntity;
import com.zyhl.yun.liteflow.external.service.DemoMessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 25538
 */
@Service
@Slf4j
public class FileInfoDisplayServiceImpl implements FileInfoDisplayService {
    @Resource
    DemoDTOConvertor dtoConvertor;

    @Resource
    DemoMessageService messageService;

    @Override
    public AssetVO display(AssetDTO assetDTO) {
        FileEntity fileEntity = dtoConvertor.toFileEntity(assetDTO);
        // 推送mq
        // messageService.sendPublishMsg(fileEntity);
        return AssetVO.builder().fileEntity(fileEntity).build();
    }
}
