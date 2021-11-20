package com.huaface.hong.dao.dataobject;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Document("users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDO extends BaseDO<String> {
    private String id;
    /**
     * 用户名
     */
    private String userName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 性别 1 男 2 女 3 保密
     */
    private Integer gender = 3;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 头像地址
     */
    private String avatar;

    /**
     * 修改密码的时间
     */
    private LocalDateTime pwdResetTime;

    /**
     * 是否为admin账号
     */
    private Boolean isAdmin = false;
}
