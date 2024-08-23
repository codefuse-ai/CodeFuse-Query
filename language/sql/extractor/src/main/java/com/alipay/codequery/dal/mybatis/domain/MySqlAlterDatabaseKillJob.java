package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlAlterDatabaseKillJob implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_database_kill_job.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_database_kill_job.job_id_oid")
    private Long jobIdOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_database_kill_job.job_type_oid")
    private Long jobTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    public MySqlAlterDatabaseKillJob(Long oid, Long jobIdOid, Long jobTypeOid) {
        this.oid = oid;
        this.jobIdOid = jobIdOid;
        this.jobTypeOid = jobTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    public MySqlAlterDatabaseKillJob() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_database_kill_job.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_database_kill_job.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_database_kill_job.job_id_oid")
    public Long getJobIdOid() {
        return jobIdOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_database_kill_job.job_id_oid")
    public void setJobIdOid(Long jobIdOid) {
        this.jobIdOid = jobIdOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_database_kill_job.job_type_oid")
    public Long getJobTypeOid() {
        return jobTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_database_kill_job.job_type_oid")
    public void setJobTypeOid(Long jobTypeOid) {
        this.jobTypeOid = jobTypeOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
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
        MySqlAlterDatabaseKillJob other = (MySqlAlterDatabaseKillJob) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getJobIdOid() == null ? other.getJobIdOid() == null : this.getJobIdOid().equals(other.getJobIdOid()))
            && (this.getJobTypeOid() == null ? other.getJobTypeOid() == null : this.getJobTypeOid().equals(other.getJobTypeOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getJobIdOid() == null) ? 0 : getJobIdOid().hashCode());
        result = prime * result + ((getJobTypeOid() == null) ? 0 : getJobTypeOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", jobIdOid=").append(jobIdOid);
        sb.append(", jobTypeOid=").append(jobTypeOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}