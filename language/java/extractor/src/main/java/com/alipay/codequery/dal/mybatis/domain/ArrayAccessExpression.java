package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class ArrayAccessExpression implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_access_expression.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_access_expression.index_expression_hash_id")
    private Long indexExpressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_access_expression.array_expression_hash_id")
    private Long arrayExpressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    public ArrayAccessExpression(Long elementHashId, Long indexExpressionHashId, Long arrayExpressionHashId) {
        this.elementHashId = elementHashId;
        this.indexExpressionHashId = indexExpressionHashId;
        this.arrayExpressionHashId = arrayExpressionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    public ArrayAccessExpression() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_access_expression.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_access_expression.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_access_expression.index_expression_hash_id")
    public Long getIndexExpressionHashId() {
        return indexExpressionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_access_expression.index_expression_hash_id")
    public void setIndexExpressionHashId(Long indexExpressionHashId) {
        this.indexExpressionHashId = indexExpressionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_access_expression.array_expression_hash_id")
    public Long getArrayExpressionHashId() {
        return arrayExpressionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_access_expression.array_expression_hash_id")
    public void setArrayExpressionHashId(Long arrayExpressionHashId) {
        this.arrayExpressionHashId = arrayExpressionHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
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
        ArrayAccessExpression other = (ArrayAccessExpression) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getIndexExpressionHashId() == null ? other.getIndexExpressionHashId() == null : this.getIndexExpressionHashId().equals(other.getIndexExpressionHashId()))
            && (this.getArrayExpressionHashId() == null ? other.getArrayExpressionHashId() == null : this.getArrayExpressionHashId().equals(other.getArrayExpressionHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getIndexExpressionHashId() == null) ? 0 : getIndexExpressionHashId().hashCode());
        result = prime * result + ((getArrayExpressionHashId() == null) ? 0 : getArrayExpressionHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", indexExpressionHashId=").append(indexExpressionHashId);
        sb.append(", arrayExpressionHashId=").append(arrayExpressionHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}