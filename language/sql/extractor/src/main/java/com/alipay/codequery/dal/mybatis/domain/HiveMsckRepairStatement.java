package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class HiveMsckRepairStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_msck_repair_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_msck_repair_statement.database_oid")
    private Long databaseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_msck_repair_statement.is_add_partitions")
    private Integer isAddPartitions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_msck_repair_statement.table_oid")
    private Long tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_msck_repair_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_msck_repair_statement")
    public HiveMsckRepairStatement(Long oid, Long databaseOid, Integer isAddPartitions, Long tableOid) {
        this.oid = oid;
        this.databaseOid = databaseOid;
        this.isAddPartitions = isAddPartitions;
        this.tableOid = tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_msck_repair_statement")
    public HiveMsckRepairStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_msck_repair_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_msck_repair_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_msck_repair_statement.database_oid")
    public Long getDatabaseOid() {
        return databaseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_msck_repair_statement.database_oid")
    public void setDatabaseOid(Long databaseOid) {
        this.databaseOid = databaseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_msck_repair_statement.is_add_partitions")
    public Integer getIsAddPartitions() {
        return isAddPartitions;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_msck_repair_statement.is_add_partitions")
    public void setIsAddPartitions(Integer isAddPartitions) {
        this.isAddPartitions = isAddPartitions;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_msck_repair_statement.table_oid")
    public Long getTableOid() {
        return tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_msck_repair_statement.table_oid")
    public void setTableOid(Long tableOid) {
        this.tableOid = tableOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_msck_repair_statement")
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
        HiveMsckRepairStatement other = (HiveMsckRepairStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getDatabaseOid() == null ? other.getDatabaseOid() == null : this.getDatabaseOid().equals(other.getDatabaseOid()))
            && (this.getIsAddPartitions() == null ? other.getIsAddPartitions() == null : this.getIsAddPartitions().equals(other.getIsAddPartitions()))
            && (this.getTableOid() == null ? other.getTableOid() == null : this.getTableOid().equals(other.getTableOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_msck_repair_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getDatabaseOid() == null) ? 0 : getDatabaseOid().hashCode());
        result = prime * result + ((getIsAddPartitions() == null) ? 0 : getIsAddPartitions().hashCode());
        result = prime * result + ((getTableOid() == null) ? 0 : getTableOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_msck_repair_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", databaseOid=").append(databaseOid);
        sb.append(", isAddPartitions=").append(isAddPartitions);
        sb.append(", tableOid=").append(tableOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}