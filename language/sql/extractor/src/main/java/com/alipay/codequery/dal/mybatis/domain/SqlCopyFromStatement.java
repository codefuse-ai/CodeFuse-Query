package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlCopyFromStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_copy_from_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_copy_from_statement.access_key_id_oid")
    private Long accessKeyIdOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_copy_from_statement.access_key_secret_oid")
    private Long accessKeySecretOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_copy_from_statement.from_oid")
    private Long fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_copy_from_statement.table_oid")
    private Long tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    public SqlCopyFromStatement(Long oid, Long accessKeyIdOid, Long accessKeySecretOid, Long fromOid, Long tableOid) {
        this.oid = oid;
        this.accessKeyIdOid = accessKeyIdOid;
        this.accessKeySecretOid = accessKeySecretOid;
        this.fromOid = fromOid;
        this.tableOid = tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    public SqlCopyFromStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_copy_from_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_copy_from_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_copy_from_statement.access_key_id_oid")
    public Long getAccessKeyIdOid() {
        return accessKeyIdOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_copy_from_statement.access_key_id_oid")
    public void setAccessKeyIdOid(Long accessKeyIdOid) {
        this.accessKeyIdOid = accessKeyIdOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_copy_from_statement.access_key_secret_oid")
    public Long getAccessKeySecretOid() {
        return accessKeySecretOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_copy_from_statement.access_key_secret_oid")
    public void setAccessKeySecretOid(Long accessKeySecretOid) {
        this.accessKeySecretOid = accessKeySecretOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_copy_from_statement.from_oid")
    public Long getFromOid() {
        return fromOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_copy_from_statement.from_oid")
    public void setFromOid(Long fromOid) {
        this.fromOid = fromOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_copy_from_statement.table_oid")
    public Long getTableOid() {
        return tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_copy_from_statement.table_oid")
    public void setTableOid(Long tableOid) {
        this.tableOid = tableOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
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
        SqlCopyFromStatement other = (SqlCopyFromStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAccessKeyIdOid() == null ? other.getAccessKeyIdOid() == null : this.getAccessKeyIdOid().equals(other.getAccessKeyIdOid()))
            && (this.getAccessKeySecretOid() == null ? other.getAccessKeySecretOid() == null : this.getAccessKeySecretOid().equals(other.getAccessKeySecretOid()))
            && (this.getFromOid() == null ? other.getFromOid() == null : this.getFromOid().equals(other.getFromOid()))
            && (this.getTableOid() == null ? other.getTableOid() == null : this.getTableOid().equals(other.getTableOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAccessKeyIdOid() == null) ? 0 : getAccessKeyIdOid().hashCode());
        result = prime * result + ((getAccessKeySecretOid() == null) ? 0 : getAccessKeySecretOid().hashCode());
        result = prime * result + ((getFromOid() == null) ? 0 : getFromOid().hashCode());
        result = prime * result + ((getTableOid() == null) ? 0 : getTableOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", accessKeyIdOid=").append(accessKeyIdOid);
        sb.append(", accessKeySecretOid=").append(accessKeySecretOid);
        sb.append(", fromOid=").append(fromOid);
        sb.append(", tableOid=").append(tableOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}