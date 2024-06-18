package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class LabeledStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: labeled_statement.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: labeled_statement.labeled_hash_identifier_hash_id")
    private Long labeledHashIdentifierHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: labeled_statement.statement_hash_id")
    private Long statementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    public LabeledStatement(Long elementHashId, Long labeledHashIdentifierHashId, Long statementHashId) {
        this.elementHashId = elementHashId;
        this.labeledHashIdentifierHashId = labeledHashIdentifierHashId;
        this.statementHashId = statementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    public LabeledStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: labeled_statement.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: labeled_statement.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: labeled_statement.labeled_hash_identifier_hash_id")
    public Long getLabeledHashIdentifierHashId() {
        return labeledHashIdentifierHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: labeled_statement.labeled_hash_identifier_hash_id")
    public void setLabeledHashIdentifierHashId(Long labeledHashIdentifierHashId) {
        this.labeledHashIdentifierHashId = labeledHashIdentifierHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: labeled_statement.statement_hash_id")
    public Long getStatementHashId() {
        return statementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: labeled_statement.statement_hash_id")
    public void setStatementHashId(Long statementHashId) {
        this.statementHashId = statementHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
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
        LabeledStatement other = (LabeledStatement) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getLabeledHashIdentifierHashId() == null ? other.getLabeledHashIdentifierHashId() == null : this.getLabeledHashIdentifierHashId().equals(other.getLabeledHashIdentifierHashId()))
            && (this.getStatementHashId() == null ? other.getStatementHashId() == null : this.getStatementHashId().equals(other.getStatementHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getLabeledHashIdentifierHashId() == null) ? 0 : getLabeledHashIdentifierHashId().hashCode());
        result = prime * result + ((getStatementHashId() == null) ? 0 : getStatementHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", labeledHashIdentifierHashId=").append(labeledHashIdentifierHashId);
        sb.append(", statementHashId=").append(statementHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}