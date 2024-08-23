package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlCancelJobStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cancel_job_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cancel_job_statement.is_import")
    private Integer isImport;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cancel_job_statement.job_name_oid")
    private Long jobNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_cancel_job_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_cancel_job_statement")
    public SqlCancelJobStatement(Long oid, Integer isImport, Long jobNameOid) {
        this.oid = oid;
        this.isImport = isImport;
        this.jobNameOid = jobNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_cancel_job_statement")
    public SqlCancelJobStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cancel_job_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cancel_job_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cancel_job_statement.is_import")
    public Integer getIsImport() {
        return isImport;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cancel_job_statement.is_import")
    public void setIsImport(Integer isImport) {
        this.isImport = isImport;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cancel_job_statement.job_name_oid")
    public Long getJobNameOid() {
        return jobNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cancel_job_statement.job_name_oid")
    public void setJobNameOid(Long jobNameOid) {
        this.jobNameOid = jobNameOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_cancel_job_statement")
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
        SqlCancelJobStatement other = (SqlCancelJobStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsImport() == null ? other.getIsImport() == null : this.getIsImport().equals(other.getIsImport()))
            && (this.getJobNameOid() == null ? other.getJobNameOid() == null : this.getJobNameOid().equals(other.getJobNameOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_cancel_job_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsImport() == null) ? 0 : getIsImport().hashCode());
        result = prime * result + ((getJobNameOid() == null) ? 0 : getJobNameOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_cancel_job_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isImport=").append(isImport);
        sb.append(", jobNameOid=").append(jobNameOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}