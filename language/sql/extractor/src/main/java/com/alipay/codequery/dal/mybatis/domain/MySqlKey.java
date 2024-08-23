package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlKey implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_key.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_key.index_type")
    private String indexType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_key.is_has_constraint")
    private Integer isHasConstraint;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_key.key_block_size_oid")
    private Long keyBlockSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    public MySqlKey(Long oid, String indexType, Integer isHasConstraint, Long keyBlockSizeOid) {
        this.oid = oid;
        this.indexType = indexType;
        this.isHasConstraint = isHasConstraint;
        this.keyBlockSizeOid = keyBlockSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    public MySqlKey() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_key.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_key.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_key.index_type")
    public String getIndexType() {
        return indexType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_key.index_type")
    public void setIndexType(String indexType) {
        this.indexType = indexType == null ? null : indexType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_key.is_has_constraint")
    public Integer getIsHasConstraint() {
        return isHasConstraint;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_key.is_has_constraint")
    public void setIsHasConstraint(Integer isHasConstraint) {
        this.isHasConstraint = isHasConstraint;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_key.key_block_size_oid")
    public Long getKeyBlockSizeOid() {
        return keyBlockSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_key.key_block_size_oid")
    public void setKeyBlockSizeOid(Long keyBlockSizeOid) {
        this.keyBlockSizeOid = keyBlockSizeOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
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
        MySqlKey other = (MySqlKey) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIndexType() == null ? other.getIndexType() == null : this.getIndexType().equals(other.getIndexType()))
            && (this.getIsHasConstraint() == null ? other.getIsHasConstraint() == null : this.getIsHasConstraint().equals(other.getIsHasConstraint()))
            && (this.getKeyBlockSizeOid() == null ? other.getKeyBlockSizeOid() == null : this.getKeyBlockSizeOid().equals(other.getKeyBlockSizeOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIndexType() == null) ? 0 : getIndexType().hashCode());
        result = prime * result + ((getIsHasConstraint() == null) ? 0 : getIsHasConstraint().hashCode());
        result = prime * result + ((getKeyBlockSizeOid() == null) ? 0 : getKeyBlockSizeOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", indexType=").append(indexType);
        sb.append(", isHasConstraint=").append(isHasConstraint);
        sb.append(", keyBlockSizeOid=").append(keyBlockSizeOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}