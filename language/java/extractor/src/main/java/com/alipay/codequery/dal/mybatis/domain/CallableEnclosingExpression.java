package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class CallableEnclosingExpression implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_enclosing_expression.expression_hash_id")
    private Long expressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_enclosing_expression.callable_hash_id")
    private Long callableHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    public CallableEnclosingExpression(Long expressionHashId, Long callableHashId) {
        this.expressionHashId = expressionHashId;
        this.callableHashId = callableHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    public CallableEnclosingExpression() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_enclosing_expression.expression_hash_id")
    public Long getExpressionHashId() {
        return expressionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_enclosing_expression.expression_hash_id")
    public void setExpressionHashId(Long expressionHashId) {
        this.expressionHashId = expressionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_enclosing_expression.callable_hash_id")
    public Long getCallableHashId() {
        return callableHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_enclosing_expression.callable_hash_id")
    public void setCallableHashId(Long callableHashId) {
        this.callableHashId = callableHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
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
        CallableEnclosingExpression other = (CallableEnclosingExpression) that;
        return (this.getExpressionHashId() == null ? other.getExpressionHashId() == null : this.getExpressionHashId().equals(other.getExpressionHashId()))
            && (this.getCallableHashId() == null ? other.getCallableHashId() == null : this.getCallableHashId().equals(other.getCallableHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExpressionHashId() == null) ? 0 : getExpressionHashId().hashCode());
        result = prime * result + ((getCallableHashId() == null) ? 0 : getCallableHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", expressionHashId=").append(expressionHashId);
        sb.append(", callableHashId=").append(callableHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}