package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class PolyadicExpression implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: polyadic_expression.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: polyadic_expression.size")
    private Integer size;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: polyadic_expression.opcode")
    private String opcode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: polyadic_expression")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: polyadic_expression")
    public PolyadicExpression(Long elementHashId, Integer size, String opcode) {
        this.elementHashId = elementHashId;
        this.size = size;
        this.opcode = opcode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: polyadic_expression")
    public PolyadicExpression() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: polyadic_expression.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: polyadic_expression.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: polyadic_expression.size")
    public Integer getSize() {
        return size;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: polyadic_expression.size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: polyadic_expression.opcode")
    public String getOpcode() {
        return opcode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: polyadic_expression.opcode")
    public void setOpcode(String opcode) {
        this.opcode = opcode == null ? null : opcode.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: polyadic_expression")
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
        PolyadicExpression other = (PolyadicExpression) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
            && (this.getOpcode() == null ? other.getOpcode() == null : this.getOpcode().equals(other.getOpcode()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: polyadic_expression")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        result = prime * result + ((getOpcode() == null) ? 0 : getOpcode().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: polyadic_expression")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", size=").append(size);
        sb.append(", opcode=").append(opcode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}