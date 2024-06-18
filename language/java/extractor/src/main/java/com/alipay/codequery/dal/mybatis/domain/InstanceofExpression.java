package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class InstanceofExpression implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: instanceof_expression.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: instanceof_expression.operand_hash_id")
    private Long operandHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: instanceof_expression.check_type_hash_id")
    private Long checkTypeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: instanceof_expression.pattern_hash_id")
    private Long patternHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    public InstanceofExpression(Long elementHashId, Long operandHashId, Long checkTypeHashId, Long patternHashId) {
        this.elementHashId = elementHashId;
        this.operandHashId = operandHashId;
        this.checkTypeHashId = checkTypeHashId;
        this.patternHashId = patternHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    public InstanceofExpression() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: instanceof_expression.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: instanceof_expression.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: instanceof_expression.operand_hash_id")
    public Long getOperandHashId() {
        return operandHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: instanceof_expression.operand_hash_id")
    public void setOperandHashId(Long operandHashId) {
        this.operandHashId = operandHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: instanceof_expression.check_type_hash_id")
    public Long getCheckTypeHashId() {
        return checkTypeHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: instanceof_expression.check_type_hash_id")
    public void setCheckTypeHashId(Long checkTypeHashId) {
        this.checkTypeHashId = checkTypeHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: instanceof_expression.pattern_hash_id")
    public Long getPatternHashId() {
        return patternHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: instanceof_expression.pattern_hash_id")
    public void setPatternHashId(Long patternHashId) {
        this.patternHashId = patternHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
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
        InstanceofExpression other = (InstanceofExpression) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getOperandHashId() == null ? other.getOperandHashId() == null : this.getOperandHashId().equals(other.getOperandHashId()))
            && (this.getCheckTypeHashId() == null ? other.getCheckTypeHashId() == null : this.getCheckTypeHashId().equals(other.getCheckTypeHashId()))
            && (this.getPatternHashId() == null ? other.getPatternHashId() == null : this.getPatternHashId().equals(other.getPatternHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getOperandHashId() == null) ? 0 : getOperandHashId().hashCode());
        result = prime * result + ((getCheckTypeHashId() == null) ? 0 : getCheckTypeHashId().hashCode());
        result = prime * result + ((getPatternHashId() == null) ? 0 : getPatternHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", operandHashId=").append(operandHashId);
        sb.append(", checkTypeHashId=").append(checkTypeHashId);
        sb.append(", patternHashId=").append(patternHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}