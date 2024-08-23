package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class DrdsChangeDdlJob implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_change_ddl_job.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_change_ddl_job.group_and_table_name_list")
    private String groupAndTableNameList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_change_ddl_job.is_add")
    private Integer isAdd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_change_ddl_job.is_skip")
    private Integer isSkip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_change_ddl_job.job_id")
    private String jobId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    public DrdsChangeDdlJob(Long oid, String groupAndTableNameList, Integer isAdd, Integer isSkip, String jobId) {
        this.oid = oid;
        this.groupAndTableNameList = groupAndTableNameList;
        this.isAdd = isAdd;
        this.isSkip = isSkip;
        this.jobId = jobId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    public DrdsChangeDdlJob() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_change_ddl_job.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_change_ddl_job.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_change_ddl_job.group_and_table_name_list")
    public String getGroupAndTableNameList() {
        return groupAndTableNameList;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_change_ddl_job.group_and_table_name_list")
    public void setGroupAndTableNameList(String groupAndTableNameList) {
        this.groupAndTableNameList = groupAndTableNameList == null ? null : groupAndTableNameList.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_change_ddl_job.is_add")
    public Integer getIsAdd() {
        return isAdd;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_change_ddl_job.is_add")
    public void setIsAdd(Integer isAdd) {
        this.isAdd = isAdd;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_change_ddl_job.is_skip")
    public Integer getIsSkip() {
        return isSkip;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_change_ddl_job.is_skip")
    public void setIsSkip(Integer isSkip) {
        this.isSkip = isSkip;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_change_ddl_job.job_id")
    public String getJobId() {
        return jobId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_change_ddl_job.job_id")
    public void setJobId(String jobId) {
        this.jobId = jobId == null ? null : jobId.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
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
        DrdsChangeDdlJob other = (DrdsChangeDdlJob) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getGroupAndTableNameList() == null ? other.getGroupAndTableNameList() == null : this.getGroupAndTableNameList().equals(other.getGroupAndTableNameList()))
            && (this.getIsAdd() == null ? other.getIsAdd() == null : this.getIsAdd().equals(other.getIsAdd()))
            && (this.getIsSkip() == null ? other.getIsSkip() == null : this.getIsSkip().equals(other.getIsSkip()))
            && (this.getJobId() == null ? other.getJobId() == null : this.getJobId().equals(other.getJobId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getGroupAndTableNameList() == null) ? 0 : getGroupAndTableNameList().hashCode());
        result = prime * result + ((getIsAdd() == null) ? 0 : getIsAdd().hashCode());
        result = prime * result + ((getIsSkip() == null) ? 0 : getIsSkip().hashCode());
        result = prime * result + ((getJobId() == null) ? 0 : getJobId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", groupAndTableNameList=").append(groupAndTableNameList);
        sb.append(", isAdd=").append(isAdd);
        sb.append(", isSkip=").append(isSkip);
        sb.append(", jobId=").append(jobId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}