package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class DrdsShowDdlJobs implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_ddl_jobs.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_ddl_jobs.is_full")
    private Integer isFull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_ddl_jobs.job_ids")
    private String jobIds;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_show_ddl_jobs")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_show_ddl_jobs")
    public DrdsShowDdlJobs(Long oid, Integer isFull, String jobIds) {
        this.oid = oid;
        this.isFull = isFull;
        this.jobIds = jobIds;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_show_ddl_jobs")
    public DrdsShowDdlJobs() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_ddl_jobs.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_ddl_jobs.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_ddl_jobs.is_full")
    public Integer getIsFull() {
        return isFull;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_ddl_jobs.is_full")
    public void setIsFull(Integer isFull) {
        this.isFull = isFull;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_ddl_jobs.job_ids")
    public String getJobIds() {
        return jobIds;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_ddl_jobs.job_ids")
    public void setJobIds(String jobIds) {
        this.jobIds = jobIds == null ? null : jobIds.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_show_ddl_jobs")
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
        DrdsShowDdlJobs other = (DrdsShowDdlJobs) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsFull() == null ? other.getIsFull() == null : this.getIsFull().equals(other.getIsFull()))
            && (this.getJobIds() == null ? other.getJobIds() == null : this.getJobIds().equals(other.getJobIds()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_show_ddl_jobs")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsFull() == null) ? 0 : getIsFull().hashCode());
        result = prime * result + ((getJobIds() == null) ? 0 : getJobIds().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_show_ddl_jobs")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isFull=").append(isFull);
        sb.append(", jobIds=").append(jobIds);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}