package com.zyhl.yun.liteflow.persistence.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyhl.yun.liteflow.datahelper.query.DemoQueryCommand;
import com.zyhl.yun.liteflow.datahelper.vo.DemoQueryVO;
import com.zyhl.yun.liteflow.persistence.po.DemoInfoPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * 数据库操作mapper，尽量使用BaseMapper中的方法
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/7/25 14:29
 */
@Mapper
public interface DemoMapper extends BaseMapper<DemoMapper> {

	List<DemoQueryVO> selectListWithPageHelper(@Param("queryCommand") DemoQueryCommand queryCommand);

	int insertInfo(@Param("infoPo") DemoInfoPO infoPO);
}
