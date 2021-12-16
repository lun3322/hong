package com.huaface.hong.api;

import com.huaface.hong.api.model.account.AccountRequest;

/**
 * @author chenhongbo
 */
public interface AccountService {
    /**
     * 登录
     *
     * @param request
     * @return
     */
    Boolean login(AccountRequest request);

    /**
     * 登录
     *
     * @return
     */
    Boolean logout();

    void registerAdminAccount();
}
