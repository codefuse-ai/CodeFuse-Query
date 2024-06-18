package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class ReferenceParameterList implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.type_element_hash_id")
    private Long typeElementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.list_hash_id")
    private Long listHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.index_order")
    private Integer indexOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.parent_hash_id")
    private Long parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.debug_message")
    private String debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.location_hash_id")
    private Long locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    public ReferenceParameterList(Long typeElementHashId, Long listHashId, Integer indexOrder, Long parentHashId, String debugMessage, Long locationHashId) {
        this.typeElementHashId = typeElementHashId;
        this.listHashId = listHashId;
        this.indexOrder = indexOrder;
        this.parentHashId = parentHashId;
        this.debugMessage = debugMessage;
        this.locationHashId = locationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    public ReferenceParameterList() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.type_element_hash_id")
    public Long getTypeElementHashId() {
        return typeElementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.type_element_hash_id")
    public void setTypeElementHashId(Long typeElementHashId) {
        this.typeElementHashId = typeElementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.list_hash_id")
    public Long getListHashId() {
        return listHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.list_hash_id")
    public void setListHashId(Long listHashId) {
        this.listHashId = listHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.index_order")
    public Integer getIndexOrder() {
        return indexOrder;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.index_order")
    public void setIndexOrder(Integer indexOrder) {
        this.indexOrder = indexOrder;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.parent_hash_id")
    public Long getParentHashId() {
        return parentHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.parent_hash_id")
    public void setParentHashId(Long parentHashId) {
        this.parentHashId = parentHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.debug_message")
    public String getDebugMessage() {
        return debugMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.debug_message")
    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage == null ? null : debugMessage.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.location_hash_id")
    public Long getLocationHashId() {
        return locationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.location_hash_id")
    public void setLocationHashId(Long locationHashId) {
        this.locationHashId = locationHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
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
        ReferenceParameterList other = (ReferenceParameterList) that;
        return (this.getTypeElementHashId() == null ? other.getTypeElementHashId() == null : this.getTypeElementHashId().equals(other.getTypeElementHashId()))
            && (this.getListHashId() == null ? other.getListHashId() == null : this.getListHashId().equals(other.getListHashId()))
            && (this.getIndexOrder() == null ? other.getIndexOrder() == null : this.getIndexOrder().equals(other.getIndexOrder()))
            && (this.getParentHashId() == null ? other.getParentHashId() == null : this.getParentHashId().equals(other.getParentHashId()))
            && (this.getDebugMessage() == null ? other.getDebugMessage() == null : this.getDebugMessage().equals(other.getDebugMessage()))
            && (this.getLocationHashId() == null ? other.getLocationHashId() == null : this.getLocationHashId().equals(other.getLocationHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTypeElementHashId() == null) ? 0 : getTypeElementHashId().hashCode());
        result = prime * result + ((getListHashId() == null) ? 0 : getListHashId().hashCode());
        result = prime * result + ((getIndexOrder() == null) ? 0 : getIndexOrder().hashCode());
        result = prime * result + ((getParentHashId() == null) ? 0 : getParentHashId().hashCode());
        result = prime * result + ((getDebugMessage() == null) ? 0 : getDebugMessage().hashCode());
        result = prime * result + ((getLocationHashId() == null) ? 0 : getLocationHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", typeElementHashId=").append(typeElementHashId);
        sb.append(", listHashId=").append(listHashId);
        sb.append(", indexOrder=").append(indexOrder);
        sb.append(", parentHashId=").append(parentHashId);
        sb.append(", debugMessage=").append(debugMessage);
        sb.append(", locationHashId=").append(locationHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}