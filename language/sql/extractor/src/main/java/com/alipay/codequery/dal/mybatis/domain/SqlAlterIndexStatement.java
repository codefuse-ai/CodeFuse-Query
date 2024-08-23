package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlAlterIndexStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.db_partition_by_oid")
    private Long dbPartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.enable")
    private Integer enable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.is_compile")
    private Integer isCompile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.is_unusable")
    private Integer isUnusable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.monitoring_usage")
    private Integer monitoringUsage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.parallel_oid")
    private Long parallelOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.rebuild")
    private String rebuild;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.rename_to_oid")
    private Long renameToOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.table_oid")
    private Long tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    public SqlAlterIndexStatement(Long oid, Long dbPartitionByOid, Integer enable, Integer isCompile, Integer isUnusable, Integer monitoringUsage, Long nameOid, Long parallelOid, String rebuild, Long renameToOid, Long tableOid) {
        this.oid = oid;
        this.dbPartitionByOid = dbPartitionByOid;
        this.enable = enable;
        this.isCompile = isCompile;
        this.isUnusable = isUnusable;
        this.monitoringUsage = monitoringUsage;
        this.nameOid = nameOid;
        this.parallelOid = parallelOid;
        this.rebuild = rebuild;
        this.renameToOid = renameToOid;
        this.tableOid = tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    public SqlAlterIndexStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.db_partition_by_oid")
    public Long getDbPartitionByOid() {
        return dbPartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.db_partition_by_oid")
    public void setDbPartitionByOid(Long dbPartitionByOid) {
        this.dbPartitionByOid = dbPartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.enable")
    public Integer getEnable() {
        return enable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.enable")
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.is_compile")
    public Integer getIsCompile() {
        return isCompile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.is_compile")
    public void setIsCompile(Integer isCompile) {
        this.isCompile = isCompile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.is_unusable")
    public Integer getIsUnusable() {
        return isUnusable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.is_unusable")
    public void setIsUnusable(Integer isUnusable) {
        this.isUnusable = isUnusable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.monitoring_usage")
    public Integer getMonitoringUsage() {
        return monitoringUsage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.monitoring_usage")
    public void setMonitoringUsage(Integer monitoringUsage) {
        this.monitoringUsage = monitoringUsage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.parallel_oid")
    public Long getParallelOid() {
        return parallelOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.parallel_oid")
    public void setParallelOid(Long parallelOid) {
        this.parallelOid = parallelOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.rebuild")
    public String getRebuild() {
        return rebuild;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.rebuild")
    public void setRebuild(String rebuild) {
        this.rebuild = rebuild == null ? null : rebuild.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.rename_to_oid")
    public Long getRenameToOid() {
        return renameToOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.rename_to_oid")
    public void setRenameToOid(Long renameToOid) {
        this.renameToOid = renameToOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.table_oid")
    public Long getTableOid() {
        return tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.table_oid")
    public void setTableOid(Long tableOid) {
        this.tableOid = tableOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
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
        SqlAlterIndexStatement other = (SqlAlterIndexStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getDbPartitionByOid() == null ? other.getDbPartitionByOid() == null : this.getDbPartitionByOid().equals(other.getDbPartitionByOid()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getIsCompile() == null ? other.getIsCompile() == null : this.getIsCompile().equals(other.getIsCompile()))
            && (this.getIsUnusable() == null ? other.getIsUnusable() == null : this.getIsUnusable().equals(other.getIsUnusable()))
            && (this.getMonitoringUsage() == null ? other.getMonitoringUsage() == null : this.getMonitoringUsage().equals(other.getMonitoringUsage()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getParallelOid() == null ? other.getParallelOid() == null : this.getParallelOid().equals(other.getParallelOid()))
            && (this.getRebuild() == null ? other.getRebuild() == null : this.getRebuild().equals(other.getRebuild()))
            && (this.getRenameToOid() == null ? other.getRenameToOid() == null : this.getRenameToOid().equals(other.getRenameToOid()))
            && (this.getTableOid() == null ? other.getTableOid() == null : this.getTableOid().equals(other.getTableOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getDbPartitionByOid() == null) ? 0 : getDbPartitionByOid().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getIsCompile() == null) ? 0 : getIsCompile().hashCode());
        result = prime * result + ((getIsUnusable() == null) ? 0 : getIsUnusable().hashCode());
        result = prime * result + ((getMonitoringUsage() == null) ? 0 : getMonitoringUsage().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getParallelOid() == null) ? 0 : getParallelOid().hashCode());
        result = prime * result + ((getRebuild() == null) ? 0 : getRebuild().hashCode());
        result = prime * result + ((getRenameToOid() == null) ? 0 : getRenameToOid().hashCode());
        result = prime * result + ((getTableOid() == null) ? 0 : getTableOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", dbPartitionByOid=").append(dbPartitionByOid);
        sb.append(", enable=").append(enable);
        sb.append(", isCompile=").append(isCompile);
        sb.append(", isUnusable=").append(isUnusable);
        sb.append(", monitoringUsage=").append(monitoringUsage);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", parallelOid=").append(parallelOid);
        sb.append(", rebuild=").append(rebuild);
        sb.append(", renameToOid=").append(renameToOid);
        sb.append(", tableOid=").append(tableOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}