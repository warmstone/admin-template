package com.warmstone.admin.template.controller;

import com.warmstone.admin.template.common.JsonResult;
import com.warmstone.admin.template.entity.Table;
import com.warmstone.admin.template.exception.BizException;
import com.warmstone.admin.template.param.TableQuery;
import com.warmstone.admin.template.service.GeneratorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

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
