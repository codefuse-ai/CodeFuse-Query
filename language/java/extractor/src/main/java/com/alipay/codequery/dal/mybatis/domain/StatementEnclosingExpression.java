package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class StatementEnclosingExpression implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: statement_enclosing_expression.expression_hash_id")
    private Long expressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: statement_enclosing_expression.statement_hash_id")
    private Long statementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    public StatementEnclosingExpression(Long expressionHashId, Long statementHashId) {
        this.expressionHashId = expressionHashId;
        this.statementHashId = statementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    public StatementEnclosingExpression() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: statement_enclosing_expression.expression_hash_id")
    public Long getExpressionHashId() {
        return expressionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: statement_enclosing_expression.expression_hash_id")
    public void setExpressionHashId(Long expressionHashId) {
        this.expressionHashId = expressionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: statement_enclosing_expression.statement_hash_id")
    public Long getStatementHashId() {
        return statementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: statement_enclosing_expression.statement_hash_id")
    public void setStatementHashId(Long statementHashId) {
        this.statementHashId = statementHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
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
        StatementEnclosingExpression other = (StatementEnclosingExpression) that;
        return (this.getExpressionHashId() == null ? other.getExpressionHashId() == null : this.getExpressionHashId().equals(other.getExpressionHashId()))
            && (this.getStatementHashId() == null ? other.getStatementHashId() == null : this.getStatementHashId().equals(other.getStatementHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExpressionHashId() == null) ? 0 : getExpressionHashId().hashCode());
        result = prime * result + ((getStatementHashId() == null) ? 0 : getStatementHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", expressionHashId=").append(expressionHashId);
        sb.append(", statementHashId=").append(statementHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}