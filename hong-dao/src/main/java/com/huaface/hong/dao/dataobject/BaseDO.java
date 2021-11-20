package com.huaface.hong.dao.dataobject;

import java.time.LocalDateTime;

/**
 * @author chenhongbo
 */
public class BaseDO<IDTYPE> {

    /**
     * 状态：1启用、0禁用
     */
    private Integer status = 1;

    /**
     * 是否已删除
     */
    private Boolean isDeleted = false;

    /**
     * 创建者
     */
    private IDTYPE createBy;

    /**
     * 更新者
     */
    private IDTYPE updateBy;

    /**
     * 创建日期
     */
    private LocalDateTime createTime = LocalDateTime.now();

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}
