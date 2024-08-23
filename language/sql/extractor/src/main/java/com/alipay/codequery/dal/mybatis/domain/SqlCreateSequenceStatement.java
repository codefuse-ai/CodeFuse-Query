package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlCreateSequenceStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.cache")
    private Integer cache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.cache_value_oid")
    private Long cacheValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.cycle")
    private Integer cycle;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.increment_by_oid")
    private Long incrementByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.is_group")
    private Integer isGroup;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.is_no_max_value")
    private Integer isNoMaxValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.is_no_min_value")
    private Integer isNoMinValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.is_simple")
    private Integer isSimple;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.is_time")
    private Integer isTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.max_value_oid")
    private Long maxValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.min_value_oid")
    private Long minValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.order")
    private Integer order;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.schema")
    private String schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.start_with_oid")
    private Long startWithOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.step_oid")
    private Long stepOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.unit_count_oid")
    private Long unitCountOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.unit_index_oid")
    private Long unitIndexOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.with_cache")
    private Integer withCache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    public SqlCreateSequenceStatement(Long oid, Integer cache, Long cacheValueOid, Integer cycle, Long incrementByOid, Integer isGroup, Integer isNoMaxValue, Integer isNoMinValue, Integer isSimple, Integer isTime, Long maxValueOid, Long minValueOid, Long nameOid, Integer order, String schema, Long startWithOid, Long stepOid, Long unitCountOid, Long unitIndexOid, Integer withCache) {
        this.oid = oid;
        this.cache = cache;
        this.cacheValueOid = cacheValueOid;
        this.cycle = cycle;
        this.incrementByOid = incrementByOid;
        this.isGroup = isGroup;
        this.isNoMaxValue = isNoMaxValue;
        this.isNoMinValue = isNoMinValue;
        this.isSimple = isSimple;
        this.isTime = isTime;
        this.maxValueOid = maxValueOid;
        this.minValueOid = minValueOid;
        this.nameOid = nameOid;
        this.order = order;
        this.schema = schema;
        this.startWithOid = startWithOid;
        this.stepOid = stepOid;
        this.unitCountOid = unitCountOid;
        this.unitIndexOid = unitIndexOid;
        this.withCache = withCache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    public SqlCreateSequenceStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.cache")
    public Integer getCache() {
        return cache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.cache")
    public void setCache(Integer cache) {
        this.cache = cache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.cache_value_oid")
    public Long getCacheValueOid() {
        return cacheValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.cache_value_oid")
    public void setCacheValueOid(Long cacheValueOid) {
        this.cacheValueOid = cacheValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.cycle")
    public Integer getCycle() {
        return cycle;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.cycle")
    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.increment_by_oid")
    public Long getIncrementByOid() {
        return incrementByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.increment_by_oid")
    public void setIncrementByOid(Long incrementByOid) {
        this.incrementByOid = incrementByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.is_group")
    public Integer getIsGroup() {
        return isGroup;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.is_group")
    public void setIsGroup(Integer isGroup) {
        this.isGroup = isGroup;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.is_no_max_value")
    public Integer getIsNoMaxValue() {
        return isNoMaxValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.is_no_max_value")
    public void setIsNoMaxValue(Integer isNoMaxValue) {
        this.isNoMaxValue = isNoMaxValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.is_no_min_value")
    public Integer getIsNoMinValue() {
        return isNoMinValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.is_no_min_value")
    public void setIsNoMinValue(Integer isNoMinValue) {
        this.isNoMinValue = isNoMinValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.is_simple")
    public Integer getIsSimple() {
        return isSimple;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.is_simple")
    public void setIsSimple(Integer isSimple) {
        this.isSimple = isSimple;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.is_time")
    public Integer getIsTime() {
        return isTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.is_time")
    public void setIsTime(Integer isTime) {
        this.isTime = isTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.max_value_oid")
    public Long getMaxValueOid() {
        return maxValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.max_value_oid")
    public void setMaxValueOid(Long maxValueOid) {
        this.maxValueOid = maxValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.min_value_oid")
    public Long getMinValueOid() {
        return minValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.min_value_oid")
    public void setMinValueOid(Long minValueOid) {
        this.minValueOid = minValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.order")
    public Integer getOrder() {
        return order;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.schema")
    public String getSchema() {
        return schema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.schema")
    public void setSchema(String schema) {
        this.schema = schema == null ? null : schema.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.start_with_oid")
    public Long getStartWithOid() {
        return startWithOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.start_with_oid")
    public void setStartWithOid(Long startWithOid) {
        this.startWithOid = startWithOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.step_oid")
    public Long getStepOid() {
        return stepOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.step_oid")
    public void setStepOid(Long stepOid) {
        this.stepOid = stepOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.unit_count_oid")
    public Long getUnitCountOid() {
        return unitCountOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.unit_count_oid")
    public void setUnitCountOid(Long unitCountOid) {
        this.unitCountOid = unitCountOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.unit_index_oid")
    public Long getUnitIndexOid() {
        return unitIndexOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.unit_index_oid")
    public void setUnitIndexOid(Long unitIndexOid) {
        this.unitIndexOid = unitIndexOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.with_cache")
    public Integer getWithCache() {
        return withCache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.with_cache")
    public void setWithCache(Integer withCache) {
        this.withCache = withCache;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
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
        SqlCreateSequenceStatement other = (SqlCreateSequenceStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCache() == null ? other.getCache() == null : this.getCache().equals(other.getCache()))
            && (this.getCacheValueOid() == null ? other.getCacheValueOid() == null : this.getCacheValueOid().equals(other.getCacheValueOid()))
            && (this.getCycle() == null ? other.getCycle() == null : this.getCycle().equals(other.getCycle()))
            && (this.getIncrementByOid() == null ? other.getIncrementByOid() == null : this.getIncrementByOid().equals(other.getIncrementByOid()))
            && (this.getIsGroup() == null ? other.getIsGroup() == null : this.getIsGroup().equals(other.getIsGroup()))
            && (this.getIsNoMaxValue() == null ? other.getIsNoMaxValue() == null : this.getIsNoMaxValue().equals(other.getIsNoMaxValue()))
            && (this.getIsNoMinValue() == null ? other.getIsNoMinValue() == null : this.getIsNoMinValue().equals(other.getIsNoMinValue()))
            && (this.getIsSimple() == null ? other.getIsSimple() == null : this.getIsSimple().equals(other.getIsSimple()))
            && (this.getIsTime() == null ? other.getIsTime() == null : this.getIsTime().equals(other.getIsTime()))
            && (this.getMaxValueOid() == null ? other.getMaxValueOid() == null : this.getMaxValueOid().equals(other.getMaxValueOid()))
            && (this.getMinValueOid() == null ? other.getMinValueOid() == null : this.getMinValueOid().equals(other.getMinValueOid()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getOrder() == null ? other.getOrder() == null : this.getOrder().equals(other.getOrder()))
            && (this.getSchema() == null ? other.getSchema() == null : this.getSchema().equals(other.getSchema()))
            && (this.getStartWithOid() == null ? other.getStartWithOid() == null : this.getStartWithOid().equals(other.getStartWithOid()))
            && (this.getStepOid() == null ? other.getStepOid() == null : this.getStepOid().equals(other.getStepOid()))
            && (this.getUnitCountOid() == null ? other.getUnitCountOid() == null : this.getUnitCountOid().equals(other.getUnitCountOid()))
            && (this.getUnitIndexOid() == null ? other.getUnitIndexOid() == null : this.getUnitIndexOid().equals(other.getUnitIndexOid()))
            && (this.getWithCache() == null ? other.getWithCache() == null : this.getWithCache().equals(other.getWithCache()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCache() == null) ? 0 : getCache().hashCode());
        result = prime * result + ((getCacheValueOid() == null) ? 0 : getCacheValueOid().hashCode());
        result = prime * result + ((getCycle() == null) ? 0 : getCycle().hashCode());
        result = prime * result + ((getIncrementByOid() == null) ? 0 : getIncrementByOid().hashCode());
        result = prime * result + ((getIsGroup() == null) ? 0 : getIsGroup().hashCode());
        result = prime * result + ((getIsNoMaxValue() == null) ? 0 : getIsNoMaxValue().hashCode());
        result = prime * result + ((getIsNoMinValue() == null) ? 0 : getIsNoMinValue().hashCode());
        result = prime * result + ((getIsSimple() == null) ? 0 : getIsSimple().hashCode());
        result = prime * result + ((getIsTime() == null) ? 0 : getIsTime().hashCode());
        result = prime * result + ((getMaxValueOid() == null) ? 0 : getMaxValueOid().hashCode());
        result = prime * result + ((getMinValueOid() == null) ? 0 : getMinValueOid().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getOrder() == null) ? 0 : getOrder().hashCode());
        result = prime * result + ((getSchema() == null) ? 0 : getSchema().hashCode());
        result = prime * result + ((getStartWithOid() == null) ? 0 : getStartWithOid().hashCode());
        result = prime * result + ((getStepOid() == null) ? 0 : getStepOid().hashCode());
        result = prime * result + ((getUnitCountOid() == null) ? 0 : getUnitCountOid().hashCode());
        result = prime * result + ((getUnitIndexOid() == null) ? 0 : getUnitIndexOid().hashCode());
        result = prime * result + ((getWithCache() == null) ? 0 : getWithCache().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
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
        sb.append(", isGroup=").append(isGroup);
        sb.append(", isNoMaxValue=").append(isNoMaxValue);
        sb.append(", isNoMinValue=").append(isNoMinValue);
        sb.append(", isSimple=").append(isSimple);
        sb.append(", isTime=").append(isTime);
        sb.append(", maxValueOid=").append(maxValueOid);
        sb.append(", minValueOid=").append(minValueOid);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", order=").append(order);
        sb.append(", schema=").append(schema);
        sb.append(", startWithOid=").append(startWithOid);
        sb.append(", stepOid=").append(stepOid);
        sb.append(", unitCountOid=").append(unitCountOid);
        sb.append(", unitIndexOid=").append(unitIndexOid);
        sb.append(", withCache=").append(withCache);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}