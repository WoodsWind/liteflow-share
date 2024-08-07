

package com.zyhl.yun.liteflow.persistence.config;

import com.github.pagehelper.Page;
import com.github.pagehelper.dialect.AbstractHelperDialect;
import com.github.pagehelper.page.PageAutoDialect;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * 自定义oceanbase分页插件，适配oceanbase
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/2/18 17:50
 */
@Component
public class OceanbaseDialect extends AbstractHelperDialect {

	/**
	 * 注册ImpalaDialect的方言到PageAutoDialect
	 */
	public OceanbaseDialect(){
		PageAutoDialect.registerDialectAlias("mysql",OceanbaseDialect.class);
	}


	public Object processPageParameter(MappedStatement ms, Map<String, Object> paramMap, Page page, BoundSql boundSql, CacheKey pageKey) {
		paramMap.put("First_PageHelper", page.getEndRow());
		paramMap.put("Second_PageHelper", page.getStartRow());
		pageKey.update(page.getEndRow());
		pageKey.update(page.getStartRow());
		this.handleParameter(boundSql, ms, Long.TYPE, Long.TYPE);
		return paramMap;
	}

	public String getPageSql(String sql, Page page, CacheKey pageKey) {
		StringBuilder sqlBuilder = new StringBuilder(sql.length() + 120);
		sqlBuilder.append("SELECT * FROM ( ");
		sqlBuilder.append(" SELECT TMP_PAGE.*, ROWNUM PAGEHELPER_ROW_ID FROM ( \n");
		sqlBuilder.append(sql);
		sqlBuilder.append("\n ) TMP_PAGE)");
		sqlBuilder.append(" WHERE PAGEHELPER_ROW_ID <= ? AND PAGEHELPER_ROW_ID > ?");
		return sqlBuilder.toString();
	}
}