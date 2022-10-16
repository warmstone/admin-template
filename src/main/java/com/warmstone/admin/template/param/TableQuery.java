package com.warmstone.admin.template.param;

import com.warmstone.admin.template.common.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("数据库表查询入参")
public class TableQuery extends PageQuery {
    /**
     * 表名
     */
    @ApiModelProperty(value = "表名", required = false)
    private String tableName;

}
