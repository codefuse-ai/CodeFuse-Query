package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class BinaryExpression implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: binary_expression.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: binary_expression.lhs_hash_id")
    private Long lhsHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: binary_expression.rhs_hash_id")
    private Long rhsHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: binary_expression.opcode")
    private String opcode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    public BinaryExpression(Long elementHashId, Long lhsHashId, Long rhsHashId, String opcode) {
        this.elementHashId = elementHashId;
        this.lhsHashId = lhsHashId;
        this.rhsHashId = rhsHashId;
        this.opcode = opcode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    public BinaryExpression() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: binary_expression.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: binary_expression.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: binary_expression.lhs_hash_id")
    public Long getLhsHashId() {
        return lhsHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: binary_expression.lhs_hash_id")
    public void setLhsHashId(Long lhsHashId) {
        this.lhsHashId = lhsHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: binary_expression.rhs_hash_id")
    public Long getRhsHashId() {
        return rhsHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: binary_expression.rhs_hash_id")
    public void setRhsHashId(Long rhsHashId) {
        this.rhsHashId = rhsHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: binary_expression.opcode")
    public String getOpcode() {
        return opcode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: binary_expression.opcode")
    public void setOpcode(String opcode) {
        this.opcode = opcode == null ? null : opcode.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
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
        BinaryExpression other = (BinaryExpression) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getLhsHashId() == null ? other.getLhsHashId() == null : this.getLhsHashId().equals(other.getLhsHashId()))
            && (this.getRhsHashId() == null ? other.getRhsHashId() == null : this.getRhsHashId().equals(other.getRhsHashId()))
            && (this.getOpcode() == null ? other.getOpcode() == null : this.getOpcode().equals(other.getOpcode()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getLhsHashId() == null) ? 0 : getLhsHashId().hashCode());
        result = prime * result + ((getRhsHashId() == null) ? 0 : getRhsHashId().hashCode());
        result = prime * result + ((getOpcode() == null) ? 0 : getOpcode().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", lhsHashId=").append(lhsHashId);
        sb.append(", rhsHashId=").append(rhsHashId);
        sb.append(", opcode=").append(opcode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}