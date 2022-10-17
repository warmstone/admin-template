package com.warmstone.admin.template.service.impl;


import com.warmstone.admin.template.domain.entity.SysUser;
import com.warmstone.admin.template.mapper.SysUserMapper;
import com.warmstone.admin.template.service.AbstractBaseService;
import com.warmstone.admin.template.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author pengshun
 * @date 2022-10-17 21:32
 * @description
 */
@Service
public class SysUserServiceImpl extends AbstractBaseService<SysUserMapper, SysUser> implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

}
