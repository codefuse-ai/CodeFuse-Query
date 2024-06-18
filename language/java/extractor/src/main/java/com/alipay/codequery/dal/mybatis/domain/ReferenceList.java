package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class ReferenceList implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_list.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_list.location_hash_id")
    private Long locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_list.parent_hash_id")
    private Long parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_list.debug_message")
    private String debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_list.role")
    private String role;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    public ReferenceList(Long elementHashId, Long locationHashId, Long parentHashId, String debugMessage, String role) {
        this.elementHashId = elementHashId;
        this.locationHashId = locationHashId;
        this.parentHashId = parentHashId;
        this.debugMessage = debugMessage;
        this.role = role;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    public ReferenceList() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_list.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_list.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_list.location_hash_id")
    public Long getLocationHashId() {
        return locationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_list.location_hash_id")
    public void setLocationHashId(Long locationHashId) {
        this.locationHashId = locationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_list.parent_hash_id")
    public Long getParentHashId() {
        return parentHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_list.parent_hash_id")
    public void setParentHashId(Long parentHashId) {
        this.parentHashId = parentHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_list.debug_message")
    public String getDebugMessage() {
        return debugMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_list.debug_message")
    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage == null ? null : debugMessage.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_list.role")
    public String getRole() {
        return role;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_list.role")
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
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
        ReferenceList other = (ReferenceList) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getLocationHashId() == null ? other.getLocationHashId() == null : this.getLocationHashId().equals(other.getLocationHashId()))
            && (this.getParentHashId() == null ? other.getParentHashId() == null : this.getParentHashId().equals(other.getParentHashId()))
            && (this.getDebugMessage() == null ? other.getDebugMessage() == null : this.getDebugMessage().equals(other.getDebugMessage()))
            && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getLocationHashId() == null) ? 0 : getLocationHashId().hashCode());
        result = prime * result + ((getParentHashId() == null) ? 0 : getParentHashId().hashCode());
        result = prime * result + ((getDebugMessage() == null) ? 0 : getDebugMessage().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", locationHashId=").append(locationHashId);
        sb.append(", parentHashId=").append(parentHashId);
        sb.append(", debugMessage=").append(debugMessage);
        sb.append(", role=").append(role);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}