package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlCreateTableStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.archive_by_oid")
    private Long archiveByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.db_partition_by_oid")
    private Long dbPartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.db_partitions_oid")
    private Long dbPartitionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.dbpartitions_oid")
    private Long dbpartitionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.distribute_by_type_oid")
    private Long distributeByTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.engine_oid")
    private Long engineOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.ext_partition_oid")
    private Long extPartitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.is_broad_cast")
    private Integer isBroadCast;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.stored_by_oid")
    private Long storedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.table_group_oid")
    private Long tableGroupOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.table_partition_by_oid")
    private Long tablePartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.table_partitions_oid")
    private Long tablePartitionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.tbpartitions_oid")
    private Long tbpartitionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.with")
    private String with;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.with_data")
    private Integer withData;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    public MySqlCreateTableStatement(Long oid, Long archiveByOid, Long dbPartitionByOid, Long dbPartitionsOid, Long dbpartitionsOid, Long distributeByTypeOid, Long engineOid, Long extPartitionOid, Integer isBroadCast, Long storedByOid, Long tableGroupOid, Long tablePartitionByOid, Long tablePartitionsOid, Long tbpartitionsOid, String with, Integer withData) {
        this.oid = oid;
        this.archiveByOid = archiveByOid;
        this.dbPartitionByOid = dbPartitionByOid;
        this.dbPartitionsOid = dbPartitionsOid;
        this.dbpartitionsOid = dbpartitionsOid;
        this.distributeByTypeOid = distributeByTypeOid;
        this.engineOid = engineOid;
        this.extPartitionOid = extPartitionOid;
        this.isBroadCast = isBroadCast;
        this.storedByOid = storedByOid;
        this.tableGroupOid = tableGroupOid;
        this.tablePartitionByOid = tablePartitionByOid;
        this.tablePartitionsOid = tablePartitionsOid;
        this.tbpartitionsOid = tbpartitionsOid;
        this.with = with;
        this.withData = withData;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    public MySqlCreateTableStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.archive_by_oid")
    public Long getArchiveByOid() {
        return archiveByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.archive_by_oid")
    public void setArchiveByOid(Long archiveByOid) {
        this.archiveByOid = archiveByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.db_partition_by_oid")
    public Long getDbPartitionByOid() {
        return dbPartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.db_partition_by_oid")
    public void setDbPartitionByOid(Long dbPartitionByOid) {
        this.dbPartitionByOid = dbPartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.db_partitions_oid")
    public Long getDbPartitionsOid() {
        return dbPartitionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.db_partitions_oid")
    public void setDbPartitionsOid(Long dbPartitionsOid) {
        this.dbPartitionsOid = dbPartitionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.dbpartitions_oid")
    public Long getDbpartitionsOid() {
        return dbpartitionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.dbpartitions_oid")
    public void setDbpartitionsOid(Long dbpartitionsOid) {
        this.dbpartitionsOid = dbpartitionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.distribute_by_type_oid")
    public Long getDistributeByTypeOid() {
        return distributeByTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.distribute_by_type_oid")
    public void setDistributeByTypeOid(Long distributeByTypeOid) {
        this.distributeByTypeOid = distributeByTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.engine_oid")
    public Long getEngineOid() {
        return engineOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.engine_oid")
    public void setEngineOid(Long engineOid) {
        this.engineOid = engineOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.ext_partition_oid")
    public Long getExtPartitionOid() {
        return extPartitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.ext_partition_oid")
    public void setExtPartitionOid(Long extPartitionOid) {
        this.extPartitionOid = extPartitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.is_broad_cast")
    public Integer getIsBroadCast() {
        return isBroadCast;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.is_broad_cast")
    public void setIsBroadCast(Integer isBroadCast) {
        this.isBroadCast = isBroadCast;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.stored_by_oid")
    public Long getStoredByOid() {
        return storedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.stored_by_oid")
    public void setStoredByOid(Long storedByOid) {
        this.storedByOid = storedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.table_group_oid")
    public Long getTableGroupOid() {
        return tableGroupOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.table_group_oid")
    public void setTableGroupOid(Long tableGroupOid) {
        this.tableGroupOid = tableGroupOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.table_partition_by_oid")
    public Long getTablePartitionByOid() {
        return tablePartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.table_partition_by_oid")
    public void setTablePartitionByOid(Long tablePartitionByOid) {
        this.tablePartitionByOid = tablePartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.table_partitions_oid")
    public Long getTablePartitionsOid() {
        return tablePartitionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.table_partitions_oid")
    public void setTablePartitionsOid(Long tablePartitionsOid) {
        this.tablePartitionsOid = tablePartitionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.tbpartitions_oid")
    public Long getTbpartitionsOid() {
        return tbpartitionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.tbpartitions_oid")
    public void setTbpartitionsOid(Long tbpartitionsOid) {
        this.tbpartitionsOid = tbpartitionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.with")
    public String getWith() {
        return with;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.with")
    public void setWith(String with) {
        this.with = with == null ? null : with.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.with_data")
    public Integer getWithData() {
        return withData;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.with_data")
    public void setWithData(Integer withData) {
        this.withData = withData;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
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
        MySqlCreateTableStatement other = (MySqlCreateTableStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getArchiveByOid() == null ? other.getArchiveByOid() == null : this.getArchiveByOid().equals(other.getArchiveByOid()))
            && (this.getDbPartitionByOid() == null ? other.getDbPartitionByOid() == null : this.getDbPartitionByOid().equals(other.getDbPartitionByOid()))
            && (this.getDbPartitionsOid() == null ? other.getDbPartitionsOid() == null : this.getDbPartitionsOid().equals(other.getDbPartitionsOid()))
            && (this.getDbpartitionsOid() == null ? other.getDbpartitionsOid() == null : this.getDbpartitionsOid().equals(other.getDbpartitionsOid()))
            && (this.getDistributeByTypeOid() == null ? other.getDistributeByTypeOid() == null : this.getDistributeByTypeOid().equals(other.getDistributeByTypeOid()))
            && (this.getEngineOid() == null ? other.getEngineOid() == null : this.getEngineOid().equals(other.getEngineOid()))
            && (this.getExtPartitionOid() == null ? other.getExtPartitionOid() == null : this.getExtPartitionOid().equals(other.getExtPartitionOid()))
            && (this.getIsBroadCast() == null ? other.getIsBroadCast() == null : this.getIsBroadCast().equals(other.getIsBroadCast()))
            && (this.getStoredByOid() == null ? other.getStoredByOid() == null : this.getStoredByOid().equals(other.getStoredByOid()))
            && (this.getTableGroupOid() == null ? other.getTableGroupOid() == null : this.getTableGroupOid().equals(other.getTableGroupOid()))
            && (this.getTablePartitionByOid() == null ? other.getTablePartitionByOid() == null : this.getTablePartitionByOid().equals(other.getTablePartitionByOid()))
            && (this.getTablePartitionsOid() == null ? other.getTablePartitionsOid() == null : this.getTablePartitionsOid().equals(other.getTablePartitionsOid()))
            && (this.getTbpartitionsOid() == null ? other.getTbpartitionsOid() == null : this.getTbpartitionsOid().equals(other.getTbpartitionsOid()))
            && (this.getWith() == null ? other.getWith() == null : this.getWith().equals(other.getWith()))
            && (this.getWithData() == null ? other.getWithData() == null : this.getWithData().equals(other.getWithData()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getArchiveByOid() == null) ? 0 : getArchiveByOid().hashCode());
        result = prime * result + ((getDbPartitionByOid() == null) ? 0 : getDbPartitionByOid().hashCode());
        result = prime * result + ((getDbPartitionsOid() == null) ? 0 : getDbPartitionsOid().hashCode());
        result = prime * result + ((getDbpartitionsOid() == null) ? 0 : getDbpartitionsOid().hashCode());
        result = prime * result + ((getDistributeByTypeOid() == null) ? 0 : getDistributeByTypeOid().hashCode());
        result = prime * result + ((getEngineOid() == null) ? 0 : getEngineOid().hashCode());
        result = prime * result + ((getExtPartitionOid() == null) ? 0 : getExtPartitionOid().hashCode());
        result = prime * result + ((getIsBroadCast() == null) ? 0 : getIsBroadCast().hashCode());
        result = prime * result + ((getStoredByOid() == null) ? 0 : getStoredByOid().hashCode());
        result = prime * result + ((getTableGroupOid() == null) ? 0 : getTableGroupOid().hashCode());
        result = prime * result + ((getTablePartitionByOid() == null) ? 0 : getTablePartitionByOid().hashCode());
        result = prime * result + ((getTablePartitionsOid() == null) ? 0 : getTablePartitionsOid().hashCode());
        result = prime * result + ((getTbpartitionsOid() == null) ? 0 : getTbpartitionsOid().hashCode());
        result = prime * result + ((getWith() == null) ? 0 : getWith().hashCode());
        result = prime * result + ((getWithData() == null) ? 0 : getWithData().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", archiveByOid=").append(archiveByOid);
        sb.append(", dbPartitionByOid=").append(dbPartitionByOid);
        sb.append(", dbPartitionsOid=").append(dbPartitionsOid);
        sb.append(", dbpartitionsOid=").append(dbpartitionsOid);
        sb.append(", distributeByTypeOid=").append(distributeByTypeOid);
        sb.append(", engineOid=").append(engineOid);
        sb.append(", extPartitionOid=").append(extPartitionOid);
        sb.append(", isBroadCast=").append(isBroadCast);
        sb.append(", storedByOid=").append(storedByOid);
        sb.append(", tableGroupOid=").append(tableGroupOid);
        sb.append(", tablePartitionByOid=").append(tablePartitionByOid);
        sb.append(", tablePartitionsOid=").append(tablePartitionsOid);
        sb.append(", tbpartitionsOid=").append(tbpartitionsOid);
        sb.append(", with=").append(with);
        sb.append(", withData=").append(withData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}