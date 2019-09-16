package com.lkx.union.controller;

import com.lkx.union.form.UserForm;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@Api(tags = "测试类")
public class TestController {

    @GetMapping("/testMethod")
    @ApiOperation("测试方法")
    public String test(@RequestBody @Validated UserForm userForm){

        return "ok";
    }

    @GetMapping("/test")
    @ApiOperation("测试方法2")
    public String test2(@ApiParam("用户名") String username){

        return "ok";
    }
}
