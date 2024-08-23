package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlCreateIndexStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.comment_oid")
    private Long commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.db_partition_by_oid")
    private Long dbPartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.in_oid")
    private Long inOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.index_definition_oid")
    private Long indexDefinitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_concurrently")
    private Integer isConcurrently;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_defered_rebuild")
    private Integer isDeferedRebuild;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_global")
    private Integer isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_if_not_exists")
    private Integer isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_local")
    private Integer isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_storing")
    private Integer isStoring;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.row_format_oid")
    private Long rowFormatOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.schema")
    private String schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.stored_as_oid")
    private Long storedAsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.table_oid")
    private Long tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.table_name")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.table_partition_by_oid")
    private Long tablePartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.table_partitions_oid")
    private Long tablePartitionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.tablespace_oid")
    private Long tablespaceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.type")
    private String type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.using")
    private String using;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    public SqlCreateIndexStatement(Long oid, Long commentOid, Long dbPartitionByOid, Long inOid, Long indexDefinitionOid, Integer isConcurrently, Integer isDeferedRebuild, Integer isGlobal, Integer isIfNotExists, Integer isLocal, Integer isStoring, Long nameOid, Long rowFormatOid, String schema, Long storedAsOid, Long tableOid, String tableName, Long tablePartitionByOid, Long tablePartitionsOid, Long tablespaceOid, String type, String using) {
        this.oid = oid;
        this.commentOid = commentOid;
        this.dbPartitionByOid = dbPartitionByOid;
        this.inOid = inOid;
        this.indexDefinitionOid = indexDefinitionOid;
        this.isConcurrently = isConcurrently;
        this.isDeferedRebuild = isDeferedRebuild;
        this.isGlobal = isGlobal;
        this.isIfNotExists = isIfNotExists;
        this.isLocal = isLocal;
        this.isStoring = isStoring;
        this.nameOid = nameOid;
        this.rowFormatOid = rowFormatOid;
        this.schema = schema;
        this.storedAsOid = storedAsOid;
        this.tableOid = tableOid;
        this.tableName = tableName;
        this.tablePartitionByOid = tablePartitionByOid;
        this.tablePartitionsOid = tablePartitionsOid;
        this.tablespaceOid = tablespaceOid;
        this.type = type;
        this.using = using;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    public SqlCreateIndexStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.comment_oid")
    public Long getCommentOid() {
        return commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.comment_oid")
    public void setCommentOid(Long commentOid) {
        this.commentOid = commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.db_partition_by_oid")
    public Long getDbPartitionByOid() {
        return dbPartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.db_partition_by_oid")
    public void setDbPartitionByOid(Long dbPartitionByOid) {
        this.dbPartitionByOid = dbPartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.in_oid")
    public Long getInOid() {
        return inOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.in_oid")
    public void setInOid(Long inOid) {
        this.inOid = inOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.index_definition_oid")
    public Long getIndexDefinitionOid() {
        return indexDefinitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.index_definition_oid")
    public void setIndexDefinitionOid(Long indexDefinitionOid) {
        this.indexDefinitionOid = indexDefinitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_concurrently")
    public Integer getIsConcurrently() {
        return isConcurrently;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_concurrently")
    public void setIsConcurrently(Integer isConcurrently) {
        this.isConcurrently = isConcurrently;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_defered_rebuild")
    public Integer getIsDeferedRebuild() {
        return isDeferedRebuild;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_defered_rebuild")
    public void setIsDeferedRebuild(Integer isDeferedRebuild) {
        this.isDeferedRebuild = isDeferedRebuild;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_global")
    public Integer getIsGlobal() {
        return isGlobal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_global")
    public void setIsGlobal(Integer isGlobal) {
        this.isGlobal = isGlobal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_if_not_exists")
    public Integer getIsIfNotExists() {
        return isIfNotExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_if_not_exists")
    public void setIsIfNotExists(Integer isIfNotExists) {
        this.isIfNotExists = isIfNotExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_local")
    public Integer getIsLocal() {
        return isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_local")
    public void setIsLocal(Integer isLocal) {
        this.isLocal = isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_storing")
    public Integer getIsStoring() {
        return isStoring;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_storing")
    public void setIsStoring(Integer isStoring) {
        this.isStoring = isStoring;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.row_format_oid")
    public Long getRowFormatOid() {
        return rowFormatOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.row_format_oid")
    public void setRowFormatOid(Long rowFormatOid) {
        this.rowFormatOid = rowFormatOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.schema")
    public String getSchema() {
        return schema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.schema")
    public void setSchema(String schema) {
        this.schema = schema == null ? null : schema.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.stored_as_oid")
    public Long getStoredAsOid() {
        return storedAsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.stored_as_oid")
    public void setStoredAsOid(Long storedAsOid) {
        this.storedAsOid = storedAsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.table_oid")
    public Long getTableOid() {
        return tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.table_oid")
    public void setTableOid(Long tableOid) {
        this.tableOid = tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.table_name")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.table_name")
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.table_partition_by_oid")
    public Long getTablePartitionByOid() {
        return tablePartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.table_partition_by_oid")
    public void setTablePartitionByOid(Long tablePartitionByOid) {
        this.tablePartitionByOid = tablePartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.table_partitions_oid")
    public Long getTablePartitionsOid() {
        return tablePartitionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.table_partitions_oid")
    public void setTablePartitionsOid(Long tablePartitionsOid) {
        this.tablePartitionsOid = tablePartitionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.tablespace_oid")
    public Long getTablespaceOid() {
        return tablespaceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.tablespace_oid")
    public void setTablespaceOid(Long tablespaceOid) {
        this.tablespaceOid = tablespaceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.type")
    public String getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.type")
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.using")
    public String getUsing() {
        return using;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.using")
    public void setUsing(String using) {
        this.using = using == null ? null : using.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
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
        SqlCreateIndexStatement other = (SqlCreateIndexStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCommentOid() == null ? other.getCommentOid() == null : this.getCommentOid().equals(other.getCommentOid()))
            && (this.getDbPartitionByOid() == null ? other.getDbPartitionByOid() == null : this.getDbPartitionByOid().equals(other.getDbPartitionByOid()))
            && (this.getInOid() == null ? other.getInOid() == null : this.getInOid().equals(other.getInOid()))
            && (this.getIndexDefinitionOid() == null ? other.getIndexDefinitionOid() == null : this.getIndexDefinitionOid().equals(other.getIndexDefinitionOid()))
            && (this.getIsConcurrently() == null ? other.getIsConcurrently() == null : this.getIsConcurrently().equals(other.getIsConcurrently()))
            && (this.getIsDeferedRebuild() == null ? other.getIsDeferedRebuild() == null : this.getIsDeferedRebuild().equals(other.getIsDeferedRebuild()))
            && (this.getIsGlobal() == null ? other.getIsGlobal() == null : this.getIsGlobal().equals(other.getIsGlobal()))
            && (this.getIsIfNotExists() == null ? other.getIsIfNotExists() == null : this.getIsIfNotExists().equals(other.getIsIfNotExists()))
            && (this.getIsLocal() == null ? other.getIsLocal() == null : this.getIsLocal().equals(other.getIsLocal()))
            && (this.getIsStoring() == null ? other.getIsStoring() == null : this.getIsStoring().equals(other.getIsStoring()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getRowFormatOid() == null ? other.getRowFormatOid() == null : this.getRowFormatOid().equals(other.getRowFormatOid()))
            && (this.getSchema() == null ? other.getSchema() == null : this.getSchema().equals(other.getSchema()))
            && (this.getStoredAsOid() == null ? other.getStoredAsOid() == null : this.getStoredAsOid().equals(other.getStoredAsOid()))
            && (this.getTableOid() == null ? other.getTableOid() == null : this.getTableOid().equals(other.getTableOid()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getTablePartitionByOid() == null ? other.getTablePartitionByOid() == null : this.getTablePartitionByOid().equals(other.getTablePartitionByOid()))
            && (this.getTablePartitionsOid() == null ? other.getTablePartitionsOid() == null : this.getTablePartitionsOid().equals(other.getTablePartitionsOid()))
            && (this.getTablespaceOid() == null ? other.getTablespaceOid() == null : this.getTablespaceOid().equals(other.getTablespaceOid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getUsing() == null ? other.getUsing() == null : this.getUsing().equals(other.getUsing()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCommentOid() == null) ? 0 : getCommentOid().hashCode());
        result = prime * result + ((getDbPartitionByOid() == null) ? 0 : getDbPartitionByOid().hashCode());
        result = prime * result + ((getInOid() == null) ? 0 : getInOid().hashCode());
        result = prime * result + ((getIndexDefinitionOid() == null) ? 0 : getIndexDefinitionOid().hashCode());
        result = prime * result + ((getIsConcurrently() == null) ? 0 : getIsConcurrently().hashCode());
        result = prime * result + ((getIsDeferedRebuild() == null) ? 0 : getIsDeferedRebuild().hashCode());
        result = prime * result + ((getIsGlobal() == null) ? 0 : getIsGlobal().hashCode());
        result = prime * result + ((getIsIfNotExists() == null) ? 0 : getIsIfNotExists().hashCode());
        result = prime * result + ((getIsLocal() == null) ? 0 : getIsLocal().hashCode());
        result = prime * result + ((getIsStoring() == null) ? 0 : getIsStoring().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getRowFormatOid() == null) ? 0 : getRowFormatOid().hashCode());
        result = prime * result + ((getSchema() == null) ? 0 : getSchema().hashCode());
        result = prime * result + ((getStoredAsOid() == null) ? 0 : getStoredAsOid().hashCode());
        result = prime * result + ((getTableOid() == null) ? 0 : getTableOid().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getTablePartitionByOid() == null) ? 0 : getTablePartitionByOid().hashCode());
        result = prime * result + ((getTablePartitionsOid() == null) ? 0 : getTablePartitionsOid().hashCode());
        result = prime * result + ((getTablespaceOid() == null) ? 0 : getTablespaceOid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getUsing() == null) ? 0 : getUsing().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", commentOid=").append(commentOid);
        sb.append(", dbPartitionByOid=").append(dbPartitionByOid);
        sb.append(", inOid=").append(inOid);
        sb.append(", indexDefinitionOid=").append(indexDefinitionOid);
        sb.append(", isConcurrently=").append(isConcurrently);
        sb.append(", isDeferedRebuild=").append(isDeferedRebuild);
        sb.append(", isGlobal=").append(isGlobal);
        sb.append(", isIfNotExists=").append(isIfNotExists);
        sb.append(", isLocal=").append(isLocal);
        sb.append(", isStoring=").append(isStoring);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", rowFormatOid=").append(rowFormatOid);
        sb.append(", schema=").append(schema);
        sb.append(", storedAsOid=").append(storedAsOid);
        sb.append(", tableOid=").append(tableOid);
        sb.append(", tableName=").append(tableName);
        sb.append(", tablePartitionByOid=").append(tablePartitionByOid);
        sb.append(", tablePartitionsOid=").append(tablePartitionsOid);
        sb.append(", tablespaceOid=").append(tablespaceOid);
        sb.append(", type=").append(type);
        sb.append(", using=").append(using);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}