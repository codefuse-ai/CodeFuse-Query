package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class ReferenceRelation implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_relation.reference_element_hash_id")
    private Long referenceElementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_relation.definition_element_hash_id")
    private Long definitionElementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    public ReferenceRelation(Long referenceElementHashId, Long definitionElementHashId) {
        this.referenceElementHashId = referenceElementHashId;
        this.definitionElementHashId = definitionElementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    public ReferenceRelation() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_relation.reference_element_hash_id")
    public Long getReferenceElementHashId() {
        return referenceElementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_relation.reference_element_hash_id")
    public void setReferenceElementHashId(Long referenceElementHashId) {
        this.referenceElementHashId = referenceElementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_relation.definition_element_hash_id")
    public Long getDefinitionElementHashId() {
        return definitionElementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_relation.definition_element_hash_id")
    public void setDefinitionElementHashId(Long definitionElementHashId) {
        this.definitionElementHashId = definitionElementHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
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
        ReferenceRelation other = (ReferenceRelation) that;
        return (this.getReferenceElementHashId() == null ? other.getReferenceElementHashId() == null : this.getReferenceElementHashId().equals(other.getReferenceElementHashId()))
            && (this.getDefinitionElementHashId() == null ? other.getDefinitionElementHashId() == null : this.getDefinitionElementHashId().equals(other.getDefinitionElementHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReferenceElementHashId() == null) ? 0 : getReferenceElementHashId().hashCode());
        result = prime * result + ((getDefinitionElementHashId() == null) ? 0 : getDefinitionElementHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", referenceElementHashId=").append(referenceElementHashId);
        sb.append(", definitionElementHashId=").append(definitionElementHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}