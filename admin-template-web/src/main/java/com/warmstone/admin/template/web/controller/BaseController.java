package com.warmstone.admin.template.web.controller;

import com.warmstone.admin.template.common.JsonResult;
import com.warmstone.admin.template.mapper.BaseMapper;
import com.warmstone.admin.template.service.BaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author pengshun
 * @date 2022-10-17 22:20
 * @description
 */
public interface BaseController <R extends BaseService<? extends BaseMapper<T>, T>, T> {

    @GetMapping(value = "/{id}")
    JsonResult<T> queryById(@PathVariable("id") Long id);
}
