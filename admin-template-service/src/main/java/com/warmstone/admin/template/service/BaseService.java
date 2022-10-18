package com.warmstone.admin.template.service;

import com.warmstone.admin.template.mapper.BaseMapper;

import java.util.List;

/**
 * @author pengshun
 * @date 2022-10-17 21:17
 * @description
 */
public interface BaseService <E extends BaseMapper<T>, T> {

    T selectById(Long id);
}
