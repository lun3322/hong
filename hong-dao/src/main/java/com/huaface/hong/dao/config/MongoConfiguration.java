package com.huaface.hong.dao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author chenhongbo
 */
@Configuration
@EnableMongoRepositories("com.huaface.hong.dao.repository")
public class MongoConfiguration {
}
