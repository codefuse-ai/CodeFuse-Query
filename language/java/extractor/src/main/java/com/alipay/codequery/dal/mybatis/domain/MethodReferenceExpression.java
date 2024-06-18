package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MethodReferenceExpression implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_reference_expression.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_reference_expression.is_constructor")
    private Integer isConstructor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    public MethodReferenceExpression(Long elementHashId, Integer isConstructor) {
        this.elementHashId = elementHashId;
        this.isConstructor = isConstructor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    public MethodReferenceExpression() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_reference_expression.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_reference_expression.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_reference_expression.is_constructor")
    public Integer getIsConstructor() {
        return isConstructor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_reference_expression.is_constructor")
    public void setIsConstructor(Integer isConstructor) {
        this.isConstructor = isConstructor;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
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
        MethodReferenceExpression other = (MethodReferenceExpression) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getIsConstructor() == null ? other.getIsConstructor() == null : this.getIsConstructor().equals(other.getIsConstructor()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getIsConstructor() == null) ? 0 : getIsConstructor().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", isConstructor=").append(isConstructor);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}