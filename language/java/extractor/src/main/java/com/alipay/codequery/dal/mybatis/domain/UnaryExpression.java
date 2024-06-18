package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class UnaryExpression implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: unary_expression.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: unary_expression.operand_hash_id")
    private Long operandHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: unary_expression.opcode")
    private String opcode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: unary_expression.is_postfix")
    private Integer isPostfix;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    public UnaryExpression(Long elementHashId, Long operandHashId, String opcode, Integer isPostfix) {
        this.elementHashId = elementHashId;
        this.operandHashId = operandHashId;
        this.opcode = opcode;
        this.isPostfix = isPostfix;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    public UnaryExpression() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: unary_expression.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: unary_expression.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: unary_expression.operand_hash_id")
    public Long getOperandHashId() {
        return operandHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: unary_expression.operand_hash_id")
    public void setOperandHashId(Long operandHashId) {
        this.operandHashId = operandHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: unary_expression.opcode")
    public String getOpcode() {
        return opcode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: unary_expression.opcode")
    public void setOpcode(String opcode) {
        this.opcode = opcode == null ? null : opcode.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: unary_expression.is_postfix")
    public Integer getIsPostfix() {
        return isPostfix;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: unary_expression.is_postfix")
    public void setIsPostfix(Integer isPostfix) {
        this.isPostfix = isPostfix;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
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
        UnaryExpression other = (UnaryExpression) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getOperandHashId() == null ? other.getOperandHashId() == null : this.getOperandHashId().equals(other.getOperandHashId()))
            && (this.getOpcode() == null ? other.getOpcode() == null : this.getOpcode().equals(other.getOpcode()))
            && (this.getIsPostfix() == null ? other.getIsPostfix() == null : this.getIsPostfix().equals(other.getIsPostfix()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getOperandHashId() == null) ? 0 : getOperandHashId().hashCode());
        result = prime * result + ((getOpcode() == null) ? 0 : getOpcode().hashCode());
        result = prime * result + ((getIsPostfix() == null) ? 0 : getIsPostfix().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", operandHashId=").append(operandHashId);
        sb.append(", opcode=").append(opcode);
        sb.append(", isPostfix=").append(isPostfix);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}