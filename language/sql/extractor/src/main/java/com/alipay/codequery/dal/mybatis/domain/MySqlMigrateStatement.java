package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlMigrateStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.from_ins_id_oid")
    private Long fromInsIdOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.from_ins_ip_oid")
    private Long fromInsIpOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.from_ins_port_oid")
    private Long fromInsPortOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.from_ins_status_oid")
    private Long fromInsStatusOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.migrate_type_oid")
    private Long migrateTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.schema_oid")
    private Long schemaOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.shard_names_oid")
    private Long shardNamesOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.to_ins_id_oid")
    private Long toInsIdOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.to_ins_ip_oid")
    private Long toInsIpOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.to_ins_port_oid")
    private Long toInsPortOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.to_ins_status_oid")
    private Long toInsStatusOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    public MySqlMigrateStatement(Long oid, Long fromInsIdOid, Long fromInsIpOid, Long fromInsPortOid, Long fromInsStatusOid, Long migrateTypeOid, Long schemaOid, Long shardNamesOid, Long toInsIdOid, Long toInsIpOid, Long toInsPortOid, Long toInsStatusOid) {
        this.oid = oid;
        this.fromInsIdOid = fromInsIdOid;
        this.fromInsIpOid = fromInsIpOid;
        this.fromInsPortOid = fromInsPortOid;
        this.fromInsStatusOid = fromInsStatusOid;
        this.migrateTypeOid = migrateTypeOid;
        this.schemaOid = schemaOid;
        this.shardNamesOid = shardNamesOid;
        this.toInsIdOid = toInsIdOid;
        this.toInsIpOid = toInsIpOid;
        this.toInsPortOid = toInsPortOid;
        this.toInsStatusOid = toInsStatusOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    public MySqlMigrateStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.from_ins_id_oid")
    public Long getFromInsIdOid() {
        return fromInsIdOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.from_ins_id_oid")
    public void setFromInsIdOid(Long fromInsIdOid) {
        this.fromInsIdOid = fromInsIdOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.from_ins_ip_oid")
    public Long getFromInsIpOid() {
        return fromInsIpOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.from_ins_ip_oid")
    public void setFromInsIpOid(Long fromInsIpOid) {
        this.fromInsIpOid = fromInsIpOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.from_ins_port_oid")
    public Long getFromInsPortOid() {
        return fromInsPortOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.from_ins_port_oid")
    public void setFromInsPortOid(Long fromInsPortOid) {
        this.fromInsPortOid = fromInsPortOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.from_ins_status_oid")
    public Long getFromInsStatusOid() {
        return fromInsStatusOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.from_ins_status_oid")
    public void setFromInsStatusOid(Long fromInsStatusOid) {
        this.fromInsStatusOid = fromInsStatusOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.migrate_type_oid")
    public Long getMigrateTypeOid() {
        return migrateTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.migrate_type_oid")
    public void setMigrateTypeOid(Long migrateTypeOid) {
        this.migrateTypeOid = migrateTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.schema_oid")
    public Long getSchemaOid() {
        return schemaOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.schema_oid")
    public void setSchemaOid(Long schemaOid) {
        this.schemaOid = schemaOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.shard_names_oid")
    public Long getShardNamesOid() {
        return shardNamesOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.shard_names_oid")
    public void setShardNamesOid(Long shardNamesOid) {
        this.shardNamesOid = shardNamesOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.to_ins_id_oid")
    public Long getToInsIdOid() {
        return toInsIdOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.to_ins_id_oid")
    public void setToInsIdOid(Long toInsIdOid) {
        this.toInsIdOid = toInsIdOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.to_ins_ip_oid")
    public Long getToInsIpOid() {
        return toInsIpOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.to_ins_ip_oid")
    public void setToInsIpOid(Long toInsIpOid) {
        this.toInsIpOid = toInsIpOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.to_ins_port_oid")
    public Long getToInsPortOid() {
        return toInsPortOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.to_ins_port_oid")
    public void setToInsPortOid(Long toInsPortOid) {
        this.toInsPortOid = toInsPortOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.to_ins_status_oid")
    public Long getToInsStatusOid() {
        return toInsStatusOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.to_ins_status_oid")
    public void setToInsStatusOid(Long toInsStatusOid) {
        this.toInsStatusOid = toInsStatusOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
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
        MySqlMigrateStatement other = (MySqlMigrateStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getFromInsIdOid() == null ? other.getFromInsIdOid() == null : this.getFromInsIdOid().equals(other.getFromInsIdOid()))
            && (this.getFromInsIpOid() == null ? other.getFromInsIpOid() == null : this.getFromInsIpOid().equals(other.getFromInsIpOid()))
            && (this.getFromInsPortOid() == null ? other.getFromInsPortOid() == null : this.getFromInsPortOid().equals(other.getFromInsPortOid()))
            && (this.getFromInsStatusOid() == null ? other.getFromInsStatusOid() == null : this.getFromInsStatusOid().equals(other.getFromInsStatusOid()))
            && (this.getMigrateTypeOid() == null ? other.getMigrateTypeOid() == null : this.getMigrateTypeOid().equals(other.getMigrateTypeOid()))
            && (this.getSchemaOid() == null ? other.getSchemaOid() == null : this.getSchemaOid().equals(other.getSchemaOid()))
            && (this.getShardNamesOid() == null ? other.getShardNamesOid() == null : this.getShardNamesOid().equals(other.getShardNamesOid()))
            && (this.getToInsIdOid() == null ? other.getToInsIdOid() == null : this.getToInsIdOid().equals(other.getToInsIdOid()))
            && (this.getToInsIpOid() == null ? other.getToInsIpOid() == null : this.getToInsIpOid().equals(other.getToInsIpOid()))
            && (this.getToInsPortOid() == null ? other.getToInsPortOid() == null : this.getToInsPortOid().equals(other.getToInsPortOid()))
            && (this.getToInsStatusOid() == null ? other.getToInsStatusOid() == null : this.getToInsStatusOid().equals(other.getToInsStatusOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getFromInsIdOid() == null) ? 0 : getFromInsIdOid().hashCode());
        result = prime * result + ((getFromInsIpOid() == null) ? 0 : getFromInsIpOid().hashCode());
        result = prime * result + ((getFromInsPortOid() == null) ? 0 : getFromInsPortOid().hashCode());
        result = prime * result + ((getFromInsStatusOid() == null) ? 0 : getFromInsStatusOid().hashCode());
        result = prime * result + ((getMigrateTypeOid() == null) ? 0 : getMigrateTypeOid().hashCode());
        result = prime * result + ((getSchemaOid() == null) ? 0 : getSchemaOid().hashCode());
        result = prime * result + ((getShardNamesOid() == null) ? 0 : getShardNamesOid().hashCode());
        result = prime * result + ((getToInsIdOid() == null) ? 0 : getToInsIdOid().hashCode());
        result = prime * result + ((getToInsIpOid() == null) ? 0 : getToInsIpOid().hashCode());
        result = prime * result + ((getToInsPortOid() == null) ? 0 : getToInsPortOid().hashCode());
        result = prime * result + ((getToInsStatusOid() == null) ? 0 : getToInsStatusOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", fromInsIdOid=").append(fromInsIdOid);
        sb.append(", fromInsIpOid=").append(fromInsIpOid);
        sb.append(", fromInsPortOid=").append(fromInsPortOid);
        sb.append(", fromInsStatusOid=").append(fromInsStatusOid);
        sb.append(", migrateTypeOid=").append(migrateTypeOid);
        sb.append(", schemaOid=").append(schemaOid);
        sb.append(", shardNamesOid=").append(shardNamesOid);
        sb.append(", toInsIdOid=").append(toInsIdOid);
        sb.append(", toInsIpOid=").append(toInsIpOid);
        sb.append(", toInsPortOid=").append(toInsPortOid);
        sb.append(", toInsStatusOid=").append(toInsStatusOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}