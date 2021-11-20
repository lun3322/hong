package com.huaface.hong.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chen
 */
@RestController
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String index() {
        return "running " + System.getenv("APP_VERSION");
    }
}
