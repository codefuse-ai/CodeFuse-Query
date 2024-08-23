package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlMergeStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.alias")
    private String alias;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.error_logging_clause_oid")
    private Long errorLoggingClauseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.insert_clause")
    private String insertClause;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.into_oid")
    private Long intoOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.on_oid")
    private Long onOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.update_clause")
    private String updateClause;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.using_oid")
    private Long usingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    public SqlMergeStatement(Long oid, String alias, Long errorLoggingClauseOid, String insertClause, Long intoOid, Long onOid, String updateClause, Long usingOid) {
        this.oid = oid;
        this.alias = alias;
        this.errorLoggingClauseOid = errorLoggingClauseOid;
        this.insertClause = insertClause;
        this.intoOid = intoOid;
        this.onOid = onOid;
        this.updateClause = updateClause;
        this.usingOid = usingOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    public SqlMergeStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.alias")
    public String getAlias() {
        return alias;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.alias")
    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.error_logging_clause_oid")
    public Long getErrorLoggingClauseOid() {
        return errorLoggingClauseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.error_logging_clause_oid")
    public void setErrorLoggingClauseOid(Long errorLoggingClauseOid) {
        this.errorLoggingClauseOid = errorLoggingClauseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.insert_clause")
    public String getInsertClause() {
        return insertClause;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.insert_clause")
    public void setInsertClause(String insertClause) {
        this.insertClause = insertClause == null ? null : insertClause.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.into_oid")
    public Long getIntoOid() {
        return intoOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.into_oid")
    public void setIntoOid(Long intoOid) {
        this.intoOid = intoOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.on_oid")
    public Long getOnOid() {
        return onOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.on_oid")
    public void setOnOid(Long onOid) {
        this.onOid = onOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.update_clause")
    public String getUpdateClause() {
        return updateClause;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.update_clause")
    public void setUpdateClause(String updateClause) {
        this.updateClause = updateClause == null ? null : updateClause.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.using_oid")
    public Long getUsingOid() {
        return usingOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.using_oid")
    public void setUsingOid(Long usingOid) {
        this.usingOid = usingOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
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
        SqlMergeStatement other = (SqlMergeStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAlias() == null ? other.getAlias() == null : this.getAlias().equals(other.getAlias()))
            && (this.getErrorLoggingClauseOid() == null ? other.getErrorLoggingClauseOid() == null : this.getErrorLoggingClauseOid().equals(other.getErrorLoggingClauseOid()))
            && (this.getInsertClause() == null ? other.getInsertClause() == null : this.getInsertClause().equals(other.getInsertClause()))
            && (this.getIntoOid() == null ? other.getIntoOid() == null : this.getIntoOid().equals(other.getIntoOid()))
            && (this.getOnOid() == null ? other.getOnOid() == null : this.getOnOid().equals(other.getOnOid()))
            && (this.getUpdateClause() == null ? other.getUpdateClause() == null : this.getUpdateClause().equals(other.getUpdateClause()))
            && (this.getUsingOid() == null ? other.getUsingOid() == null : this.getUsingOid().equals(other.getUsingOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAlias() == null) ? 0 : getAlias().hashCode());
        result = prime * result + ((getErrorLoggingClauseOid() == null) ? 0 : getErrorLoggingClauseOid().hashCode());
        result = prime * result + ((getInsertClause() == null) ? 0 : getInsertClause().hashCode());
        result = prime * result + ((getIntoOid() == null) ? 0 : getIntoOid().hashCode());
        result = prime * result + ((getOnOid() == null) ? 0 : getOnOid().hashCode());
        result = prime * result + ((getUpdateClause() == null) ? 0 : getUpdateClause().hashCode());
        result = prime * result + ((getUsingOid() == null) ? 0 : getUsingOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", alias=").append(alias);
        sb.append(", errorLoggingClauseOid=").append(errorLoggingClauseOid);
        sb.append(", insertClause=").append(insertClause);
        sb.append(", intoOid=").append(intoOid);
        sb.append(", onOid=").append(onOid);
        sb.append(", updateClause=").append(updateClause);
        sb.append(", usingOid=").append(usingOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}