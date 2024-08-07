package com.zyhl.yun.liteflow.external.client;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.external.client.req.DemoSensitiveWordReq;
import com.zyhl.yun.liteflow.external.client.resp.DemoSensitiveWordRsp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * 文件远端请求
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/7/25 10:13
 */
@FeignClient(name = "${yun.external.yun-demo-service.service-name}", url = "${yun.external.yun-demo-service.context-path}")
public interface DemoFileRemoteClient {

	/**
	 * 敏感词校验
	 *
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "/demo/sensitiveText", method = RequestMethod.POST)
	BaseResult<DemoSensitiveWordRsp> sensitiveText(@RequestBody DemoSensitiveWordReq req);

}
