package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class LambdaExpression implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: lambda_expression.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: lambda_expression.parameter_list_hash_id")
    private Long parameterListHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: lambda_expression.body_hash_id")
    private Long bodyHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: lambda_expression.is_void_compatible")
    private Integer isVoidCompatible;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: lambda_expression.is_value_compatible")
    private Integer isValueCompatible;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    public LambdaExpression(Long elementHashId, Long parameterListHashId, Long bodyHashId, Integer isVoidCompatible, Integer isValueCompatible) {
        this.elementHashId = elementHashId;
        this.parameterListHashId = parameterListHashId;
        this.bodyHashId = bodyHashId;
        this.isVoidCompatible = isVoidCompatible;
        this.isValueCompatible = isValueCompatible;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    public LambdaExpression() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: lambda_expression.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: lambda_expression.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: lambda_expression.parameter_list_hash_id")
    public Long getParameterListHashId() {
        return parameterListHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: lambda_expression.parameter_list_hash_id")
    public void setParameterListHashId(Long parameterListHashId) {
        this.parameterListHashId = parameterListHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: lambda_expression.body_hash_id")
    public Long getBodyHashId() {
        return bodyHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: lambda_expression.body_hash_id")
    public void setBodyHashId(Long bodyHashId) {
        this.bodyHashId = bodyHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: lambda_expression.is_void_compatible")
    public Integer getIsVoidCompatible() {
        return isVoidCompatible;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: lambda_expression.is_void_compatible")
    public void setIsVoidCompatible(Integer isVoidCompatible) {
        this.isVoidCompatible = isVoidCompatible;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: lambda_expression.is_value_compatible")
    public Integer getIsValueCompatible() {
        return isValueCompatible;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: lambda_expression.is_value_compatible")
    public void setIsValueCompatible(Integer isValueCompatible) {
        this.isValueCompatible = isValueCompatible;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
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
        LambdaExpression other = (LambdaExpression) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getParameterListHashId() == null ? other.getParameterListHashId() == null : this.getParameterListHashId().equals(other.getParameterListHashId()))
            && (this.getBodyHashId() == null ? other.getBodyHashId() == null : this.getBodyHashId().equals(other.getBodyHashId()))
            && (this.getIsVoidCompatible() == null ? other.getIsVoidCompatible() == null : this.getIsVoidCompatible().equals(other.getIsVoidCompatible()))
            && (this.getIsValueCompatible() == null ? other.getIsValueCompatible() == null : this.getIsValueCompatible().equals(other.getIsValueCompatible()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getParameterListHashId() == null) ? 0 : getParameterListHashId().hashCode());
        result = prime * result + ((getBodyHashId() == null) ? 0 : getBodyHashId().hashCode());
        result = prime * result + ((getIsVoidCompatible() == null) ? 0 : getIsVoidCompatible().hashCode());
        result = prime * result + ((getIsValueCompatible() == null) ? 0 : getIsValueCompatible().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", parameterListHashId=").append(parameterListHashId);
        sb.append(", bodyHashId=").append(bodyHashId);
        sb.append(", isVoidCompatible=").append(isVoidCompatible);
        sb.append(", isValueCompatible=").append(isValueCompatible);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}