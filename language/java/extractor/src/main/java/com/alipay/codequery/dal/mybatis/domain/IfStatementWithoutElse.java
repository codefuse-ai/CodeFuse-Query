package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class IfStatementWithoutElse implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: if_statement_without_else.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: if_statement_without_else.condition_hash_id")
    private Long conditionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: if_statement_without_else.consequent_hash_id")
    private Long consequentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    public IfStatementWithoutElse(Long elementHashId, Long conditionHashId, Long consequentHashId) {
        this.elementHashId = elementHashId;
        this.conditionHashId = conditionHashId;
        this.consequentHashId = consequentHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    public IfStatementWithoutElse() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: if_statement_without_else.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: if_statement_without_else.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: if_statement_without_else.condition_hash_id")
    public Long getConditionHashId() {
        return conditionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: if_statement_without_else.condition_hash_id")
    public void setConditionHashId(Long conditionHashId) {
        this.conditionHashId = conditionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: if_statement_without_else.consequent_hash_id")
    public Long getConsequentHashId() {
        return consequentHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: if_statement_without_else.consequent_hash_id")
    public void setConsequentHashId(Long consequentHashId) {
        this.consequentHashId = consequentHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
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
        IfStatementWithoutElse other = (IfStatementWithoutElse) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getConditionHashId() == null ? other.getConditionHashId() == null : this.getConditionHashId().equals(other.getConditionHashId()))
            && (this.getConsequentHashId() == null ? other.getConsequentHashId() == null : this.getConsequentHashId().equals(other.getConsequentHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getConditionHashId() == null) ? 0 : getConditionHashId().hashCode());
        result = prime * result + ((getConsequentHashId() == null) ? 0 : getConsequentHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", conditionHashId=").append(conditionHashId);
        sb.append(", consequentHashId=").append(consequentHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}