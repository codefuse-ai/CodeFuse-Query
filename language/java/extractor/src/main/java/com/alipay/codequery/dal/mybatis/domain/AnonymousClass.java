package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class AnonymousClass implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: anonymous_class.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: anonymous_class.base_class_reference_hash_id")
    private Long baseClassReferenceHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: anonymous_class.base_class_type_hash_id")
    private Long baseClassTypeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: anonymous_class.location_hash_id")
    private Long locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: anonymous_class.parent_hash_id")
    private Long parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    public AnonymousClass(Long elementHashId, Long baseClassReferenceHashId, Long baseClassTypeHashId, Long locationHashId, Long parentHashId) {
        this.elementHashId = elementHashId;
        this.baseClassReferenceHashId = baseClassReferenceHashId;
        this.baseClassTypeHashId = baseClassTypeHashId;
        this.locationHashId = locationHashId;
        this.parentHashId = parentHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    public AnonymousClass() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: anonymous_class.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: anonymous_class.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: anonymous_class.base_class_reference_hash_id")
    public Long getBaseClassReferenceHashId() {
        return baseClassReferenceHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: anonymous_class.base_class_reference_hash_id")
    public void setBaseClassReferenceHashId(Long baseClassReferenceHashId) {
        this.baseClassReferenceHashId = baseClassReferenceHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: anonymous_class.base_class_type_hash_id")
    public Long getBaseClassTypeHashId() {
        return baseClassTypeHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: anonymous_class.base_class_type_hash_id")
    public void setBaseClassTypeHashId(Long baseClassTypeHashId) {
        this.baseClassTypeHashId = baseClassTypeHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: anonymous_class.location_hash_id")
    public Long getLocationHashId() {
        return locationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: anonymous_class.location_hash_id")
    public void setLocationHashId(Long locationHashId) {
        this.locationHashId = locationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: anonymous_class.parent_hash_id")
    public Long getParentHashId() {
        return parentHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: anonymous_class.parent_hash_id")
    public void setParentHashId(Long parentHashId) {
        this.parentHashId = parentHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
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
        AnonymousClass other = (AnonymousClass) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getBaseClassReferenceHashId() == null ? other.getBaseClassReferenceHashId() == null : this.getBaseClassReferenceHashId().equals(other.getBaseClassReferenceHashId()))
            && (this.getBaseClassTypeHashId() == null ? other.getBaseClassTypeHashId() == null : this.getBaseClassTypeHashId().equals(other.getBaseClassTypeHashId()))
            && (this.getLocationHashId() == null ? other.getLocationHashId() == null : this.getLocationHashId().equals(other.getLocationHashId()))
            && (this.getParentHashId() == null ? other.getParentHashId() == null : this.getParentHashId().equals(other.getParentHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getBaseClassReferenceHashId() == null) ? 0 : getBaseClassReferenceHashId().hashCode());
        result = prime * result + ((getBaseClassTypeHashId() == null) ? 0 : getBaseClassTypeHashId().hashCode());
        result = prime * result + ((getLocationHashId() == null) ? 0 : getLocationHashId().hashCode());
        result = prime * result + ((getParentHashId() == null) ? 0 : getParentHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", baseClassReferenceHashId=").append(baseClassReferenceHashId);
        sb.append(", baseClassTypeHashId=").append(baseClassTypeHashId);
        sb.append(", locationHashId=").append(locationHashId);
        sb.append(", parentHashId=").append(parentHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}