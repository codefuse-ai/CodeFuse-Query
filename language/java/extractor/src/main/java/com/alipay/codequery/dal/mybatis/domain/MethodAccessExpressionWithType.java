package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MethodAccessExpressionWithType implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_access_expression_with_type.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_access_expression_with_type.type_hash_id")
    private Long typeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_access_expression_with_type.referen_method_hash_id")
    private Long referenMethodHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_access_expression_with_type.argument_list_hash_id")
    private Long argumentListHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    public MethodAccessExpressionWithType(Long elementHashId, Long typeHashId, Long referenMethodHashId, Long argumentListHashId) {
        this.elementHashId = elementHashId;
        this.typeHashId = typeHashId;
        this.referenMethodHashId = referenMethodHashId;
        this.argumentListHashId = argumentListHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    public MethodAccessExpressionWithType() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_access_expression_with_type.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_access_expression_with_type.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_access_expression_with_type.type_hash_id")
    public Long getTypeHashId() {
        return typeHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_access_expression_with_type.type_hash_id")
    public void setTypeHashId(Long typeHashId) {
        this.typeHashId = typeHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_access_expression_with_type.referen_method_hash_id")
    public Long getReferenMethodHashId() {
        return referenMethodHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_access_expression_with_type.referen_method_hash_id")
    public void setReferenMethodHashId(Long referenMethodHashId) {
        this.referenMethodHashId = referenMethodHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_access_expression_with_type.argument_list_hash_id")
    public Long getArgumentListHashId() {
        return argumentListHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_access_expression_with_type.argument_list_hash_id")
    public void setArgumentListHashId(Long argumentListHashId) {
        this.argumentListHashId = argumentListHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
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
        MethodAccessExpressionWithType other = (MethodAccessExpressionWithType) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getTypeHashId() == null ? other.getTypeHashId() == null : this.getTypeHashId().equals(other.getTypeHashId()))
            && (this.getReferenMethodHashId() == null ? other.getReferenMethodHashId() == null : this.getReferenMethodHashId().equals(other.getReferenMethodHashId()))
            && (this.getArgumentListHashId() == null ? other.getArgumentListHashId() == null : this.getArgumentListHashId().equals(other.getArgumentListHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getTypeHashId() == null) ? 0 : getTypeHashId().hashCode());
        result = prime * result + ((getReferenMethodHashId() == null) ? 0 : getReferenMethodHashId().hashCode());
        result = prime * result + ((getArgumentListHashId() == null) ? 0 : getArgumentListHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", typeHashId=").append(typeHashId);
        sb.append(", referenMethodHashId=").append(referenMethodHashId);
        sb.append(", argumentListHashId=").append(argumentListHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}