package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlUpdateStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.from_oid")
    private Long fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.order_by_oid")
    private Long orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.table_name_oid")
    private Long tableNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.table_source_oid")
    private Long tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.where_oid")
    private Long whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.with_oid")
    private Long withOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_update_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_update_statement")
    public SqlUpdateStatement(Long oid, Long fromOid, Long orderByOid, Long tableNameOid, Long tableSourceOid, Long whereOid, Long withOid) {
        this.oid = oid;
        this.fromOid = fromOid;
        this.orderByOid = orderByOid;
        this.tableNameOid = tableNameOid;
        this.tableSourceOid = tableSourceOid;
        this.whereOid = whereOid;
        this.withOid = withOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_update_statement")
    public SqlUpdateStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.from_oid")
    public Long getFromOid() {
        return fromOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.from_oid")
    public void setFromOid(Long fromOid) {
        this.fromOid = fromOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.order_by_oid")
    public Long getOrderByOid() {
        return orderByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.order_by_oid")
    public void setOrderByOid(Long orderByOid) {
        this.orderByOid = orderByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.table_name_oid")
    public Long getTableNameOid() {
        return tableNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.table_name_oid")
    public void setTableNameOid(Long tableNameOid) {
        this.tableNameOid = tableNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.table_source_oid")
    public Long getTableSourceOid() {
        return tableSourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.table_source_oid")
    public void setTableSourceOid(Long tableSourceOid) {
        this.tableSourceOid = tableSourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.where_oid")
    public Long getWhereOid() {
        return whereOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.where_oid")
    public void setWhereOid(Long whereOid) {
        this.whereOid = whereOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.with_oid")
    public Long getWithOid() {
        return withOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.with_oid")
    public void setWithOid(Long withOid) {
        this.withOid = withOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_update_statement")
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
        SqlUpdateStatement other = (SqlUpdateStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getFromOid() == null ? other.getFromOid() == null : this.getFromOid().equals(other.getFromOid()))
            && (this.getOrderByOid() == null ? other.getOrderByOid() == null : this.getOrderByOid().equals(other.getOrderByOid()))
            && (this.getTableNameOid() == null ? other.getTableNameOid() == null : this.getTableNameOid().equals(other.getTableNameOid()))
            && (this.getTableSourceOid() == null ? other.getTableSourceOid() == null : this.getTableSourceOid().equals(other.getTableSourceOid()))
            && (this.getWhereOid() == null ? other.getWhereOid() == null : this.getWhereOid().equals(other.getWhereOid()))
            && (this.getWithOid() == null ? other.getWithOid() == null : this.getWithOid().equals(other.getWithOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_update_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getFromOid() == null) ? 0 : getFromOid().hashCode());
        result = prime * result + ((getOrderByOid() == null) ? 0 : getOrderByOid().hashCode());
        result = prime * result + ((getTableNameOid() == null) ? 0 : getTableNameOid().hashCode());
        result = prime * result + ((getTableSourceOid() == null) ? 0 : getTableSourceOid().hashCode());
        result = prime * result + ((getWhereOid() == null) ? 0 : getWhereOid().hashCode());
        result = prime * result + ((getWithOid() == null) ? 0 : getWithOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_update_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", fromOid=").append(fromOid);
        sb.append(", orderByOid=").append(orderByOid);
        sb.append(", tableNameOid=").append(tableNameOid);
        sb.append(", tableSourceOid=").append(tableSourceOid);
        sb.append(", whereOid=").append(whereOid);
        sb.append(", withOid=").append(withOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}