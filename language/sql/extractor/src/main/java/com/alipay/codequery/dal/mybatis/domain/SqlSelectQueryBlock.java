package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlSelectQueryBlock implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.cached_select_list")
    private String cachedSelectList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.cached_select_list_hash")
    private String cachedSelectListHash;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.connect_by_oid")
    private Long connectByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.distion_option")
    private Integer distionOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.first_oid")
    private Long firstOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.for_update_of_size")
    private Integer forUpdateOfSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.from_oid")
    private Long fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.group_by_oid")
    private Long groupByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.hints_size")
    private Integer hintsSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.into_oid")
    private Long intoOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_distinct")
    private Integer isDistinct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_for_share")
    private Integer isForShare;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_for_update")
    private Integer isForUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_no_cycle")
    private Integer isNoCycle;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_no_wait")
    private Integer isNoWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_prior")
    private Integer isPrior;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_skip_locked")
    private Integer isSkipLocked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.limit_oid")
    private Long limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.offset_oid")
    private Long offsetOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.order_by_oid")
    private Long orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.order_by_siblings_oid")
    private Long orderBySiblingsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.start_with_oid")
    private Long startWithOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.wait_time_oid")
    private Long waitTimeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.where_oid")
    private Long whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    public SqlSelectQueryBlock(Long oid, String cachedSelectList, String cachedSelectListHash, Long connectByOid, Integer distionOption, Long firstOid, Integer forUpdateOfSize, Long fromOid, Long groupByOid, Integer hintsSize, Long intoOid, Integer isDistinct, Integer isForShare, Integer isForUpdate, Integer isNoCycle, Integer isNoWait, Integer isPrior, Integer isSkipLocked, Long limitOid, Long offsetOid, Long orderByOid, Long orderBySiblingsOid, Long startWithOid, Long waitTimeOid, Long whereOid) {
        this.oid = oid;
        this.cachedSelectList = cachedSelectList;
        this.cachedSelectListHash = cachedSelectListHash;
        this.connectByOid = connectByOid;
        this.distionOption = distionOption;
        this.firstOid = firstOid;
        this.forUpdateOfSize = forUpdateOfSize;
        this.fromOid = fromOid;
        this.groupByOid = groupByOid;
        this.hintsSize = hintsSize;
        this.intoOid = intoOid;
        this.isDistinct = isDistinct;
        this.isForShare = isForShare;
        this.isForUpdate = isForUpdate;
        this.isNoCycle = isNoCycle;
        this.isNoWait = isNoWait;
        this.isPrior = isPrior;
        this.isSkipLocked = isSkipLocked;
        this.limitOid = limitOid;
        this.offsetOid = offsetOid;
        this.orderByOid = orderByOid;
        this.orderBySiblingsOid = orderBySiblingsOid;
        this.startWithOid = startWithOid;
        this.waitTimeOid = waitTimeOid;
        this.whereOid = whereOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    public SqlSelectQueryBlock() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.cached_select_list")
    public String getCachedSelectList() {
        return cachedSelectList;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.cached_select_list")
    public void setCachedSelectList(String cachedSelectList) {
        this.cachedSelectList = cachedSelectList == null ? null : cachedSelectList.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.cached_select_list_hash")
    public String getCachedSelectListHash() {
        return cachedSelectListHash;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.cached_select_list_hash")
    public void setCachedSelectListHash(String cachedSelectListHash) {
        this.cachedSelectListHash = cachedSelectListHash == null ? null : cachedSelectListHash.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.connect_by_oid")
    public Long getConnectByOid() {
        return connectByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.connect_by_oid")
    public void setConnectByOid(Long connectByOid) {
        this.connectByOid = connectByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.distion_option")
    public Integer getDistionOption() {
        return distionOption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.distion_option")
    public void setDistionOption(Integer distionOption) {
        this.distionOption = distionOption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.first_oid")
    public Long getFirstOid() {
        return firstOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.first_oid")
    public void setFirstOid(Long firstOid) {
        this.firstOid = firstOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.for_update_of_size")
    public Integer getForUpdateOfSize() {
        return forUpdateOfSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.for_update_of_size")
    public void setForUpdateOfSize(Integer forUpdateOfSize) {
        this.forUpdateOfSize = forUpdateOfSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.from_oid")
    public Long getFromOid() {
        return fromOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.from_oid")
    public void setFromOid(Long fromOid) {
        this.fromOid = fromOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.group_by_oid")
    public Long getGroupByOid() {
        return groupByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.group_by_oid")
    public void setGroupByOid(Long groupByOid) {
        this.groupByOid = groupByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.hints_size")
    public Integer getHintsSize() {
        return hintsSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.hints_size")
    public void setHintsSize(Integer hintsSize) {
        this.hintsSize = hintsSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.into_oid")
    public Long getIntoOid() {
        return intoOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.into_oid")
    public void setIntoOid(Long intoOid) {
        this.intoOid = intoOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_distinct")
    public Integer getIsDistinct() {
        return isDistinct;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_distinct")
    public void setIsDistinct(Integer isDistinct) {
        this.isDistinct = isDistinct;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_for_share")
    public Integer getIsForShare() {
        return isForShare;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_for_share")
    public void setIsForShare(Integer isForShare) {
        this.isForShare = isForShare;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_for_update")
    public Integer getIsForUpdate() {
        return isForUpdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_for_update")
    public void setIsForUpdate(Integer isForUpdate) {
        this.isForUpdate = isForUpdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_no_cycle")
    public Integer getIsNoCycle() {
        return isNoCycle;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_no_cycle")
    public void setIsNoCycle(Integer isNoCycle) {
        this.isNoCycle = isNoCycle;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_no_wait")
    public Integer getIsNoWait() {
        return isNoWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_no_wait")
    public void setIsNoWait(Integer isNoWait) {
        this.isNoWait = isNoWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_prior")
    public Integer getIsPrior() {
        return isPrior;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_prior")
    public void setIsPrior(Integer isPrior) {
        this.isPrior = isPrior;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_skip_locked")
    public Integer getIsSkipLocked() {
        return isSkipLocked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_skip_locked")
    public void setIsSkipLocked(Integer isSkipLocked) {
        this.isSkipLocked = isSkipLocked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.limit_oid")
    public Long getLimitOid() {
        return limitOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.limit_oid")
    public void setLimitOid(Long limitOid) {
        this.limitOid = limitOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.offset_oid")
    public Long getOffsetOid() {
        return offsetOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.offset_oid")
    public void setOffsetOid(Long offsetOid) {
        this.offsetOid = offsetOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.order_by_oid")
    public Long getOrderByOid() {
        return orderByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.order_by_oid")
    public void setOrderByOid(Long orderByOid) {
        this.orderByOid = orderByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.order_by_siblings_oid")
    public Long getOrderBySiblingsOid() {
        return orderBySiblingsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.order_by_siblings_oid")
    public void setOrderBySiblingsOid(Long orderBySiblingsOid) {
        this.orderBySiblingsOid = orderBySiblingsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.start_with_oid")
    public Long getStartWithOid() {
        return startWithOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.start_with_oid")
    public void setStartWithOid(Long startWithOid) {
        this.startWithOid = startWithOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.wait_time_oid")
    public Long getWaitTimeOid() {
        return waitTimeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.wait_time_oid")
    public void setWaitTimeOid(Long waitTimeOid) {
        this.waitTimeOid = waitTimeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.where_oid")
    public Long getWhereOid() {
        return whereOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.where_oid")
    public void setWhereOid(Long whereOid) {
        this.whereOid = whereOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
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
        SqlSelectQueryBlock other = (SqlSelectQueryBlock) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCachedSelectList() == null ? other.getCachedSelectList() == null : this.getCachedSelectList().equals(other.getCachedSelectList()))
            && (this.getCachedSelectListHash() == null ? other.getCachedSelectListHash() == null : this.getCachedSelectListHash().equals(other.getCachedSelectListHash()))
            && (this.getConnectByOid() == null ? other.getConnectByOid() == null : this.getConnectByOid().equals(other.getConnectByOid()))
            && (this.getDistionOption() == null ? other.getDistionOption() == null : this.getDistionOption().equals(other.getDistionOption()))
            && (this.getFirstOid() == null ? other.getFirstOid() == null : this.getFirstOid().equals(other.getFirstOid()))
            && (this.getForUpdateOfSize() == null ? other.getForUpdateOfSize() == null : this.getForUpdateOfSize().equals(other.getForUpdateOfSize()))
            && (this.getFromOid() == null ? other.getFromOid() == null : this.getFromOid().equals(other.getFromOid()))
            && (this.getGroupByOid() == null ? other.getGroupByOid() == null : this.getGroupByOid().equals(other.getGroupByOid()))
            && (this.getHintsSize() == null ? other.getHintsSize() == null : this.getHintsSize().equals(other.getHintsSize()))
            && (this.getIntoOid() == null ? other.getIntoOid() == null : this.getIntoOid().equals(other.getIntoOid()))
            && (this.getIsDistinct() == null ? other.getIsDistinct() == null : this.getIsDistinct().equals(other.getIsDistinct()))
            && (this.getIsForShare() == null ? other.getIsForShare() == null : this.getIsForShare().equals(other.getIsForShare()))
            && (this.getIsForUpdate() == null ? other.getIsForUpdate() == null : this.getIsForUpdate().equals(other.getIsForUpdate()))
            && (this.getIsNoCycle() == null ? other.getIsNoCycle() == null : this.getIsNoCycle().equals(other.getIsNoCycle()))
            && (this.getIsNoWait() == null ? other.getIsNoWait() == null : this.getIsNoWait().equals(other.getIsNoWait()))
            && (this.getIsPrior() == null ? other.getIsPrior() == null : this.getIsPrior().equals(other.getIsPrior()))
            && (this.getIsSkipLocked() == null ? other.getIsSkipLocked() == null : this.getIsSkipLocked().equals(other.getIsSkipLocked()))
            && (this.getLimitOid() == null ? other.getLimitOid() == null : this.getLimitOid().equals(other.getLimitOid()))
            && (this.getOffsetOid() == null ? other.getOffsetOid() == null : this.getOffsetOid().equals(other.getOffsetOid()))
            && (this.getOrderByOid() == null ? other.getOrderByOid() == null : this.getOrderByOid().equals(other.getOrderByOid()))
            && (this.getOrderBySiblingsOid() == null ? other.getOrderBySiblingsOid() == null : this.getOrderBySiblingsOid().equals(other.getOrderBySiblingsOid()))
            && (this.getStartWithOid() == null ? other.getStartWithOid() == null : this.getStartWithOid().equals(other.getStartWithOid()))
            && (this.getWaitTimeOid() == null ? other.getWaitTimeOid() == null : this.getWaitTimeOid().equals(other.getWaitTimeOid()))
            && (this.getWhereOid() == null ? other.getWhereOid() == null : this.getWhereOid().equals(other.getWhereOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCachedSelectList() == null) ? 0 : getCachedSelectList().hashCode());
        result = prime * result + ((getCachedSelectListHash() == null) ? 0 : getCachedSelectListHash().hashCode());
        result = prime * result + ((getConnectByOid() == null) ? 0 : getConnectByOid().hashCode());
        result = prime * result + ((getDistionOption() == null) ? 0 : getDistionOption().hashCode());
        result = prime * result + ((getFirstOid() == null) ? 0 : getFirstOid().hashCode());
        result = prime * result + ((getForUpdateOfSize() == null) ? 0 : getForUpdateOfSize().hashCode());
        result = prime * result + ((getFromOid() == null) ? 0 : getFromOid().hashCode());
        result = prime * result + ((getGroupByOid() == null) ? 0 : getGroupByOid().hashCode());
        result = prime * result + ((getHintsSize() == null) ? 0 : getHintsSize().hashCode());
        result = prime * result + ((getIntoOid() == null) ? 0 : getIntoOid().hashCode());
        result = prime * result + ((getIsDistinct() == null) ? 0 : getIsDistinct().hashCode());
        result = prime * result + ((getIsForShare() == null) ? 0 : getIsForShare().hashCode());
        result = prime * result + ((getIsForUpdate() == null) ? 0 : getIsForUpdate().hashCode());
        result = prime * result + ((getIsNoCycle() == null) ? 0 : getIsNoCycle().hashCode());
        result = prime * result + ((getIsNoWait() == null) ? 0 : getIsNoWait().hashCode());
        result = prime * result + ((getIsPrior() == null) ? 0 : getIsPrior().hashCode());
        result = prime * result + ((getIsSkipLocked() == null) ? 0 : getIsSkipLocked().hashCode());
        result = prime * result + ((getLimitOid() == null) ? 0 : getLimitOid().hashCode());
        result = prime * result + ((getOffsetOid() == null) ? 0 : getOffsetOid().hashCode());
        result = prime * result + ((getOrderByOid() == null) ? 0 : getOrderByOid().hashCode());
        result = prime * result + ((getOrderBySiblingsOid() == null) ? 0 : getOrderBySiblingsOid().hashCode());
        result = prime * result + ((getStartWithOid() == null) ? 0 : getStartWithOid().hashCode());
        result = prime * result + ((getWaitTimeOid() == null) ? 0 : getWaitTimeOid().hashCode());
        result = prime * result + ((getWhereOid() == null) ? 0 : getWhereOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", cachedSelectList=").append(cachedSelectList);
        sb.append(", cachedSelectListHash=").append(cachedSelectListHash);
        sb.append(", connectByOid=").append(connectByOid);
        sb.append(", distionOption=").append(distionOption);
        sb.append(", firstOid=").append(firstOid);
        sb.append(", forUpdateOfSize=").append(forUpdateOfSize);
        sb.append(", fromOid=").append(fromOid);
        sb.append(", groupByOid=").append(groupByOid);
        sb.append(", hintsSize=").append(hintsSize);
        sb.append(", intoOid=").append(intoOid);
        sb.append(", isDistinct=").append(isDistinct);
        sb.append(", isForShare=").append(isForShare);
        sb.append(", isForUpdate=").append(isForUpdate);
        sb.append(", isNoCycle=").append(isNoCycle);
        sb.append(", isNoWait=").append(isNoWait);
        sb.append(", isPrior=").append(isPrior);
        sb.append(", isSkipLocked=").append(isSkipLocked);
        sb.append(", limitOid=").append(limitOid);
        sb.append(", offsetOid=").append(offsetOid);
        sb.append(", orderByOid=").append(orderByOid);
        sb.append(", orderBySiblingsOid=").append(orderBySiblingsOid);
        sb.append(", startWithOid=").append(startWithOid);
        sb.append(", waitTimeOid=").append(waitTimeOid);
        sb.append(", whereOid=").append(whereOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}