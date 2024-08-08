package com.zyhl.yun.liteflow.application.dto;

import com.zyhl.yun.liteflow.domain.entity.UserDomainEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 25538
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private UserDomainEntity user;
}
