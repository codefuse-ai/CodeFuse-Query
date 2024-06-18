package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class AssertStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: assert_statement.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: assert_statement.assert_condition_hash_id")
    private Long assertConditionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: assert_statement.assert_description_hash_id")
    private Long assertDescriptionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    public AssertStatement(Long elementHashId, Long assertConditionHashId, Long assertDescriptionHashId) {
        this.elementHashId = elementHashId;
        this.assertConditionHashId = assertConditionHashId;
        this.assertDescriptionHashId = assertDescriptionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    public AssertStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: assert_statement.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: assert_statement.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: assert_statement.assert_condition_hash_id")
    public Long getAssertConditionHashId() {
        return assertConditionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: assert_statement.assert_condition_hash_id")
    public void setAssertConditionHashId(Long assertConditionHashId) {
        this.assertConditionHashId = assertConditionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: assert_statement.assert_description_hash_id")
    public Long getAssertDescriptionHashId() {
        return assertDescriptionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: assert_statement.assert_description_hash_id")
    public void setAssertDescriptionHashId(Long assertDescriptionHashId) {
        this.assertDescriptionHashId = assertDescriptionHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
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
        AssertStatement other = (AssertStatement) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getAssertConditionHashId() == null ? other.getAssertConditionHashId() == null : this.getAssertConditionHashId().equals(other.getAssertConditionHashId()))
            && (this.getAssertDescriptionHashId() == null ? other.getAssertDescriptionHashId() == null : this.getAssertDescriptionHashId().equals(other.getAssertDescriptionHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getAssertConditionHashId() == null) ? 0 : getAssertConditionHashId().hashCode());
        result = prime * result + ((getAssertDescriptionHashId() == null) ? 0 : getAssertDescriptionHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", assertConditionHashId=").append(assertConditionHashId);
        sb.append(", assertDescriptionHashId=").append(assertDescriptionHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}