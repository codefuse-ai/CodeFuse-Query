package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class ConditionalExpression implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: conditional_expression.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: conditional_expression.condition_expression_hash_id")
    private Long conditionExpressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: conditional_expression.then_part_hash_id")
    private Long thenPartHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: conditional_expression.else_part_hash_id")
    private Long elsePartHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    public ConditionalExpression(Long elementHashId, Long conditionExpressionHashId, Long thenPartHashId, Long elsePartHashId) {
        this.elementHashId = elementHashId;
        this.conditionExpressionHashId = conditionExpressionHashId;
        this.thenPartHashId = thenPartHashId;
        this.elsePartHashId = elsePartHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    public ConditionalExpression() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: conditional_expression.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: conditional_expression.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: conditional_expression.condition_expression_hash_id")
    public Long getConditionExpressionHashId() {
        return conditionExpressionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: conditional_expression.condition_expression_hash_id")
    public void setConditionExpressionHashId(Long conditionExpressionHashId) {
        this.conditionExpressionHashId = conditionExpressionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: conditional_expression.then_part_hash_id")
    public Long getThenPartHashId() {
        return thenPartHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: conditional_expression.then_part_hash_id")
    public void setThenPartHashId(Long thenPartHashId) {
        this.thenPartHashId = thenPartHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: conditional_expression.else_part_hash_id")
    public Long getElsePartHashId() {
        return elsePartHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: conditional_expression.else_part_hash_id")
    public void setElsePartHashId(Long elsePartHashId) {
        this.elsePartHashId = elsePartHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
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
        ConditionalExpression other = (ConditionalExpression) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getConditionExpressionHashId() == null ? other.getConditionExpressionHashId() == null : this.getConditionExpressionHashId().equals(other.getConditionExpressionHashId()))
            && (this.getThenPartHashId() == null ? other.getThenPartHashId() == null : this.getThenPartHashId().equals(other.getThenPartHashId()))
            && (this.getElsePartHashId() == null ? other.getElsePartHashId() == null : this.getElsePartHashId().equals(other.getElsePartHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getConditionExpressionHashId() == null) ? 0 : getConditionExpressionHashId().hashCode());
        result = prime * result + ((getThenPartHashId() == null) ? 0 : getThenPartHashId().hashCode());
        result = prime * result + ((getElsePartHashId() == null) ? 0 : getElsePartHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", conditionExpressionHashId=").append(conditionExpressionHashId);
        sb.append(", thenPartHashId=").append(thenPartHashId);
        sb.append(", elsePartHashId=").append(elsePartHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}