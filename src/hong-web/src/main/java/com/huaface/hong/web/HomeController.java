package com.huaface.hong.web;

import com.huaface.hong.api.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
@RequiredArgsConstructor
public class HomeController {
    private final UserService userService;

    @GetMapping("index")
    public String hello() {
        return "hello";
    }

    @GetMapping("mongodb/{id}")
    public String mongodb(@PathVariable String id) {
        return userService.getUserName(id);
    }
}
