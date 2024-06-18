package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class AnnotationDeclaration implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration.qualified_name")
    private String qualifiedName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration")
    public AnnotationDeclaration(Long elementHashId, String qualifiedName) {
        this.elementHashId = elementHashId;
        this.qualifiedName = qualifiedName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration")
    public AnnotationDeclaration() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration.qualified_name")
    public String getQualifiedName() {
        return qualifiedName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration.qualified_name")
    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName == null ? null : qualifiedName.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration")
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
        AnnotationDeclaration other = (AnnotationDeclaration) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getQualifiedName() == null ? other.getQualifiedName() == null : this.getQualifiedName().equals(other.getQualifiedName()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getQualifiedName() == null) ? 0 : getQualifiedName().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", qualifiedName=").append(qualifiedName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}