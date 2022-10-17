package com.warmstone.admin.template.mapper;

import com.warmstone.admin.template.common.PageQuery;

import java.util.List;

/**
 * @author pengshun
 * @date 2022-10-17 21:09
 * @description
 */
public interface BaseMapper<T> {

    List<T> queryList(PageQuery query);

    T selectById(Long id);

    T selectOne(T entity);

    boolean save(T entity);

    boolean batchSave(List<T> list);

    boolean update(T entity);

    boolean batchUpdate(List<T> list);

    boolean deleteById(Long id);

    boolean softDeleteById(Long id);

    boolean batchDelete(List<Long> ids);

    boolean softBatchDelete(List<Long> ids);
}
