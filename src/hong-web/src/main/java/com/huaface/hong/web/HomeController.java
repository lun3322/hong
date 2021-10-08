package com.huaface.hong.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class HomeController {
    @GetMapping("index")
    public String hello() {
        return "hello";
    }
}
