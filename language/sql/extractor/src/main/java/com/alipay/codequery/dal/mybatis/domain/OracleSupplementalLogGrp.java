package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleSupplementalLogGrp implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_log_grp.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_log_grp.group_oid")
    private Long groupOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_log_grp.is_always")
    private Integer isAlways;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    public OracleSupplementalLogGrp(Long oid, Long groupOid, Integer isAlways) {
        this.oid = oid;
        this.groupOid = groupOid;
        this.isAlways = isAlways;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    public OracleSupplementalLogGrp() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_log_grp.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_log_grp.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_log_grp.group_oid")
    public Long getGroupOid() {
        return groupOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_log_grp.group_oid")
    public void setGroupOid(Long groupOid) {
        this.groupOid = groupOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_log_grp.is_always")
    public Integer getIsAlways() {
        return isAlways;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_log_grp.is_always")
    public void setIsAlways(Integer isAlways) {
        this.isAlways = isAlways;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
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
        OracleSupplementalLogGrp other = (OracleSupplementalLogGrp) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getGroupOid() == null ? other.getGroupOid() == null : this.getGroupOid().equals(other.getGroupOid()))
            && (this.getIsAlways() == null ? other.getIsAlways() == null : this.getIsAlways().equals(other.getIsAlways()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getGroupOid() == null) ? 0 : getGroupOid().hashCode());
        result = prime * result + ((getIsAlways() == null) ? 0 : getIsAlways().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", groupOid=").append(groupOid);
        sb.append(", isAlways=").append(isAlways);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}