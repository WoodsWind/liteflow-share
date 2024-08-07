package com.zyhl.yun.liteflow.application.service.impl;

import com.github.pagehelper.PageHelper;
import com.zyhl.yun.liteflow.application.convertor.DemoDTOConvertor;
import com.zyhl.yun.liteflow.application.dto.DemoQueryDTO;
import com.zyhl.yun.liteflow.application.service.DemoQueryService;
import com.zyhl.yun.liteflow.datahelper.query.DemoItemQueryCommand;
import com.zyhl.yun.liteflow.datahelper.query.DemoQueryCommand;
import com.zyhl.yun.liteflow.datahelper.vo.DemoItemVO;
import com.zyhl.yun.liteflow.datahelper.vo.DemoQueryVO;
import com.zyhl.yun.liteflow.exception.DemoErrorException;
import com.zyhl.yun.liteflow.external.service.DemoPermissionService;
import com.zyhl.yun.liteflow.persistence.mapper.DemoItemMapper;
import com.zyhl.yun.liteflow.persistence.mapper.DemoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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
public class DemoQueryServiceImpl implements DemoQueryService {

    @Resource
    DemoMapper demoMapper;

    @Resource
    DemoItemMapper demoItemMapper;

    @Resource
    DemoPermissionService permissionService;

    @Resource
    DemoDTOConvertor demoDTOConvertor;

    @Override
    public List<DemoQueryVO> queryList(DemoQueryDTO dto) {
        DemoQueryCommand queryCommand = demoDTOConvertor.toDemoQueryCommand(dto);
        checkQueryCommand(queryCommand);
        long getListBeginTime = System.currentTimeMillis();
        List<DemoQueryVO> voList = queryList(queryCommand);
        log.info("查询列表耗时：{}ms", System.currentTimeMillis() - getListBeginTime);
        if (CollectionUtils.isEmpty(voList)) {
            return new ArrayList<>();
        }
        long combineBeginTime = System.currentTimeMillis();
        combineQueryItemList(voList);
        log.info("总耗时：{}ms", System.currentTimeMillis() - combineBeginTime);
        return voList;
    }


    /***
     * 权限校验
     * @param command
     */
    private void checkQueryCommand(DemoQueryCommand command) {
        String account = command.getAccount();
        // 校验参数合法性
        command.validate();
        permissionService.validatePermission(account);

    }

    private List<DemoQueryVO> queryList(DemoQueryCommand queryCommand){
        PageHelper.startPage(queryCommand.getPageNum(), queryCommand.getPageSize());
        return demoMapper.selectListWithPageHelper(queryCommand);
    }


    private void combineQueryItemList(List<DemoQueryVO> voList) {
        try {
            voList.parallelStream().forEach(vo -> {
                DemoItemQueryCommand itemQuery = DemoItemQueryCommand.builder().infoId(vo.getId()).build();
                List<DemoItemVO> itemVOList = demoItemMapper.selectList(itemQuery);
                vo.setItemVos(itemVOList);
            });
        } catch (NullPointerException e) {
            throw new DemoErrorException();
        }
    }
}
