package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OdpsGrantStmt implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.expire_oid")
    private Long expireOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.is_label")
    private Integer isLabel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.is_super")
    private Integer isSuper;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.label_oid")
    private Long labelOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.subject_type")
    private String subjectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    public OdpsGrantStmt(Long oid, Long expireOid, Integer isLabel, Integer isSuper, Long labelOid, String subjectType) {
        this.oid = oid;
        this.expireOid = expireOid;
        this.isLabel = isLabel;
        this.isSuper = isSuper;
        this.labelOid = labelOid;
        this.subjectType = subjectType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    public OdpsGrantStmt() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.expire_oid")
    public Long getExpireOid() {
        return expireOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.expire_oid")
    public void setExpireOid(Long expireOid) {
        this.expireOid = expireOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.is_label")
    public Integer getIsLabel() {
        return isLabel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.is_label")
    public void setIsLabel(Integer isLabel) {
        this.isLabel = isLabel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.is_super")
    public Integer getIsSuper() {
        return isSuper;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.is_super")
    public void setIsSuper(Integer isSuper) {
        this.isSuper = isSuper;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.label_oid")
    public Long getLabelOid() {
        return labelOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.label_oid")
    public void setLabelOid(Long labelOid) {
        this.labelOid = labelOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.subject_type")
    public String getSubjectType() {
        return subjectType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.subject_type")
    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType == null ? null : subjectType.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
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
        OdpsGrantStmt other = (OdpsGrantStmt) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getExpireOid() == null ? other.getExpireOid() == null : this.getExpireOid().equals(other.getExpireOid()))
            && (this.getIsLabel() == null ? other.getIsLabel() == null : this.getIsLabel().equals(other.getIsLabel()))
            && (this.getIsSuper() == null ? other.getIsSuper() == null : this.getIsSuper().equals(other.getIsSuper()))
            && (this.getLabelOid() == null ? other.getLabelOid() == null : this.getLabelOid().equals(other.getLabelOid()))
            && (this.getSubjectType() == null ? other.getSubjectType() == null : this.getSubjectType().equals(other.getSubjectType()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getExpireOid() == null) ? 0 : getExpireOid().hashCode());
        result = prime * result + ((getIsLabel() == null) ? 0 : getIsLabel().hashCode());
        result = prime * result + ((getIsSuper() == null) ? 0 : getIsSuper().hashCode());
        result = prime * result + ((getLabelOid() == null) ? 0 : getLabelOid().hashCode());
        result = prime * result + ((getSubjectType() == null) ? 0 : getSubjectType().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", expireOid=").append(expireOid);
        sb.append(", isLabel=").append(isLabel);
        sb.append(", isSuper=").append(isSuper);
        sb.append(", labelOid=").append(labelOid);
        sb.append(", subjectType=").append(subjectType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}