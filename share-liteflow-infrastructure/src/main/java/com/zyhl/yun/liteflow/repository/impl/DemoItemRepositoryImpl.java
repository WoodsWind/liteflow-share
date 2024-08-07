package com.zyhl.yun.liteflow.repository.impl;


import com.zyhl.yun.liteflow.domain.entity.DemoItemEntity;
import com.zyhl.yun.liteflow.persistence.mapper.DemoItemMapper;
import com.zyhl.yun.liteflow.persistence.po.DemoItemPO;
import com.zyhl.yun.liteflow.repository.DemoItemRepository;
import com.zyhl.yun.liteflow.repository.assembler.EntityAssembler;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 *
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/7/25 10:24
 */
@Repository
public class DemoItemRepositoryImpl implements DemoItemRepository {

    @Resource
    DemoItemMapper demoItemMapper;

    @Resource
    EntityAssembler entityAssembler;


    @Override
    public DemoItemEntity insertItem(DemoItemEntity itemEntity) {
        DemoItemPO itemPo = entityAssembler.toDemoItemPO(itemEntity);
        demoItemMapper.insertItem(itemPo);
        return itemEntity;
    }
}
