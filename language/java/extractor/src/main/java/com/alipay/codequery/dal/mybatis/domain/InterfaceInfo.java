package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class InterfaceInfo implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: interface.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: interface.qualified_name")
    private String qualifiedName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: interface.identifier_hash_id")
    private Long identifierHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: interface.location_hash_id")
    private Long locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: interface.parent_hash_id")
    private Long parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    public InterfaceInfo(Long elementHashId, String qualifiedName, Long identifierHashId, Long locationHashId, Long parentHashId) {
        this.elementHashId = elementHashId;
        this.qualifiedName = qualifiedName;
        this.identifierHashId = identifierHashId;
        this.locationHashId = locationHashId;
        this.parentHashId = parentHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    public InterfaceInfo() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: interface.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: interface.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: interface.qualified_name")
    public String getQualifiedName() {
        return qualifiedName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: interface.qualified_name")
    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName == null ? null : qualifiedName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: interface.identifier_hash_id")
    public Long getIdentifierHashId() {
        return identifierHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: interface.identifier_hash_id")
    public void setIdentifierHashId(Long identifierHashId) {
        this.identifierHashId = identifierHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: interface.location_hash_id")
    public Long getLocationHashId() {
        return locationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: interface.location_hash_id")
    public void setLocationHashId(Long locationHashId) {
        this.locationHashId = locationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: interface.parent_hash_id")
    public Long getParentHashId() {
        return parentHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: interface.parent_hash_id")
    public void setParentHashId(Long parentHashId) {
        this.parentHashId = parentHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
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
        InterfaceInfo other = (InterfaceInfo) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getQualifiedName() == null ? other.getQualifiedName() == null : this.getQualifiedName().equals(other.getQualifiedName()))
            && (this.getIdentifierHashId() == null ? other.getIdentifierHashId() == null : this.getIdentifierHashId().equals(other.getIdentifierHashId()))
            && (this.getLocationHashId() == null ? other.getLocationHashId() == null : this.getLocationHashId().equals(other.getLocationHashId()))
            && (this.getParentHashId() == null ? other.getParentHashId() == null : this.getParentHashId().equals(other.getParentHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getQualifiedName() == null) ? 0 : getQualifiedName().hashCode());
        result = prime * result + ((getIdentifierHashId() == null) ? 0 : getIdentifierHashId().hashCode());
        result = prime * result + ((getLocationHashId() == null) ? 0 : getLocationHashId().hashCode());
        result = prime * result + ((getParentHashId() == null) ? 0 : getParentHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", qualifiedName=").append(qualifiedName);
        sb.append(", identifierHashId=").append(identifierHashId);
        sb.append(", locationHashId=").append(locationHashId);
        sb.append(", parentHashId=").append(parentHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}