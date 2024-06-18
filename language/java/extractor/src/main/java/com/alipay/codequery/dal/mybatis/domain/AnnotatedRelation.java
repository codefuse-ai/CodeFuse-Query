package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class AnnotatedRelation implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotated_relation.annotation_hash_id")
    private Long annotationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotated_relation.annotated_item_hash_id")
    private Long annotatedItemHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    public AnnotatedRelation(Long annotationHashId, Long annotatedItemHashId) {
        this.annotationHashId = annotationHashId;
        this.annotatedItemHashId = annotatedItemHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    public AnnotatedRelation() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotated_relation.annotation_hash_id")
    public Long getAnnotationHashId() {
        return annotationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotated_relation.annotation_hash_id")
    public void setAnnotationHashId(Long annotationHashId) {
        this.annotationHashId = annotationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotated_relation.annotated_item_hash_id")
    public Long getAnnotatedItemHashId() {
        return annotatedItemHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotated_relation.annotated_item_hash_id")
    public void setAnnotatedItemHashId(Long annotatedItemHashId) {
        this.annotatedItemHashId = annotatedItemHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
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
        AnnotatedRelation other = (AnnotatedRelation) that;
        return (this.getAnnotationHashId() == null ? other.getAnnotationHashId() == null : this.getAnnotationHashId().equals(other.getAnnotationHashId()))
            && (this.getAnnotatedItemHashId() == null ? other.getAnnotatedItemHashId() == null : this.getAnnotatedItemHashId().equals(other.getAnnotatedItemHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAnnotationHashId() == null) ? 0 : getAnnotationHashId().hashCode());
        result = prime * result + ((getAnnotatedItemHashId() == null) ? 0 : getAnnotatedItemHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", annotationHashId=").append(annotationHashId);
        sb.append(", annotatedItemHashId=").append(annotatedItemHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}