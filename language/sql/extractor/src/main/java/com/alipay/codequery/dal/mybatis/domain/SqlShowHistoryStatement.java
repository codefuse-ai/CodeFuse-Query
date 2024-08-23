package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlShowHistoryStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_history_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_history_statement.is_tables")
    private Integer isTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_history_statement.table_oid")
    private Long tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_history_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_history_statement")
    public SqlShowHistoryStatement(Long oid, Integer isTables, Long tableOid) {
        this.oid = oid;
        this.isTables = isTables;
        this.tableOid = tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_history_statement")
    public SqlShowHistoryStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_history_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_history_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_history_statement.is_tables")
    public Integer getIsTables() {
        return isTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_history_statement.is_tables")
    public void setIsTables(Integer isTables) {
        this.isTables = isTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_history_statement.table_oid")
    public Long getTableOid() {
        return tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_history_statement.table_oid")
    public void setTableOid(Long tableOid) {
        this.tableOid = tableOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_history_statement")
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
        SqlShowHistoryStatement other = (SqlShowHistoryStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsTables() == null ? other.getIsTables() == null : this.getIsTables().equals(other.getIsTables()))
            && (this.getTableOid() == null ? other.getTableOid() == null : this.getTableOid().equals(other.getTableOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_history_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsTables() == null) ? 0 : getIsTables().hashCode());
        result = prime * result + ((getTableOid() == null) ? 0 : getTableOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_history_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isTables=").append(isTables);
        sb.append(", tableOid=").append(tableOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}