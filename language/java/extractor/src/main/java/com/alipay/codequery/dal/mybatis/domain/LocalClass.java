package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class LocalClass implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_class.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_class.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_class.debug_message")
    private String debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_class.location_hash_id")
    private Long locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_class.parent_hash_id")
    private Long parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    public LocalClass(Long elementHashId, String name, String debugMessage, Long locationHashId, Long parentHashId) {
        this.elementHashId = elementHashId;
        this.name = name;
        this.debugMessage = debugMessage;
        this.locationHashId = locationHashId;
        this.parentHashId = parentHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    public LocalClass() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_class.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_class.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_class.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_class.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_class.debug_message")
    public String getDebugMessage() {
        return debugMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_class.debug_message")
    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage == null ? null : debugMessage.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_class.location_hash_id")
    public Long getLocationHashId() {
        return locationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_class.location_hash_id")
    public void setLocationHashId(Long locationHashId) {
        this.locationHashId = locationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_class.parent_hash_id")
    public Long getParentHashId() {
        return parentHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_class.parent_hash_id")
    public void setParentHashId(Long parentHashId) {
        this.parentHashId = parentHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
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
        LocalClass other = (LocalClass) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDebugMessage() == null ? other.getDebugMessage() == null : this.getDebugMessage().equals(other.getDebugMessage()))
            && (this.getLocationHashId() == null ? other.getLocationHashId() == null : this.getLocationHashId().equals(other.getLocationHashId()))
            && (this.getParentHashId() == null ? other.getParentHashId() == null : this.getParentHashId().equals(other.getParentHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDebugMessage() == null) ? 0 : getDebugMessage().hashCode());
        result = prime * result + ((getLocationHashId() == null) ? 0 : getLocationHashId().hashCode());
        result = prime * result + ((getParentHashId() == null) ? 0 : getParentHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", name=").append(name);
        sb.append(", debugMessage=").append(debugMessage);
        sb.append(", locationHashId=").append(locationHashId);
        sb.append(", parentHashId=").append(parentHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}