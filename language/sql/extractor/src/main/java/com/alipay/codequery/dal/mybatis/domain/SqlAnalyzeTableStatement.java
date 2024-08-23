package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlAnalyzeTableStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.adb_schema_oid")
    private Long adbSchemaOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.adb_where_oid")
    private Long adbWhereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.is_cache_metadata")
    private Integer isCacheMetadata;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.is_compute_statistics")
    private Integer isComputeStatistics;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.is_for_colums")
    private Integer isForColums;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.is_noscan")
    private Integer isNoscan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.partition_oid")
    private Long partitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.table_oid")
    private Long tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    public SqlAnalyzeTableStatement(Long oid, Long adbSchemaOid, Long adbWhereOid, Integer isCacheMetadata, Integer isComputeStatistics, Integer isForColums, Integer isNoscan, Long partitionOid, Long tableOid) {
        this.oid = oid;
        this.adbSchemaOid = adbSchemaOid;
        this.adbWhereOid = adbWhereOid;
        this.isCacheMetadata = isCacheMetadata;
        this.isComputeStatistics = isComputeStatistics;
        this.isForColums = isForColums;
        this.isNoscan = isNoscan;
        this.partitionOid = partitionOid;
        this.tableOid = tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    public SqlAnalyzeTableStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.adb_schema_oid")
    public Long getAdbSchemaOid() {
        return adbSchemaOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.adb_schema_oid")
    public void setAdbSchemaOid(Long adbSchemaOid) {
        this.adbSchemaOid = adbSchemaOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.adb_where_oid")
    public Long getAdbWhereOid() {
        return adbWhereOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.adb_where_oid")
    public void setAdbWhereOid(Long adbWhereOid) {
        this.adbWhereOid = adbWhereOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.is_cache_metadata")
    public Integer getIsCacheMetadata() {
        return isCacheMetadata;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.is_cache_metadata")
    public void setIsCacheMetadata(Integer isCacheMetadata) {
        this.isCacheMetadata = isCacheMetadata;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.is_compute_statistics")
    public Integer getIsComputeStatistics() {
        return isComputeStatistics;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.is_compute_statistics")
    public void setIsComputeStatistics(Integer isComputeStatistics) {
        this.isComputeStatistics = isComputeStatistics;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.is_for_colums")
    public Integer getIsForColums() {
        return isForColums;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.is_for_colums")
    public void setIsForColums(Integer isForColums) {
        this.isForColums = isForColums;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.is_noscan")
    public Integer getIsNoscan() {
        return isNoscan;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.is_noscan")
    public void setIsNoscan(Integer isNoscan) {
        this.isNoscan = isNoscan;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.partition_oid")
    public Long getPartitionOid() {
        return partitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.partition_oid")
    public void setPartitionOid(Long partitionOid) {
        this.partitionOid = partitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.table_oid")
    public Long getTableOid() {
        return tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.table_oid")
    public void setTableOid(Long tableOid) {
        this.tableOid = tableOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
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
        SqlAnalyzeTableStatement other = (SqlAnalyzeTableStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAdbSchemaOid() == null ? other.getAdbSchemaOid() == null : this.getAdbSchemaOid().equals(other.getAdbSchemaOid()))
            && (this.getAdbWhereOid() == null ? other.getAdbWhereOid() == null : this.getAdbWhereOid().equals(other.getAdbWhereOid()))
            && (this.getIsCacheMetadata() == null ? other.getIsCacheMetadata() == null : this.getIsCacheMetadata().equals(other.getIsCacheMetadata()))
            && (this.getIsComputeStatistics() == null ? other.getIsComputeStatistics() == null : this.getIsComputeStatistics().equals(other.getIsComputeStatistics()))
            && (this.getIsForColums() == null ? other.getIsForColums() == null : this.getIsForColums().equals(other.getIsForColums()))
            && (this.getIsNoscan() == null ? other.getIsNoscan() == null : this.getIsNoscan().equals(other.getIsNoscan()))
            && (this.getPartitionOid() == null ? other.getPartitionOid() == null : this.getPartitionOid().equals(other.getPartitionOid()))
            && (this.getTableOid() == null ? other.getTableOid() == null : this.getTableOid().equals(other.getTableOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAdbSchemaOid() == null) ? 0 : getAdbSchemaOid().hashCode());
        result = prime * result + ((getAdbWhereOid() == null) ? 0 : getAdbWhereOid().hashCode());
        result = prime * result + ((getIsCacheMetadata() == null) ? 0 : getIsCacheMetadata().hashCode());
        result = prime * result + ((getIsComputeStatistics() == null) ? 0 : getIsComputeStatistics().hashCode());
        result = prime * result + ((getIsForColums() == null) ? 0 : getIsForColums().hashCode());
        result = prime * result + ((getIsNoscan() == null) ? 0 : getIsNoscan().hashCode());
        result = prime * result + ((getPartitionOid() == null) ? 0 : getPartitionOid().hashCode());
        result = prime * result + ((getTableOid() == null) ? 0 : getTableOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", adbSchemaOid=").append(adbSchemaOid);
        sb.append(", adbWhereOid=").append(adbWhereOid);
        sb.append(", isCacheMetadata=").append(isCacheMetadata);
        sb.append(", isComputeStatistics=").append(isComputeStatistics);
        sb.append(", isForColums=").append(isForColums);
        sb.append(", isNoscan=").append(isNoscan);
        sb.append(", partitionOid=").append(partitionOid);
        sb.append(", tableOid=").append(tableOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}