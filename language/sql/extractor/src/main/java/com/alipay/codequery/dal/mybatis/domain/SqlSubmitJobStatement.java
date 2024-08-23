package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlSubmitJobStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_submit_job_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_submit_job_statement.is_await")
    private Integer isAwait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_submit_job_statement.statment_oid")
    private Long statmentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_submit_job_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_submit_job_statement")
    public SqlSubmitJobStatement(Long oid, Integer isAwait, Long statmentOid) {
        this.oid = oid;
        this.isAwait = isAwait;
        this.statmentOid = statmentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_submit_job_statement")
    public SqlSubmitJobStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_submit_job_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_submit_job_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_submit_job_statement.is_await")
    public Integer getIsAwait() {
        return isAwait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_submit_job_statement.is_await")
    public void setIsAwait(Integer isAwait) {
        this.isAwait = isAwait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_submit_job_statement.statment_oid")
    public Long getStatmentOid() {
        return statmentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_submit_job_statement.statment_oid")
    public void setStatmentOid(Long statmentOid) {
        this.statmentOid = statmentOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_submit_job_statement")
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
        SqlSubmitJobStatement other = (SqlSubmitJobStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsAwait() == null ? other.getIsAwait() == null : this.getIsAwait().equals(other.getIsAwait()))
            && (this.getStatmentOid() == null ? other.getStatmentOid() == null : this.getStatmentOid().equals(other.getStatmentOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_submit_job_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsAwait() == null) ? 0 : getIsAwait().hashCode());
        result = prime * result + ((getStatmentOid() == null) ? 0 : getStatmentOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_submit_job_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isAwait=").append(isAwait);
        sb.append(", statmentOid=").append(statmentOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}