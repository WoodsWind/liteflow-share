package com.zyhl.yun.liteflow.external.controller;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.external.client.req.GetOutLinkInfoReq;
import com.zyhl.yun.liteflow.external.client.req.GetOutLinkReq;
import com.zyhl.yun.liteflow.external.client.req.GetOutLinkSnapshotReq;
import com.zyhl.yun.liteflow.external.client.resp.GetOutLinkInfoRes;
import com.zyhl.yun.liteflow.external.client.resp.GetOutLinkRes;
import com.zyhl.yun.liteflow.external.client.resp.GetOutLinkSnapshotRes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author 25538
 */
@Slf4j
@RestController
@RequestMapping("/yun/outlink")
public class OutLinkInfoController {

    @PostMapping("/get")
    BaseResult<GetOutLinkRes> outLink(@RequestBody GetOutLinkReq req){
        GetOutLinkRes res = new GetOutLinkRes();

        return BaseResult.success(res);
    }


    @PostMapping("/snapshot")
    BaseResult<GetOutLinkSnapshotRes> outLinkInfoSnapshot(@RequestBody GetOutLinkSnapshotReq req){
        GetOutLinkSnapshotRes res = new GetOutLinkSnapshotRes();

        return BaseResult.success(res);
    }


    @PostMapping("/info")
    BaseResult<GetOutLinkInfoRes> outLinkInfo(@RequestBody GetOutLinkInfoReq req){
        GetOutLinkInfoRes res = new GetOutLinkInfoRes();

        return BaseResult.success(res);

    }
}
