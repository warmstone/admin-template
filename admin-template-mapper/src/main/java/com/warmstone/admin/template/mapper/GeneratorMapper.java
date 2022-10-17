package com.warmstone.admin.template.mapper;


import com.warmstone.admin.template.domain.entity.Column;
import com.warmstone.admin.template.domain.entity.Table;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GeneratorMapper {

    List<Table> queryList(@Param("tableName") String tableName);

    Table queryTable(@Param("tableName") String tableName);

    List<Column> queryColumns(@Param("tableName") String tableName);
}
