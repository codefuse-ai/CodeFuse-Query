package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleCreateIndexStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.compress")
    private Integer compress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.compress_level")
    private Integer compressLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.enable")
    private Integer enable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.free_lists")
    private Integer freeLists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.initrans")
    private Integer initrans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_cluster")
    private Integer isCluster;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_compress_for_oltp")
    private Integer isCompressForOltp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_compute_statistics")
    private Integer isComputeStatistics;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_global")
    private Integer isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_index_only_top_level")
    private Integer isIndexOnlyTopLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_local")
    private Integer isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_no_parallel")
    private Integer isNoParallel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_online")
    private Integer isOnline;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_reverse")
    private Integer isReverse;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.logging")
    private Integer logging;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.maxtrans")
    private Integer maxtrans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.parallel_oid")
    private Long parallelOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.pctfree")
    private Integer pctfree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.pctincrease")
    private Integer pctincrease;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.pctthreshold")
    private Integer pctthreshold;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.pctused")
    private Integer pctused;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.sort")
    private Integer sort;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.storage")
    private String storage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.tablespace_oid")
    private Long tablespaceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    public OracleCreateIndexStatement(Long oid, Integer compress, Integer compressLevel, Integer enable, Integer freeLists, Integer initrans, Integer isCluster, Integer isCompressForOltp, Integer isComputeStatistics, Integer isGlobal, Integer isIndexOnlyTopLevel, Integer isLocal, Integer isNoParallel, Integer isOnline, Integer isReverse, Integer logging, Integer maxtrans, Long parallelOid, Integer pctfree, Integer pctincrease, Integer pctthreshold, Integer pctused, Integer sort, String storage, Long tablespaceOid) {
        this.oid = oid;
        this.compress = compress;
        this.compressLevel = compressLevel;
        this.enable = enable;
        this.freeLists = freeLists;
        this.initrans = initrans;
        this.isCluster = isCluster;
        this.isCompressForOltp = isCompressForOltp;
        this.isComputeStatistics = isComputeStatistics;
        this.isGlobal = isGlobal;
        this.isIndexOnlyTopLevel = isIndexOnlyTopLevel;
        this.isLocal = isLocal;
        this.isNoParallel = isNoParallel;
        this.isOnline = isOnline;
        this.isReverse = isReverse;
        this.logging = logging;
        this.maxtrans = maxtrans;
        this.parallelOid = parallelOid;
        this.pctfree = pctfree;
        this.pctincrease = pctincrease;
        this.pctthreshold = pctthreshold;
        this.pctused = pctused;
        this.sort = sort;
        this.storage = storage;
        this.tablespaceOid = tablespaceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    public OracleCreateIndexStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.compress")
    public Integer getCompress() {
        return compress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.compress")
    public void setCompress(Integer compress) {
        this.compress = compress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.compress_level")
    public Integer getCompressLevel() {
        return compressLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.compress_level")
    public void setCompressLevel(Integer compressLevel) {
        this.compressLevel = compressLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.enable")
    public Integer getEnable() {
        return enable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.enable")
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.free_lists")
    public Integer getFreeLists() {
        return freeLists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.free_lists")
    public void setFreeLists(Integer freeLists) {
        this.freeLists = freeLists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.initrans")
    public Integer getInitrans() {
        return initrans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.initrans")
    public void setInitrans(Integer initrans) {
        this.initrans = initrans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_cluster")
    public Integer getIsCluster() {
        return isCluster;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_cluster")
    public void setIsCluster(Integer isCluster) {
        this.isCluster = isCluster;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_compress_for_oltp")
    public Integer getIsCompressForOltp() {
        return isCompressForOltp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_compress_for_oltp")
    public void setIsCompressForOltp(Integer isCompressForOltp) {
        this.isCompressForOltp = isCompressForOltp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_compute_statistics")
    public Integer getIsComputeStatistics() {
        return isComputeStatistics;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_compute_statistics")
    public void setIsComputeStatistics(Integer isComputeStatistics) {
        this.isComputeStatistics = isComputeStatistics;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_global")
    public Integer getIsGlobal() {
        return isGlobal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_global")
    public void setIsGlobal(Integer isGlobal) {
        this.isGlobal = isGlobal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_index_only_top_level")
    public Integer getIsIndexOnlyTopLevel() {
        return isIndexOnlyTopLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_index_only_top_level")
    public void setIsIndexOnlyTopLevel(Integer isIndexOnlyTopLevel) {
        this.isIndexOnlyTopLevel = isIndexOnlyTopLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_local")
    public Integer getIsLocal() {
        return isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_local")
    public void setIsLocal(Integer isLocal) {
        this.isLocal = isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_no_parallel")
    public Integer getIsNoParallel() {
        return isNoParallel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_no_parallel")
    public void setIsNoParallel(Integer isNoParallel) {
        this.isNoParallel = isNoParallel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_online")
    public Integer getIsOnline() {
        return isOnline;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_online")
    public void setIsOnline(Integer isOnline) {
        this.isOnline = isOnline;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_reverse")
    public Integer getIsReverse() {
        return isReverse;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_reverse")
    public void setIsReverse(Integer isReverse) {
        this.isReverse = isReverse;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.logging")
    public Integer getLogging() {
        return logging;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.logging")
    public void setLogging(Integer logging) {
        this.logging = logging;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.maxtrans")
    public Integer getMaxtrans() {
        return maxtrans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.maxtrans")
    public void setMaxtrans(Integer maxtrans) {
        this.maxtrans = maxtrans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.parallel_oid")
    public Long getParallelOid() {
        return parallelOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.parallel_oid")
    public void setParallelOid(Long parallelOid) {
        this.parallelOid = parallelOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.pctfree")
    public Integer getPctfree() {
        return pctfree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.pctfree")
    public void setPctfree(Integer pctfree) {
        this.pctfree = pctfree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.pctincrease")
    public Integer getPctincrease() {
        return pctincrease;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.pctincrease")
    public void setPctincrease(Integer pctincrease) {
        this.pctincrease = pctincrease;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.pctthreshold")
    public Integer getPctthreshold() {
        return pctthreshold;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.pctthreshold")
    public void setPctthreshold(Integer pctthreshold) {
        this.pctthreshold = pctthreshold;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.pctused")
    public Integer getPctused() {
        return pctused;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.pctused")
    public void setPctused(Integer pctused) {
        this.pctused = pctused;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.sort")
    public Integer getSort() {
        return sort;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.sort")
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.storage")
    public String getStorage() {
        return storage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.storage")
    public void setStorage(String storage) {
        this.storage = storage == null ? null : storage.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.tablespace_oid")
    public Long getTablespaceOid() {
        return tablespaceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.tablespace_oid")
    public void setTablespaceOid(Long tablespaceOid) {
        this.tablespaceOid = tablespaceOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
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
        OracleCreateIndexStatement other = (OracleCreateIndexStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCompress() == null ? other.getCompress() == null : this.getCompress().equals(other.getCompress()))
            && (this.getCompressLevel() == null ? other.getCompressLevel() == null : this.getCompressLevel().equals(other.getCompressLevel()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getFreeLists() == null ? other.getFreeLists() == null : this.getFreeLists().equals(other.getFreeLists()))
            && (this.getInitrans() == null ? other.getInitrans() == null : this.getInitrans().equals(other.getInitrans()))
            && (this.getIsCluster() == null ? other.getIsCluster() == null : this.getIsCluster().equals(other.getIsCluster()))
            && (this.getIsCompressForOltp() == null ? other.getIsCompressForOltp() == null : this.getIsCompressForOltp().equals(other.getIsCompressForOltp()))
            && (this.getIsComputeStatistics() == null ? other.getIsComputeStatistics() == null : this.getIsComputeStatistics().equals(other.getIsComputeStatistics()))
            && (this.getIsGlobal() == null ? other.getIsGlobal() == null : this.getIsGlobal().equals(other.getIsGlobal()))
            && (this.getIsIndexOnlyTopLevel() == null ? other.getIsIndexOnlyTopLevel() == null : this.getIsIndexOnlyTopLevel().equals(other.getIsIndexOnlyTopLevel()))
            && (this.getIsLocal() == null ? other.getIsLocal() == null : this.getIsLocal().equals(other.getIsLocal()))
            && (this.getIsNoParallel() == null ? other.getIsNoParallel() == null : this.getIsNoParallel().equals(other.getIsNoParallel()))
            && (this.getIsOnline() == null ? other.getIsOnline() == null : this.getIsOnline().equals(other.getIsOnline()))
            && (this.getIsReverse() == null ? other.getIsReverse() == null : this.getIsReverse().equals(other.getIsReverse()))
            && (this.getLogging() == null ? other.getLogging() == null : this.getLogging().equals(other.getLogging()))
            && (this.getMaxtrans() == null ? other.getMaxtrans() == null : this.getMaxtrans().equals(other.getMaxtrans()))
            && (this.getParallelOid() == null ? other.getParallelOid() == null : this.getParallelOid().equals(other.getParallelOid()))
            && (this.getPctfree() == null ? other.getPctfree() == null : this.getPctfree().equals(other.getPctfree()))
            && (this.getPctincrease() == null ? other.getPctincrease() == null : this.getPctincrease().equals(other.getPctincrease()))
            && (this.getPctthreshold() == null ? other.getPctthreshold() == null : this.getPctthreshold().equals(other.getPctthreshold()))
            && (this.getPctused() == null ? other.getPctused() == null : this.getPctused().equals(other.getPctused()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getStorage() == null ? other.getStorage() == null : this.getStorage().equals(other.getStorage()))
            && (this.getTablespaceOid() == null ? other.getTablespaceOid() == null : this.getTablespaceOid().equals(other.getTablespaceOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCompress() == null) ? 0 : getCompress().hashCode());
        result = prime * result + ((getCompressLevel() == null) ? 0 : getCompressLevel().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getFreeLists() == null) ? 0 : getFreeLists().hashCode());
        result = prime * result + ((getInitrans() == null) ? 0 : getInitrans().hashCode());
        result = prime * result + ((getIsCluster() == null) ? 0 : getIsCluster().hashCode());
        result = prime * result + ((getIsCompressForOltp() == null) ? 0 : getIsCompressForOltp().hashCode());
        result = prime * result + ((getIsComputeStatistics() == null) ? 0 : getIsComputeStatistics().hashCode());
        result = prime * result + ((getIsGlobal() == null) ? 0 : getIsGlobal().hashCode());
        result = prime * result + ((getIsIndexOnlyTopLevel() == null) ? 0 : getIsIndexOnlyTopLevel().hashCode());
        result = prime * result + ((getIsLocal() == null) ? 0 : getIsLocal().hashCode());
        result = prime * result + ((getIsNoParallel() == null) ? 0 : getIsNoParallel().hashCode());
        result = prime * result + ((getIsOnline() == null) ? 0 : getIsOnline().hashCode());
        result = prime * result + ((getIsReverse() == null) ? 0 : getIsReverse().hashCode());
        result = prime * result + ((getLogging() == null) ? 0 : getLogging().hashCode());
        result = prime * result + ((getMaxtrans() == null) ? 0 : getMaxtrans().hashCode());
        result = prime * result + ((getParallelOid() == null) ? 0 : getParallelOid().hashCode());
        result = prime * result + ((getPctfree() == null) ? 0 : getPctfree().hashCode());
        result = prime * result + ((getPctincrease() == null) ? 0 : getPctincrease().hashCode());
        result = prime * result + ((getPctthreshold() == null) ? 0 : getPctthreshold().hashCode());
        result = prime * result + ((getPctused() == null) ? 0 : getPctused().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getStorage() == null) ? 0 : getStorage().hashCode());
        result = prime * result + ((getTablespaceOid() == null) ? 0 : getTablespaceOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", compress=").append(compress);
        sb.append(", compressLevel=").append(compressLevel);
        sb.append(", enable=").append(enable);
        sb.append(", freeLists=").append(freeLists);
        sb.append(", initrans=").append(initrans);
        sb.append(", isCluster=").append(isCluster);
        sb.append(", isCompressForOltp=").append(isCompressForOltp);
        sb.append(", isComputeStatistics=").append(isComputeStatistics);
        sb.append(", isGlobal=").append(isGlobal);
        sb.append(", isIndexOnlyTopLevel=").append(isIndexOnlyTopLevel);
        sb.append(", isLocal=").append(isLocal);
        sb.append(", isNoParallel=").append(isNoParallel);
        sb.append(", isOnline=").append(isOnline);
        sb.append(", isReverse=").append(isReverse);
        sb.append(", logging=").append(logging);
        sb.append(", maxtrans=").append(maxtrans);
        sb.append(", parallelOid=").append(parallelOid);
        sb.append(", pctfree=").append(pctfree);
        sb.append(", pctincrease=").append(pctincrease);
        sb.append(", pctthreshold=").append(pctthreshold);
        sb.append(", pctused=").append(pctused);
        sb.append(", sort=").append(sort);
        sb.append(", storage=").append(storage);
        sb.append(", tablespaceOid=").append(tablespaceOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}