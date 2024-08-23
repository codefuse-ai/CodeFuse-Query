package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class DrdsClearDdlJobCache implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_clear_ddl_job_cache.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_clear_ddl_job_cache.is_all_jobs")
    private Integer isAllJobs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_clear_ddl_job_cache.job_ids")
    private String jobIds;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    public DrdsClearDdlJobCache(Long oid, Integer isAllJobs, String jobIds) {
        this.oid = oid;
        this.isAllJobs = isAllJobs;
        this.jobIds = jobIds;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    public DrdsClearDdlJobCache() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_clear_ddl_job_cache.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_clear_ddl_job_cache.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_clear_ddl_job_cache.is_all_jobs")
    public Integer getIsAllJobs() {
        return isAllJobs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_clear_ddl_job_cache.is_all_jobs")
    public void setIsAllJobs(Integer isAllJobs) {
        this.isAllJobs = isAllJobs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_clear_ddl_job_cache.job_ids")
    public String getJobIds() {
        return jobIds;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_clear_ddl_job_cache.job_ids")
    public void setJobIds(String jobIds) {
        this.jobIds = jobIds == null ? null : jobIds.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
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
        DrdsClearDdlJobCache other = (DrdsClearDdlJobCache) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsAllJobs() == null ? other.getIsAllJobs() == null : this.getIsAllJobs().equals(other.getIsAllJobs()))
            && (this.getJobIds() == null ? other.getJobIds() == null : this.getJobIds().equals(other.getJobIds()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsAllJobs() == null) ? 0 : getIsAllJobs().hashCode());
        result = prime * result + ((getJobIds() == null) ? 0 : getJobIds().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isAllJobs=").append(isAllJobs);
        sb.append(", jobIds=").append(jobIds);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}