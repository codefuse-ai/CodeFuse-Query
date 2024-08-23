package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleSupplementalIdKey implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.is_all")
    private Integer isAll;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.is_foreign_key")
    private Integer isForeignKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.is_primary_key")
    private Integer isPrimaryKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.is_unique")
    private Integer isUnique;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.is_unique_index")
    private Integer isUniqueIndex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    public OracleSupplementalIdKey(Long oid, Integer isAll, Integer isForeignKey, Integer isPrimaryKey, Integer isUnique, Integer isUniqueIndex) {
        this.oid = oid;
        this.isAll = isAll;
        this.isForeignKey = isForeignKey;
        this.isPrimaryKey = isPrimaryKey;
        this.isUnique = isUnique;
        this.isUniqueIndex = isUniqueIndex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    public OracleSupplementalIdKey() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.is_all")
    public Integer getIsAll() {
        return isAll;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.is_all")
    public void setIsAll(Integer isAll) {
        this.isAll = isAll;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.is_foreign_key")
    public Integer getIsForeignKey() {
        return isForeignKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.is_foreign_key")
    public void setIsForeignKey(Integer isForeignKey) {
        this.isForeignKey = isForeignKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.is_primary_key")
    public Integer getIsPrimaryKey() {
        return isPrimaryKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.is_primary_key")
    public void setIsPrimaryKey(Integer isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.is_unique")
    public Integer getIsUnique() {
        return isUnique;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.is_unique")
    public void setIsUnique(Integer isUnique) {
        this.isUnique = isUnique;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.is_unique_index")
    public Integer getIsUniqueIndex() {
        return isUniqueIndex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.is_unique_index")
    public void setIsUniqueIndex(Integer isUniqueIndex) {
        this.isUniqueIndex = isUniqueIndex;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
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
        OracleSupplementalIdKey other = (OracleSupplementalIdKey) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsAll() == null ? other.getIsAll() == null : this.getIsAll().equals(other.getIsAll()))
            && (this.getIsForeignKey() == null ? other.getIsForeignKey() == null : this.getIsForeignKey().equals(other.getIsForeignKey()))
            && (this.getIsPrimaryKey() == null ? other.getIsPrimaryKey() == null : this.getIsPrimaryKey().equals(other.getIsPrimaryKey()))
            && (this.getIsUnique() == null ? other.getIsUnique() == null : this.getIsUnique().equals(other.getIsUnique()))
            && (this.getIsUniqueIndex() == null ? other.getIsUniqueIndex() == null : this.getIsUniqueIndex().equals(other.getIsUniqueIndex()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsAll() == null) ? 0 : getIsAll().hashCode());
        result = prime * result + ((getIsForeignKey() == null) ? 0 : getIsForeignKey().hashCode());
        result = prime * result + ((getIsPrimaryKey() == null) ? 0 : getIsPrimaryKey().hashCode());
        result = prime * result + ((getIsUnique() == null) ? 0 : getIsUnique().hashCode());
        result = prime * result + ((getIsUniqueIndex() == null) ? 0 : getIsUniqueIndex().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isAll=").append(isAll);
        sb.append(", isForeignKey=").append(isForeignKey);
        sb.append(", isPrimaryKey=").append(isPrimaryKey);
        sb.append(", isUnique=").append(isUnique);
        sb.append(", isUniqueIndex=").append(isUniqueIndex);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}