package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleExplainStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_explain_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_explain_statement.into_oid")
    private Long intoOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_explain_statement.statement_id_oid")
    private Long statementIdOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    public OracleExplainStatement(Long oid, Long intoOid, Long statementIdOid) {
        this.oid = oid;
        this.intoOid = intoOid;
        this.statementIdOid = statementIdOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    public OracleExplainStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_explain_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_explain_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_explain_statement.into_oid")
    public Long getIntoOid() {
        return intoOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_explain_statement.into_oid")
    public void setIntoOid(Long intoOid) {
        this.intoOid = intoOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_explain_statement.statement_id_oid")
    public Long getStatementIdOid() {
        return statementIdOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_explain_statement.statement_id_oid")
    public void setStatementIdOid(Long statementIdOid) {
        this.statementIdOid = statementIdOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
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
        OracleExplainStatement other = (OracleExplainStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIntoOid() == null ? other.getIntoOid() == null : this.getIntoOid().equals(other.getIntoOid()))
            && (this.getStatementIdOid() == null ? other.getStatementIdOid() == null : this.getStatementIdOid().equals(other.getStatementIdOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIntoOid() == null) ? 0 : getIntoOid().hashCode());
        result = prime * result + ((getStatementIdOid() == null) ? 0 : getStatementIdOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", intoOid=").append(intoOid);
        sb.append(", statementIdOid=").append(statementIdOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}