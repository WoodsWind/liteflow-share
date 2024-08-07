package com.zyhl.yun.liteflow.repository.impl;

import com.zyhl.yun.liteflow.domain.entity.DemoEntity;
import com.zyhl.yun.liteflow.persistence.mapper.DemoMapper;
import com.zyhl.yun.liteflow.persistence.po.DemoInfoPO;
import com.zyhl.yun.liteflow.repository.DemoRepository;
import com.zyhl.yun.liteflow.repository.assembler.EntityAssembler;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * TODO (用一句话描述该文件做什么)
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/7/25 18:11
 */
@Repository
public class DemoRepositoryImpl implements DemoRepository {

	@Resource
	DemoMapper demoMapper;

	@Resource
	EntityAssembler assembler;


	@Override
	public DemoEntity insertInfo(DemoEntity demoEntity) {
		DemoInfoPO po = assembler.toDemoInfoPO(demoEntity);
		demoMapper.insertInfo(po);
		return demoEntity;
	}
}
