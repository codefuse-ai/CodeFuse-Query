package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class TryStatementWithoutFinally implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: try_statement_without_finally.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: try_statement_without_finally.try_block_hash_id")
    private Long tryBlockHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    public TryStatementWithoutFinally(Long elementHashId, Long tryBlockHashId) {
        this.elementHashId = elementHashId;
        this.tryBlockHashId = tryBlockHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    public TryStatementWithoutFinally() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: try_statement_without_finally.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: try_statement_without_finally.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: try_statement_without_finally.try_block_hash_id")
    public Long getTryBlockHashId() {
        return tryBlockHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: try_statement_without_finally.try_block_hash_id")
    public void setTryBlockHashId(Long tryBlockHashId) {
        this.tryBlockHashId = tryBlockHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
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
        TryStatementWithoutFinally other = (TryStatementWithoutFinally) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getTryBlockHashId() == null ? other.getTryBlockHashId() == null : this.getTryBlockHashId().equals(other.getTryBlockHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getTryBlockHashId() == null) ? 0 : getTryBlockHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", tryBlockHashId=").append(tryBlockHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}