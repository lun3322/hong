package com.huaface.hong.dao.dataobject;

import lombok.Data;

/**
 * @author chenhongbo
 */
@Data
public class RoleDO extends BaseDO<String> {

    /**
     * 角色名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;
}
