package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class JavadocTag implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.value")
    private String value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.containing_comment_hash_id")
    private Long containingCommentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.index_order")
    private Integer indexOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.location_hash_id")
    private Long locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_tag")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_tag")
    public JavadocTag(Long elementHashId, String name, String value, Long containingCommentHashId, Integer indexOrder, Long locationHashId) {
        this.elementHashId = elementHashId;
        this.name = name;
        this.value = value;
        this.containingCommentHashId = containingCommentHashId;
        this.indexOrder = indexOrder;
        this.locationHashId = locationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_tag")
    public JavadocTag() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.value")
    public String getValue() {
        return value;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.value")
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.containing_comment_hash_id")
    public Long getContainingCommentHashId() {
        return containingCommentHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.containing_comment_hash_id")
    public void setContainingCommentHashId(Long containingCommentHashId) {
        this.containingCommentHashId = containingCommentHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.index_order")
    public Integer getIndexOrder() {
        return indexOrder;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.index_order")
    public void setIndexOrder(Integer indexOrder) {
        this.indexOrder = indexOrder;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.location_hash_id")
    public Long getLocationHashId() {
        return locationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.location_hash_id")
    public void setLocationHashId(Long locationHashId) {
        this.locationHashId = locationHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_tag")
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
        JavadocTag other = (JavadocTag) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getContainingCommentHashId() == null ? other.getContainingCommentHashId() == null : this.getContainingCommentHashId().equals(other.getContainingCommentHashId()))
            && (this.getIndexOrder() == null ? other.getIndexOrder() == null : this.getIndexOrder().equals(other.getIndexOrder()))
            && (this.getLocationHashId() == null ? other.getLocationHashId() == null : this.getLocationHashId().equals(other.getLocationHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_tag")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getContainingCommentHashId() == null) ? 0 : getContainingCommentHashId().hashCode());
        result = prime * result + ((getIndexOrder() == null) ? 0 : getIndexOrder().hashCode());
        result = prime * result + ((getLocationHashId() == null) ? 0 : getLocationHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_tag")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", name=").append(name);
        sb.append(", value=").append(value);
        sb.append(", containingCommentHashId=").append(containingCommentHashId);
        sb.append(", indexOrder=").append(indexOrder);
        sb.append(", locationHashId=").append(locationHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}