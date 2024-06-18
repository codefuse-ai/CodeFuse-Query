package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class CallableEnclosingStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_enclosing_statement.statement_hash_id")
    private Long statementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_enclosing_statement.callable_hash_id")
    private Long callableHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    public CallableEnclosingStatement(Long statementHashId, Long callableHashId) {
        this.statementHashId = statementHashId;
        this.callableHashId = callableHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    public CallableEnclosingStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_enclosing_statement.statement_hash_id")
    public Long getStatementHashId() {
        return statementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_enclosing_statement.statement_hash_id")
    public void setStatementHashId(Long statementHashId) {
        this.statementHashId = statementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_enclosing_statement.callable_hash_id")
    public Long getCallableHashId() {
        return callableHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_enclosing_statement.callable_hash_id")
    public void setCallableHashId(Long callableHashId) {
        this.callableHashId = callableHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
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
        CallableEnclosingStatement other = (CallableEnclosingStatement) that;
        return (this.getStatementHashId() == null ? other.getStatementHashId() == null : this.getStatementHashId().equals(other.getStatementHashId()))
            && (this.getCallableHashId() == null ? other.getCallableHashId() == null : this.getCallableHashId().equals(other.getCallableHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStatementHashId() == null) ? 0 : getStatementHashId().hashCode());
        result = prime * result + ((getCallableHashId() == null) ? 0 : getCallableHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", statementHashId=").append(statementHashId);
        sb.append(", callableHashId=").append(callableHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}