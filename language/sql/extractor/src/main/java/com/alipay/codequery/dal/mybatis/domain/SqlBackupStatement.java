package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlBackupStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_backup_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_backup_statement.action_oid")
    private Long actionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_backup_statement.type_oid")
    private Long typeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_backup_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_backup_statement")
    public SqlBackupStatement(Long oid, Long actionOid, Long typeOid) {
        this.oid = oid;
        this.actionOid = actionOid;
        this.typeOid = typeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_backup_statement")
    public SqlBackupStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_backup_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_backup_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_backup_statement.action_oid")
    public Long getActionOid() {
        return actionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_backup_statement.action_oid")
    public void setActionOid(Long actionOid) {
        this.actionOid = actionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_backup_statement.type_oid")
    public Long getTypeOid() {
        return typeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_backup_statement.type_oid")
    public void setTypeOid(Long typeOid) {
        this.typeOid = typeOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_backup_statement")
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
        SqlBackupStatement other = (SqlBackupStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getActionOid() == null ? other.getActionOid() == null : this.getActionOid().equals(other.getActionOid()))
            && (this.getTypeOid() == null ? other.getTypeOid() == null : this.getTypeOid().equals(other.getTypeOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_backup_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getActionOid() == null) ? 0 : getActionOid().hashCode());
        result = prime * result + ((getTypeOid() == null) ? 0 : getTypeOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_backup_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", actionOid=").append(actionOid);
        sb.append(", typeOid=").append(typeOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}