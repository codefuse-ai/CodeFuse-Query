package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlAlterSequenceStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.cache")
    private Integer cache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.cache_value_oid")
    private Long cacheValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.cycle")
    private Integer cycle;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.increment_by_oid")
    private Long incrementByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_change_to_group")
    private Integer isChangeToGroup;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_change_to_simple")
    private Integer isChangeToSimple;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_change_to_time")
    private Integer isChangeToTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_no_max_value")
    private Integer isNoMaxValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_no_min_value")
    private Integer isNoMinValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_restart")
    private Integer isRestart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.max_value_oid")
    private Long maxValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.min_value_oid")
    private Long minValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.order")
    private Integer order;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.restart_with_oid")
    private Long restartWithOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.schema")
    private String schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.start_with_oid")
    private Long startWithOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.with_cache")
    private Integer withCache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    public SqlAlterSequenceStatement(Long oid, Integer cache, Long cacheValueOid, Integer cycle, Long incrementByOid, Integer isChangeToGroup, Integer isChangeToSimple, Integer isChangeToTime, Integer isNoMaxValue, Integer isNoMinValue, Integer isRestart, Long maxValueOid, Long minValueOid, Long nameOid, Integer order, Long restartWithOid, String schema, Long startWithOid, Integer withCache) {
        this.oid = oid;
        this.cache = cache;
        this.cacheValueOid = cacheValueOid;
        this.cycle = cycle;
        this.incrementByOid = incrementByOid;
        this.isChangeToGroup = isChangeToGroup;
        this.isChangeToSimple = isChangeToSimple;
        this.isChangeToTime = isChangeToTime;
        this.isNoMaxValue = isNoMaxValue;
        this.isNoMinValue = isNoMinValue;
        this.isRestart = isRestart;
        this.maxValueOid = maxValueOid;
        this.minValueOid = minValueOid;
        this.nameOid = nameOid;
        this.order = order;
        this.restartWithOid = restartWithOid;
        this.schema = schema;
        this.startWithOid = startWithOid;
        this.withCache = withCache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    public SqlAlterSequenceStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.cache")
    public Integer getCache() {
        return cache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.cache")
    public void setCache(Integer cache) {
        this.cache = cache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.cache_value_oid")
    public Long getCacheValueOid() {
        return cacheValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.cache_value_oid")
    public void setCacheValueOid(Long cacheValueOid) {
        this.cacheValueOid = cacheValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.cycle")
    public Integer getCycle() {
        return cycle;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.cycle")
    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.increment_by_oid")
    public Long getIncrementByOid() {
        return incrementByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.increment_by_oid")
    public void setIncrementByOid(Long incrementByOid) {
        this.incrementByOid = incrementByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_change_to_group")
    public Integer getIsChangeToGroup() {
        return isChangeToGroup;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_change_to_group")
    public void setIsChangeToGroup(Integer isChangeToGroup) {
        this.isChangeToGroup = isChangeToGroup;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_change_to_simple")
    public Integer getIsChangeToSimple() {
        return isChangeToSimple;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_change_to_simple")
    public void setIsChangeToSimple(Integer isChangeToSimple) {
        this.isChangeToSimple = isChangeToSimple;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_change_to_time")
    public Integer getIsChangeToTime() {
        return isChangeToTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_change_to_time")
    public void setIsChangeToTime(Integer isChangeToTime) {
        this.isChangeToTime = isChangeToTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_no_max_value")
    public Integer getIsNoMaxValue() {
        return isNoMaxValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_no_max_value")
    public void setIsNoMaxValue(Integer isNoMaxValue) {
        this.isNoMaxValue = isNoMaxValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_no_min_value")
    public Integer getIsNoMinValue() {
        return isNoMinValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_no_min_value")
    public void setIsNoMinValue(Integer isNoMinValue) {
        this.isNoMinValue = isNoMinValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_restart")
    public Integer getIsRestart() {
        return isRestart;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_restart")
    public void setIsRestart(Integer isRestart) {
        this.isRestart = isRestart;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.max_value_oid")
    public Long getMaxValueOid() {
        return maxValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.max_value_oid")
    public void setMaxValueOid(Long maxValueOid) {
        this.maxValueOid = maxValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.min_value_oid")
    public Long getMinValueOid() {
        return minValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.min_value_oid")
    public void setMinValueOid(Long minValueOid) {
        this.minValueOid = minValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.order")
    public Integer getOrder() {
        return order;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.restart_with_oid")
    public Long getRestartWithOid() {
        return restartWithOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.restart_with_oid")
    public void setRestartWithOid(Long restartWithOid) {
        this.restartWithOid = restartWithOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.schema")
    public String getSchema() {
        return schema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.schema")
    public void setSchema(String schema) {
        this.schema = schema == null ? null : schema.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.start_with_oid")
    public Long getStartWithOid() {
        return startWithOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.start_with_oid")
    public void setStartWithOid(Long startWithOid) {
        this.startWithOid = startWithOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.with_cache")
    public Integer getWithCache() {
        return withCache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.with_cache")
    public void setWithCache(Integer withCache) {
        this.withCache = withCache;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
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
        SqlAlterSequenceStatement other = (SqlAlterSequenceStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCache() == null ? other.getCache() == null : this.getCache().equals(other.getCache()))
            && (this.getCacheValueOid() == null ? other.getCacheValueOid() == null : this.getCacheValueOid().equals(other.getCacheValueOid()))
            && (this.getCycle() == null ? other.getCycle() == null : this.getCycle().equals(other.getCycle()))
            && (this.getIncrementByOid() == null ? other.getIncrementByOid() == null : this.getIncrementByOid().equals(other.getIncrementByOid()))
            && (this.getIsChangeToGroup() == null ? other.getIsChangeToGroup() == null : this.getIsChangeToGroup().equals(other.getIsChangeToGroup()))
            && (this.getIsChangeToSimple() == null ? other.getIsChangeToSimple() == null : this.getIsChangeToSimple().equals(other.getIsChangeToSimple()))
            && (this.getIsChangeToTime() == null ? other.getIsChangeToTime() == null : this.getIsChangeToTime().equals(other.getIsChangeToTime()))
            && (this.getIsNoMaxValue() == null ? other.getIsNoMaxValue() == null : this.getIsNoMaxValue().equals(other.getIsNoMaxValue()))
            && (this.getIsNoMinValue() == null ? other.getIsNoMinValue() == null : this.getIsNoMinValue().equals(other.getIsNoMinValue()))
            && (this.getIsRestart() == null ? other.getIsRestart() == null : this.getIsRestart().equals(other.getIsRestart()))
            && (this.getMaxValueOid() == null ? other.getMaxValueOid() == null : this.getMaxValueOid().equals(other.getMaxValueOid()))
            && (this.getMinValueOid() == null ? other.getMinValueOid() == null : this.getMinValueOid().equals(other.getMinValueOid()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getOrder() == null ? other.getOrder() == null : this.getOrder().equals(other.getOrder()))
            && (this.getRestartWithOid() == null ? other.getRestartWithOid() == null : this.getRestartWithOid().equals(other.getRestartWithOid()))
            && (this.getSchema() == null ? other.getSchema() == null : this.getSchema().equals(other.getSchema()))
            && (this.getStartWithOid() == null ? other.getStartWithOid() == null : this.getStartWithOid().equals(other.getStartWithOid()))
            && (this.getWithCache() == null ? other.getWithCache() == null : this.getWithCache().equals(other.getWithCache()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCache() == null) ? 0 : getCache().hashCode());
        result = prime * result + ((getCacheValueOid() == null) ? 0 : getCacheValueOid().hashCode());
        result = prime * result + ((getCycle() == null) ? 0 : getCycle().hashCode());
        result = prime * result + ((getIncrementByOid() == null) ? 0 : getIncrementByOid().hashCode());
        result = prime * result + ((getIsChangeToGroup() == null) ? 0 : getIsChangeToGroup().hashCode());
        result = prime * result + ((getIsChangeToSimple() == null) ? 0 : getIsChangeToSimple().hashCode());
        result = prime * result + ((getIsChangeToTime() == null) ? 0 : getIsChangeToTime().hashCode());
        result = prime * result + ((getIsNoMaxValue() == null) ? 0 : getIsNoMaxValue().hashCode());
        result = prime * result + ((getIsNoMinValue() == null) ? 0 : getIsNoMinValue().hashCode());
        result = prime * result + ((getIsRestart() == null) ? 0 : getIsRestart().hashCode());
        result = prime * result + ((getMaxValueOid() == null) ? 0 : getMaxValueOid().hashCode());
        result = prime * result + ((getMinValueOid() == null) ? 0 : getMinValueOid().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getOrder() == null) ? 0 : getOrder().hashCode());
        result = prime * result + ((getRestartWithOid() == null) ? 0 : getRestartWithOid().hashCode());
        result = prime * result + ((getSchema() == null) ? 0 : getSchema().hashCode());
        result = prime * result + ((getStartWithOid() == null) ? 0 : getStartWithOid().hashCode());
        result = prime * result + ((getWithCache() == null) ? 0 : getWithCache().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", cache=").append(cache);
        sb.append(", cacheValueOid=").append(cacheValueOid);
        sb.append(", cycle=").append(cycle);
        sb.append(", incrementByOid=").append(incrementByOid);
        sb.append(", isChangeToGroup=").append(isChangeToGroup);
        sb.append(", isChangeToSimple=").append(isChangeToSimple);
        sb.append(", isChangeToTime=").append(isChangeToTime);
        sb.append(", isNoMaxValue=").append(isNoMaxValue);
        sb.append(", isNoMinValue=").append(isNoMinValue);
        sb.append(", isRestart=").append(isRestart);
        sb.append(", maxValueOid=").append(maxValueOid);
        sb.append(", minValueOid=").append(minValueOid);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", order=").append(order);
        sb.append(", restartWithOid=").append(restartWithOid);
        sb.append(", schema=").append(schema);
        sb.append(", startWithOid=").append(startWithOid);
        sb.append(", withCache=").append(withCache);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}