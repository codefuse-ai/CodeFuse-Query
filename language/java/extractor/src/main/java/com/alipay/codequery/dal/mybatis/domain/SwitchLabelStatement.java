package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SwitchLabelStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_label_statement.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_label_statement.case_value_hash_id")
    private Long caseValueHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_label_statement.enclosing_switch_block_hash_id")
    private Long enclosingSwitchBlockHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_label_statement.next_switch_case_hash_id")
    private Long nextSwitchCaseHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    public SwitchLabelStatement(Long elementHashId, Long caseValueHashId, Long enclosingSwitchBlockHashId, Long nextSwitchCaseHashId) {
        this.elementHashId = elementHashId;
        this.caseValueHashId = caseValueHashId;
        this.enclosingSwitchBlockHashId = enclosingSwitchBlockHashId;
        this.nextSwitchCaseHashId = nextSwitchCaseHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    public SwitchLabelStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_label_statement.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_label_statement.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_label_statement.case_value_hash_id")
    public Long getCaseValueHashId() {
        return caseValueHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_label_statement.case_value_hash_id")
    public void setCaseValueHashId(Long caseValueHashId) {
        this.caseValueHashId = caseValueHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_label_statement.enclosing_switch_block_hash_id")
    public Long getEnclosingSwitchBlockHashId() {
        return enclosingSwitchBlockHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_label_statement.enclosing_switch_block_hash_id")
    public void setEnclosingSwitchBlockHashId(Long enclosingSwitchBlockHashId) {
        this.enclosingSwitchBlockHashId = enclosingSwitchBlockHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_label_statement.next_switch_case_hash_id")
    public Long getNextSwitchCaseHashId() {
        return nextSwitchCaseHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_label_statement.next_switch_case_hash_id")
    public void setNextSwitchCaseHashId(Long nextSwitchCaseHashId) {
        this.nextSwitchCaseHashId = nextSwitchCaseHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
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
        SwitchLabelStatement other = (SwitchLabelStatement) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getCaseValueHashId() == null ? other.getCaseValueHashId() == null : this.getCaseValueHashId().equals(other.getCaseValueHashId()))
            && (this.getEnclosingSwitchBlockHashId() == null ? other.getEnclosingSwitchBlockHashId() == null : this.getEnclosingSwitchBlockHashId().equals(other.getEnclosingSwitchBlockHashId()))
            && (this.getNextSwitchCaseHashId() == null ? other.getNextSwitchCaseHashId() == null : this.getNextSwitchCaseHashId().equals(other.getNextSwitchCaseHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getCaseValueHashId() == null) ? 0 : getCaseValueHashId().hashCode());
        result = prime * result + ((getEnclosingSwitchBlockHashId() == null) ? 0 : getEnclosingSwitchBlockHashId().hashCode());
        result = prime * result + ((getNextSwitchCaseHashId() == null) ? 0 : getNextSwitchCaseHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", caseValueHashId=").append(caseValueHashId);
        sb.append(", enclosingSwitchBlockHashId=").append(enclosingSwitchBlockHashId);
        sb.append(", nextSwitchCaseHashId=").append(nextSwitchCaseHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}