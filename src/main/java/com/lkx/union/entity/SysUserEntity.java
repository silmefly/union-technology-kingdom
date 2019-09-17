package com.lkx.union.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName: SysUserEntity
 * @Author: KunxianLi
 * @Description: ${description}
 * @Date: 2019/9/17 13:49
 * @Version: 1.0
 */
@Data
@TableName("sys_user")
public class SysUserEntity {

    @TableId(type= IdType.AUTO)
    private Integer id;

    private String sysUserName;

    private String sysPassWord;

}
