package com.zyhl.yun.liteflow.application.service.impl;

import com.zyhl.yun.liteflow.application.convertor.DemoDTOConvertor;
import com.zyhl.yun.liteflow.application.dto.FileDirDTO;
import com.zyhl.yun.liteflow.application.service.FileDirDisplayService;
import com.zyhl.yun.liteflow.application.vo.FileDirVO;
import com.zyhl.yun.liteflow.domain.entity.FileDirEntity;
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
public class FileDirDisplayServiceImpl implements FileDirDisplayService {
    @Resource
    DemoDTOConvertor dtoConvertor;

    @Resource
    DemoMessageService messageService;

    @Override
    public FileDirVO display(FileDirDTO fileDirDTO) {
        FileDirEntity fileDirEntity = dtoConvertor.toFileDirEntity(fileDirDTO);

        return FileDirVO.builder().fileDirEntity(fileDirEntity).build();
    }
}
