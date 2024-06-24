package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class YieldStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: yield_statement.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: yield_statement.expression_hash_id")
    private Long expressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: yield_statement.enclosing_expression_hash_id")
    private Long enclosingExpressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    public YieldStatement(Long elementHashId, Long expressionHashId, Long enclosingExpressionHashId) {
        this.elementHashId = elementHashId;
        this.expressionHashId = expressionHashId;
        this.enclosingExpressionHashId = enclosingExpressionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    public YieldStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: yield_statement.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: yield_statement.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: yield_statement.expression_hash_id")
    public Long getExpressionHashId() {
        return expressionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: yield_statement.expression_hash_id")
    public void setExpressionHashId(Long expressionHashId) {
        this.expressionHashId = expressionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: yield_statement.enclosing_expression_hash_id")
    public Long getEnclosingExpressionHashId() {
        return enclosingExpressionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: yield_statement.enclosing_expression_hash_id")
    public void setEnclosingExpressionHashId(Long enclosingExpressionHashId) {
        this.enclosingExpressionHashId = enclosingExpressionHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
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
        YieldStatement other = (YieldStatement) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getExpressionHashId() == null ? other.getExpressionHashId() == null : this.getExpressionHashId().equals(other.getExpressionHashId()))
            && (this.getEnclosingExpressionHashId() == null ? other.getEnclosingExpressionHashId() == null : this.getEnclosingExpressionHashId().equals(other.getEnclosingExpressionHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getExpressionHashId() == null) ? 0 : getExpressionHashId().hashCode());
        result = prime * result + ((getEnclosingExpressionHashId() == null) ? 0 : getEnclosingExpressionHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", expressionHashId=").append(expressionHashId);
        sb.append(", enclosingExpressionHashId=").append(enclosingExpressionHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}