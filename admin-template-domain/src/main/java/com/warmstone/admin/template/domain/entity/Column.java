package com.warmstone.admin.template.domain.entity;

public abstract class Column {

    /**
     * 数据库
     */
    protected String tableSchema;
    /**
     * 表名
     */
    protected String tableName;
    /**
     * 列名
     */
    protected String columnName;
    /**
     * 列序号
     */
    protected Integer ordinalPosition;
    /**
     * 默认值
     */
    protected String columnDefault;
    /**
     * 是否可以为空
     */
    protected String isNullable;
    /**
     * 数据类型
     */
    protected String dataType;
    /**
     * 字符最大长度
     */
    protected String characterMaximumLength;
    /**
     * 二进制长度
     */
    protected String characterOctetLength;
    /**
     * 数值长度
     */
    protected Integer numericPrecision;
    /**
     * 小数位数
     */
    protected Integer numericScale;
    /**
     * 列类型
     */
    protected String columnType;
    /**
     * 索引
     */
    protected String columnKey;
    /**
     * 其他
     */
    protected String extra;
    /**
     * 列备注
     */
    protected String columnComment;

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

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public Integer getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    public String getColumnDefault() {
        return columnDefault;
    }

    public void setColumnDefault(String columnDefault) {
        this.columnDefault = columnDefault;
    }

    public String getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getCharacterMaximumLength() {
        return characterMaximumLength;
    }

    public void setCharacterMaximumLength(String characterMaximumLength) {
        this.characterMaximumLength = characterMaximumLength;
    }

    public String getCharacterOctetLength() {
        return characterOctetLength;
    }

    public void setCharacterOctetLength(String characterOctetLength) {
        this.characterOctetLength = characterOctetLength;
    }

    public Integer getNumericPrecision() {
        return numericPrecision;
    }

    public void setNumericPrecision(Integer numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    public Integer getNumericScale() {
        return numericScale;
    }

    public void setNumericScale(Integer numericScale) {
        this.numericScale = numericScale;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public String getColumnKey() {
        return columnKey;
    }

    public void setColumnKey(String columnKey) {
        this.columnKey = columnKey;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getColumnComment() {
        return columnComment;
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }
}
