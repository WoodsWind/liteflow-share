package com.zyhl.yun.liteflow.controller;

import com.zyhl.yun.liteflow.application.dto.DemoPublishDTO;
import com.zyhl.yun.liteflow.application.dto.DemoQueryDTO;
import com.zyhl.yun.liteflow.application.service.DemoPublishService;
import com.zyhl.yun.liteflow.application.service.DemoQueryService;
import com.zyhl.yun.liteflow.application.vo.DemoPublishVO;
import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.datahelper.vo.DemoQueryVO;
import com.zyhl.yun.liteflow.domain.entity.UserDomainEntity;
import com.zyhl.yun.liteflow.external.client.req.DemoSensitiveWordReq;
import com.zyhl.yun.liteflow.external.client.req.UserInfoReq;
import com.zyhl.yun.liteflow.external.client.resp.DemoSensitiveWordRsp;
import com.zyhl.yun.liteflow.external.client.resp.UserInfoRsp;
import com.zyhl.yun.liteflow.view.BasePageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * TODO (用一句话描述该文件做什么)
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/7/25 11:15
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoPublishService publishService;

    @Resource
    private DemoQueryService queryService;


    @PostMapping("/publish")
    public BaseResult publish(@RequestBody @Validated DemoPublishDTO publishDTO){
        DemoPublishVO vo = publishService.publish(publishDTO);
        return BaseResult.success(vo);
    }


    @PostMapping("/query")
    public BaseResult query(@RequestBody @Validated DemoQueryDTO queryDto){
        List<DemoQueryVO> list = queryService.queryList(queryDto);
        return BasePageResult.success(list, queryDto.getPageSize());
    }


    /***
     * 用于本地feign请求响应，不合规的写法，此处仅做http请求响应服务使用
     * @param req
     * @return
     */
    @Deprecated
    @PostMapping("/sensitiveText")
    public BaseResult<DemoSensitiveWordRsp> sensitiveText(@RequestBody @Validated DemoSensitiveWordReq req){
        DemoSensitiveWordRsp rsp = new DemoSensitiveWordRsp();
        rsp.setDesc("success");
        return BaseResult.success(rsp);
    }

}
