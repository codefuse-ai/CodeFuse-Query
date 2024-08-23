package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleSegmentAttributesImpl implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.compress")
    private Integer compress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.compress_level")
    private Integer compressLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.free_lists")
    private Integer freeLists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.initrans")
    private Integer initrans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.is_compress_for_oltp")
    private Integer isCompressForOltp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.logging")
    private Integer logging;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.maxtrans")
    private Integer maxtrans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.pctfree")
    private Integer pctfree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.pctincrease")
    private Integer pctincrease;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.pctthreshold")
    private Integer pctthreshold;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.pctused")
    private Integer pctused;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.storage")
    private String storage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.tablespace_oid")
    private Long tablespaceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    public OracleSegmentAttributesImpl(Long oid, Integer compress, Integer compressLevel, Integer freeLists, Integer initrans, Integer isCompressForOltp, Integer logging, Integer maxtrans, Integer pctfree, Integer pctincrease, Integer pctthreshold, Integer pctused, String storage, Long tablespaceOid) {
        this.oid = oid;
        this.compress = compress;
        this.compressLevel = compressLevel;
        this.freeLists = freeLists;
        this.initrans = initrans;
        this.isCompressForOltp = isCompressForOltp;
        this.logging = logging;
        this.maxtrans = maxtrans;
        this.pctfree = pctfree;
        this.pctincrease = pctincrease;
        this.pctthreshold = pctthreshold;
        this.pctused = pctused;
        this.storage = storage;
        this.tablespaceOid = tablespaceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    public OracleSegmentAttributesImpl() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.compress")
    public Integer getCompress() {
        return compress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.compress")
    public void setCompress(Integer compress) {
        this.compress = compress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.compress_level")
    public Integer getCompressLevel() {
        return compressLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.compress_level")
    public void setCompressLevel(Integer compressLevel) {
        this.compressLevel = compressLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.free_lists")
    public Integer getFreeLists() {
        return freeLists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.free_lists")
    public void setFreeLists(Integer freeLists) {
        this.freeLists = freeLists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.initrans")
    public Integer getInitrans() {
        return initrans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.initrans")
    public void setInitrans(Integer initrans) {
        this.initrans = initrans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.is_compress_for_oltp")
    public Integer getIsCompressForOltp() {
        return isCompressForOltp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.is_compress_for_oltp")
    public void setIsCompressForOltp(Integer isCompressForOltp) {
        this.isCompressForOltp = isCompressForOltp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.logging")
    public Integer getLogging() {
        return logging;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.logging")
    public void setLogging(Integer logging) {
        this.logging = logging;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.maxtrans")
    public Integer getMaxtrans() {
        return maxtrans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.maxtrans")
    public void setMaxtrans(Integer maxtrans) {
        this.maxtrans = maxtrans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.pctfree")
    public Integer getPctfree() {
        return pctfree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.pctfree")
    public void setPctfree(Integer pctfree) {
        this.pctfree = pctfree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.pctincrease")
    public Integer getPctincrease() {
        return pctincrease;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.pctincrease")
    public void setPctincrease(Integer pctincrease) {
        this.pctincrease = pctincrease;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.pctthreshold")
    public Integer getPctthreshold() {
        return pctthreshold;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.pctthreshold")
    public void setPctthreshold(Integer pctthreshold) {
        this.pctthreshold = pctthreshold;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.pctused")
    public Integer getPctused() {
        return pctused;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.pctused")
    public void setPctused(Integer pctused) {
        this.pctused = pctused;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.storage")
    public String getStorage() {
        return storage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.storage")
    public void setStorage(String storage) {
        this.storage = storage == null ? null : storage.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.tablespace_oid")
    public Long getTablespaceOid() {
        return tablespaceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.tablespace_oid")
    public void setTablespaceOid(Long tablespaceOid) {
        this.tablespaceOid = tablespaceOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
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
        OracleSegmentAttributesImpl other = (OracleSegmentAttributesImpl) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCompress() == null ? other.getCompress() == null : this.getCompress().equals(other.getCompress()))
            && (this.getCompressLevel() == null ? other.getCompressLevel() == null : this.getCompressLevel().equals(other.getCompressLevel()))
            && (this.getFreeLists() == null ? other.getFreeLists() == null : this.getFreeLists().equals(other.getFreeLists()))
            && (this.getInitrans() == null ? other.getInitrans() == null : this.getInitrans().equals(other.getInitrans()))
            && (this.getIsCompressForOltp() == null ? other.getIsCompressForOltp() == null : this.getIsCompressForOltp().equals(other.getIsCompressForOltp()))
            && (this.getLogging() == null ? other.getLogging() == null : this.getLogging().equals(other.getLogging()))
            && (this.getMaxtrans() == null ? other.getMaxtrans() == null : this.getMaxtrans().equals(other.getMaxtrans()))
            && (this.getPctfree() == null ? other.getPctfree() == null : this.getPctfree().equals(other.getPctfree()))
            && (this.getPctincrease() == null ? other.getPctincrease() == null : this.getPctincrease().equals(other.getPctincrease()))
            && (this.getPctthreshold() == null ? other.getPctthreshold() == null : this.getPctthreshold().equals(other.getPctthreshold()))
            && (this.getPctused() == null ? other.getPctused() == null : this.getPctused().equals(other.getPctused()))
            && (this.getStorage() == null ? other.getStorage() == null : this.getStorage().equals(other.getStorage()))
            && (this.getTablespaceOid() == null ? other.getTablespaceOid() == null : this.getTablespaceOid().equals(other.getTablespaceOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCompress() == null) ? 0 : getCompress().hashCode());
        result = prime * result + ((getCompressLevel() == null) ? 0 : getCompressLevel().hashCode());
        result = prime * result + ((getFreeLists() == null) ? 0 : getFreeLists().hashCode());
        result = prime * result + ((getInitrans() == null) ? 0 : getInitrans().hashCode());
        result = prime * result + ((getIsCompressForOltp() == null) ? 0 : getIsCompressForOltp().hashCode());
        result = prime * result + ((getLogging() == null) ? 0 : getLogging().hashCode());
        result = prime * result + ((getMaxtrans() == null) ? 0 : getMaxtrans().hashCode());
        result = prime * result + ((getPctfree() == null) ? 0 : getPctfree().hashCode());
        result = prime * result + ((getPctincrease() == null) ? 0 : getPctincrease().hashCode());
        result = prime * result + ((getPctthreshold() == null) ? 0 : getPctthreshold().hashCode());
        result = prime * result + ((getPctused() == null) ? 0 : getPctused().hashCode());
        result = prime * result + ((getStorage() == null) ? 0 : getStorage().hashCode());
        result = prime * result + ((getTablespaceOid() == null) ? 0 : getTablespaceOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", compress=").append(compress);
        sb.append(", compressLevel=").append(compressLevel);
        sb.append(", freeLists=").append(freeLists);
        sb.append(", initrans=").append(initrans);
        sb.append(", isCompressForOltp=").append(isCompressForOltp);
        sb.append(", logging=").append(logging);
        sb.append(", maxtrans=").append(maxtrans);
        sb.append(", pctfree=").append(pctfree);
        sb.append(", pctincrease=").append(pctincrease);
        sb.append(", pctthreshold=").append(pctthreshold);
        sb.append(", pctused=").append(pctused);
        sb.append(", storage=").append(storage);
        sb.append(", tablespaceOid=").append(tablespaceOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}