package com.warmstone.admin.template.web.controller;

import com.warmstone.admin.template.common.JsonResult;
import com.warmstone.admin.template.common.exception.BizException;
import com.warmstone.admin.template.domain.entity.Table;
import com.warmstone.admin.template.domain.param.TableQuery;
import com.warmstone.admin.template.service.GeneratorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "代码生成器")
@RequestMapping("/generator")
public class GeneratorController {

    @Resource
    private GeneratorService generatorService;

    @GetMapping("/queryList")
    @ApiOperation(value = "查询数据库表", httpMethod = "GET", produces = "application/json")
    public JsonResult<List<Table>> queryList(TableQuery tableQuery) {
        return generatorService.queryList(tableQuery);
    }

    @GetMapping("/queryTable/{tableName}")
    @ApiOperation(value = "查询表的所有列", httpMethod = "GET")
    public JsonResult<Table> queryTable(@PathVariable("tableName") String tableName) throws BizException {
        return JsonResult.ok(generatorService.queryTable(tableName));
    }
}
