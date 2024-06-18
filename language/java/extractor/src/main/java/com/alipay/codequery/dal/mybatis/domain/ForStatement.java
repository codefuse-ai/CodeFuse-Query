package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class ForStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: for_statement.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: for_statement.initialization_hash_id")
    private Long initializationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: for_statement.condition_hash_id")
    private Long conditionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: for_statement.update_hash_id")
    private Long updateHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: for_statement.body_hash_id")
    private Long bodyHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    public ForStatement(Long elementHashId, Long initializationHashId, Long conditionHashId, Long updateHashId, Long bodyHashId) {
        this.elementHashId = elementHashId;
        this.initializationHashId = initializationHashId;
        this.conditionHashId = conditionHashId;
        this.updateHashId = updateHashId;
        this.bodyHashId = bodyHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    public ForStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: for_statement.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: for_statement.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: for_statement.initialization_hash_id")
    public Long getInitializationHashId() {
        return initializationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: for_statement.initialization_hash_id")
    public void setInitializationHashId(Long initializationHashId) {
        this.initializationHashId = initializationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: for_statement.condition_hash_id")
    public Long getConditionHashId() {
        return conditionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: for_statement.condition_hash_id")
    public void setConditionHashId(Long conditionHashId) {
        this.conditionHashId = conditionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: for_statement.update_hash_id")
    public Long getUpdateHashId() {
        return updateHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: for_statement.update_hash_id")
    public void setUpdateHashId(Long updateHashId) {
        this.updateHashId = updateHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: for_statement.body_hash_id")
    public Long getBodyHashId() {
        return bodyHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: for_statement.body_hash_id")
    public void setBodyHashId(Long bodyHashId) {
        this.bodyHashId = bodyHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
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
        ForStatement other = (ForStatement) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getInitializationHashId() == null ? other.getInitializationHashId() == null : this.getInitializationHashId().equals(other.getInitializationHashId()))
            && (this.getConditionHashId() == null ? other.getConditionHashId() == null : this.getConditionHashId().equals(other.getConditionHashId()))
            && (this.getUpdateHashId() == null ? other.getUpdateHashId() == null : this.getUpdateHashId().equals(other.getUpdateHashId()))
            && (this.getBodyHashId() == null ? other.getBodyHashId() == null : this.getBodyHashId().equals(other.getBodyHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getInitializationHashId() == null) ? 0 : getInitializationHashId().hashCode());
        result = prime * result + ((getConditionHashId() == null) ? 0 : getConditionHashId().hashCode());
        result = prime * result + ((getUpdateHashId() == null) ? 0 : getUpdateHashId().hashCode());
        result = prime * result + ((getBodyHashId() == null) ? 0 : getBodyHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", initializationHashId=").append(initializationHashId);
        sb.append(", conditionHashId=").append(conditionHashId);
        sb.append(", updateHashId=").append(updateHashId);
        sb.append(", bodyHashId=").append(bodyHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}