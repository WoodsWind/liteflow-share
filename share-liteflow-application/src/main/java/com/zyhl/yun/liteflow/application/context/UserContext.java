package com.zyhl.yun.liteflow.application.context;

import com.zyhl.yun.liteflow.domain.entity.UserDomainEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserContext {
    private UserDomainEntity userInfo;

    public UserDomainEntity setAccount(Long account) {
        userInfo.setUserDomainId(account);
        return userInfo;
    }
    public UserDomainEntity setPhoneNumber(String phone) {
        userInfo.setPhoneNumber(phone);
        return userInfo;
    }
}
