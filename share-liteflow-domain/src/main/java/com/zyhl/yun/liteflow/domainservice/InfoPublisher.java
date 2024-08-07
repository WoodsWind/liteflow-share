package com.zyhl.yun.liteflow.domainservice;

import com.zyhl.yun.liteflow.domain.entity.DemoEntity;
import com.zyhl.yun.liteflow.domain.entity.DemoItemEntity;
import com.zyhl.hcy.commons.enums.CommonResultCode;
import com.zyhl.yun.liteflow.exception.DemoErrorException;
import com.zyhl.yun.liteflow.repository.DemoItemRepository;
import com.zyhl.yun.liteflow.repository.DemoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Copyright © 2022 ChinaMobile Info. Tech Ltd. All rights reserved.
 * <p>
 * TODO (用一句话描述该文件做什么)
 *
 * @author <a href="19802021461@139.com">ZhiFeng.Wu</a>
 * @date 2022/7/25 11:15
 */
@Slf4j
@Service
public class InfoPublisher {

    @Resource
    DemoRepository demoRepository;

    @Resource
    DemoItemRepository demoItemRepository;


    @Transactional(rollbackFor = Exception.class)
    public DemoItemEntity publish(DemoEntity entity, DemoItemEntity itemEntity) {
        DemoItemEntity result = null;
        try {
            saveEntity(entity);
            result = saveItemEntity(itemEntity);
        } catch (Exception e) {
            log.error("publish error, caused by:", e);
            // 手动抛出异常回滚
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            throw new DemoErrorException(CommonResultCode.ERROR_SERVER_INTERNAL);
        }
        return result;
    }


    private DemoEntity saveEntity(DemoEntity entity) {
        entity.setId(1L);
        return demoRepository.insertInfo(entity);
    }

    private DemoItemEntity saveItemEntity(DemoItemEntity itemEntity) {
        itemEntity.setId(1L);
        return demoItemRepository.insertItem(itemEntity);
    }
}
