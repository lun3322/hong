package com.huaface.hong.service;

import cn.dev33.satoken.secure.SaSecureUtil;
import cn.dev33.satoken.stp.StpUtil;
import com.huaface.hong.api.AccountService;
import com.huaface.hong.api.model.account.AccountConst;
import com.huaface.hong.api.model.account.AccountRequest;
import com.huaface.hong.dao.dataobject.UserDO;
import com.huaface.hong.dao.repository.UserRepository;
import com.huaface.hong.exception.HongException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author chenhongbo
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class AccountServiceImpl implements AccountService {
    private final UserRepository userRepository;

    @Override
    public Boolean login(AccountRequest request) {
        Optional<UserDO> userDO = userRepository.findByUserName(request.getUsername());
        if (userDO.isEmpty()) {
            throw new HongException("用户不存在");
        }
        UserDO user = userDO.get();
        String sha256 = SaSecureUtil.sha256(request.getPassword());
        if (!sha256.equals(user.getPassword())) {
            throw new HongException("用户名或密码错误");
        }
        StpUtil.login(user.getId());
        return true;
    }

    @Override
    public Boolean logout() {
        StpUtil.logout();
        return true;
    }

    @Override
    public void registerAdminAccount() {
        Optional<UserDO> adminOptional = userRepository.findByUserName(AccountConst.ADMIN_ACCOUNT);
        if (adminOptional.isPresent()) {
            log.info("存在管理员账号");
            return;
        }
        UserDO userDO = UserDO.builder()
                .userName(AccountConst.ADMIN_ACCOUNT)
                .nickName(AccountConst.ADMIN_NICKNAME)
                .password(SaSecureUtil.sha256(AccountConst.ADMIN_PASSWORD))
                .isAdmin(true)
                .build();
        userRepository.save(userDO);
    }
}
