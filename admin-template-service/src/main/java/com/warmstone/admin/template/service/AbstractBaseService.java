package com.warmstone.admin.template.service;


import cn.hutool.core.util.ObjectUtil;
import com.warmstone.admin.template.mapper.BaseMapper;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author pengshun
 * @date 2022-10-17 22:07
 * @description
 */
public abstract class AbstractBaseService <E extends BaseMapper<T>, T> implements BaseService <E, T> {

    public abstract void setMapper(E mapper);

    public abstract E getMapper();

    public T selectById(Long id) {
        return this.getMapper().selectById(id);
    }
}
