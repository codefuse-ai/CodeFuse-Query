package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class AnnotationAccessArgumentWithoutName implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.annotation_access_hash_id")
    private Long annotationAccessHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.argument_value_hash_id")
    private Long argumentValueHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.location_hash_id")
    private Long locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.index_order")
    private Integer indexOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.debug_message")
    private String debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    public AnnotationAccessArgumentWithoutName(Long elementHashId, Long annotationAccessHashId, Long argumentValueHashId, Long locationHashId, Integer indexOrder, String debugMessage) {
        this.elementHashId = elementHashId;
        this.annotationAccessHashId = annotationAccessHashId;
        this.argumentValueHashId = argumentValueHashId;
        this.locationHashId = locationHashId;
        this.indexOrder = indexOrder;
        this.debugMessage = debugMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    public AnnotationAccessArgumentWithoutName() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.annotation_access_hash_id")
    public Long getAnnotationAccessHashId() {
        return annotationAccessHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.annotation_access_hash_id")
    public void setAnnotationAccessHashId(Long annotationAccessHashId) {
        this.annotationAccessHashId = annotationAccessHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.argument_value_hash_id")
    public Long getArgumentValueHashId() {
        return argumentValueHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.argument_value_hash_id")
    public void setArgumentValueHashId(Long argumentValueHashId) {
        this.argumentValueHashId = argumentValueHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.location_hash_id")
    public Long getLocationHashId() {
        return locationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.location_hash_id")
    public void setLocationHashId(Long locationHashId) {
        this.locationHashId = locationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.index_order")
    public Integer getIndexOrder() {
        return indexOrder;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.index_order")
    public void setIndexOrder(Integer indexOrder) {
        this.indexOrder = indexOrder;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.debug_message")
    public String getDebugMessage() {
        return debugMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.debug_message")
    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage == null ? null : debugMessage.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
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
        AnnotationAccessArgumentWithoutName other = (AnnotationAccessArgumentWithoutName) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getAnnotationAccessHashId() == null ? other.getAnnotationAccessHashId() == null : this.getAnnotationAccessHashId().equals(other.getAnnotationAccessHashId()))
            && (this.getArgumentValueHashId() == null ? other.getArgumentValueHashId() == null : this.getArgumentValueHashId().equals(other.getArgumentValueHashId()))
            && (this.getLocationHashId() == null ? other.getLocationHashId() == null : this.getLocationHashId().equals(other.getLocationHashId()))
            && (this.getIndexOrder() == null ? other.getIndexOrder() == null : this.getIndexOrder().equals(other.getIndexOrder()))
            && (this.getDebugMessage() == null ? other.getDebugMessage() == null : this.getDebugMessage().equals(other.getDebugMessage()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getAnnotationAccessHashId() == null) ? 0 : getAnnotationAccessHashId().hashCode());
        result = prime * result + ((getArgumentValueHashId() == null) ? 0 : getArgumentValueHashId().hashCode());
        result = prime * result + ((getLocationHashId() == null) ? 0 : getLocationHashId().hashCode());
        result = prime * result + ((getIndexOrder() == null) ? 0 : getIndexOrder().hashCode());
        result = prime * result + ((getDebugMessage() == null) ? 0 : getDebugMessage().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", annotationAccessHashId=").append(annotationAccessHashId);
        sb.append(", argumentValueHashId=").append(argumentValueHashId);
        sb.append(", locationHashId=").append(locationHashId);
        sb.append(", indexOrder=").append(indexOrder);
        sb.append(", debugMessage=").append(debugMessage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}