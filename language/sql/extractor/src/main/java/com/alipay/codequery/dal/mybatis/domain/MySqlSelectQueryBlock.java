package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlSelectQueryBlock implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.cache")
    private Integer cache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.force_partition_oid")
    private Long forcePartitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.hints_size")
    private Integer hintsSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_big_result")
    private Integer isBigResult;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_buffer_result")
    private Integer isBufferResult;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_calc_found_rows")
    private Integer isCalcFoundRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_hign_priority")
    private Integer isHignPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_lock_in_share_mode")
    private Integer isLockInShareMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_small_result")
    private Integer isSmallResult;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_straight_join")
    private Integer isStraightJoin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.procedure_name_oid")
    private Long procedureNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    public MySqlSelectQueryBlock(Long oid, Integer cache, Long forcePartitionOid, Integer hintsSize, Integer isBigResult, Integer isBufferResult, Integer isCalcFoundRows, Integer isHignPriority, Integer isLockInShareMode, Integer isSmallResult, Integer isStraightJoin, Long procedureNameOid) {
        this.oid = oid;
        this.cache = cache;
        this.forcePartitionOid = forcePartitionOid;
        this.hintsSize = hintsSize;
        this.isBigResult = isBigResult;
        this.isBufferResult = isBufferResult;
        this.isCalcFoundRows = isCalcFoundRows;
        this.isHignPriority = isHignPriority;
        this.isLockInShareMode = isLockInShareMode;
        this.isSmallResult = isSmallResult;
        this.isStraightJoin = isStraightJoin;
        this.procedureNameOid = procedureNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    public MySqlSelectQueryBlock() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.cache")
    public Integer getCache() {
        return cache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.cache")
    public void setCache(Integer cache) {
        this.cache = cache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.force_partition_oid")
    public Long getForcePartitionOid() {
        return forcePartitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.force_partition_oid")
    public void setForcePartitionOid(Long forcePartitionOid) {
        this.forcePartitionOid = forcePartitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.hints_size")
    public Integer getHintsSize() {
        return hintsSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.hints_size")
    public void setHintsSize(Integer hintsSize) {
        this.hintsSize = hintsSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_big_result")
    public Integer getIsBigResult() {
        return isBigResult;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_big_result")
    public void setIsBigResult(Integer isBigResult) {
        this.isBigResult = isBigResult;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_buffer_result")
    public Integer getIsBufferResult() {
        return isBufferResult;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_buffer_result")
    public void setIsBufferResult(Integer isBufferResult) {
        this.isBufferResult = isBufferResult;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_calc_found_rows")
    public Integer getIsCalcFoundRows() {
        return isCalcFoundRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_calc_found_rows")
    public void setIsCalcFoundRows(Integer isCalcFoundRows) {
        this.isCalcFoundRows = isCalcFoundRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_hign_priority")
    public Integer getIsHignPriority() {
        return isHignPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_hign_priority")
    public void setIsHignPriority(Integer isHignPriority) {
        this.isHignPriority = isHignPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_lock_in_share_mode")
    public Integer getIsLockInShareMode() {
        return isLockInShareMode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_lock_in_share_mode")
    public void setIsLockInShareMode(Integer isLockInShareMode) {
        this.isLockInShareMode = isLockInShareMode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_small_result")
    public Integer getIsSmallResult() {
        return isSmallResult;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_small_result")
    public void setIsSmallResult(Integer isSmallResult) {
        this.isSmallResult = isSmallResult;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_straight_join")
    public Integer getIsStraightJoin() {
        return isStraightJoin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_straight_join")
    public void setIsStraightJoin(Integer isStraightJoin) {
        this.isStraightJoin = isStraightJoin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.procedure_name_oid")
    public Long getProcedureNameOid() {
        return procedureNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.procedure_name_oid")
    public void setProcedureNameOid(Long procedureNameOid) {
        this.procedureNameOid = procedureNameOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
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
        MySqlSelectQueryBlock other = (MySqlSelectQueryBlock) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCache() == null ? other.getCache() == null : this.getCache().equals(other.getCache()))
            && (this.getForcePartitionOid() == null ? other.getForcePartitionOid() == null : this.getForcePartitionOid().equals(other.getForcePartitionOid()))
            && (this.getHintsSize() == null ? other.getHintsSize() == null : this.getHintsSize().equals(other.getHintsSize()))
            && (this.getIsBigResult() == null ? other.getIsBigResult() == null : this.getIsBigResult().equals(other.getIsBigResult()))
            && (this.getIsBufferResult() == null ? other.getIsBufferResult() == null : this.getIsBufferResult().equals(other.getIsBufferResult()))
            && (this.getIsCalcFoundRows() == null ? other.getIsCalcFoundRows() == null : this.getIsCalcFoundRows().equals(other.getIsCalcFoundRows()))
            && (this.getIsHignPriority() == null ? other.getIsHignPriority() == null : this.getIsHignPriority().equals(other.getIsHignPriority()))
            && (this.getIsLockInShareMode() == null ? other.getIsLockInShareMode() == null : this.getIsLockInShareMode().equals(other.getIsLockInShareMode()))
            && (this.getIsSmallResult() == null ? other.getIsSmallResult() == null : this.getIsSmallResult().equals(other.getIsSmallResult()))
            && (this.getIsStraightJoin() == null ? other.getIsStraightJoin() == null : this.getIsStraightJoin().equals(other.getIsStraightJoin()))
            && (this.getProcedureNameOid() == null ? other.getProcedureNameOid() == null : this.getProcedureNameOid().equals(other.getProcedureNameOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCache() == null) ? 0 : getCache().hashCode());
        result = prime * result + ((getForcePartitionOid() == null) ? 0 : getForcePartitionOid().hashCode());
        result = prime * result + ((getHintsSize() == null) ? 0 : getHintsSize().hashCode());
        result = prime * result + ((getIsBigResult() == null) ? 0 : getIsBigResult().hashCode());
        result = prime * result + ((getIsBufferResult() == null) ? 0 : getIsBufferResult().hashCode());
        result = prime * result + ((getIsCalcFoundRows() == null) ? 0 : getIsCalcFoundRows().hashCode());
        result = prime * result + ((getIsHignPriority() == null) ? 0 : getIsHignPriority().hashCode());
        result = prime * result + ((getIsLockInShareMode() == null) ? 0 : getIsLockInShareMode().hashCode());
        result = prime * result + ((getIsSmallResult() == null) ? 0 : getIsSmallResult().hashCode());
        result = prime * result + ((getIsStraightJoin() == null) ? 0 : getIsStraightJoin().hashCode());
        result = prime * result + ((getProcedureNameOid() == null) ? 0 : getProcedureNameOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", cache=").append(cache);
        sb.append(", forcePartitionOid=").append(forcePartitionOid);
        sb.append(", hintsSize=").append(hintsSize);
        sb.append(", isBigResult=").append(isBigResult);
        sb.append(", isBufferResult=").append(isBufferResult);
        sb.append(", isCalcFoundRows=").append(isCalcFoundRows);
        sb.append(", isHignPriority=").append(isHignPriority);
        sb.append(", isLockInShareMode=").append(isLockInShareMode);
        sb.append(", isSmallResult=").append(isSmallResult);
        sb.append(", isStraightJoin=").append(isStraightJoin);
        sb.append(", procedureNameOid=").append(procedureNameOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}