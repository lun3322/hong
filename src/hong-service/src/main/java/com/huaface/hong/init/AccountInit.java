package com.huaface.hong.init;

import com.huaface.hong.api.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author chenhongbo
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class AccountInit implements InitializingBean {
    private final AccountService accountService;

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("初始化管理员账号");
        accountService.registerAdminAccount();
    }
}
