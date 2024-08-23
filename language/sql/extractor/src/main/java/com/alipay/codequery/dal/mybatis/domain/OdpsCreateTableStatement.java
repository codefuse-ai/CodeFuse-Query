package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OdpsCreateTableStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_create_table_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_create_table_statement.lifecycle_oid")
    private Long lifecycleOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_create_table_statement.like_oid")
    private Long likeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_create_table_statement.stored_by_oid")
    private Long storedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_create_table_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_create_table_statement")
    public OdpsCreateTableStatement(Long oid, Long lifecycleOid, Long likeOid, Long storedByOid) {
        this.oid = oid;
        this.lifecycleOid = lifecycleOid;
        this.likeOid = likeOid;
        this.storedByOid = storedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_create_table_statement")
    public OdpsCreateTableStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_create_table_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_create_table_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_create_table_statement.lifecycle_oid")
    public Long getLifecycleOid() {
        return lifecycleOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_create_table_statement.lifecycle_oid")
    public void setLifecycleOid(Long lifecycleOid) {
        this.lifecycleOid = lifecycleOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_create_table_statement.like_oid")
    public Long getLikeOid() {
        return likeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_create_table_statement.like_oid")
    public void setLikeOid(Long likeOid) {
        this.likeOid = likeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_create_table_statement.stored_by_oid")
    public Long getStoredByOid() {
        return storedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_create_table_statement.stored_by_oid")
    public void setStoredByOid(Long storedByOid) {
        this.storedByOid = storedByOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_create_table_statement")
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
        OdpsCreateTableStatement other = (OdpsCreateTableStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getLifecycleOid() == null ? other.getLifecycleOid() == null : this.getLifecycleOid().equals(other.getLifecycleOid()))
            && (this.getLikeOid() == null ? other.getLikeOid() == null : this.getLikeOid().equals(other.getLikeOid()))
            && (this.getStoredByOid() == null ? other.getStoredByOid() == null : this.getStoredByOid().equals(other.getStoredByOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_create_table_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getLifecycleOid() == null) ? 0 : getLifecycleOid().hashCode());
        result = prime * result + ((getLikeOid() == null) ? 0 : getLikeOid().hashCode());
        result = prime * result + ((getStoredByOid() == null) ? 0 : getStoredByOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_create_table_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", lifecycleOid=").append(lifecycleOid);
        sb.append(", likeOid=").append(likeOid);
        sb.append(", storedByOid=").append(storedByOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}