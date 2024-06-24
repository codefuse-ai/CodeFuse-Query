package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SynchronizedStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: synchronized_statement.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: synchronized_statement.lock_expression_hash_id")
    private Long lockExpressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: synchronized_statement.body_declaration_hash_id")
    private Long bodyDeclarationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    public SynchronizedStatement(Long elementHashId, Long lockExpressionHashId, Long bodyDeclarationHashId) {
        this.elementHashId = elementHashId;
        this.lockExpressionHashId = lockExpressionHashId;
        this.bodyDeclarationHashId = bodyDeclarationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    public SynchronizedStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: synchronized_statement.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: synchronized_statement.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: synchronized_statement.lock_expression_hash_id")
    public Long getLockExpressionHashId() {
        return lockExpressionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: synchronized_statement.lock_expression_hash_id")
    public void setLockExpressionHashId(Long lockExpressionHashId) {
        this.lockExpressionHashId = lockExpressionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: synchronized_statement.body_declaration_hash_id")
    public Long getBodyDeclarationHashId() {
        return bodyDeclarationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: synchronized_statement.body_declaration_hash_id")
    public void setBodyDeclarationHashId(Long bodyDeclarationHashId) {
        this.bodyDeclarationHashId = bodyDeclarationHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
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
        SynchronizedStatement other = (SynchronizedStatement) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getLockExpressionHashId() == null ? other.getLockExpressionHashId() == null : this.getLockExpressionHashId().equals(other.getLockExpressionHashId()))
            && (this.getBodyDeclarationHashId() == null ? other.getBodyDeclarationHashId() == null : this.getBodyDeclarationHashId().equals(other.getBodyDeclarationHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getLockExpressionHashId() == null) ? 0 : getLockExpressionHashId().hashCode());
        result = prime * result + ((getBodyDeclarationHashId() == null) ? 0 : getBodyDeclarationHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", lockExpressionHashId=").append(lockExpressionHashId);
        sb.append(", bodyDeclarationHashId=").append(bodyDeclarationHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}