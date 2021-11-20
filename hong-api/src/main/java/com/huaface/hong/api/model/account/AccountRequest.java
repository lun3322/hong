package com.huaface.hong.api.model.account;

import lombok.Data;

/**
 * @author chenhongbo
 */
@Data
public class AccountRequest {
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;

    /**
     * 记住我
     */
    private Boolean rememberMe;
}
