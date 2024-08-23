package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OdpsShowGrantsStmt implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_grants_stmt.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_grants_stmt.is_label")
    private Integer isLabel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_grants_stmt.object_type_oid")
    private Long objectTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_grants_stmt.user_oid")
    private Long userOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    public OdpsShowGrantsStmt(Long oid, Integer isLabel, Long objectTypeOid, Long userOid) {
        this.oid = oid;
        this.isLabel = isLabel;
        this.objectTypeOid = objectTypeOid;
        this.userOid = userOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    public OdpsShowGrantsStmt() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_grants_stmt.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_grants_stmt.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_grants_stmt.is_label")
    public Integer getIsLabel() {
        return isLabel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_grants_stmt.is_label")
    public void setIsLabel(Integer isLabel) {
        this.isLabel = isLabel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_grants_stmt.object_type_oid")
    public Long getObjectTypeOid() {
        return objectTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_grants_stmt.object_type_oid")
    public void setObjectTypeOid(Long objectTypeOid) {
        this.objectTypeOid = objectTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_grants_stmt.user_oid")
    public Long getUserOid() {
        return userOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_grants_stmt.user_oid")
    public void setUserOid(Long userOid) {
        this.userOid = userOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
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
        OdpsShowGrantsStmt other = (OdpsShowGrantsStmt) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsLabel() == null ? other.getIsLabel() == null : this.getIsLabel().equals(other.getIsLabel()))
            && (this.getObjectTypeOid() == null ? other.getObjectTypeOid() == null : this.getObjectTypeOid().equals(other.getObjectTypeOid()))
            && (this.getUserOid() == null ? other.getUserOid() == null : this.getUserOid().equals(other.getUserOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsLabel() == null) ? 0 : getIsLabel().hashCode());
        result = prime * result + ((getObjectTypeOid() == null) ? 0 : getObjectTypeOid().hashCode());
        result = prime * result + ((getUserOid() == null) ? 0 : getUserOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isLabel=").append(isLabel);
        sb.append(", objectTypeOid=").append(objectTypeOid);
        sb.append(", userOid=").append(userOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}