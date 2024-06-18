package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SwitchStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_statement.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_statement.discriminant_hash_id")
    private Long discriminantHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_statement.body_declaration_hash_id")
    private Long bodyDeclarationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    public SwitchStatement(Long elementHashId, Long discriminantHashId, Long bodyDeclarationHashId) {
        this.elementHashId = elementHashId;
        this.discriminantHashId = discriminantHashId;
        this.bodyDeclarationHashId = bodyDeclarationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    public SwitchStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_statement.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_statement.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_statement.discriminant_hash_id")
    public Long getDiscriminantHashId() {
        return discriminantHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_statement.discriminant_hash_id")
    public void setDiscriminantHashId(Long discriminantHashId) {
        this.discriminantHashId = discriminantHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_statement.body_declaration_hash_id")
    public Long getBodyDeclarationHashId() {
        return bodyDeclarationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_statement.body_declaration_hash_id")
    public void setBodyDeclarationHashId(Long bodyDeclarationHashId) {
        this.bodyDeclarationHashId = bodyDeclarationHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
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
        SwitchStatement other = (SwitchStatement) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getDiscriminantHashId() == null ? other.getDiscriminantHashId() == null : this.getDiscriminantHashId().equals(other.getDiscriminantHashId()))
            && (this.getBodyDeclarationHashId() == null ? other.getBodyDeclarationHashId() == null : this.getBodyDeclarationHashId().equals(other.getBodyDeclarationHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getDiscriminantHashId() == null) ? 0 : getDiscriminantHashId().hashCode());
        result = prime * result + ((getBodyDeclarationHashId() == null) ? 0 : getBodyDeclarationHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", discriminantHashId=").append(discriminantHashId);
        sb.append(", bodyDeclarationHashId=").append(bodyDeclarationHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}