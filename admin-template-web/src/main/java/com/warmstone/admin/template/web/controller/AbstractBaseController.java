package com.warmstone.admin.template.web.controller;

import com.warmstone.admin.template.common.JsonResult;
import com.warmstone.admin.template.mapper.BaseMapper;
import com.warmstone.admin.template.service.BaseService;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author pengshun
 * @date 2022-10-18 19:09
 * @description
 */
public abstract class AbstractBaseController <R extends BaseService<? extends BaseMapper<T>, T>, T>
        implements BaseController<R, T>{

    public abstract void setService(R service);

    public abstract R getService();

    @Override
    public JsonResult<T> queryById(Long id) {
        return JsonResult.ok(this.getService().selectById(id));
    }
}
