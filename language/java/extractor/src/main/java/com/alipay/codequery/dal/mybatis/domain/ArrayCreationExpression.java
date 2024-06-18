package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class ArrayCreationExpression implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_creation_expression.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_creation_expression.number_of_array_dimension")
    private Integer numberOfArrayDimension;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_creation_expression.type_hash_id")
    private Long typeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    public ArrayCreationExpression(Long elementHashId, Integer numberOfArrayDimension, Long typeHashId) {
        this.elementHashId = elementHashId;
        this.numberOfArrayDimension = numberOfArrayDimension;
        this.typeHashId = typeHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    public ArrayCreationExpression() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_creation_expression.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_creation_expression.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_creation_expression.number_of_array_dimension")
    public Integer getNumberOfArrayDimension() {
        return numberOfArrayDimension;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_creation_expression.number_of_array_dimension")
    public void setNumberOfArrayDimension(Integer numberOfArrayDimension) {
        this.numberOfArrayDimension = numberOfArrayDimension;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_creation_expression.type_hash_id")
    public Long getTypeHashId() {
        return typeHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_creation_expression.type_hash_id")
    public void setTypeHashId(Long typeHashId) {
        this.typeHashId = typeHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
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
        ArrayCreationExpression other = (ArrayCreationExpression) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getNumberOfArrayDimension() == null ? other.getNumberOfArrayDimension() == null : this.getNumberOfArrayDimension().equals(other.getNumberOfArrayDimension()))
            && (this.getTypeHashId() == null ? other.getTypeHashId() == null : this.getTypeHashId().equals(other.getTypeHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getNumberOfArrayDimension() == null) ? 0 : getNumberOfArrayDimension().hashCode());
        result = prime * result + ((getTypeHashId() == null) ? 0 : getTypeHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", numberOfArrayDimension=").append(numberOfArrayDimension);
        sb.append(", typeHashId=").append(typeHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}