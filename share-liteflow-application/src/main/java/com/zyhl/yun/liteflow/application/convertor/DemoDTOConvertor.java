package com.zyhl.yun.liteflow.application.convertor;

import com.zyhl.yun.liteflow.application.dto.DemoPublishDTO;
import com.zyhl.yun.liteflow.application.dto.DemoQueryDTO;
import com.zyhl.yun.liteflow.datahelper.query.DemoQueryCommand;
import com.zyhl.yun.liteflow.domain.entity.DemoEntity;
import com.zyhl.yun.liteflow.domain.entity.DemoItemEntity;
import org.mapstruct.Mapper;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/7/25 10:12
 */

@Mapper(componentModel = "spring")
public interface DemoDTOConvertor {

	DemoQueryCommand toDemoQueryCommand(DemoQueryDTO dto);

    DemoEntity toDemoEntity(DemoPublishDTO publishDTO);

    DemoItemEntity toDemoItemEntity(DemoPublishDTO publishDTO);
}