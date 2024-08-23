package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlShowStatisticStmt implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_statistic_stmt.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_statistic_stmt.is_full")
    private Integer isFull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_statistic_stmt.table_source_oid")
    private Long tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_statistic_stmt")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_statistic_stmt")
    public SqlShowStatisticStmt(Long oid, Integer isFull, Long tableSourceOid) {
        this.oid = oid;
        this.isFull = isFull;
        this.tableSourceOid = tableSourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_statistic_stmt")
    public SqlShowStatisticStmt() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_statistic_stmt.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_statistic_stmt.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_statistic_stmt.is_full")
    public Integer getIsFull() {
        return isFull;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_statistic_stmt.is_full")
    public void setIsFull(Integer isFull) {
        this.isFull = isFull;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_statistic_stmt.table_source_oid")
    public Long getTableSourceOid() {
        return tableSourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_statistic_stmt.table_source_oid")
    public void setTableSourceOid(Long tableSourceOid) {
        this.tableSourceOid = tableSourceOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_statistic_stmt")
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
        SqlShowStatisticStmt other = (SqlShowStatisticStmt) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsFull() == null ? other.getIsFull() == null : this.getIsFull().equals(other.getIsFull()))
            && (this.getTableSourceOid() == null ? other.getTableSourceOid() == null : this.getTableSourceOid().equals(other.getTableSourceOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_statistic_stmt")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsFull() == null) ? 0 : getIsFull().hashCode());
        result = prime * result + ((getTableSourceOid() == null) ? 0 : getTableSourceOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_statistic_stmt")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isFull=").append(isFull);
        sb.append(", tableSourceOid=").append(tableSourceOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}