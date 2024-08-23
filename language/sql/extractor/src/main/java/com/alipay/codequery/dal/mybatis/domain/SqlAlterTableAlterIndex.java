package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlAlterTableAlterIndex implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.algorithm")
    private String algorithm;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.comment_oid")
    private Long commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.db_partition_by_oid")
    private Long dbPartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.distance_measure")
    private String distanceMeasure;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.index_definition_oid")
    private Long indexDefinitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.is_global")
    private Integer isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.is_hash_map_type")
    private Integer isHashMapType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.is_key")
    private Integer isKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.is_unique")
    private Integer isUnique;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.key_block_size_oid")
    private Long keyBlockSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.parser_name")
    private String parserName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.table_partition_by_oid")
    private Long tablePartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.table_partitions_oid")
    private Long tablePartitionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.type")
    private String type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.using")
    private String using;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    public SqlAlterTableAlterIndex(Long oid, String algorithm, Long commentOid, Long dbPartitionByOid, String distanceMeasure, Long indexDefinitionOid, Integer isGlobal, Integer isHashMapType, Integer isKey, Integer isUnique, Long keyBlockSizeOid, Long nameOid, String parserName, Long tablePartitionByOid, Long tablePartitionsOid, String type, String using) {
        this.oid = oid;
        this.algorithm = algorithm;
        this.commentOid = commentOid;
        this.dbPartitionByOid = dbPartitionByOid;
        this.distanceMeasure = distanceMeasure;
        this.indexDefinitionOid = indexDefinitionOid;
        this.isGlobal = isGlobal;
        this.isHashMapType = isHashMapType;
        this.isKey = isKey;
        this.isUnique = isUnique;
        this.keyBlockSizeOid = keyBlockSizeOid;
        this.nameOid = nameOid;
        this.parserName = parserName;
        this.tablePartitionByOid = tablePartitionByOid;
        this.tablePartitionsOid = tablePartitionsOid;
        this.type = type;
        this.using = using;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    public SqlAlterTableAlterIndex() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.algorithm")
    public String getAlgorithm() {
        return algorithm;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.algorithm")
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm == null ? null : algorithm.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.comment_oid")
    public Long getCommentOid() {
        return commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.comment_oid")
    public void setCommentOid(Long commentOid) {
        this.commentOid = commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.db_partition_by_oid")
    public Long getDbPartitionByOid() {
        return dbPartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.db_partition_by_oid")
    public void setDbPartitionByOid(Long dbPartitionByOid) {
        this.dbPartitionByOid = dbPartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.distance_measure")
    public String getDistanceMeasure() {
        return distanceMeasure;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.distance_measure")
    public void setDistanceMeasure(String distanceMeasure) {
        this.distanceMeasure = distanceMeasure == null ? null : distanceMeasure.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.index_definition_oid")
    public Long getIndexDefinitionOid() {
        return indexDefinitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.index_definition_oid")
    public void setIndexDefinitionOid(Long indexDefinitionOid) {
        this.indexDefinitionOid = indexDefinitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.is_global")
    public Integer getIsGlobal() {
        return isGlobal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.is_global")
    public void setIsGlobal(Integer isGlobal) {
        this.isGlobal = isGlobal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.is_hash_map_type")
    public Integer getIsHashMapType() {
        return isHashMapType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.is_hash_map_type")
    public void setIsHashMapType(Integer isHashMapType) {
        this.isHashMapType = isHashMapType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.is_key")
    public Integer getIsKey() {
        return isKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.is_key")
    public void setIsKey(Integer isKey) {
        this.isKey = isKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.is_unique")
    public Integer getIsUnique() {
        return isUnique;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.is_unique")
    public void setIsUnique(Integer isUnique) {
        this.isUnique = isUnique;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.key_block_size_oid")
    public Long getKeyBlockSizeOid() {
        return keyBlockSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.key_block_size_oid")
    public void setKeyBlockSizeOid(Long keyBlockSizeOid) {
        this.keyBlockSizeOid = keyBlockSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.parser_name")
    public String getParserName() {
        return parserName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.parser_name")
    public void setParserName(String parserName) {
        this.parserName = parserName == null ? null : parserName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.table_partition_by_oid")
    public Long getTablePartitionByOid() {
        return tablePartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.table_partition_by_oid")
    public void setTablePartitionByOid(Long tablePartitionByOid) {
        this.tablePartitionByOid = tablePartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.table_partitions_oid")
    public Long getTablePartitionsOid() {
        return tablePartitionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.table_partitions_oid")
    public void setTablePartitionsOid(Long tablePartitionsOid) {
        this.tablePartitionsOid = tablePartitionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.type")
    public String getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.type")
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.using")
    public String getUsing() {
        return using;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.using")
    public void setUsing(String using) {
        this.using = using == null ? null : using.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
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
        SqlAlterTableAlterIndex other = (SqlAlterTableAlterIndex) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAlgorithm() == null ? other.getAlgorithm() == null : this.getAlgorithm().equals(other.getAlgorithm()))
            && (this.getCommentOid() == null ? other.getCommentOid() == null : this.getCommentOid().equals(other.getCommentOid()))
            && (this.getDbPartitionByOid() == null ? other.getDbPartitionByOid() == null : this.getDbPartitionByOid().equals(other.getDbPartitionByOid()))
            && (this.getDistanceMeasure() == null ? other.getDistanceMeasure() == null : this.getDistanceMeasure().equals(other.getDistanceMeasure()))
            && (this.getIndexDefinitionOid() == null ? other.getIndexDefinitionOid() == null : this.getIndexDefinitionOid().equals(other.getIndexDefinitionOid()))
            && (this.getIsGlobal() == null ? other.getIsGlobal() == null : this.getIsGlobal().equals(other.getIsGlobal()))
            && (this.getIsHashMapType() == null ? other.getIsHashMapType() == null : this.getIsHashMapType().equals(other.getIsHashMapType()))
            && (this.getIsKey() == null ? other.getIsKey() == null : this.getIsKey().equals(other.getIsKey()))
            && (this.getIsUnique() == null ? other.getIsUnique() == null : this.getIsUnique().equals(other.getIsUnique()))
            && (this.getKeyBlockSizeOid() == null ? other.getKeyBlockSizeOid() == null : this.getKeyBlockSizeOid().equals(other.getKeyBlockSizeOid()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getParserName() == null ? other.getParserName() == null : this.getParserName().equals(other.getParserName()))
            && (this.getTablePartitionByOid() == null ? other.getTablePartitionByOid() == null : this.getTablePartitionByOid().equals(other.getTablePartitionByOid()))
            && (this.getTablePartitionsOid() == null ? other.getTablePartitionsOid() == null : this.getTablePartitionsOid().equals(other.getTablePartitionsOid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getUsing() == null ? other.getUsing() == null : this.getUsing().equals(other.getUsing()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        result = prime * result + ((getCommentOid() == null) ? 0 : getCommentOid().hashCode());
        result = prime * result + ((getDbPartitionByOid() == null) ? 0 : getDbPartitionByOid().hashCode());
        result = prime * result + ((getDistanceMeasure() == null) ? 0 : getDistanceMeasure().hashCode());
        result = prime * result + ((getIndexDefinitionOid() == null) ? 0 : getIndexDefinitionOid().hashCode());
        result = prime * result + ((getIsGlobal() == null) ? 0 : getIsGlobal().hashCode());
        result = prime * result + ((getIsHashMapType() == null) ? 0 : getIsHashMapType().hashCode());
        result = prime * result + ((getIsKey() == null) ? 0 : getIsKey().hashCode());
        result = prime * result + ((getIsUnique() == null) ? 0 : getIsUnique().hashCode());
        result = prime * result + ((getKeyBlockSizeOid() == null) ? 0 : getKeyBlockSizeOid().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getParserName() == null) ? 0 : getParserName().hashCode());
        result = prime * result + ((getTablePartitionByOid() == null) ? 0 : getTablePartitionByOid().hashCode());
        result = prime * result + ((getTablePartitionsOid() == null) ? 0 : getTablePartitionsOid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getUsing() == null) ? 0 : getUsing().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", algorithm=").append(algorithm);
        sb.append(", commentOid=").append(commentOid);
        sb.append(", dbPartitionByOid=").append(dbPartitionByOid);
        sb.append(", distanceMeasure=").append(distanceMeasure);
        sb.append(", indexDefinitionOid=").append(indexDefinitionOid);
        sb.append(", isGlobal=").append(isGlobal);
        sb.append(", isHashMapType=").append(isHashMapType);
        sb.append(", isKey=").append(isKey);
        sb.append(", isUnique=").append(isUnique);
        sb.append(", keyBlockSizeOid=").append(keyBlockSizeOid);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", parserName=").append(parserName);
        sb.append(", tablePartitionByOid=").append(tablePartitionByOid);
        sb.append(", tablePartitionsOid=").append(tablePartitionsOid);
        sb.append(", type=").append(type);
        sb.append(", using=").append(using);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}