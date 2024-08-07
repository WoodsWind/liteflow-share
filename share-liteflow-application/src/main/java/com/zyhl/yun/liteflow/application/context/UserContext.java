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
    private UserDomainEntity userDomain;
    public UserDomainEntity getUserDomain() {
        return userDomain;
    }

    public UserDomainEntity change(String userPhone) {
        userDomain.setPhoneNumber(userPhone);
        return userDomain;
    }

}
