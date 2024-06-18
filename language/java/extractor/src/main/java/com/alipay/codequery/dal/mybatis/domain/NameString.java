package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class NameString implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: name_string.parent_hash_id")
    private Long parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: name_string.name_element_hash_id")
    private Long nameElementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: name_string.value_element_hash_id")
    private Long valueElementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    public NameString(Long parentHashId, Long nameElementHashId, Long valueElementHashId) {
        this.parentHashId = parentHashId;
        this.nameElementHashId = nameElementHashId;
        this.valueElementHashId = valueElementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    public NameString() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: name_string.parent_hash_id")
    public Long getParentHashId() {
        return parentHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: name_string.parent_hash_id")
    public void setParentHashId(Long parentHashId) {
        this.parentHashId = parentHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: name_string.name_element_hash_id")
    public Long getNameElementHashId() {
        return nameElementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: name_string.name_element_hash_id")
    public void setNameElementHashId(Long nameElementHashId) {
        this.nameElementHashId = nameElementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: name_string.value_element_hash_id")
    public Long getValueElementHashId() {
        return valueElementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: name_string.value_element_hash_id")
    public void setValueElementHashId(Long valueElementHashId) {
        this.valueElementHashId = valueElementHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
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
        NameString other = (NameString) that;
        return (this.getParentHashId() == null ? other.getParentHashId() == null : this.getParentHashId().equals(other.getParentHashId()))
            && (this.getNameElementHashId() == null ? other.getNameElementHashId() == null : this.getNameElementHashId().equals(other.getNameElementHashId()))
            && (this.getValueElementHashId() == null ? other.getValueElementHashId() == null : this.getValueElementHashId().equals(other.getValueElementHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getParentHashId() == null) ? 0 : getParentHashId().hashCode());
        result = prime * result + ((getNameElementHashId() == null) ? 0 : getNameElementHashId().hashCode());
        result = prime * result + ((getValueElementHashId() == null) ? 0 : getValueElementHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", parentHashId=").append(parentHashId);
        sb.append(", nameElementHashId=").append(nameElementHashId);
        sb.append(", valueElementHashId=").append(valueElementHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}