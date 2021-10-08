package com.huaface.hong.service;

import com.huaface.hong.api.UserService;
import com.huaface.hong.dao.dataobject.UserDO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.Duration;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final MongoTemplate mongoTemplate;
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public String getUserName(Long id) {
        UserDO userDO = mongoTemplate.findById(id, UserDO.class);
        if (userDO == null) {
            UserDO aDo = new UserDO();
            aDo.setId(id);
            aDo.setName("test测试");
            aDo.setAge(33);
            mongoTemplate.save(aDo);
        }
        UserDO userDO1 = mongoTemplate.findById(id, UserDO.class);
        if (userDO1 != null) {
            redisTemplate.opsForValue().set("test", userDO1, Duration.ofMinutes(60));
            return userDO1.getName();
        }

        return "未发现数据";
    }

//    @Autowired
//    private UserMapper userMapper;

//    private static final BeanCopier copier = BeanCopier.create(UserModel.class, UserDO.class, false);
//
//    public String getUserName(Long id) {
//        UserDO userDO = userMapper.getById(id);
//        return userDO != null ? userDO.getName() : null;
//    }
//
//    public UserModel addUser(UserModel user) {
//        UserDO userDO = new UserDO();
//        copier.copy(user, userDO, null);
//
//        Long id = userMapper.insert(userDO);
//        user.setId(id);
//        return user;
//    }
}
