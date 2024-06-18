package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class Exception implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: exception.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: exception.type_hash_id")
    private Long typeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: exception.callable_hash_id")
    private Long callableHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: exception.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: exception")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: exception")
    public Exception(Long elementHashId, Long typeHashId, Long callableHashId, String name) {
        this.elementHashId = elementHashId;
        this.typeHashId = typeHashId;
        this.callableHashId = callableHashId;
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: exception")
    public Exception() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: exception.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: exception.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: exception.type_hash_id")
    public Long getTypeHashId() {
        return typeHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: exception.type_hash_id")
    public void setTypeHashId(Long typeHashId) {
        this.typeHashId = typeHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: exception.callable_hash_id")
    public Long getCallableHashId() {
        return callableHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: exception.callable_hash_id")
    public void setCallableHashId(Long callableHashId) {
        this.callableHashId = callableHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: exception.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: exception.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: exception")
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
        Exception other = (Exception) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getTypeHashId() == null ? other.getTypeHashId() == null : this.getTypeHashId().equals(other.getTypeHashId()))
            && (this.getCallableHashId() == null ? other.getCallableHashId() == null : this.getCallableHashId().equals(other.getCallableHashId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: exception")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getTypeHashId() == null) ? 0 : getTypeHashId().hashCode());
        result = prime * result + ((getCallableHashId() == null) ? 0 : getCallableHashId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: exception")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", typeHashId=").append(typeHashId);
        sb.append(", callableHashId=").append(callableHashId);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}