package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class Parent implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: parent.parent_hash_id")
    private Long parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: parent.parent_type")
    private String parentType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    public Parent(Long parentHashId, String parentType) {
        this.parentHashId = parentHashId;
        this.parentType = parentType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    public Parent() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: parent.parent_hash_id")
    public Long getParentHashId() {
        return parentHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: parent.parent_hash_id")
    public void setParentHashId(Long parentHashId) {
        this.parentHashId = parentHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: parent.parent_type")
    public String getParentType() {
        return parentType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: parent.parent_type")
    public void setParentType(String parentType) {
        this.parentType = parentType == null ? null : parentType.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
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
        Parent other = (Parent) that;
        return (this.getParentHashId() == null ? other.getParentHashId() == null : this.getParentHashId().equals(other.getParentHashId()))
            && (this.getParentType() == null ? other.getParentType() == null : this.getParentType().equals(other.getParentType()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getParentHashId() == null) ? 0 : getParentHashId().hashCode());
        result = prime * result + ((getParentType() == null) ? 0 : getParentType().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", parentHashId=").append(parentHashId);
        sb.append(", parentType=").append(parentType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}