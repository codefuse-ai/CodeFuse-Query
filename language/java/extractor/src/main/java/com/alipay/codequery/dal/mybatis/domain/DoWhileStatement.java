package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class DoWhileStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: do_while_statement.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: do_while_statement.keyword")
    private String keyword;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: do_while_statement.condition_hash_id")
    private Long conditionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: do_while_statement.body_declaration_hash_id")
    private Long bodyDeclarationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    public DoWhileStatement(Long elementHashId, String keyword, Long conditionHashId, Long bodyDeclarationHashId) {
        this.elementHashId = elementHashId;
        this.keyword = keyword;
        this.conditionHashId = conditionHashId;
        this.bodyDeclarationHashId = bodyDeclarationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    public DoWhileStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: do_while_statement.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: do_while_statement.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: do_while_statement.keyword")
    public String getKeyword() {
        return keyword;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: do_while_statement.keyword")
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: do_while_statement.condition_hash_id")
    public Long getConditionHashId() {
        return conditionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: do_while_statement.condition_hash_id")
    public void setConditionHashId(Long conditionHashId) {
        this.conditionHashId = conditionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: do_while_statement.body_declaration_hash_id")
    public Long getBodyDeclarationHashId() {
        return bodyDeclarationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: do_while_statement.body_declaration_hash_id")
    public void setBodyDeclarationHashId(Long bodyDeclarationHashId) {
        this.bodyDeclarationHashId = bodyDeclarationHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
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
        DoWhileStatement other = (DoWhileStatement) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getKeyword() == null ? other.getKeyword() == null : this.getKeyword().equals(other.getKeyword()))
            && (this.getConditionHashId() == null ? other.getConditionHashId() == null : this.getConditionHashId().equals(other.getConditionHashId()))
            && (this.getBodyDeclarationHashId() == null ? other.getBodyDeclarationHashId() == null : this.getBodyDeclarationHashId().equals(other.getBodyDeclarationHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        result = prime * result + ((getConditionHashId() == null) ? 0 : getConditionHashId().hashCode());
        result = prime * result + ((getBodyDeclarationHashId() == null) ? 0 : getBodyDeclarationHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", keyword=").append(keyword);
        sb.append(", conditionHashId=").append(conditionHashId);
        sb.append(", bodyDeclarationHashId=").append(bodyDeclarationHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}