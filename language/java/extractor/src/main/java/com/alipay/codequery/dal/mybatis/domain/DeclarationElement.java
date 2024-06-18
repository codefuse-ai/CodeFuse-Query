package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class DeclarationElement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: declaration_element.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: declaration_element.index_order")
    private Integer indexOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: declaration_element.declaration_statement_hash_id")
    private Long declarationStatementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    public DeclarationElement(Long elementHashId, Integer indexOrder, Long declarationStatementHashId) {
        this.elementHashId = elementHashId;
        this.indexOrder = indexOrder;
        this.declarationStatementHashId = declarationStatementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    public DeclarationElement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: declaration_element.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: declaration_element.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: declaration_element.index_order")
    public Integer getIndexOrder() {
        return indexOrder;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: declaration_element.index_order")
    public void setIndexOrder(Integer indexOrder) {
        this.indexOrder = indexOrder;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: declaration_element.declaration_statement_hash_id")
    public Long getDeclarationStatementHashId() {
        return declarationStatementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: declaration_element.declaration_statement_hash_id")
    public void setDeclarationStatementHashId(Long declarationStatementHashId) {
        this.declarationStatementHashId = declarationStatementHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
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
        DeclarationElement other = (DeclarationElement) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getIndexOrder() == null ? other.getIndexOrder() == null : this.getIndexOrder().equals(other.getIndexOrder()))
            && (this.getDeclarationStatementHashId() == null ? other.getDeclarationStatementHashId() == null : this.getDeclarationStatementHashId().equals(other.getDeclarationStatementHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getIndexOrder() == null) ? 0 : getIndexOrder().hashCode());
        result = prime * result + ((getDeclarationStatementHashId() == null) ? 0 : getDeclarationStatementHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", indexOrder=").append(indexOrder);
        sb.append(", declarationStatementHashId=").append(declarationStatementHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}