package com.zyhl.yun.liteflow.repository.assembler;

import com.zyhl.yun.liteflow.domain.entity.DemoEntity;
import com.zyhl.yun.liteflow.domain.entity.DemoItemEntity;
import com.zyhl.yun.liteflow.persistence.po.DemoInfoPO;
import com.zyhl.yun.liteflow.persistence.po.DemoItemPO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 *
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/7/25 10:24
 */
@Mapper(componentModel = "spring")
public interface EntityAssembler {

    DemoInfoPO toDemoInfoPO(DemoEntity demoEntity);

    DemoItemPO toDemoItemPO(DemoItemEntity itemEntity);
}
