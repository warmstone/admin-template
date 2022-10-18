package com.warmstone.admin.template.web.controller;

import com.warmstone.admin.template.domain.entity.SysUser;
import com.warmstone.admin.template.service.SysUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author pengshun
 * @date 2022-10-18 19:12
 * @description
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController extends AbstractBaseController <SysUserService, SysUser> {

    @Resource
    private SysUserService service;

    @Override
    public void setService(SysUserService service) {
        this.service = service;
    }

    @Override
    public SysUserService getService() {
        return this.service;
    }
}
