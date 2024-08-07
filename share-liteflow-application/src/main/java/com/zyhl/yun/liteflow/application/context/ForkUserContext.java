package com.zyhl.yun.liteflow.application.context;

import com.zyhl.yun.liteflow.domain.entity.UserDomainEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ForkUserContext {
    private UserDomainEntity userDomain;

    public void updateDomain(UserDomainEntity user) {
        this.userDomain = user;
    }
}
