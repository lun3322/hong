package com.huaface.hong.dao.repository;

import com.huaface.hong.dao.dataobject.UserDO;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

/**
 * @author chenhongbo
 */
public interface UserRepository extends PagingAndSortingRepository<UserDO, String> {
    Optional<UserDO> findByUserName(String username);
}
