package com.zyhl.yun.liteflow.view;



import com.zyhl.hcy.commons.result.BaseResult;

import java.util.List;
import java.util.TreeMap;

public class BasePageResult {

	public static BaseResult success(List<? extends Object> list, int pageSize) {
		boolean isLastPage = false;
		if (list.size() < pageSize) {
			isLastPage = true;
		}
		TreeMap<String, Object> map = new TreeMap<>();
		// 是否为最后一页
		map.put("isLastPage", isLastPage);
		// 数据
		map.put("list", list);

		return BaseResult.success(map);
	}

}
