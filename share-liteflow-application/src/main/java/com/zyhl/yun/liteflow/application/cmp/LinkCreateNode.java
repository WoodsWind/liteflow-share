package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeComponent;
import com.zyhl.yun.liteflow.application.context.AssetsContext;
import com.zyhl.yun.liteflow.application.context.OutLinkContext;
import com.zyhl.yun.liteflow.application.context.UserContext;
import com.zyhl.yun.liteflow.domain.entity.OutLinkEntity;
import com.zyhl.yun.liteflow.domain.entity.UserDomainEntity;
import com.zyhl.yun.liteflow.external.controller.OutLinkInfoController;
import com.zyhl.yun.liteflow.external.service.GetOutLinkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author 25538
 */
@Slf4j
@Component("linkCreate")
public class LinkCreateNode extends NodeComponent {

    @Resource
    private GetOutLinkService getOutLinkService;

    @Override
    public void process() throws Exception {
        log.info("\n===Link Create Node===");
        OutLinkContext linkContext = this.getContextBean(OutLinkContext.class);
        UserContext userContext = this.getContextBean(UserContext.class);
        AssetsContext assetsContext = this.getContextBean(AssetsContext.class);
        //log.info("\n外链初始化：\n{}", linkContext.toString());

        UserDomainEntity userDomainEntity = userContext.getUserInfo();
        String[] caIDLst = assetsContext.getCaIDLst();
        String[] coIDLst = assetsContext.getCoIDLst();

        OutLinkEntity outLinkEntity = getOutLinkService.getOutLink(userDomainEntity.getPhoneNumber(), userDomainEntity.getUserDomainId(), coIDLst, caIDLst);
        log.info("\n" + outLinkEntity.toString());
        // get files to be shared
        // create
    }
}
