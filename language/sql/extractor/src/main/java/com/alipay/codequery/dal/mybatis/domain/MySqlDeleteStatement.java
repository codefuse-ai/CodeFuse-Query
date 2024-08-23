package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlDeleteStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.force_partition_oid")
    private Long forcePartitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.hints_size")
    private Integer hintsSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.is_force_all_partitions")
    private Integer isForceAllPartitions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.is_fulltext_dictionary")
    private Integer isFulltextDictionary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.is_ignore")
    private Integer isIgnore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.is_low_priority")
    private Integer isLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.is_quick")
    private Integer isQuick;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.limit_oid")
    private Long limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.order_by_oid")
    private Long orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    public MySqlDeleteStatement(Long oid, Long forcePartitionOid, Integer hintsSize, Integer isForceAllPartitions, Integer isFulltextDictionary, Integer isIgnore, Integer isLowPriority, Integer isQuick, Long limitOid, Long orderByOid) {
        this.oid = oid;
        this.forcePartitionOid = forcePartitionOid;
        this.hintsSize = hintsSize;
        this.isForceAllPartitions = isForceAllPartitions;
        this.isFulltextDictionary = isFulltextDictionary;
        this.isIgnore = isIgnore;
        this.isLowPriority = isLowPriority;
        this.isQuick = isQuick;
        this.limitOid = limitOid;
        this.orderByOid = orderByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    public MySqlDeleteStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.force_partition_oid")
    public Long getForcePartitionOid() {
        return forcePartitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.force_partition_oid")
    public void setForcePartitionOid(Long forcePartitionOid) {
        this.forcePartitionOid = forcePartitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.hints_size")
    public Integer getHintsSize() {
        return hintsSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.hints_size")
    public void setHintsSize(Integer hintsSize) {
        this.hintsSize = hintsSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.is_force_all_partitions")
    public Integer getIsForceAllPartitions() {
        return isForceAllPartitions;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.is_force_all_partitions")
    public void setIsForceAllPartitions(Integer isForceAllPartitions) {
        this.isForceAllPartitions = isForceAllPartitions;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.is_fulltext_dictionary")
    public Integer getIsFulltextDictionary() {
        return isFulltextDictionary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.is_fulltext_dictionary")
    public void setIsFulltextDictionary(Integer isFulltextDictionary) {
        this.isFulltextDictionary = isFulltextDictionary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.is_ignore")
    public Integer getIsIgnore() {
        return isIgnore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.is_ignore")
    public void setIsIgnore(Integer isIgnore) {
        this.isIgnore = isIgnore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.is_low_priority")
    public Integer getIsLowPriority() {
        return isLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.is_low_priority")
    public void setIsLowPriority(Integer isLowPriority) {
        this.isLowPriority = isLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.is_quick")
    public Integer getIsQuick() {
        return isQuick;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.is_quick")
    public void setIsQuick(Integer isQuick) {
        this.isQuick = isQuick;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.limit_oid")
    public Long getLimitOid() {
        return limitOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.limit_oid")
    public void setLimitOid(Long limitOid) {
        this.limitOid = limitOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.order_by_oid")
    public Long getOrderByOid() {
        return orderByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.order_by_oid")
    public void setOrderByOid(Long orderByOid) {
        this.orderByOid = orderByOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
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
        MySqlDeleteStatement other = (MySqlDeleteStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getForcePartitionOid() == null ? other.getForcePartitionOid() == null : this.getForcePartitionOid().equals(other.getForcePartitionOid()))
            && (this.getHintsSize() == null ? other.getHintsSize() == null : this.getHintsSize().equals(other.getHintsSize()))
            && (this.getIsForceAllPartitions() == null ? other.getIsForceAllPartitions() == null : this.getIsForceAllPartitions().equals(other.getIsForceAllPartitions()))
            && (this.getIsFulltextDictionary() == null ? other.getIsFulltextDictionary() == null : this.getIsFulltextDictionary().equals(other.getIsFulltextDictionary()))
            && (this.getIsIgnore() == null ? other.getIsIgnore() == null : this.getIsIgnore().equals(other.getIsIgnore()))
            && (this.getIsLowPriority() == null ? other.getIsLowPriority() == null : this.getIsLowPriority().equals(other.getIsLowPriority()))
            && (this.getIsQuick() == null ? other.getIsQuick() == null : this.getIsQuick().equals(other.getIsQuick()))
            && (this.getLimitOid() == null ? other.getLimitOid() == null : this.getLimitOid().equals(other.getLimitOid()))
            && (this.getOrderByOid() == null ? other.getOrderByOid() == null : this.getOrderByOid().equals(other.getOrderByOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getForcePartitionOid() == null) ? 0 : getForcePartitionOid().hashCode());
        result = prime * result + ((getHintsSize() == null) ? 0 : getHintsSize().hashCode());
        result = prime * result + ((getIsForceAllPartitions() == null) ? 0 : getIsForceAllPartitions().hashCode());
        result = prime * result + ((getIsFulltextDictionary() == null) ? 0 : getIsFulltextDictionary().hashCode());
        result = prime * result + ((getIsIgnore() == null) ? 0 : getIsIgnore().hashCode());
        result = prime * result + ((getIsLowPriority() == null) ? 0 : getIsLowPriority().hashCode());
        result = prime * result + ((getIsQuick() == null) ? 0 : getIsQuick().hashCode());
        result = prime * result + ((getLimitOid() == null) ? 0 : getLimitOid().hashCode());
        result = prime * result + ((getOrderByOid() == null) ? 0 : getOrderByOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", forcePartitionOid=").append(forcePartitionOid);
        sb.append(", hintsSize=").append(hintsSize);
        sb.append(", isForceAllPartitions=").append(isForceAllPartitions);
        sb.append(", isFulltextDictionary=").append(isFulltextDictionary);
        sb.append(", isIgnore=").append(isIgnore);
        sb.append(", isLowPriority=").append(isLowPriority);
        sb.append(", isQuick=").append(isQuick);
        sb.append(", limitOid=").append(limitOid);
        sb.append(", orderByOid=").append(orderByOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}