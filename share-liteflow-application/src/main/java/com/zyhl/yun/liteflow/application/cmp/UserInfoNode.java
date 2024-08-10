package com.zyhl.yun.liteflow.application.cmp;

import com.yomahub.liteflow.core.NodeComponent;
import com.zyhl.yun.liteflow.application.context.UserContext;
import com.zyhl.yun.liteflow.domain.entity.UserDomainEntity;
import com.zyhl.yun.liteflow.external.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author 25538
 */
@Slf4j
@Component("userInfo")
public class UserInfoNode extends NodeComponent {

    @Resource
    UserInfoService userInfoService;

    @Override
    public void process() throws Exception {
        log.info("===User Info Node===");
        // ForkUserContext context = null;
        UserContext userContext = getContextBean(UserContext.class);
        try(Scanner scanner = new Scanner(System.in)) {
            Integer choice = null;
            Long userId = null;
            String userPhoneNumber = null;
            log.info("0 输入账号\n1 输入手机号");
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                log.error("输入0或1", e);
                scanner.nextLine(); // 清除错误输入
            }
            if (choice != null) {
                if (choice == 0) {
                    // 0为用户账户
                    try {
                        userId = scanner.nextLong();
                    } catch (InputMismatchException e) {
                        log.error("输入一个Long值", e);
                    }
                    userContext.setAccount(userId);
                    log.info("account: {}", userContext.getUserInfo().getUserDomainId());
                    // 获得用户信息
                    UserDomainEntity userInfo = userInfoService.queryUserInfo(userId);
                    userContext.setUserInfo(userInfo);
                } else if (choice == 1) {
                    // 1为用户手机号
                    try {
                        userPhoneNumber = scanner.next();
                    } catch (InputMismatchException e) {
                        /* 格式判断待补充 */
                        log.error("输入电话格式错误", e);
                    }
                    userContext.setPhoneNumber(userPhoneNumber);
                    log.info("phone: {}", userContext.getUserInfo().getPhoneNumber());
                    // 获得用户信息
                    UserDomainEntity userInfo = userInfoService.queryUserInfo(userPhoneNumber);
                    userContext.setUserInfo(userInfo);
                } else {
                    log.error("只能二选一");
                }
            }
        }
    }
}
