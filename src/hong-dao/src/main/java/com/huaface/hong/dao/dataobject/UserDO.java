package com.huaface.hong.dao.dataobject;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@Data
@Document("users")
public class UserDO {
    private String id;
    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 性别 1 男 2 女 3 保密
     */
    private int gender;

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
    private String isAdmin;

    /**
     * 状态：1启用、0禁用
     */
    private Integer status;

    /**
     * 是否已删除
     */
    private String isDeleted;

    /**
     * 创建者
     */
    private Long createBy;

    /**
     * 更新者
     */
    private Long updateBy;

    /**
     * 创建日期
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}
