package com.warmstone.admin.template.domain.entity;

import java.util.List;

public abstract class Table {

    /**
     * 数据库
     */
    private String tableSchema;
    /**
     * 表名
     */
    private String tableName;
    /**
     * 表类型
     */
    private String tableType;
    /**
     * 引擎
     */
    private String engine;
    /**
     * 排序规则
     */
    private String tableCollation;
    /**
     * 表备注
     */
    private String tableComment;
    /**
     * 列
     */
    private List<Column> columns;

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTableCollation() {
        return tableCollation;
    }

    public void setTableCollation(String tableCollation) {
        this.tableCollation = tableCollation;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }
}
