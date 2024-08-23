package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleStorageClause implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.buffer_pool_oid")
    private Long bufferPoolOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.cell_flash_cache")
    private String cellFlashCache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.flash_cache")
    private String flashCache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.free_list_groups_oid")
    private Long freeListGroupsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.free_lists_oid")
    private Long freeListsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.initial_oid")
    private Long initialOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.max_extents_oid")
    private Long maxExtentsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.max_size_oid")
    private Long maxSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.min_extents_oid")
    private Long minExtentsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.next_oid")
    private Long nextOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.objno_oid")
    private Long objnoOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.pct_increase_oid")
    private Long pctIncreaseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    public OracleStorageClause(Long oid, Long bufferPoolOid, String cellFlashCache, String flashCache, Long freeListGroupsOid, Long freeListsOid, Long initialOid, Long maxExtentsOid, Long maxSizeOid, Long minExtentsOid, Long nextOid, Long objnoOid, Long pctIncreaseOid) {
        this.oid = oid;
        this.bufferPoolOid = bufferPoolOid;
        this.cellFlashCache = cellFlashCache;
        this.flashCache = flashCache;
        this.freeListGroupsOid = freeListGroupsOid;
        this.freeListsOid = freeListsOid;
        this.initialOid = initialOid;
        this.maxExtentsOid = maxExtentsOid;
        this.maxSizeOid = maxSizeOid;
        this.minExtentsOid = minExtentsOid;
        this.nextOid = nextOid;
        this.objnoOid = objnoOid;
        this.pctIncreaseOid = pctIncreaseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    public OracleStorageClause() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.buffer_pool_oid")
    public Long getBufferPoolOid() {
        return bufferPoolOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.buffer_pool_oid")
    public void setBufferPoolOid(Long bufferPoolOid) {
        this.bufferPoolOid = bufferPoolOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.cell_flash_cache")
    public String getCellFlashCache() {
        return cellFlashCache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.cell_flash_cache")
    public void setCellFlashCache(String cellFlashCache) {
        this.cellFlashCache = cellFlashCache == null ? null : cellFlashCache.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.flash_cache")
    public String getFlashCache() {
        return flashCache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.flash_cache")
    public void setFlashCache(String flashCache) {
        this.flashCache = flashCache == null ? null : flashCache.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.free_list_groups_oid")
    public Long getFreeListGroupsOid() {
        return freeListGroupsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.free_list_groups_oid")
    public void setFreeListGroupsOid(Long freeListGroupsOid) {
        this.freeListGroupsOid = freeListGroupsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.free_lists_oid")
    public Long getFreeListsOid() {
        return freeListsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.free_lists_oid")
    public void setFreeListsOid(Long freeListsOid) {
        this.freeListsOid = freeListsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.initial_oid")
    public Long getInitialOid() {
        return initialOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.initial_oid")
    public void setInitialOid(Long initialOid) {
        this.initialOid = initialOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.max_extents_oid")
    public Long getMaxExtentsOid() {
        return maxExtentsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.max_extents_oid")
    public void setMaxExtentsOid(Long maxExtentsOid) {
        this.maxExtentsOid = maxExtentsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.max_size_oid")
    public Long getMaxSizeOid() {
        return maxSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.max_size_oid")
    public void setMaxSizeOid(Long maxSizeOid) {
        this.maxSizeOid = maxSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.min_extents_oid")
    public Long getMinExtentsOid() {
        return minExtentsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.min_extents_oid")
    public void setMinExtentsOid(Long minExtentsOid) {
        this.minExtentsOid = minExtentsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.next_oid")
    public Long getNextOid() {
        return nextOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.next_oid")
    public void setNextOid(Long nextOid) {
        this.nextOid = nextOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.objno_oid")
    public Long getObjnoOid() {
        return objnoOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.objno_oid")
    public void setObjnoOid(Long objnoOid) {
        this.objnoOid = objnoOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.pct_increase_oid")
    public Long getPctIncreaseOid() {
        return pctIncreaseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.pct_increase_oid")
    public void setPctIncreaseOid(Long pctIncreaseOid) {
        this.pctIncreaseOid = pctIncreaseOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
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
        OracleStorageClause other = (OracleStorageClause) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getBufferPoolOid() == null ? other.getBufferPoolOid() == null : this.getBufferPoolOid().equals(other.getBufferPoolOid()))
            && (this.getCellFlashCache() == null ? other.getCellFlashCache() == null : this.getCellFlashCache().equals(other.getCellFlashCache()))
            && (this.getFlashCache() == null ? other.getFlashCache() == null : this.getFlashCache().equals(other.getFlashCache()))
            && (this.getFreeListGroupsOid() == null ? other.getFreeListGroupsOid() == null : this.getFreeListGroupsOid().equals(other.getFreeListGroupsOid()))
            && (this.getFreeListsOid() == null ? other.getFreeListsOid() == null : this.getFreeListsOid().equals(other.getFreeListsOid()))
            && (this.getInitialOid() == null ? other.getInitialOid() == null : this.getInitialOid().equals(other.getInitialOid()))
            && (this.getMaxExtentsOid() == null ? other.getMaxExtentsOid() == null : this.getMaxExtentsOid().equals(other.getMaxExtentsOid()))
            && (this.getMaxSizeOid() == null ? other.getMaxSizeOid() == null : this.getMaxSizeOid().equals(other.getMaxSizeOid()))
            && (this.getMinExtentsOid() == null ? other.getMinExtentsOid() == null : this.getMinExtentsOid().equals(other.getMinExtentsOid()))
            && (this.getNextOid() == null ? other.getNextOid() == null : this.getNextOid().equals(other.getNextOid()))
            && (this.getObjnoOid() == null ? other.getObjnoOid() == null : this.getObjnoOid().equals(other.getObjnoOid()))
            && (this.getPctIncreaseOid() == null ? other.getPctIncreaseOid() == null : this.getPctIncreaseOid().equals(other.getPctIncreaseOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getBufferPoolOid() == null) ? 0 : getBufferPoolOid().hashCode());
        result = prime * result + ((getCellFlashCache() == null) ? 0 : getCellFlashCache().hashCode());
        result = prime * result + ((getFlashCache() == null) ? 0 : getFlashCache().hashCode());
        result = prime * result + ((getFreeListGroupsOid() == null) ? 0 : getFreeListGroupsOid().hashCode());
        result = prime * result + ((getFreeListsOid() == null) ? 0 : getFreeListsOid().hashCode());
        result = prime * result + ((getInitialOid() == null) ? 0 : getInitialOid().hashCode());
        result = prime * result + ((getMaxExtentsOid() == null) ? 0 : getMaxExtentsOid().hashCode());
        result = prime * result + ((getMaxSizeOid() == null) ? 0 : getMaxSizeOid().hashCode());
        result = prime * result + ((getMinExtentsOid() == null) ? 0 : getMinExtentsOid().hashCode());
        result = prime * result + ((getNextOid() == null) ? 0 : getNextOid().hashCode());
        result = prime * result + ((getObjnoOid() == null) ? 0 : getObjnoOid().hashCode());
        result = prime * result + ((getPctIncreaseOid() == null) ? 0 : getPctIncreaseOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", bufferPoolOid=").append(bufferPoolOid);
        sb.append(", cellFlashCache=").append(cellFlashCache);
        sb.append(", flashCache=").append(flashCache);
        sb.append(", freeListGroupsOid=").append(freeListGroupsOid);
        sb.append(", freeListsOid=").append(freeListsOid);
        sb.append(", initialOid=").append(initialOid);
        sb.append(", maxExtentsOid=").append(maxExtentsOid);
        sb.append(", maxSizeOid=").append(maxSizeOid);
        sb.append(", minExtentsOid=").append(minExtentsOid);
        sb.append(", nextOid=").append(nextOid);
        sb.append(", objnoOid=").append(objnoOid);
        sb.append(", pctIncreaseOid=").append(pctIncreaseOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}