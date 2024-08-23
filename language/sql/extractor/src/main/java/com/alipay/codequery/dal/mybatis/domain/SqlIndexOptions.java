package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlIndexOptions implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.algorithm")
    private String algorithm;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.comment_oid")
    private Long commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.index_type")
    private String indexType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.is_global")
    private Integer isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.is_invisible")
    private Integer isInvisible;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.is_local")
    private Integer isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.is_visible")
    private Integer isVisible;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.key_block_size_oid")
    private Long keyBlockSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.lock")
    private String lock;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.parser_name")
    private String parserName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    public SqlIndexOptions(Long oid, String algorithm, Long commentOid, String indexType, Integer isGlobal, Integer isInvisible, Integer isLocal, Integer isVisible, Long keyBlockSizeOid, String lock, String parserName) {
        this.oid = oid;
        this.algorithm = algorithm;
        this.commentOid = commentOid;
        this.indexType = indexType;
        this.isGlobal = isGlobal;
        this.isInvisible = isInvisible;
        this.isLocal = isLocal;
        this.isVisible = isVisible;
        this.keyBlockSizeOid = keyBlockSizeOid;
        this.lock = lock;
        this.parserName = parserName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    public SqlIndexOptions() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.algorithm")
    public String getAlgorithm() {
        return algorithm;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.algorithm")
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm == null ? null : algorithm.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.comment_oid")
    public Long getCommentOid() {
        return commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.comment_oid")
    public void setCommentOid(Long commentOid) {
        this.commentOid = commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.index_type")
    public String getIndexType() {
        return indexType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.index_type")
    public void setIndexType(String indexType) {
        this.indexType = indexType == null ? null : indexType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.is_global")
    public Integer getIsGlobal() {
        return isGlobal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.is_global")
    public void setIsGlobal(Integer isGlobal) {
        this.isGlobal = isGlobal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.is_invisible")
    public Integer getIsInvisible() {
        return isInvisible;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.is_invisible")
    public void setIsInvisible(Integer isInvisible) {
        this.isInvisible = isInvisible;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.is_local")
    public Integer getIsLocal() {
        return isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.is_local")
    public void setIsLocal(Integer isLocal) {
        this.isLocal = isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.is_visible")
    public Integer getIsVisible() {
        return isVisible;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.is_visible")
    public void setIsVisible(Integer isVisible) {
        this.isVisible = isVisible;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.key_block_size_oid")
    public Long getKeyBlockSizeOid() {
        return keyBlockSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.key_block_size_oid")
    public void setKeyBlockSizeOid(Long keyBlockSizeOid) {
        this.keyBlockSizeOid = keyBlockSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.lock")
    public String getLock() {
        return lock;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.lock")
    public void setLock(String lock) {
        this.lock = lock == null ? null : lock.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.parser_name")
    public String getParserName() {
        return parserName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.parser_name")
    public void setParserName(String parserName) {
        this.parserName = parserName == null ? null : parserName.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
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
        SqlIndexOptions other = (SqlIndexOptions) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAlgorithm() == null ? other.getAlgorithm() == null : this.getAlgorithm().equals(other.getAlgorithm()))
            && (this.getCommentOid() == null ? other.getCommentOid() == null : this.getCommentOid().equals(other.getCommentOid()))
            && (this.getIndexType() == null ? other.getIndexType() == null : this.getIndexType().equals(other.getIndexType()))
            && (this.getIsGlobal() == null ? other.getIsGlobal() == null : this.getIsGlobal().equals(other.getIsGlobal()))
            && (this.getIsInvisible() == null ? other.getIsInvisible() == null : this.getIsInvisible().equals(other.getIsInvisible()))
            && (this.getIsLocal() == null ? other.getIsLocal() == null : this.getIsLocal().equals(other.getIsLocal()))
            && (this.getIsVisible() == null ? other.getIsVisible() == null : this.getIsVisible().equals(other.getIsVisible()))
            && (this.getKeyBlockSizeOid() == null ? other.getKeyBlockSizeOid() == null : this.getKeyBlockSizeOid().equals(other.getKeyBlockSizeOid()))
            && (this.getLock() == null ? other.getLock() == null : this.getLock().equals(other.getLock()))
            && (this.getParserName() == null ? other.getParserName() == null : this.getParserName().equals(other.getParserName()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        result = prime * result + ((getCommentOid() == null) ? 0 : getCommentOid().hashCode());
        result = prime * result + ((getIndexType() == null) ? 0 : getIndexType().hashCode());
        result = prime * result + ((getIsGlobal() == null) ? 0 : getIsGlobal().hashCode());
        result = prime * result + ((getIsInvisible() == null) ? 0 : getIsInvisible().hashCode());
        result = prime * result + ((getIsLocal() == null) ? 0 : getIsLocal().hashCode());
        result = prime * result + ((getIsVisible() == null) ? 0 : getIsVisible().hashCode());
        result = prime * result + ((getKeyBlockSizeOid() == null) ? 0 : getKeyBlockSizeOid().hashCode());
        result = prime * result + ((getLock() == null) ? 0 : getLock().hashCode());
        result = prime * result + ((getParserName() == null) ? 0 : getParserName().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", algorithm=").append(algorithm);
        sb.append(", commentOid=").append(commentOid);
        sb.append(", indexType=").append(indexType);
        sb.append(", isGlobal=").append(isGlobal);
        sb.append(", isInvisible=").append(isInvisible);
        sb.append(", isLocal=").append(isLocal);
        sb.append(", isVisible=").append(isVisible);
        sb.append(", keyBlockSizeOid=").append(keyBlockSizeOid);
        sb.append(", lock=").append(lock);
        sb.append(", parserName=").append(parserName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}