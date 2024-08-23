package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleCreateTableStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.cache")
    private Integer cache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.cluster_oid")
    private Long clusterOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.compress_level")
    private Integer compressLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.deferred_segment_creation")
    private String deferredSegmentCreation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.enable_row_movement")
    private Integer enableRowMovement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.initrans")
    private Integer initrans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.is_compress_for_oltp")
    private Integer isCompressForOltp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.is_cursor_specific_segment")
    private Integer isCursorSpecificSegment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.is_in_memory_metadata")
    private Integer isInMemoryMetadata;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.is_monitoring")
    private Integer isMonitoring;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.is_on_commit_delete_rows")
    private Integer isOnCommitDeleteRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.lob_storage_oid")
    private Long lobStorageOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.maxtrans")
    private Integer maxtrans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.of_oid")
    private Long ofOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.oid_index")
    private String oidIndex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.organization")
    private String organization;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.parallel")
    private Integer parallel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.parallel_value_oid")
    private Long parallelValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.pctfree")
    private Integer pctfree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.pctincrease")
    private Integer pctincrease;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.pctused")
    private Integer pctused;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.storage_oid")
    private Long storageOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.xml_type_column_properties_oid")
    private Long xmlTypeColumnPropertiesOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    public OracleCreateTableStatement(Long oid, Integer cache, Long clusterOid, Integer compressLevel, String deferredSegmentCreation, Integer enableRowMovement, Integer initrans, Integer isCompressForOltp, Integer isCursorSpecificSegment, Integer isInMemoryMetadata, Integer isMonitoring, Integer isOnCommitDeleteRows, Long lobStorageOid, Integer maxtrans, Long ofOid, String oidIndex, String organization, Integer parallel, Long parallelValueOid, Integer pctfree, Integer pctincrease, Integer pctused, Long storageOid, Long xmlTypeColumnPropertiesOid) {
        this.oid = oid;
        this.cache = cache;
        this.clusterOid = clusterOid;
        this.compressLevel = compressLevel;
        this.deferredSegmentCreation = deferredSegmentCreation;
        this.enableRowMovement = enableRowMovement;
        this.initrans = initrans;
        this.isCompressForOltp = isCompressForOltp;
        this.isCursorSpecificSegment = isCursorSpecificSegment;
        this.isInMemoryMetadata = isInMemoryMetadata;
        this.isMonitoring = isMonitoring;
        this.isOnCommitDeleteRows = isOnCommitDeleteRows;
        this.lobStorageOid = lobStorageOid;
        this.maxtrans = maxtrans;
        this.ofOid = ofOid;
        this.oidIndex = oidIndex;
        this.organization = organization;
        this.parallel = parallel;
        this.parallelValueOid = parallelValueOid;
        this.pctfree = pctfree;
        this.pctincrease = pctincrease;
        this.pctused = pctused;
        this.storageOid = storageOid;
        this.xmlTypeColumnPropertiesOid = xmlTypeColumnPropertiesOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    public OracleCreateTableStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.cache")
    public Integer getCache() {
        return cache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.cache")
    public void setCache(Integer cache) {
        this.cache = cache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.cluster_oid")
    public Long getClusterOid() {
        return clusterOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.cluster_oid")
    public void setClusterOid(Long clusterOid) {
        this.clusterOid = clusterOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.compress_level")
    public Integer getCompressLevel() {
        return compressLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.compress_level")
    public void setCompressLevel(Integer compressLevel) {
        this.compressLevel = compressLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.deferred_segment_creation")
    public String getDeferredSegmentCreation() {
        return deferredSegmentCreation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.deferred_segment_creation")
    public void setDeferredSegmentCreation(String deferredSegmentCreation) {
        this.deferredSegmentCreation = deferredSegmentCreation == null ? null : deferredSegmentCreation.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.enable_row_movement")
    public Integer getEnableRowMovement() {
        return enableRowMovement;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.enable_row_movement")
    public void setEnableRowMovement(Integer enableRowMovement) {
        this.enableRowMovement = enableRowMovement;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.initrans")
    public Integer getInitrans() {
        return initrans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.initrans")
    public void setInitrans(Integer initrans) {
        this.initrans = initrans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.is_compress_for_oltp")
    public Integer getIsCompressForOltp() {
        return isCompressForOltp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.is_compress_for_oltp")
    public void setIsCompressForOltp(Integer isCompressForOltp) {
        this.isCompressForOltp = isCompressForOltp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.is_cursor_specific_segment")
    public Integer getIsCursorSpecificSegment() {
        return isCursorSpecificSegment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.is_cursor_specific_segment")
    public void setIsCursorSpecificSegment(Integer isCursorSpecificSegment) {
        this.isCursorSpecificSegment = isCursorSpecificSegment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.is_in_memory_metadata")
    public Integer getIsInMemoryMetadata() {
        return isInMemoryMetadata;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.is_in_memory_metadata")
    public void setIsInMemoryMetadata(Integer isInMemoryMetadata) {
        this.isInMemoryMetadata = isInMemoryMetadata;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.is_monitoring")
    public Integer getIsMonitoring() {
        return isMonitoring;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.is_monitoring")
    public void setIsMonitoring(Integer isMonitoring) {
        this.isMonitoring = isMonitoring;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.is_on_commit_delete_rows")
    public Integer getIsOnCommitDeleteRows() {
        return isOnCommitDeleteRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.is_on_commit_delete_rows")
    public void setIsOnCommitDeleteRows(Integer isOnCommitDeleteRows) {
        this.isOnCommitDeleteRows = isOnCommitDeleteRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.lob_storage_oid")
    public Long getLobStorageOid() {
        return lobStorageOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.lob_storage_oid")
    public void setLobStorageOid(Long lobStorageOid) {
        this.lobStorageOid = lobStorageOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.maxtrans")
    public Integer getMaxtrans() {
        return maxtrans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.maxtrans")
    public void setMaxtrans(Integer maxtrans) {
        this.maxtrans = maxtrans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.of_oid")
    public Long getOfOid() {
        return ofOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.of_oid")
    public void setOfOid(Long ofOid) {
        this.ofOid = ofOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.oid_index")
    public String getOidIndex() {
        return oidIndex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.oid_index")
    public void setOidIndex(String oidIndex) {
        this.oidIndex = oidIndex == null ? null : oidIndex.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.organization")
    public String getOrganization() {
        return organization;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.organization")
    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.parallel")
    public Integer getParallel() {
        return parallel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.parallel")
    public void setParallel(Integer parallel) {
        this.parallel = parallel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.parallel_value_oid")
    public Long getParallelValueOid() {
        return parallelValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.parallel_value_oid")
    public void setParallelValueOid(Long parallelValueOid) {
        this.parallelValueOid = parallelValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.pctfree")
    public Integer getPctfree() {
        return pctfree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.pctfree")
    public void setPctfree(Integer pctfree) {
        this.pctfree = pctfree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.pctincrease")
    public Integer getPctincrease() {
        return pctincrease;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.pctincrease")
    public void setPctincrease(Integer pctincrease) {
        this.pctincrease = pctincrease;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.pctused")
    public Integer getPctused() {
        return pctused;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.pctused")
    public void setPctused(Integer pctused) {
        this.pctused = pctused;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.storage_oid")
    public Long getStorageOid() {
        return storageOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.storage_oid")
    public void setStorageOid(Long storageOid) {
        this.storageOid = storageOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.xml_type_column_properties_oid")
    public Long getXmlTypeColumnPropertiesOid() {
        return xmlTypeColumnPropertiesOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.xml_type_column_properties_oid")
    public void setXmlTypeColumnPropertiesOid(Long xmlTypeColumnPropertiesOid) {
        this.xmlTypeColumnPropertiesOid = xmlTypeColumnPropertiesOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
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
        OracleCreateTableStatement other = (OracleCreateTableStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCache() == null ? other.getCache() == null : this.getCache().equals(other.getCache()))
            && (this.getClusterOid() == null ? other.getClusterOid() == null : this.getClusterOid().equals(other.getClusterOid()))
            && (this.getCompressLevel() == null ? other.getCompressLevel() == null : this.getCompressLevel().equals(other.getCompressLevel()))
            && (this.getDeferredSegmentCreation() == null ? other.getDeferredSegmentCreation() == null : this.getDeferredSegmentCreation().equals(other.getDeferredSegmentCreation()))
            && (this.getEnableRowMovement() == null ? other.getEnableRowMovement() == null : this.getEnableRowMovement().equals(other.getEnableRowMovement()))
            && (this.getInitrans() == null ? other.getInitrans() == null : this.getInitrans().equals(other.getInitrans()))
            && (this.getIsCompressForOltp() == null ? other.getIsCompressForOltp() == null : this.getIsCompressForOltp().equals(other.getIsCompressForOltp()))
            && (this.getIsCursorSpecificSegment() == null ? other.getIsCursorSpecificSegment() == null : this.getIsCursorSpecificSegment().equals(other.getIsCursorSpecificSegment()))
            && (this.getIsInMemoryMetadata() == null ? other.getIsInMemoryMetadata() == null : this.getIsInMemoryMetadata().equals(other.getIsInMemoryMetadata()))
            && (this.getIsMonitoring() == null ? other.getIsMonitoring() == null : this.getIsMonitoring().equals(other.getIsMonitoring()))
            && (this.getIsOnCommitDeleteRows() == null ? other.getIsOnCommitDeleteRows() == null : this.getIsOnCommitDeleteRows().equals(other.getIsOnCommitDeleteRows()))
            && (this.getLobStorageOid() == null ? other.getLobStorageOid() == null : this.getLobStorageOid().equals(other.getLobStorageOid()))
            && (this.getMaxtrans() == null ? other.getMaxtrans() == null : this.getMaxtrans().equals(other.getMaxtrans()))
            && (this.getOfOid() == null ? other.getOfOid() == null : this.getOfOid().equals(other.getOfOid()))
            && (this.getOidIndex() == null ? other.getOidIndex() == null : this.getOidIndex().equals(other.getOidIndex()))
            && (this.getOrganization() == null ? other.getOrganization() == null : this.getOrganization().equals(other.getOrganization()))
            && (this.getParallel() == null ? other.getParallel() == null : this.getParallel().equals(other.getParallel()))
            && (this.getParallelValueOid() == null ? other.getParallelValueOid() == null : this.getParallelValueOid().equals(other.getParallelValueOid()))
            && (this.getPctfree() == null ? other.getPctfree() == null : this.getPctfree().equals(other.getPctfree()))
            && (this.getPctincrease() == null ? other.getPctincrease() == null : this.getPctincrease().equals(other.getPctincrease()))
            && (this.getPctused() == null ? other.getPctused() == null : this.getPctused().equals(other.getPctused()))
            && (this.getStorageOid() == null ? other.getStorageOid() == null : this.getStorageOid().equals(other.getStorageOid()))
            && (this.getXmlTypeColumnPropertiesOid() == null ? other.getXmlTypeColumnPropertiesOid() == null : this.getXmlTypeColumnPropertiesOid().equals(other.getXmlTypeColumnPropertiesOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCache() == null) ? 0 : getCache().hashCode());
        result = prime * result + ((getClusterOid() == null) ? 0 : getClusterOid().hashCode());
        result = prime * result + ((getCompressLevel() == null) ? 0 : getCompressLevel().hashCode());
        result = prime * result + ((getDeferredSegmentCreation() == null) ? 0 : getDeferredSegmentCreation().hashCode());
        result = prime * result + ((getEnableRowMovement() == null) ? 0 : getEnableRowMovement().hashCode());
        result = prime * result + ((getInitrans() == null) ? 0 : getInitrans().hashCode());
        result = prime * result + ((getIsCompressForOltp() == null) ? 0 : getIsCompressForOltp().hashCode());
        result = prime * result + ((getIsCursorSpecificSegment() == null) ? 0 : getIsCursorSpecificSegment().hashCode());
        result = prime * result + ((getIsInMemoryMetadata() == null) ? 0 : getIsInMemoryMetadata().hashCode());
        result = prime * result + ((getIsMonitoring() == null) ? 0 : getIsMonitoring().hashCode());
        result = prime * result + ((getIsOnCommitDeleteRows() == null) ? 0 : getIsOnCommitDeleteRows().hashCode());
        result = prime * result + ((getLobStorageOid() == null) ? 0 : getLobStorageOid().hashCode());
        result = prime * result + ((getMaxtrans() == null) ? 0 : getMaxtrans().hashCode());
        result = prime * result + ((getOfOid() == null) ? 0 : getOfOid().hashCode());
        result = prime * result + ((getOidIndex() == null) ? 0 : getOidIndex().hashCode());
        result = prime * result + ((getOrganization() == null) ? 0 : getOrganization().hashCode());
        result = prime * result + ((getParallel() == null) ? 0 : getParallel().hashCode());
        result = prime * result + ((getParallelValueOid() == null) ? 0 : getParallelValueOid().hashCode());
        result = prime * result + ((getPctfree() == null) ? 0 : getPctfree().hashCode());
        result = prime * result + ((getPctincrease() == null) ? 0 : getPctincrease().hashCode());
        result = prime * result + ((getPctused() == null) ? 0 : getPctused().hashCode());
        result = prime * result + ((getStorageOid() == null) ? 0 : getStorageOid().hashCode());
        result = prime * result + ((getXmlTypeColumnPropertiesOid() == null) ? 0 : getXmlTypeColumnPropertiesOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", cache=").append(cache);
        sb.append(", clusterOid=").append(clusterOid);
        sb.append(", compressLevel=").append(compressLevel);
        sb.append(", deferredSegmentCreation=").append(deferredSegmentCreation);
        sb.append(", enableRowMovement=").append(enableRowMovement);
        sb.append(", initrans=").append(initrans);
        sb.append(", isCompressForOltp=").append(isCompressForOltp);
        sb.append(", isCursorSpecificSegment=").append(isCursorSpecificSegment);
        sb.append(", isInMemoryMetadata=").append(isInMemoryMetadata);
        sb.append(", isMonitoring=").append(isMonitoring);
        sb.append(", isOnCommitDeleteRows=").append(isOnCommitDeleteRows);
        sb.append(", lobStorageOid=").append(lobStorageOid);
        sb.append(", maxtrans=").append(maxtrans);
        sb.append(", ofOid=").append(ofOid);
        sb.append(", oidIndex=").append(oidIndex);
        sb.append(", organization=").append(organization);
        sb.append(", parallel=").append(parallel);
        sb.append(", parallelValueOid=").append(parallelValueOid);
        sb.append(", pctfree=").append(pctfree);
        sb.append(", pctincrease=").append(pctincrease);
        sb.append(", pctused=").append(pctused);
        sb.append(", storageOid=").append(storageOid);
        sb.append(", xmlTypeColumnPropertiesOid=").append(xmlTypeColumnPropertiesOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}