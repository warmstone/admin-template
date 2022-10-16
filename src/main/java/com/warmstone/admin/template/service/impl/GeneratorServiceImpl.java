package com.warmstone.admin.template.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.warmstone.admin.template.common.JsonResult;
import com.warmstone.admin.template.common.RetCode;
import com.warmstone.admin.template.entity.Column;
import com.warmstone.admin.template.entity.MySQLTable;
import com.warmstone.admin.template.entity.Table;
import com.warmstone.admin.template.exception.BizException;
import com.warmstone.admin.template.mapper.MySQLGeneratorMapper;
import com.warmstone.admin.template.param.TableQuery;
import com.warmstone.admin.template.service.GeneratorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GeneratorServiceImpl implements GeneratorService {

    @Resource
    private MySQLGeneratorMapper mySQLGeneratorMapper;

    @Override
    public JsonResult<List<Table>> queryList(TableQuery tableQuery) {
        PageInfo<Table> pageInfo = PageHelper.startPage(tableQuery.getCurrentPage(), tableQuery.getPageSize())
                .doSelectPageInfo(() -> mySQLGeneratorMapper.queryList(tableQuery.getTableName()));
        return JsonResult.ok(pageInfo.getList(), pageInfo.getTotal());
    }

    @Override
    public Table queryTable(String tableName) throws BizException {
        Table table = checkTableExist(tableName);
        table.setColumns(mySQLGeneratorMapper.queryColumns(tableName));
        return table;
    }

    private Table checkTableExist(String tableName) throws BizException {
        Table table = mySQLGeneratorMapper.queryTable(tableName);
        if (ObjectUtil.isNull(table)) {
            throw new BizException(RetCode.NOT_FOUND);
        }
        return table;
    }
}
