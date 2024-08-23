package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlTableIndex implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.algorithm")
    private String algorithm;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.analyzer_name_oid")
    private Long analyzerNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.comment_oid")
    private Long commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.db_partition_by_oid")
    private Long dbPartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.distance_measure")
    private String distanceMeasure;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.index_analyzer_name_oid")
    private Long indexAnalyzerNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.index_definition_oid")
    private Long indexDefinitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.index_type")
    private String indexType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.is_global")
    private Integer isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.is_local")
    private Integer isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.query_analyzer_name_oid")
    private Long queryAnalyzerNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.table_partition_by_oid")
    private Long tablePartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.table_partitions_oid")
    private Long tablePartitionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.with_dic_name_oid")
    private Long withDicNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    public MySqlTableIndex(Long oid, String algorithm, Long analyzerNameOid, Long commentOid, Long dbPartitionByOid, String distanceMeasure, Long indexAnalyzerNameOid, Long indexDefinitionOid, String indexType, Integer isGlobal, Integer isLocal, Long nameOid, Long queryAnalyzerNameOid, Long tablePartitionByOid, Long tablePartitionsOid, Long withDicNameOid) {
        this.oid = oid;
        this.algorithm = algorithm;
        this.analyzerNameOid = analyzerNameOid;
        this.commentOid = commentOid;
        this.dbPartitionByOid = dbPartitionByOid;
        this.distanceMeasure = distanceMeasure;
        this.indexAnalyzerNameOid = indexAnalyzerNameOid;
        this.indexDefinitionOid = indexDefinitionOid;
        this.indexType = indexType;
        this.isGlobal = isGlobal;
        this.isLocal = isLocal;
        this.nameOid = nameOid;
        this.queryAnalyzerNameOid = queryAnalyzerNameOid;
        this.tablePartitionByOid = tablePartitionByOid;
        this.tablePartitionsOid = tablePartitionsOid;
        this.withDicNameOid = withDicNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    public MySqlTableIndex() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.algorithm")
    public String getAlgorithm() {
        return algorithm;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.algorithm")
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm == null ? null : algorithm.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.analyzer_name_oid")
    public Long getAnalyzerNameOid() {
        return analyzerNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.analyzer_name_oid")
    public void setAnalyzerNameOid(Long analyzerNameOid) {
        this.analyzerNameOid = analyzerNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.comment_oid")
    public Long getCommentOid() {
        return commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.comment_oid")
    public void setCommentOid(Long commentOid) {
        this.commentOid = commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.db_partition_by_oid")
    public Long getDbPartitionByOid() {
        return dbPartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.db_partition_by_oid")
    public void setDbPartitionByOid(Long dbPartitionByOid) {
        this.dbPartitionByOid = dbPartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.distance_measure")
    public String getDistanceMeasure() {
        return distanceMeasure;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.distance_measure")
    public void setDistanceMeasure(String distanceMeasure) {
        this.distanceMeasure = distanceMeasure == null ? null : distanceMeasure.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.index_analyzer_name_oid")
    public Long getIndexAnalyzerNameOid() {
        return indexAnalyzerNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.index_analyzer_name_oid")
    public void setIndexAnalyzerNameOid(Long indexAnalyzerNameOid) {
        this.indexAnalyzerNameOid = indexAnalyzerNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.index_definition_oid")
    public Long getIndexDefinitionOid() {
        return indexDefinitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.index_definition_oid")
    public void setIndexDefinitionOid(Long indexDefinitionOid) {
        this.indexDefinitionOid = indexDefinitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.index_type")
    public String getIndexType() {
        return indexType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.index_type")
    public void setIndexType(String indexType) {
        this.indexType = indexType == null ? null : indexType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.is_global")
    public Integer getIsGlobal() {
        return isGlobal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.is_global")
    public void setIsGlobal(Integer isGlobal) {
        this.isGlobal = isGlobal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.is_local")
    public Integer getIsLocal() {
        return isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.is_local")
    public void setIsLocal(Integer isLocal) {
        this.isLocal = isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.query_analyzer_name_oid")
    public Long getQueryAnalyzerNameOid() {
        return queryAnalyzerNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.query_analyzer_name_oid")
    public void setQueryAnalyzerNameOid(Long queryAnalyzerNameOid) {
        this.queryAnalyzerNameOid = queryAnalyzerNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.table_partition_by_oid")
    public Long getTablePartitionByOid() {
        return tablePartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.table_partition_by_oid")
    public void setTablePartitionByOid(Long tablePartitionByOid) {
        this.tablePartitionByOid = tablePartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.table_partitions_oid")
    public Long getTablePartitionsOid() {
        return tablePartitionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.table_partitions_oid")
    public void setTablePartitionsOid(Long tablePartitionsOid) {
        this.tablePartitionsOid = tablePartitionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.with_dic_name_oid")
    public Long getWithDicNameOid() {
        return withDicNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.with_dic_name_oid")
    public void setWithDicNameOid(Long withDicNameOid) {
        this.withDicNameOid = withDicNameOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
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
        MySqlTableIndex other = (MySqlTableIndex) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAlgorithm() == null ? other.getAlgorithm() == null : this.getAlgorithm().equals(other.getAlgorithm()))
            && (this.getAnalyzerNameOid() == null ? other.getAnalyzerNameOid() == null : this.getAnalyzerNameOid().equals(other.getAnalyzerNameOid()))
            && (this.getCommentOid() == null ? other.getCommentOid() == null : this.getCommentOid().equals(other.getCommentOid()))
            && (this.getDbPartitionByOid() == null ? other.getDbPartitionByOid() == null : this.getDbPartitionByOid().equals(other.getDbPartitionByOid()))
            && (this.getDistanceMeasure() == null ? other.getDistanceMeasure() == null : this.getDistanceMeasure().equals(other.getDistanceMeasure()))
            && (this.getIndexAnalyzerNameOid() == null ? other.getIndexAnalyzerNameOid() == null : this.getIndexAnalyzerNameOid().equals(other.getIndexAnalyzerNameOid()))
            && (this.getIndexDefinitionOid() == null ? other.getIndexDefinitionOid() == null : this.getIndexDefinitionOid().equals(other.getIndexDefinitionOid()))
            && (this.getIndexType() == null ? other.getIndexType() == null : this.getIndexType().equals(other.getIndexType()))
            && (this.getIsGlobal() == null ? other.getIsGlobal() == null : this.getIsGlobal().equals(other.getIsGlobal()))
            && (this.getIsLocal() == null ? other.getIsLocal() == null : this.getIsLocal().equals(other.getIsLocal()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getQueryAnalyzerNameOid() == null ? other.getQueryAnalyzerNameOid() == null : this.getQueryAnalyzerNameOid().equals(other.getQueryAnalyzerNameOid()))
            && (this.getTablePartitionByOid() == null ? other.getTablePartitionByOid() == null : this.getTablePartitionByOid().equals(other.getTablePartitionByOid()))
            && (this.getTablePartitionsOid() == null ? other.getTablePartitionsOid() == null : this.getTablePartitionsOid().equals(other.getTablePartitionsOid()))
            && (this.getWithDicNameOid() == null ? other.getWithDicNameOid() == null : this.getWithDicNameOid().equals(other.getWithDicNameOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        result = prime * result + ((getAnalyzerNameOid() == null) ? 0 : getAnalyzerNameOid().hashCode());
        result = prime * result + ((getCommentOid() == null) ? 0 : getCommentOid().hashCode());
        result = prime * result + ((getDbPartitionByOid() == null) ? 0 : getDbPartitionByOid().hashCode());
        result = prime * result + ((getDistanceMeasure() == null) ? 0 : getDistanceMeasure().hashCode());
        result = prime * result + ((getIndexAnalyzerNameOid() == null) ? 0 : getIndexAnalyzerNameOid().hashCode());
        result = prime * result + ((getIndexDefinitionOid() == null) ? 0 : getIndexDefinitionOid().hashCode());
        result = prime * result + ((getIndexType() == null) ? 0 : getIndexType().hashCode());
        result = prime * result + ((getIsGlobal() == null) ? 0 : getIsGlobal().hashCode());
        result = prime * result + ((getIsLocal() == null) ? 0 : getIsLocal().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getQueryAnalyzerNameOid() == null) ? 0 : getQueryAnalyzerNameOid().hashCode());
        result = prime * result + ((getTablePartitionByOid() == null) ? 0 : getTablePartitionByOid().hashCode());
        result = prime * result + ((getTablePartitionsOid() == null) ? 0 : getTablePartitionsOid().hashCode());
        result = prime * result + ((getWithDicNameOid() == null) ? 0 : getWithDicNameOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", algorithm=").append(algorithm);
        sb.append(", analyzerNameOid=").append(analyzerNameOid);
        sb.append(", commentOid=").append(commentOid);
        sb.append(", dbPartitionByOid=").append(dbPartitionByOid);
        sb.append(", distanceMeasure=").append(distanceMeasure);
        sb.append(", indexAnalyzerNameOid=").append(indexAnalyzerNameOid);
        sb.append(", indexDefinitionOid=").append(indexDefinitionOid);
        sb.append(", indexType=").append(indexType);
        sb.append(", isGlobal=").append(isGlobal);
        sb.append(", isLocal=").append(isLocal);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", queryAnalyzerNameOid=").append(queryAnalyzerNameOid);
        sb.append(", tablePartitionByOid=").append(tablePartitionByOid);
        sb.append(", tablePartitionsOid=").append(tablePartitionsOid);
        sb.append(", withDicNameOid=").append(withDicNameOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}