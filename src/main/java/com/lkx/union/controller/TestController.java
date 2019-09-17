package com.lkx.union.controller;

import com.lkx.union.entity.SysUserEntity;
import com.lkx.union.form.UserForm;
import com.lkx.union.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/testMethod")
    @ApiOperation("测试方法")
    public String test(@RequestBody @Validated UserForm userForm){

        return "ok";
    }

    @GetMapping("/test")
    @ApiOperation("测试方法2")
    public String test2(@RequestParam(value = "用户名",required = false) String username){
        SysUserEntity sysUser = sysUserService.getById(1);
        return sysUser.getSysUserName();
    }
}
