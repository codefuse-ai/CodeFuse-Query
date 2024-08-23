package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlAlterTableAlterColumn implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_column.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_column.column_oid")
    private Long columnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_column.default_expr_oid")
    private Long defaultExprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_column.is_drop_default")
    private Integer isDropDefault;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    public MySqlAlterTableAlterColumn(Long oid, Long columnOid, Long defaultExprOid, Integer isDropDefault) {
        this.oid = oid;
        this.columnOid = columnOid;
        this.defaultExprOid = defaultExprOid;
        this.isDropDefault = isDropDefault;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    public MySqlAlterTableAlterColumn() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_column.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_column.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_column.column_oid")
    public Long getColumnOid() {
        return columnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_column.column_oid")
    public void setColumnOid(Long columnOid) {
        this.columnOid = columnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_column.default_expr_oid")
    public Long getDefaultExprOid() {
        return defaultExprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_column.default_expr_oid")
    public void setDefaultExprOid(Long defaultExprOid) {
        this.defaultExprOid = defaultExprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_column.is_drop_default")
    public Integer getIsDropDefault() {
        return isDropDefault;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_column.is_drop_default")
    public void setIsDropDefault(Integer isDropDefault) {
        this.isDropDefault = isDropDefault;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MySqlAlterTableAlterColumn other = (MySqlAlterTableAlterColumn) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getColumnOid() == null ? other.getColumnOid() == null : this.getColumnOid().equals(other.getColumnOid()))
            && (this.getDefaultExprOid() == null ? other.getDefaultExprOid() == null : this.getDefaultExprOid().equals(other.getDefaultExprOid()))
            && (this.getIsDropDefault() == null ? other.getIsDropDefault() == null : this.getIsDropDefault().equals(other.getIsDropDefault()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getColumnOid() == null) ? 0 : getColumnOid().hashCode());
        result = prime * result + ((getDefaultExprOid() == null) ? 0 : getDefaultExprOid().hashCode());
        result = prime * result + ((getIsDropDefault() == null) ? 0 : getIsDropDefault().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", columnOid=").append(columnOid);
        sb.append(", defaultExprOid=").append(defaultExprOid);
        sb.append(", isDropDefault=").append(isDropDefault);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}