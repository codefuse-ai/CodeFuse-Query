package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class DrdsRemoveDdlJob implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_remove_ddl_job.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_remove_ddl_job.is_all_completed")
    private Integer isAllCompleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_remove_ddl_job.is_all_pending")
    private Integer isAllPending;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_remove_ddl_job.job_ids")
    private String jobIds;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    public DrdsRemoveDdlJob(Long oid, Integer isAllCompleted, Integer isAllPending, String jobIds) {
        this.oid = oid;
        this.isAllCompleted = isAllCompleted;
        this.isAllPending = isAllPending;
        this.jobIds = jobIds;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    public DrdsRemoveDdlJob() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_remove_ddl_job.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_remove_ddl_job.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_remove_ddl_job.is_all_completed")
    public Integer getIsAllCompleted() {
        return isAllCompleted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_remove_ddl_job.is_all_completed")
    public void setIsAllCompleted(Integer isAllCompleted) {
        this.isAllCompleted = isAllCompleted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_remove_ddl_job.is_all_pending")
    public Integer getIsAllPending() {
        return isAllPending;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_remove_ddl_job.is_all_pending")
    public void setIsAllPending(Integer isAllPending) {
        this.isAllPending = isAllPending;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_remove_ddl_job.job_ids")
    public String getJobIds() {
        return jobIds;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_remove_ddl_job.job_ids")
    public void setJobIds(String jobIds) {
        this.jobIds = jobIds == null ? null : jobIds.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
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
        DrdsRemoveDdlJob other = (DrdsRemoveDdlJob) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsAllCompleted() == null ? other.getIsAllCompleted() == null : this.getIsAllCompleted().equals(other.getIsAllCompleted()))
            && (this.getIsAllPending() == null ? other.getIsAllPending() == null : this.getIsAllPending().equals(other.getIsAllPending()))
            && (this.getJobIds() == null ? other.getJobIds() == null : this.getJobIds().equals(other.getJobIds()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsAllCompleted() == null) ? 0 : getIsAllCompleted().hashCode());
        result = prime * result + ((getIsAllPending() == null) ? 0 : getIsAllPending().hashCode());
        result = prime * result + ((getJobIds() == null) ? 0 : getJobIds().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isAllCompleted=").append(isAllCompleted);
        sb.append(", isAllPending=").append(isAllPending);
        sb.append(", jobIds=").append(jobIds);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}