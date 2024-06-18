package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class ThrowStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: throw_statement.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: throw_statement.exception_hash_id")
    private Long exceptionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: throw_statement.block_hash_id")
    private Long blockHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: throw_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: throw_statement")
    public ThrowStatement(Long elementHashId, Long exceptionHashId, Long blockHashId) {
        this.elementHashId = elementHashId;
        this.exceptionHashId = exceptionHashId;
        this.blockHashId = blockHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: throw_statement")
    public ThrowStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: throw_statement.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: throw_statement.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: throw_statement.exception_hash_id")
    public Long getExceptionHashId() {
        return exceptionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: throw_statement.exception_hash_id")
    public void setExceptionHashId(Long exceptionHashId) {
        this.exceptionHashId = exceptionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: throw_statement.block_hash_id")
    public Long getBlockHashId() {
        return blockHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: throw_statement.block_hash_id")
    public void setBlockHashId(Long blockHashId) {
        this.blockHashId = blockHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: throw_statement")
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
        ThrowStatement other = (ThrowStatement) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getExceptionHashId() == null ? other.getExceptionHashId() == null : this.getExceptionHashId().equals(other.getExceptionHashId()))
            && (this.getBlockHashId() == null ? other.getBlockHashId() == null : this.getBlockHashId().equals(other.getBlockHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: throw_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getExceptionHashId() == null) ? 0 : getExceptionHashId().hashCode());
        result = prime * result + ((getBlockHashId() == null) ? 0 : getBlockHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: throw_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", exceptionHashId=").append(exceptionHashId);
        sb.append(", blockHashId=").append(blockHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}