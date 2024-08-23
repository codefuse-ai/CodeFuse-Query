package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlBlockStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_block_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_block_statement.end_label")
    private String endLabel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_block_statement.exception_oid")
    private Long exceptionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_block_statement.is_end_of_commit")
    private Integer isEndOfCommit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_block_statement.label_name")
    private String labelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    public SqlBlockStatement(Long oid, String endLabel, Long exceptionOid, Integer isEndOfCommit, String labelName) {
        this.oid = oid;
        this.endLabel = endLabel;
        this.exceptionOid = exceptionOid;
        this.isEndOfCommit = isEndOfCommit;
        this.labelName = labelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    public SqlBlockStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_block_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_block_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_block_statement.end_label")
    public String getEndLabel() {
        return endLabel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_block_statement.end_label")
    public void setEndLabel(String endLabel) {
        this.endLabel = endLabel == null ? null : endLabel.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_block_statement.exception_oid")
    public Long getExceptionOid() {
        return exceptionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_block_statement.exception_oid")
    public void setExceptionOid(Long exceptionOid) {
        this.exceptionOid = exceptionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_block_statement.is_end_of_commit")
    public Integer getIsEndOfCommit() {
        return isEndOfCommit;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_block_statement.is_end_of_commit")
    public void setIsEndOfCommit(Integer isEndOfCommit) {
        this.isEndOfCommit = isEndOfCommit;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_block_statement.label_name")
    public String getLabelName() {
        return labelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_block_statement.label_name")
    public void setLabelName(String labelName) {
        this.labelName = labelName == null ? null : labelName.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
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
        SqlBlockStatement other = (SqlBlockStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getEndLabel() == null ? other.getEndLabel() == null : this.getEndLabel().equals(other.getEndLabel()))
            && (this.getExceptionOid() == null ? other.getExceptionOid() == null : this.getExceptionOid().equals(other.getExceptionOid()))
            && (this.getIsEndOfCommit() == null ? other.getIsEndOfCommit() == null : this.getIsEndOfCommit().equals(other.getIsEndOfCommit()))
            && (this.getLabelName() == null ? other.getLabelName() == null : this.getLabelName().equals(other.getLabelName()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getEndLabel() == null) ? 0 : getEndLabel().hashCode());
        result = prime * result + ((getExceptionOid() == null) ? 0 : getExceptionOid().hashCode());
        result = prime * result + ((getIsEndOfCommit() == null) ? 0 : getIsEndOfCommit().hashCode());
        result = prime * result + ((getLabelName() == null) ? 0 : getLabelName().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", endLabel=").append(endLabel);
        sb.append(", exceptionOid=").append(exceptionOid);
        sb.append(", isEndOfCommit=").append(isEndOfCommit);
        sb.append(", labelName=").append(labelName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}