package com.lkx.union.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lkx.union.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName: SysUserDao
 * @Author: KunxianLi
 * @Description: ${description}
 * @Date: 2019/9/17 16:25
 * @Version: 1.0
 */

@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {
}
