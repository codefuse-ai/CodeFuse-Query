package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class TryStatementWithFinally implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: try_statement_with_finally.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: try_statement_with_finally.try_block_hash_id")
    private Long tryBlockHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: try_statement_with_finally.finally_block_hash_id")
    private Long finallyBlockHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    public TryStatementWithFinally(Long elementHashId, Long tryBlockHashId, Long finallyBlockHashId) {
        this.elementHashId = elementHashId;
        this.tryBlockHashId = tryBlockHashId;
        this.finallyBlockHashId = finallyBlockHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    public TryStatementWithFinally() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: try_statement_with_finally.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: try_statement_with_finally.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: try_statement_with_finally.try_block_hash_id")
    public Long getTryBlockHashId() {
        return tryBlockHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: try_statement_with_finally.try_block_hash_id")
    public void setTryBlockHashId(Long tryBlockHashId) {
        this.tryBlockHashId = tryBlockHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: try_statement_with_finally.finally_block_hash_id")
    public Long getFinallyBlockHashId() {
        return finallyBlockHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: try_statement_with_finally.finally_block_hash_id")
    public void setFinallyBlockHashId(Long finallyBlockHashId) {
        this.finallyBlockHashId = finallyBlockHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
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
        TryStatementWithFinally other = (TryStatementWithFinally) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getTryBlockHashId() == null ? other.getTryBlockHashId() == null : this.getTryBlockHashId().equals(other.getTryBlockHashId()))
            && (this.getFinallyBlockHashId() == null ? other.getFinallyBlockHashId() == null : this.getFinallyBlockHashId().equals(other.getFinallyBlockHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getTryBlockHashId() == null) ? 0 : getTryBlockHashId().hashCode());
        result = prime * result + ((getFinallyBlockHashId() == null) ? 0 : getFinallyBlockHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", tryBlockHashId=").append(tryBlockHashId);
        sb.append(", finallyBlockHashId=").append(finallyBlockHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}