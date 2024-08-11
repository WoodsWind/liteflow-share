package com.zyhl.yun.liteflow.external.controller;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.external.client.req.GetOutLinkInfoReq;
import com.zyhl.yun.liteflow.external.client.req.GetOutLinkReq;
import com.zyhl.yun.liteflow.external.client.req.GetOutLinkSnapshotReq;
import com.zyhl.yun.liteflow.external.client.resp.GetOutLinkInfoRes;
import com.zyhl.yun.liteflow.external.client.resp.GetOutLinkResOne;
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
    public BaseResult<GetOutLinkResOne[]> outLinkGet(@RequestBody GetOutLinkReq req){
        GetOutLinkResOne[] getOutLinkResSet = new GetOutLinkResOne[0];

        return BaseResult.success(getOutLinkResSet);
    }


    @PostMapping("/snapshot")
    public BaseResult<GetOutLinkSnapshotRes> outLinkInfoSnapshot(@RequestBody GetOutLinkSnapshotReq req){
        GetOutLinkSnapshotRes res = new GetOutLinkSnapshotRes();

        return BaseResult.success(res);
    }


    @PostMapping("/info")
    public BaseResult<GetOutLinkInfoRes> outLinkInfo(@RequestBody GetOutLinkInfoReq req){
        GetOutLinkInfoRes res = new GetOutLinkInfoRes();

        return BaseResult.success(res);

    }
}
