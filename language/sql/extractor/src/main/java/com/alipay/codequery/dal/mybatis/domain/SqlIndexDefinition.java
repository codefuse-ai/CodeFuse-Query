package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlIndexDefinition implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.algorithm")
    private String algorithm;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.analyzer_name_oid")
    private Long analyzerNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.db_partition_by_oid")
    private Long dbPartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.distance_measure")
    private String distanceMeasure;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.index_analyzer_name_oid")
    private Long indexAnalyzerNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_global")
    private Integer isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_hash_map_type")
    private Integer isHashMapType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_hash_type")
    private Integer isHashType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_index")
    private Integer isIndex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_key")
    private Integer isKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_local")
    private Integer isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.options_oid")
    private Long optionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.query_analyzer_name_oid")
    private Long queryAnalyzerNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.symbol_oid")
    private Long symbolOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.table_oid")
    private Long tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.tb_partition_by_oid")
    private Long tbPartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.tb_partitions_oid")
    private Long tbPartitionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.type")
    private String type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.with_dic_name_oid")
    private Long withDicNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    public SqlIndexDefinition(Long oid, String algorithm, Long analyzerNameOid, Long dbPartitionByOid, String distanceMeasure, Long indexAnalyzerNameOid, Integer isGlobal, Integer isHashMapType, Integer isHashType, Integer isIndex, Integer isKey, Integer isLocal, Long nameOid, Long optionsOid, Long queryAnalyzerNameOid, Long symbolOid, Long tableOid, Long tbPartitionByOid, Long tbPartitionsOid, String type, Long withDicNameOid) {
        this.oid = oid;
        this.algorithm = algorithm;
        this.analyzerNameOid = analyzerNameOid;
        this.dbPartitionByOid = dbPartitionByOid;
        this.distanceMeasure = distanceMeasure;
        this.indexAnalyzerNameOid = indexAnalyzerNameOid;
        this.isGlobal = isGlobal;
        this.isHashMapType = isHashMapType;
        this.isHashType = isHashType;
        this.isIndex = isIndex;
        this.isKey = isKey;
        this.isLocal = isLocal;
        this.nameOid = nameOid;
        this.optionsOid = optionsOid;
        this.queryAnalyzerNameOid = queryAnalyzerNameOid;
        this.symbolOid = symbolOid;
        this.tableOid = tableOid;
        this.tbPartitionByOid = tbPartitionByOid;
        this.tbPartitionsOid = tbPartitionsOid;
        this.type = type;
        this.withDicNameOid = withDicNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    public SqlIndexDefinition() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.algorithm")
    public String getAlgorithm() {
        return algorithm;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.algorithm")
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm == null ? null : algorithm.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.analyzer_name_oid")
    public Long getAnalyzerNameOid() {
        return analyzerNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.analyzer_name_oid")
    public void setAnalyzerNameOid(Long analyzerNameOid) {
        this.analyzerNameOid = analyzerNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.db_partition_by_oid")
    public Long getDbPartitionByOid() {
        return dbPartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.db_partition_by_oid")
    public void setDbPartitionByOid(Long dbPartitionByOid) {
        this.dbPartitionByOid = dbPartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.distance_measure")
    public String getDistanceMeasure() {
        return distanceMeasure;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.distance_measure")
    public void setDistanceMeasure(String distanceMeasure) {
        this.distanceMeasure = distanceMeasure == null ? null : distanceMeasure.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.index_analyzer_name_oid")
    public Long getIndexAnalyzerNameOid() {
        return indexAnalyzerNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.index_analyzer_name_oid")
    public void setIndexAnalyzerNameOid(Long indexAnalyzerNameOid) {
        this.indexAnalyzerNameOid = indexAnalyzerNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_global")
    public Integer getIsGlobal() {
        return isGlobal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_global")
    public void setIsGlobal(Integer isGlobal) {
        this.isGlobal = isGlobal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_hash_map_type")
    public Integer getIsHashMapType() {
        return isHashMapType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_hash_map_type")
    public void setIsHashMapType(Integer isHashMapType) {
        this.isHashMapType = isHashMapType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_hash_type")
    public Integer getIsHashType() {
        return isHashType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_hash_type")
    public void setIsHashType(Integer isHashType) {
        this.isHashType = isHashType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_index")
    public Integer getIsIndex() {
        return isIndex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_index")
    public void setIsIndex(Integer isIndex) {
        this.isIndex = isIndex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_key")
    public Integer getIsKey() {
        return isKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_key")
    public void setIsKey(Integer isKey) {
        this.isKey = isKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_local")
    public Integer getIsLocal() {
        return isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_local")
    public void setIsLocal(Integer isLocal) {
        this.isLocal = isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.options_oid")
    public Long getOptionsOid() {
        return optionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.options_oid")
    public void setOptionsOid(Long optionsOid) {
        this.optionsOid = optionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.query_analyzer_name_oid")
    public Long getQueryAnalyzerNameOid() {
        return queryAnalyzerNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.query_analyzer_name_oid")
    public void setQueryAnalyzerNameOid(Long queryAnalyzerNameOid) {
        this.queryAnalyzerNameOid = queryAnalyzerNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.symbol_oid")
    public Long getSymbolOid() {
        return symbolOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.symbol_oid")
    public void setSymbolOid(Long symbolOid) {
        this.symbolOid = symbolOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.table_oid")
    public Long getTableOid() {
        return tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.table_oid")
    public void setTableOid(Long tableOid) {
        this.tableOid = tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.tb_partition_by_oid")
    public Long getTbPartitionByOid() {
        return tbPartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.tb_partition_by_oid")
    public void setTbPartitionByOid(Long tbPartitionByOid) {
        this.tbPartitionByOid = tbPartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.tb_partitions_oid")
    public Long getTbPartitionsOid() {
        return tbPartitionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.tb_partitions_oid")
    public void setTbPartitionsOid(Long tbPartitionsOid) {
        this.tbPartitionsOid = tbPartitionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.type")
    public String getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.type")
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.with_dic_name_oid")
    public Long getWithDicNameOid() {
        return withDicNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.with_dic_name_oid")
    public void setWithDicNameOid(Long withDicNameOid) {
        this.withDicNameOid = withDicNameOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
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
        SqlIndexDefinition other = (SqlIndexDefinition) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAlgorithm() == null ? other.getAlgorithm() == null : this.getAlgorithm().equals(other.getAlgorithm()))
            && (this.getAnalyzerNameOid() == null ? other.getAnalyzerNameOid() == null : this.getAnalyzerNameOid().equals(other.getAnalyzerNameOid()))
            && (this.getDbPartitionByOid() == null ? other.getDbPartitionByOid() == null : this.getDbPartitionByOid().equals(other.getDbPartitionByOid()))
            && (this.getDistanceMeasure() == null ? other.getDistanceMeasure() == null : this.getDistanceMeasure().equals(other.getDistanceMeasure()))
            && (this.getIndexAnalyzerNameOid() == null ? other.getIndexAnalyzerNameOid() == null : this.getIndexAnalyzerNameOid().equals(other.getIndexAnalyzerNameOid()))
            && (this.getIsGlobal() == null ? other.getIsGlobal() == null : this.getIsGlobal().equals(other.getIsGlobal()))
            && (this.getIsHashMapType() == null ? other.getIsHashMapType() == null : this.getIsHashMapType().equals(other.getIsHashMapType()))
            && (this.getIsHashType() == null ? other.getIsHashType() == null : this.getIsHashType().equals(other.getIsHashType()))
            && (this.getIsIndex() == null ? other.getIsIndex() == null : this.getIsIndex().equals(other.getIsIndex()))
            && (this.getIsKey() == null ? other.getIsKey() == null : this.getIsKey().equals(other.getIsKey()))
            && (this.getIsLocal() == null ? other.getIsLocal() == null : this.getIsLocal().equals(other.getIsLocal()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getOptionsOid() == null ? other.getOptionsOid() == null : this.getOptionsOid().equals(other.getOptionsOid()))
            && (this.getQueryAnalyzerNameOid() == null ? other.getQueryAnalyzerNameOid() == null : this.getQueryAnalyzerNameOid().equals(other.getQueryAnalyzerNameOid()))
            && (this.getSymbolOid() == null ? other.getSymbolOid() == null : this.getSymbolOid().equals(other.getSymbolOid()))
            && (this.getTableOid() == null ? other.getTableOid() == null : this.getTableOid().equals(other.getTableOid()))
            && (this.getTbPartitionByOid() == null ? other.getTbPartitionByOid() == null : this.getTbPartitionByOid().equals(other.getTbPartitionByOid()))
            && (this.getTbPartitionsOid() == null ? other.getTbPartitionsOid() == null : this.getTbPartitionsOid().equals(other.getTbPartitionsOid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getWithDicNameOid() == null ? other.getWithDicNameOid() == null : this.getWithDicNameOid().equals(other.getWithDicNameOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        result = prime * result + ((getAnalyzerNameOid() == null) ? 0 : getAnalyzerNameOid().hashCode());
        result = prime * result + ((getDbPartitionByOid() == null) ? 0 : getDbPartitionByOid().hashCode());
        result = prime * result + ((getDistanceMeasure() == null) ? 0 : getDistanceMeasure().hashCode());
        result = prime * result + ((getIndexAnalyzerNameOid() == null) ? 0 : getIndexAnalyzerNameOid().hashCode());
        result = prime * result + ((getIsGlobal() == null) ? 0 : getIsGlobal().hashCode());
        result = prime * result + ((getIsHashMapType() == null) ? 0 : getIsHashMapType().hashCode());
        result = prime * result + ((getIsHashType() == null) ? 0 : getIsHashType().hashCode());
        result = prime * result + ((getIsIndex() == null) ? 0 : getIsIndex().hashCode());
        result = prime * result + ((getIsKey() == null) ? 0 : getIsKey().hashCode());
        result = prime * result + ((getIsLocal() == null) ? 0 : getIsLocal().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getOptionsOid() == null) ? 0 : getOptionsOid().hashCode());
        result = prime * result + ((getQueryAnalyzerNameOid() == null) ? 0 : getQueryAnalyzerNameOid().hashCode());
        result = prime * result + ((getSymbolOid() == null) ? 0 : getSymbolOid().hashCode());
        result = prime * result + ((getTableOid() == null) ? 0 : getTableOid().hashCode());
        result = prime * result + ((getTbPartitionByOid() == null) ? 0 : getTbPartitionByOid().hashCode());
        result = prime * result + ((getTbPartitionsOid() == null) ? 0 : getTbPartitionsOid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getWithDicNameOid() == null) ? 0 : getWithDicNameOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", algorithm=").append(algorithm);
        sb.append(", analyzerNameOid=").append(analyzerNameOid);
        sb.append(", dbPartitionByOid=").append(dbPartitionByOid);
        sb.append(", distanceMeasure=").append(distanceMeasure);
        sb.append(", indexAnalyzerNameOid=").append(indexAnalyzerNameOid);
        sb.append(", isGlobal=").append(isGlobal);
        sb.append(", isHashMapType=").append(isHashMapType);
        sb.append(", isHashType=").append(isHashType);
        sb.append(", isIndex=").append(isIndex);
        sb.append(", isKey=").append(isKey);
        sb.append(", isLocal=").append(isLocal);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", optionsOid=").append(optionsOid);
        sb.append(", queryAnalyzerNameOid=").append(queryAnalyzerNameOid);
        sb.append(", symbolOid=").append(symbolOid);
        sb.append(", tableOid=").append(tableOid);
        sb.append(", tbPartitionByOid=").append(tbPartitionByOid);
        sb.append(", tbPartitionsOid=").append(tbPartitionsOid);
        sb.append(", type=").append(type);
        sb.append(", withDicNameOid=").append(withDicNameOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}