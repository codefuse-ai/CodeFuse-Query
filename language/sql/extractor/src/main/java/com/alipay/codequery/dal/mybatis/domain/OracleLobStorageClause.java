package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleLobStorageClause implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.cache")
    private Integer cache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.chunk_oid")
    private Long chunkOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.compress")
    private Integer compress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.enable")
    private Integer enable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.is_basic_file")
    private Integer isBasicFile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.is_retention")
    private Integer isRetention;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.is_secure_file")
    private Integer isSecureFile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.keep_duplicate")
    private Integer keepDuplicate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.logging")
    private Integer logging;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.pctversion_oid")
    private Long pctversionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.segement_name_oid")
    private Long segementNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.storage_clause_oid")
    private Long storageClauseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    public OracleLobStorageClause(Long oid, Integer cache, Long chunkOid, Integer compress, Integer enable, Integer isBasicFile, Integer isRetention, Integer isSecureFile, Integer keepDuplicate, Integer logging, Long pctversionOid, Long segementNameOid, Long storageClauseOid) {
        this.oid = oid;
        this.cache = cache;
        this.chunkOid = chunkOid;
        this.compress = compress;
        this.enable = enable;
        this.isBasicFile = isBasicFile;
        this.isRetention = isRetention;
        this.isSecureFile = isSecureFile;
        this.keepDuplicate = keepDuplicate;
        this.logging = logging;
        this.pctversionOid = pctversionOid;
        this.segementNameOid = segementNameOid;
        this.storageClauseOid = storageClauseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    public OracleLobStorageClause() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.cache")
    public Integer getCache() {
        return cache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.cache")
    public void setCache(Integer cache) {
        this.cache = cache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.chunk_oid")
    public Long getChunkOid() {
        return chunkOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.chunk_oid")
    public void setChunkOid(Long chunkOid) {
        this.chunkOid = chunkOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.compress")
    public Integer getCompress() {
        return compress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.compress")
    public void setCompress(Integer compress) {
        this.compress = compress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.enable")
    public Integer getEnable() {
        return enable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.enable")
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.is_basic_file")
    public Integer getIsBasicFile() {
        return isBasicFile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.is_basic_file")
    public void setIsBasicFile(Integer isBasicFile) {
        this.isBasicFile = isBasicFile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.is_retention")
    public Integer getIsRetention() {
        return isRetention;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.is_retention")
    public void setIsRetention(Integer isRetention) {
        this.isRetention = isRetention;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.is_secure_file")
    public Integer getIsSecureFile() {
        return isSecureFile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.is_secure_file")
    public void setIsSecureFile(Integer isSecureFile) {
        this.isSecureFile = isSecureFile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.keep_duplicate")
    public Integer getKeepDuplicate() {
        return keepDuplicate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.keep_duplicate")
    public void setKeepDuplicate(Integer keepDuplicate) {
        this.keepDuplicate = keepDuplicate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.logging")
    public Integer getLogging() {
        return logging;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.logging")
    public void setLogging(Integer logging) {
        this.logging = logging;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.pctversion_oid")
    public Long getPctversionOid() {
        return pctversionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.pctversion_oid")
    public void setPctversionOid(Long pctversionOid) {
        this.pctversionOid = pctversionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.segement_name_oid")
    public Long getSegementNameOid() {
        return segementNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.segement_name_oid")
    public void setSegementNameOid(Long segementNameOid) {
        this.segementNameOid = segementNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.storage_clause_oid")
    public Long getStorageClauseOid() {
        return storageClauseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.storage_clause_oid")
    public void setStorageClauseOid(Long storageClauseOid) {
        this.storageClauseOid = storageClauseOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
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
        OracleLobStorageClause other = (OracleLobStorageClause) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCache() == null ? other.getCache() == null : this.getCache().equals(other.getCache()))
            && (this.getChunkOid() == null ? other.getChunkOid() == null : this.getChunkOid().equals(other.getChunkOid()))
            && (this.getCompress() == null ? other.getCompress() == null : this.getCompress().equals(other.getCompress()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getIsBasicFile() == null ? other.getIsBasicFile() == null : this.getIsBasicFile().equals(other.getIsBasicFile()))
            && (this.getIsRetention() == null ? other.getIsRetention() == null : this.getIsRetention().equals(other.getIsRetention()))
            && (this.getIsSecureFile() == null ? other.getIsSecureFile() == null : this.getIsSecureFile().equals(other.getIsSecureFile()))
            && (this.getKeepDuplicate() == null ? other.getKeepDuplicate() == null : this.getKeepDuplicate().equals(other.getKeepDuplicate()))
            && (this.getLogging() == null ? other.getLogging() == null : this.getLogging().equals(other.getLogging()))
            && (this.getPctversionOid() == null ? other.getPctversionOid() == null : this.getPctversionOid().equals(other.getPctversionOid()))
            && (this.getSegementNameOid() == null ? other.getSegementNameOid() == null : this.getSegementNameOid().equals(other.getSegementNameOid()))
            && (this.getStorageClauseOid() == null ? other.getStorageClauseOid() == null : this.getStorageClauseOid().equals(other.getStorageClauseOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCache() == null) ? 0 : getCache().hashCode());
        result = prime * result + ((getChunkOid() == null) ? 0 : getChunkOid().hashCode());
        result = prime * result + ((getCompress() == null) ? 0 : getCompress().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getIsBasicFile() == null) ? 0 : getIsBasicFile().hashCode());
        result = prime * result + ((getIsRetention() == null) ? 0 : getIsRetention().hashCode());
        result = prime * result + ((getIsSecureFile() == null) ? 0 : getIsSecureFile().hashCode());
        result = prime * result + ((getKeepDuplicate() == null) ? 0 : getKeepDuplicate().hashCode());
        result = prime * result + ((getLogging() == null) ? 0 : getLogging().hashCode());
        result = prime * result + ((getPctversionOid() == null) ? 0 : getPctversionOid().hashCode());
        result = prime * result + ((getSegementNameOid() == null) ? 0 : getSegementNameOid().hashCode());
        result = prime * result + ((getStorageClauseOid() == null) ? 0 : getStorageClauseOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", cache=").append(cache);
        sb.append(", chunkOid=").append(chunkOid);
        sb.append(", compress=").append(compress);
        sb.append(", enable=").append(enable);
        sb.append(", isBasicFile=").append(isBasicFile);
        sb.append(", isRetention=").append(isRetention);
        sb.append(", isSecureFile=").append(isSecureFile);
        sb.append(", keepDuplicate=").append(keepDuplicate);
        sb.append(", logging=").append(logging);
        sb.append(", pctversionOid=").append(pctversionOid);
        sb.append(", segementNameOid=").append(segementNameOid);
        sb.append(", storageClauseOid=").append(storageClauseOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}