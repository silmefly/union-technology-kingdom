package com.lkx.union.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

@Data
@ApiModel("用户入参")
public class UserForm {

    @ApiModelProperty(value = "用户名1",required = true)
    private String userName;

    @ApiModelProperty(value = "密码",required = true)
    private String passWard;
}
