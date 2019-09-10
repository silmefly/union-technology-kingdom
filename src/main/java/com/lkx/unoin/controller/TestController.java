package com.lkx.unoin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Author: KunxianLi
 * @Description: ${description}
 * @Date: 2019/9/4 18:06
 * @Version: 1.0
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/testMethod")
    public String test(){

        return "ok";
    }

}
