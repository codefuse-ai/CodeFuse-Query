package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class ThisExpressionWithQualifier implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: this_expression_with_qualifier.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: this_expression_with_qualifier.qualifier_hash_id")
    private Long qualifierHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: this_expression_with_qualifier")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: this_expression_with_qualifier")
    public ThisExpressionWithQualifier(Long elementHashId, Long qualifierHashId) {
        this.elementHashId = elementHashId;
        this.qualifierHashId = qualifierHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: this_expression_with_qualifier")
    public ThisExpressionWithQualifier() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: this_expression_with_qualifier.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: this_expression_with_qualifier.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: this_expression_with_qualifier.qualifier_hash_id")
    public Long getQualifierHashId() {
        return qualifierHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: this_expression_with_qualifier.qualifier_hash_id")
    public void setQualifierHashId(Long qualifierHashId) {
        this.qualifierHashId = qualifierHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: this_expression_with_qualifier")
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
        ThisExpressionWithQualifier other = (ThisExpressionWithQualifier) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getQualifierHashId() == null ? other.getQualifierHashId() == null : this.getQualifierHashId().equals(other.getQualifierHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: this_expression_with_qualifier")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getQualifierHashId() == null) ? 0 : getQualifierHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: this_expression_with_qualifier")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", qualifierHashId=").append(qualifierHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}