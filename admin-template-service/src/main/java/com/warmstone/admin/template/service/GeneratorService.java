package com.warmstone.admin.template.service;


import com.warmstone.admin.template.common.JsonResult;
import com.warmstone.admin.template.common.exception.BizException;
import com.warmstone.admin.template.domain.entity.Table;
import com.warmstone.admin.template.domain.param.TableQuery;

import java.util.List;

public interface GeneratorService {

    JsonResult<List<Table>> queryList(TableQuery tableQuery);

    Table queryTable(String tableName) throws BizException;
}
