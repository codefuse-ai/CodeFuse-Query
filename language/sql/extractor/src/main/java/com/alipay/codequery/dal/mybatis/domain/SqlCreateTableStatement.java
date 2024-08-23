package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlCreateTableStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.body_before_comments_direct")
    private String bodyBeforeCommentsDirect;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.buckets")
    private Integer buckets;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.catalog")
    private String catalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.clustering_type")
    private String clusteringType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.column_comments")
    private String columnComments;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.comment_oid")
    private Long commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.compress")
    private Integer compress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.engine_oid")
    private Long engineOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.inherits_oid")
    private Long inheritsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_dimension")
    private Integer isDimension;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_external")
    private Integer isExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_if_not_exists")
    private Integer isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_ignore")
    private Integer isIgnore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_on_commit_preserve_rows")
    private Integer isOnCommitPreserveRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_replace")
    private Integer isReplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_single")
    private Integer isSingle;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.like_oid")
    private Long likeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.local_partitioning_oid")
    private Long localPartitioningOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.location_oid")
    private Long locationOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.logging")
    private Integer logging;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.partitioning_oid")
    private Long partitioningOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.primary_key_names")
    private String primaryKeyNames;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.row_format_oid")
    private Long rowFormatOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.schema")
    private String schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.select_oid")
    private Long selectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.shards")
    private Integer shards;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.stored_as_oid")
    private Long storedAsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.table_name")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.table_source_oid")
    private Long tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.tablespace_oid")
    private Long tablespaceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.type")
    private String type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    public SqlCreateTableStatement(Long oid, String bodyBeforeCommentsDirect, Integer buckets, String catalog, String clusteringType, String columnComments, Long commentOid, Integer compress, Long engineOid, Long inheritsOid, Integer isDimension, Integer isExternal, Integer isIfNotExists, Integer isIgnore, Integer isOnCommitPreserveRows, Integer isReplace, Integer isSingle, Long likeOid, Long localPartitioningOid, Long locationOid, Integer logging, Long nameOid, Long partitioningOid, String primaryKeyNames, Long rowFormatOid, String schema, Long selectOid, Integer shards, Long storedAsOid, String tableName, Long tableSourceOid, Long tablespaceOid, String type) {
        this.oid = oid;
        this.bodyBeforeCommentsDirect = bodyBeforeCommentsDirect;
        this.buckets = buckets;
        this.catalog = catalog;
        this.clusteringType = clusteringType;
        this.columnComments = columnComments;
        this.commentOid = commentOid;
        this.compress = compress;
        this.engineOid = engineOid;
        this.inheritsOid = inheritsOid;
        this.isDimension = isDimension;
        this.isExternal = isExternal;
        this.isIfNotExists = isIfNotExists;
        this.isIgnore = isIgnore;
        this.isOnCommitPreserveRows = isOnCommitPreserveRows;
        this.isReplace = isReplace;
        this.isSingle = isSingle;
        this.likeOid = likeOid;
        this.localPartitioningOid = localPartitioningOid;
        this.locationOid = locationOid;
        this.logging = logging;
        this.nameOid = nameOid;
        this.partitioningOid = partitioningOid;
        this.primaryKeyNames = primaryKeyNames;
        this.rowFormatOid = rowFormatOid;
        this.schema = schema;
        this.selectOid = selectOid;
        this.shards = shards;
        this.storedAsOid = storedAsOid;
        this.tableName = tableName;
        this.tableSourceOid = tableSourceOid;
        this.tablespaceOid = tablespaceOid;
        this.type = type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    public SqlCreateTableStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.body_before_comments_direct")
    public String getBodyBeforeCommentsDirect() {
        return bodyBeforeCommentsDirect;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.body_before_comments_direct")
    public void setBodyBeforeCommentsDirect(String bodyBeforeCommentsDirect) {
        this.bodyBeforeCommentsDirect = bodyBeforeCommentsDirect == null ? null : bodyBeforeCommentsDirect.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.buckets")
    public Integer getBuckets() {
        return buckets;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.buckets")
    public void setBuckets(Integer buckets) {
        this.buckets = buckets;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.catalog")
    public String getCatalog() {
        return catalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.catalog")
    public void setCatalog(String catalog) {
        this.catalog = catalog == null ? null : catalog.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.clustering_type")
    public String getClusteringType() {
        return clusteringType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.clustering_type")
    public void setClusteringType(String clusteringType) {
        this.clusteringType = clusteringType == null ? null : clusteringType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.column_comments")
    public String getColumnComments() {
        return columnComments;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.column_comments")
    public void setColumnComments(String columnComments) {
        this.columnComments = columnComments == null ? null : columnComments.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.comment_oid")
    public Long getCommentOid() {
        return commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.comment_oid")
    public void setCommentOid(Long commentOid) {
        this.commentOid = commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.compress")
    public Integer getCompress() {
        return compress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.compress")
    public void setCompress(Integer compress) {
        this.compress = compress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.engine_oid")
    public Long getEngineOid() {
        return engineOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.engine_oid")
    public void setEngineOid(Long engineOid) {
        this.engineOid = engineOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.inherits_oid")
    public Long getInheritsOid() {
        return inheritsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.inherits_oid")
    public void setInheritsOid(Long inheritsOid) {
        this.inheritsOid = inheritsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_dimension")
    public Integer getIsDimension() {
        return isDimension;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_dimension")
    public void setIsDimension(Integer isDimension) {
        this.isDimension = isDimension;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_external")
    public Integer getIsExternal() {
        return isExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_external")
    public void setIsExternal(Integer isExternal) {
        this.isExternal = isExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_if_not_exists")
    public Integer getIsIfNotExists() {
        return isIfNotExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_if_not_exists")
    public void setIsIfNotExists(Integer isIfNotExists) {
        this.isIfNotExists = isIfNotExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_ignore")
    public Integer getIsIgnore() {
        return isIgnore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_ignore")
    public void setIsIgnore(Integer isIgnore) {
        this.isIgnore = isIgnore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_on_commit_preserve_rows")
    public Integer getIsOnCommitPreserveRows() {
        return isOnCommitPreserveRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_on_commit_preserve_rows")
    public void setIsOnCommitPreserveRows(Integer isOnCommitPreserveRows) {
        this.isOnCommitPreserveRows = isOnCommitPreserveRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_replace")
    public Integer getIsReplace() {
        return isReplace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_replace")
    public void setIsReplace(Integer isReplace) {
        this.isReplace = isReplace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_single")
    public Integer getIsSingle() {
        return isSingle;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_single")
    public void setIsSingle(Integer isSingle) {
        this.isSingle = isSingle;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.like_oid")
    public Long getLikeOid() {
        return likeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.like_oid")
    public void setLikeOid(Long likeOid) {
        this.likeOid = likeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.local_partitioning_oid")
    public Long getLocalPartitioningOid() {
        return localPartitioningOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.local_partitioning_oid")
    public void setLocalPartitioningOid(Long localPartitioningOid) {
        this.localPartitioningOid = localPartitioningOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.location_oid")
    public Long getLocationOid() {
        return locationOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.location_oid")
    public void setLocationOid(Long locationOid) {
        this.locationOid = locationOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.logging")
    public Integer getLogging() {
        return logging;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.logging")
    public void setLogging(Integer logging) {
        this.logging = logging;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.partitioning_oid")
    public Long getPartitioningOid() {
        return partitioningOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.partitioning_oid")
    public void setPartitioningOid(Long partitioningOid) {
        this.partitioningOid = partitioningOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.primary_key_names")
    public String getPrimaryKeyNames() {
        return primaryKeyNames;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.primary_key_names")
    public void setPrimaryKeyNames(String primaryKeyNames) {
        this.primaryKeyNames = primaryKeyNames == null ? null : primaryKeyNames.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.row_format_oid")
    public Long getRowFormatOid() {
        return rowFormatOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.row_format_oid")
    public void setRowFormatOid(Long rowFormatOid) {
        this.rowFormatOid = rowFormatOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.schema")
    public String getSchema() {
        return schema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.schema")
    public void setSchema(String schema) {
        this.schema = schema == null ? null : schema.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.select_oid")
    public Long getSelectOid() {
        return selectOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.select_oid")
    public void setSelectOid(Long selectOid) {
        this.selectOid = selectOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.shards")
    public Integer getShards() {
        return shards;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.shards")
    public void setShards(Integer shards) {
        this.shards = shards;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.stored_as_oid")
    public Long getStoredAsOid() {
        return storedAsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.stored_as_oid")
    public void setStoredAsOid(Long storedAsOid) {
        this.storedAsOid = storedAsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.table_name")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.table_name")
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.table_source_oid")
    public Long getTableSourceOid() {
        return tableSourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.table_source_oid")
    public void setTableSourceOid(Long tableSourceOid) {
        this.tableSourceOid = tableSourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.tablespace_oid")
    public Long getTablespaceOid() {
        return tablespaceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.tablespace_oid")
    public void setTablespaceOid(Long tablespaceOid) {
        this.tablespaceOid = tablespaceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.type")
    public String getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.type")
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
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
        SqlCreateTableStatement other = (SqlCreateTableStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getBodyBeforeCommentsDirect() == null ? other.getBodyBeforeCommentsDirect() == null : this.getBodyBeforeCommentsDirect().equals(other.getBodyBeforeCommentsDirect()))
            && (this.getBuckets() == null ? other.getBuckets() == null : this.getBuckets().equals(other.getBuckets()))
            && (this.getCatalog() == null ? other.getCatalog() == null : this.getCatalog().equals(other.getCatalog()))
            && (this.getClusteringType() == null ? other.getClusteringType() == null : this.getClusteringType().equals(other.getClusteringType()))
            && (this.getColumnComments() == null ? other.getColumnComments() == null : this.getColumnComments().equals(other.getColumnComments()))
            && (this.getCommentOid() == null ? other.getCommentOid() == null : this.getCommentOid().equals(other.getCommentOid()))
            && (this.getCompress() == null ? other.getCompress() == null : this.getCompress().equals(other.getCompress()))
            && (this.getEngineOid() == null ? other.getEngineOid() == null : this.getEngineOid().equals(other.getEngineOid()))
            && (this.getInheritsOid() == null ? other.getInheritsOid() == null : this.getInheritsOid().equals(other.getInheritsOid()))
            && (this.getIsDimension() == null ? other.getIsDimension() == null : this.getIsDimension().equals(other.getIsDimension()))
            && (this.getIsExternal() == null ? other.getIsExternal() == null : this.getIsExternal().equals(other.getIsExternal()))
            && (this.getIsIfNotExists() == null ? other.getIsIfNotExists() == null : this.getIsIfNotExists().equals(other.getIsIfNotExists()))
            && (this.getIsIgnore() == null ? other.getIsIgnore() == null : this.getIsIgnore().equals(other.getIsIgnore()))
            && (this.getIsOnCommitPreserveRows() == null ? other.getIsOnCommitPreserveRows() == null : this.getIsOnCommitPreserveRows().equals(other.getIsOnCommitPreserveRows()))
            && (this.getIsReplace() == null ? other.getIsReplace() == null : this.getIsReplace().equals(other.getIsReplace()))
            && (this.getIsSingle() == null ? other.getIsSingle() == null : this.getIsSingle().equals(other.getIsSingle()))
            && (this.getLikeOid() == null ? other.getLikeOid() == null : this.getLikeOid().equals(other.getLikeOid()))
            && (this.getLocalPartitioningOid() == null ? other.getLocalPartitioningOid() == null : this.getLocalPartitioningOid().equals(other.getLocalPartitioningOid()))
            && (this.getLocationOid() == null ? other.getLocationOid() == null : this.getLocationOid().equals(other.getLocationOid()))
            && (this.getLogging() == null ? other.getLogging() == null : this.getLogging().equals(other.getLogging()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getPartitioningOid() == null ? other.getPartitioningOid() == null : this.getPartitioningOid().equals(other.getPartitioningOid()))
            && (this.getPrimaryKeyNames() == null ? other.getPrimaryKeyNames() == null : this.getPrimaryKeyNames().equals(other.getPrimaryKeyNames()))
            && (this.getRowFormatOid() == null ? other.getRowFormatOid() == null : this.getRowFormatOid().equals(other.getRowFormatOid()))
            && (this.getSchema() == null ? other.getSchema() == null : this.getSchema().equals(other.getSchema()))
            && (this.getSelectOid() == null ? other.getSelectOid() == null : this.getSelectOid().equals(other.getSelectOid()))
            && (this.getShards() == null ? other.getShards() == null : this.getShards().equals(other.getShards()))
            && (this.getStoredAsOid() == null ? other.getStoredAsOid() == null : this.getStoredAsOid().equals(other.getStoredAsOid()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getTableSourceOid() == null ? other.getTableSourceOid() == null : this.getTableSourceOid().equals(other.getTableSourceOid()))
            && (this.getTablespaceOid() == null ? other.getTablespaceOid() == null : this.getTablespaceOid().equals(other.getTablespaceOid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getBodyBeforeCommentsDirect() == null) ? 0 : getBodyBeforeCommentsDirect().hashCode());
        result = prime * result + ((getBuckets() == null) ? 0 : getBuckets().hashCode());
        result = prime * result + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        result = prime * result + ((getClusteringType() == null) ? 0 : getClusteringType().hashCode());
        result = prime * result + ((getColumnComments() == null) ? 0 : getColumnComments().hashCode());
        result = prime * result + ((getCommentOid() == null) ? 0 : getCommentOid().hashCode());
        result = prime * result + ((getCompress() == null) ? 0 : getCompress().hashCode());
        result = prime * result + ((getEngineOid() == null) ? 0 : getEngineOid().hashCode());
        result = prime * result + ((getInheritsOid() == null) ? 0 : getInheritsOid().hashCode());
        result = prime * result + ((getIsDimension() == null) ? 0 : getIsDimension().hashCode());
        result = prime * result + ((getIsExternal() == null) ? 0 : getIsExternal().hashCode());
        result = prime * result + ((getIsIfNotExists() == null) ? 0 : getIsIfNotExists().hashCode());
        result = prime * result + ((getIsIgnore() == null) ? 0 : getIsIgnore().hashCode());
        result = prime * result + ((getIsOnCommitPreserveRows() == null) ? 0 : getIsOnCommitPreserveRows().hashCode());
        result = prime * result + ((getIsReplace() == null) ? 0 : getIsReplace().hashCode());
        result = prime * result + ((getIsSingle() == null) ? 0 : getIsSingle().hashCode());
        result = prime * result + ((getLikeOid() == null) ? 0 : getLikeOid().hashCode());
        result = prime * result + ((getLocalPartitioningOid() == null) ? 0 : getLocalPartitioningOid().hashCode());
        result = prime * result + ((getLocationOid() == null) ? 0 : getLocationOid().hashCode());
        result = prime * result + ((getLogging() == null) ? 0 : getLogging().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getPartitioningOid() == null) ? 0 : getPartitioningOid().hashCode());
        result = prime * result + ((getPrimaryKeyNames() == null) ? 0 : getPrimaryKeyNames().hashCode());
        result = prime * result + ((getRowFormatOid() == null) ? 0 : getRowFormatOid().hashCode());
        result = prime * result + ((getSchema() == null) ? 0 : getSchema().hashCode());
        result = prime * result + ((getSelectOid() == null) ? 0 : getSelectOid().hashCode());
        result = prime * result + ((getShards() == null) ? 0 : getShards().hashCode());
        result = prime * result + ((getStoredAsOid() == null) ? 0 : getStoredAsOid().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getTableSourceOid() == null) ? 0 : getTableSourceOid().hashCode());
        result = prime * result + ((getTablespaceOid() == null) ? 0 : getTablespaceOid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", bodyBeforeCommentsDirect=").append(bodyBeforeCommentsDirect);
        sb.append(", buckets=").append(buckets);
        sb.append(", catalog=").append(catalog);
        sb.append(", clusteringType=").append(clusteringType);
        sb.append(", columnComments=").append(columnComments);
        sb.append(", commentOid=").append(commentOid);
        sb.append(", compress=").append(compress);
        sb.append(", engineOid=").append(engineOid);
        sb.append(", inheritsOid=").append(inheritsOid);
        sb.append(", isDimension=").append(isDimension);
        sb.append(", isExternal=").append(isExternal);
        sb.append(", isIfNotExists=").append(isIfNotExists);
        sb.append(", isIgnore=").append(isIgnore);
        sb.append(", isOnCommitPreserveRows=").append(isOnCommitPreserveRows);
        sb.append(", isReplace=").append(isReplace);
        sb.append(", isSingle=").append(isSingle);
        sb.append(", likeOid=").append(likeOid);
        sb.append(", localPartitioningOid=").append(localPartitioningOid);
        sb.append(", locationOid=").append(locationOid);
        sb.append(", logging=").append(logging);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", partitioningOid=").append(partitioningOid);
        sb.append(", primaryKeyNames=").append(primaryKeyNames);
        sb.append(", rowFormatOid=").append(rowFormatOid);
        sb.append(", schema=").append(schema);
        sb.append(", selectOid=").append(selectOid);
        sb.append(", shards=").append(shards);
        sb.append(", storedAsOid=").append(storedAsOid);
        sb.append(", tableName=").append(tableName);
        sb.append(", tableSourceOid=").append(tableSourceOid);
        sb.append(", tablespaceOid=").append(tablespaceOid);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}