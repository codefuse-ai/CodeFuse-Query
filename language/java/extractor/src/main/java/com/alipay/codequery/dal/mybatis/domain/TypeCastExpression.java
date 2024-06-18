package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class TypeCastExpression implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_cast_expression.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_cast_expression.cast_expression_hash_id")
    private Long castExpressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    public TypeCastExpression(Long elementHashId, Long castExpressionHashId) {
        this.elementHashId = elementHashId;
        this.castExpressionHashId = castExpressionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    public TypeCastExpression() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_cast_expression.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_cast_expression.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_cast_expression.cast_expression_hash_id")
    public Long getCastExpressionHashId() {
        return castExpressionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_cast_expression.cast_expression_hash_id")
    public void setCastExpressionHashId(Long castExpressionHashId) {
        this.castExpressionHashId = castExpressionHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
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
        TypeCastExpression other = (TypeCastExpression) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getCastExpressionHashId() == null ? other.getCastExpressionHashId() == null : this.getCastExpressionHashId().equals(other.getCastExpressionHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getCastExpressionHashId() == null) ? 0 : getCastExpressionHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", castExpressionHashId=").append(castExpressionHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}