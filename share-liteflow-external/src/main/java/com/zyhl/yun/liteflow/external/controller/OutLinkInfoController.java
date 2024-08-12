package com.zyhl.yun.liteflow.external.controller;

import com.zyhl.hcy.commons.result.BaseResult;
import com.zyhl.yun.liteflow.domain.entity.OutLinkCaInfo;
import com.zyhl.yun.liteflow.domain.entity.OutLinkCoInfo;
import com.zyhl.yun.liteflow.domain.entity.OutLinkEntity;
import com.zyhl.yun.liteflow.domain.entity.OutLinkSnapshotInfo;
import com.zyhl.yun.liteflow.external.client.req.GetOutLinkInfoReq;
import com.zyhl.yun.liteflow.external.client.req.GetOutLinkReq;
import com.zyhl.yun.liteflow.external.client.resp.GetOutLinkInfoRes;
import com.zyhl.yun.liteflow.external.client.resp.GetOutLinkResOne;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author 25538
 */
@Slf4j
@RestController
@RequestMapping("/yun/outlink")
public class OutLinkInfoController {

    /**
     * 创建外链
     */
    @PostMapping("/get")
    public BaseResult<GetOutLinkResOne[]> outLinkGet(@RequestBody GetOutLinkReq req) {

        String caID = req.getCaIDLst()[0];
        OutLinkCaInfo caInfo = OutLinkCaInfo.builder().caID(caID).build();
        OutLinkCaInfo[] outLinkCaInfo = new OutLinkCaInfo[1];
        outLinkCaInfo[0] = caInfo;

        String colID = req.getCoIDLst()[0];
        OutLinkCoInfo coInfo = OutLinkCoInfo.builder().coID(colID).build();
        OutLinkCoInfo[] outLinkCoInfo = new OutLinkCoInfo[1];
        outLinkCoInfo[0] = coInfo;

        OutLinkSnapshotInfo outLinkSnapshotInfo = OutLinkSnapshotInfo.builder().linkID(req.getUserDomainId()+"-link").lkName("linkName").url("linkUrl").build();

        OutLinkEntity outLinkEntity = new OutLinkEntity(outLinkSnapshotInfo, outLinkCaInfo, outLinkCoInfo);
        log.info("\n创建外链：\n{}", outLinkEntity.toString());
        log.info("\n基本：\n{}", outLinkSnapshotInfo.toString());
        log.info("\n目录：\n{}", outLinkCaInfo[0].toString());
        log.info("\n文件：\n{}", outLinkCoInfo[0].toString());

        log.info("\n\n\noutLinkGet req:{}", req);
        GetOutLinkResOne res = GetOutLinkResOne.builder()
                .objID("obID")
                .passwd("password")
                .linkID(outLinkEntity.getOutLinkSnapshotInfo().getLinkID())
                .linkUrl(outLinkEntity.getOutLinkSnapshotInfo().getUrl())
                .build();
        GetOutLinkResOne[] getOutLinkResSet = new GetOutLinkResOne[1];
        getOutLinkResSet[0] = res;
        return BaseResult.success(getOutLinkResSet);
    }


    /**
     * 获取外链详情
     */
    @PostMapping("/info")
    public BaseResult<GetOutLinkInfoRes> outLinkInfo(@RequestBody GetOutLinkInfoReq req) {

        OutLinkCaInfo[] outLinkCaInfo = new OutLinkCaInfo[1];
        OutLinkCoInfo[] outLinkCoInfo = new OutLinkCoInfo[1];

        GetOutLinkInfoRes res = new GetOutLinkInfoRes(outLinkCaInfo.length + outLinkCaInfo.length, "linkName", "ctTime");

        return BaseResult.success(res);

    }

    private GetOutLinkResOne outLink1 = GetOutLinkResOne.builder()
            .objID("obj001")
            .passwd("password1")
            .linkID("OutLink001")
            .linkUrl("http://example.com/demo/demo1")
            .linkUrlMin("http://example.com/min/min1")
            .linkCode("code1")
            .build();

}