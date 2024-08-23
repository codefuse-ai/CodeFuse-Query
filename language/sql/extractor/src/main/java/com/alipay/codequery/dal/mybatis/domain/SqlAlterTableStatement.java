package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlAlterTableStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.buckets")
    private Integer buckets;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_if_exists")
    private Integer isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_ignore")
    private Integer isIgnore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_invalidate_global_indexes")
    private Integer isInvalidateGlobalIndexes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_merge_small_files")
    private Integer isMergeSmallFiles;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_not_clustered")
    private Integer isNotClustered;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_offline")
    private Integer isOffline;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_online")
    private Integer isOnline;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_range")
    private Integer isRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_remove_patiting")
    private Integer isRemovePatiting;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_update_global_indexes")
    private Integer isUpdateGlobalIndexes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_upgrade_patiting")
    private Integer isUpgradePatiting;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.partition_oid")
    private Long partitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.schema")
    private String schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.shards")
    private Integer shards;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.table_name")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.table_source_oid")
    private Long tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    public SqlAlterTableStatement(Long oid, Integer buckets, Integer isIfExists, Integer isIgnore, Integer isInvalidateGlobalIndexes, Integer isMergeSmallFiles, Integer isNotClustered, Integer isOffline, Integer isOnline, Integer isRange, Integer isRemovePatiting, Integer isUpdateGlobalIndexes, Integer isUpgradePatiting, Long nameOid, Long partitionOid, String schema, Integer shards, String tableName, Long tableSourceOid) {
        this.oid = oid;
        this.buckets = buckets;
        this.isIfExists = isIfExists;
        this.isIgnore = isIgnore;
        this.isInvalidateGlobalIndexes = isInvalidateGlobalIndexes;
        this.isMergeSmallFiles = isMergeSmallFiles;
        this.isNotClustered = isNotClustered;
        this.isOffline = isOffline;
        this.isOnline = isOnline;
        this.isRange = isRange;
        this.isRemovePatiting = isRemovePatiting;
        this.isUpdateGlobalIndexes = isUpdateGlobalIndexes;
        this.isUpgradePatiting = isUpgradePatiting;
        this.nameOid = nameOid;
        this.partitionOid = partitionOid;
        this.schema = schema;
        this.shards = shards;
        this.tableName = tableName;
        this.tableSourceOid = tableSourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    public SqlAlterTableStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.buckets")
    public Integer getBuckets() {
        return buckets;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.buckets")
    public void setBuckets(Integer buckets) {
        this.buckets = buckets;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_if_exists")
    public Integer getIsIfExists() {
        return isIfExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_if_exists")
    public void setIsIfExists(Integer isIfExists) {
        this.isIfExists = isIfExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_ignore")
    public Integer getIsIgnore() {
        return isIgnore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_ignore")
    public void setIsIgnore(Integer isIgnore) {
        this.isIgnore = isIgnore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_invalidate_global_indexes")
    public Integer getIsInvalidateGlobalIndexes() {
        return isInvalidateGlobalIndexes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_invalidate_global_indexes")
    public void setIsInvalidateGlobalIndexes(Integer isInvalidateGlobalIndexes) {
        this.isInvalidateGlobalIndexes = isInvalidateGlobalIndexes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_merge_small_files")
    public Integer getIsMergeSmallFiles() {
        return isMergeSmallFiles;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_merge_small_files")
    public void setIsMergeSmallFiles(Integer isMergeSmallFiles) {
        this.isMergeSmallFiles = isMergeSmallFiles;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_not_clustered")
    public Integer getIsNotClustered() {
        return isNotClustered;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_not_clustered")
    public void setIsNotClustered(Integer isNotClustered) {
        this.isNotClustered = isNotClustered;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_offline")
    public Integer getIsOffline() {
        return isOffline;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_offline")
    public void setIsOffline(Integer isOffline) {
        this.isOffline = isOffline;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_online")
    public Integer getIsOnline() {
        return isOnline;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_online")
    public void setIsOnline(Integer isOnline) {
        this.isOnline = isOnline;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_range")
    public Integer getIsRange() {
        return isRange;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_range")
    public void setIsRange(Integer isRange) {
        this.isRange = isRange;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_remove_patiting")
    public Integer getIsRemovePatiting() {
        return isRemovePatiting;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_remove_patiting")
    public void setIsRemovePatiting(Integer isRemovePatiting) {
        this.isRemovePatiting = isRemovePatiting;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_update_global_indexes")
    public Integer getIsUpdateGlobalIndexes() {
        return isUpdateGlobalIndexes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_update_global_indexes")
    public void setIsUpdateGlobalIndexes(Integer isUpdateGlobalIndexes) {
        this.isUpdateGlobalIndexes = isUpdateGlobalIndexes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_upgrade_patiting")
    public Integer getIsUpgradePatiting() {
        return isUpgradePatiting;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_upgrade_patiting")
    public void setIsUpgradePatiting(Integer isUpgradePatiting) {
        this.isUpgradePatiting = isUpgradePatiting;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.partition_oid")
    public Long getPartitionOid() {
        return partitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.partition_oid")
    public void setPartitionOid(Long partitionOid) {
        this.partitionOid = partitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.schema")
    public String getSchema() {
        return schema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.schema")
    public void setSchema(String schema) {
        this.schema = schema == null ? null : schema.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.shards")
    public Integer getShards() {
        return shards;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.shards")
    public void setShards(Integer shards) {
        this.shards = shards;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.table_name")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.table_name")
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.table_source_oid")
    public Long getTableSourceOid() {
        return tableSourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.table_source_oid")
    public void setTableSourceOid(Long tableSourceOid) {
        this.tableSourceOid = tableSourceOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
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
        SqlAlterTableStatement other = (SqlAlterTableStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getBuckets() == null ? other.getBuckets() == null : this.getBuckets().equals(other.getBuckets()))
            && (this.getIsIfExists() == null ? other.getIsIfExists() == null : this.getIsIfExists().equals(other.getIsIfExists()))
            && (this.getIsIgnore() == null ? other.getIsIgnore() == null : this.getIsIgnore().equals(other.getIsIgnore()))
            && (this.getIsInvalidateGlobalIndexes() == null ? other.getIsInvalidateGlobalIndexes() == null : this.getIsInvalidateGlobalIndexes().equals(other.getIsInvalidateGlobalIndexes()))
            && (this.getIsMergeSmallFiles() == null ? other.getIsMergeSmallFiles() == null : this.getIsMergeSmallFiles().equals(other.getIsMergeSmallFiles()))
            && (this.getIsNotClustered() == null ? other.getIsNotClustered() == null : this.getIsNotClustered().equals(other.getIsNotClustered()))
            && (this.getIsOffline() == null ? other.getIsOffline() == null : this.getIsOffline().equals(other.getIsOffline()))
            && (this.getIsOnline() == null ? other.getIsOnline() == null : this.getIsOnline().equals(other.getIsOnline()))
            && (this.getIsRange() == null ? other.getIsRange() == null : this.getIsRange().equals(other.getIsRange()))
            && (this.getIsRemovePatiting() == null ? other.getIsRemovePatiting() == null : this.getIsRemovePatiting().equals(other.getIsRemovePatiting()))
            && (this.getIsUpdateGlobalIndexes() == null ? other.getIsUpdateGlobalIndexes() == null : this.getIsUpdateGlobalIndexes().equals(other.getIsUpdateGlobalIndexes()))
            && (this.getIsUpgradePatiting() == null ? other.getIsUpgradePatiting() == null : this.getIsUpgradePatiting().equals(other.getIsUpgradePatiting()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getPartitionOid() == null ? other.getPartitionOid() == null : this.getPartitionOid().equals(other.getPartitionOid()))
            && (this.getSchema() == null ? other.getSchema() == null : this.getSchema().equals(other.getSchema()))
            && (this.getShards() == null ? other.getShards() == null : this.getShards().equals(other.getShards()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getTableSourceOid() == null ? other.getTableSourceOid() == null : this.getTableSourceOid().equals(other.getTableSourceOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getBuckets() == null) ? 0 : getBuckets().hashCode());
        result = prime * result + ((getIsIfExists() == null) ? 0 : getIsIfExists().hashCode());
        result = prime * result + ((getIsIgnore() == null) ? 0 : getIsIgnore().hashCode());
        result = prime * result + ((getIsInvalidateGlobalIndexes() == null) ? 0 : getIsInvalidateGlobalIndexes().hashCode());
        result = prime * result + ((getIsMergeSmallFiles() == null) ? 0 : getIsMergeSmallFiles().hashCode());
        result = prime * result + ((getIsNotClustered() == null) ? 0 : getIsNotClustered().hashCode());
        result = prime * result + ((getIsOffline() == null) ? 0 : getIsOffline().hashCode());
        result = prime * result + ((getIsOnline() == null) ? 0 : getIsOnline().hashCode());
        result = prime * result + ((getIsRange() == null) ? 0 : getIsRange().hashCode());
        result = prime * result + ((getIsRemovePatiting() == null) ? 0 : getIsRemovePatiting().hashCode());
        result = prime * result + ((getIsUpdateGlobalIndexes() == null) ? 0 : getIsUpdateGlobalIndexes().hashCode());
        result = prime * result + ((getIsUpgradePatiting() == null) ? 0 : getIsUpgradePatiting().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getPartitionOid() == null) ? 0 : getPartitionOid().hashCode());
        result = prime * result + ((getSchema() == null) ? 0 : getSchema().hashCode());
        result = prime * result + ((getShards() == null) ? 0 : getShards().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getTableSourceOid() == null) ? 0 : getTableSourceOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", buckets=").append(buckets);
        sb.append(", isIfExists=").append(isIfExists);
        sb.append(", isIgnore=").append(isIgnore);
        sb.append(", isInvalidateGlobalIndexes=").append(isInvalidateGlobalIndexes);
        sb.append(", isMergeSmallFiles=").append(isMergeSmallFiles);
        sb.append(", isNotClustered=").append(isNotClustered);
        sb.append(", isOffline=").append(isOffline);
        sb.append(", isOnline=").append(isOnline);
        sb.append(", isRange=").append(isRange);
        sb.append(", isRemovePatiting=").append(isRemovePatiting);
        sb.append(", isUpdateGlobalIndexes=").append(isUpdateGlobalIndexes);
        sb.append(", isUpgradePatiting=").append(isUpgradePatiting);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", partitionOid=").append(partitionOid);
        sb.append(", schema=").append(schema);
        sb.append(", shards=").append(shards);
        sb.append(", tableName=").append(tableName);
        sb.append(", tableSourceOid=").append(tableSourceOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}