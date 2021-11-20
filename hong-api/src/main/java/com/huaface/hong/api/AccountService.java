package com.huaface.hong.api;

import com.huaface.hong.api.model.account.AccountRequest;

/**
 * @author chenhongbo
 */
public interface AccountService {
    Boolean login(AccountRequest request);

    Boolean logout();

    void registerAdminAccount();
}
