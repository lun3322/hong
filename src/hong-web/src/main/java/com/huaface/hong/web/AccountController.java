package com.huaface.hong.web;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import com.huaface.hong.api.AccountService;
import com.huaface.hong.api.model.account.AccountRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenhongbo
 */
@RestController
@RequestMapping("api/v1/account")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @PostMapping("login")
    public ResponseEntity<Object> login(@RequestBody AccountRequest request) {
        accountService.login(request);
        SaTokenInfo tokenInfo = StpUtil.getTokenInfo();
        return ResponseEntity.ok(tokenInfo);
    }

    @GetMapping("logout")
    public ResponseEntity<Object> logout() {
        accountService.logout();
        return ResponseEntity.ok().build();
    }
}
