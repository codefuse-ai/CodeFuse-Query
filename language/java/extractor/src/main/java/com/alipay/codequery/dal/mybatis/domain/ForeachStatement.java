package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class ForeachStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: foreach_statement.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: foreach_statement.iterated_value_hash_id")
    private Long iteratedValueHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: foreach_statement.iteration_parameter_hash_id")
    private Long iterationParameterHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: foreach_statement.body_hash_id")
    private Long bodyHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    public ForeachStatement(Long elementHashId, Long iteratedValueHashId, Long iterationParameterHashId, Long bodyHashId) {
        this.elementHashId = elementHashId;
        this.iteratedValueHashId = iteratedValueHashId;
        this.iterationParameterHashId = iterationParameterHashId;
        this.bodyHashId = bodyHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    public ForeachStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: foreach_statement.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: foreach_statement.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: foreach_statement.iterated_value_hash_id")
    public Long getIteratedValueHashId() {
        return iteratedValueHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: foreach_statement.iterated_value_hash_id")
    public void setIteratedValueHashId(Long iteratedValueHashId) {
        this.iteratedValueHashId = iteratedValueHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: foreach_statement.iteration_parameter_hash_id")
    public Long getIterationParameterHashId() {
        return iterationParameterHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: foreach_statement.iteration_parameter_hash_id")
    public void setIterationParameterHashId(Long iterationParameterHashId) {
        this.iterationParameterHashId = iterationParameterHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: foreach_statement.body_hash_id")
    public Long getBodyHashId() {
        return bodyHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: foreach_statement.body_hash_id")
    public void setBodyHashId(Long bodyHashId) {
        this.bodyHashId = bodyHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
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
        ForeachStatement other = (ForeachStatement) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getIteratedValueHashId() == null ? other.getIteratedValueHashId() == null : this.getIteratedValueHashId().equals(other.getIteratedValueHashId()))
            && (this.getIterationParameterHashId() == null ? other.getIterationParameterHashId() == null : this.getIterationParameterHashId().equals(other.getIterationParameterHashId()))
            && (this.getBodyHashId() == null ? other.getBodyHashId() == null : this.getBodyHashId().equals(other.getBodyHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getIteratedValueHashId() == null) ? 0 : getIteratedValueHashId().hashCode());
        result = prime * result + ((getIterationParameterHashId() == null) ? 0 : getIterationParameterHashId().hashCode());
        result = prime * result + ((getBodyHashId() == null) ? 0 : getBodyHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", iteratedValueHashId=").append(iteratedValueHashId);
        sb.append(", iterationParameterHashId=").append(iterationParameterHashId);
        sb.append(", bodyHashId=").append(bodyHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}