package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlOver implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.cluster_by_oid")
    private Long clusterByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.distribute_by_oid")
    private Long distributeByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.is_exclude_current_row")
    private Integer isExcludeCurrentRow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.is_windowing_between_end_following")
    private Integer isWindowingBetweenEndFollowing;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.is_windowing_between_end_preceding")
    private Integer isWindowingBetweenEndPreceding;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.is_windowing_preceding")
    private Integer isWindowingPreceding;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.of_oid")
    private Long ofOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.order_by_oid")
    private Long orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.sort_by_oid")
    private Long sortByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.windowing_between_begin_oid")
    private Long windowingBetweenBeginOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.windowing_between_begin_bound")
    private String windowingBetweenBeginBound;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.windowing_between_end_oid")
    private Long windowingBetweenEndOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.windowing_between_end_bound")
    private String windowingBetweenEndBound;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.windowing_type")
    private String windowingType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    public SqlOver(Long oid, Long clusterByOid, Long distributeByOid, Integer isExcludeCurrentRow, Integer isWindowingBetweenEndFollowing, Integer isWindowingBetweenEndPreceding, Integer isWindowingPreceding, Long ofOid, Long orderByOid, Long sortByOid, Long windowingBetweenBeginOid, String windowingBetweenBeginBound, Long windowingBetweenEndOid, String windowingBetweenEndBound, String windowingType) {
        this.oid = oid;
        this.clusterByOid = clusterByOid;
        this.distributeByOid = distributeByOid;
        this.isExcludeCurrentRow = isExcludeCurrentRow;
        this.isWindowingBetweenEndFollowing = isWindowingBetweenEndFollowing;
        this.isWindowingBetweenEndPreceding = isWindowingBetweenEndPreceding;
        this.isWindowingPreceding = isWindowingPreceding;
        this.ofOid = ofOid;
        this.orderByOid = orderByOid;
        this.sortByOid = sortByOid;
        this.windowingBetweenBeginOid = windowingBetweenBeginOid;
        this.windowingBetweenBeginBound = windowingBetweenBeginBound;
        this.windowingBetweenEndOid = windowingBetweenEndOid;
        this.windowingBetweenEndBound = windowingBetweenEndBound;
        this.windowingType = windowingType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    public SqlOver() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.cluster_by_oid")
    public Long getClusterByOid() {
        return clusterByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.cluster_by_oid")
    public void setClusterByOid(Long clusterByOid) {
        this.clusterByOid = clusterByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.distribute_by_oid")
    public Long getDistributeByOid() {
        return distributeByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.distribute_by_oid")
    public void setDistributeByOid(Long distributeByOid) {
        this.distributeByOid = distributeByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.is_exclude_current_row")
    public Integer getIsExcludeCurrentRow() {
        return isExcludeCurrentRow;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.is_exclude_current_row")
    public void setIsExcludeCurrentRow(Integer isExcludeCurrentRow) {
        this.isExcludeCurrentRow = isExcludeCurrentRow;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.is_windowing_between_end_following")
    public Integer getIsWindowingBetweenEndFollowing() {
        return isWindowingBetweenEndFollowing;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.is_windowing_between_end_following")
    public void setIsWindowingBetweenEndFollowing(Integer isWindowingBetweenEndFollowing) {
        this.isWindowingBetweenEndFollowing = isWindowingBetweenEndFollowing;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.is_windowing_between_end_preceding")
    public Integer getIsWindowingBetweenEndPreceding() {
        return isWindowingBetweenEndPreceding;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.is_windowing_between_end_preceding")
    public void setIsWindowingBetweenEndPreceding(Integer isWindowingBetweenEndPreceding) {
        this.isWindowingBetweenEndPreceding = isWindowingBetweenEndPreceding;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.is_windowing_preceding")
    public Integer getIsWindowingPreceding() {
        return isWindowingPreceding;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.is_windowing_preceding")
    public void setIsWindowingPreceding(Integer isWindowingPreceding) {
        this.isWindowingPreceding = isWindowingPreceding;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.of_oid")
    public Long getOfOid() {
        return ofOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.of_oid")
    public void setOfOid(Long ofOid) {
        this.ofOid = ofOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.order_by_oid")
    public Long getOrderByOid() {
        return orderByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.order_by_oid")
    public void setOrderByOid(Long orderByOid) {
        this.orderByOid = orderByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.sort_by_oid")
    public Long getSortByOid() {
        return sortByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.sort_by_oid")
    public void setSortByOid(Long sortByOid) {
        this.sortByOid = sortByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.windowing_between_begin_oid")
    public Long getWindowingBetweenBeginOid() {
        return windowingBetweenBeginOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.windowing_between_begin_oid")
    public void setWindowingBetweenBeginOid(Long windowingBetweenBeginOid) {
        this.windowingBetweenBeginOid = windowingBetweenBeginOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.windowing_between_begin_bound")
    public String getWindowingBetweenBeginBound() {
        return windowingBetweenBeginBound;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.windowing_between_begin_bound")
    public void setWindowingBetweenBeginBound(String windowingBetweenBeginBound) {
        this.windowingBetweenBeginBound = windowingBetweenBeginBound == null ? null : windowingBetweenBeginBound.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.windowing_between_end_oid")
    public Long getWindowingBetweenEndOid() {
        return windowingBetweenEndOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.windowing_between_end_oid")
    public void setWindowingBetweenEndOid(Long windowingBetweenEndOid) {
        this.windowingBetweenEndOid = windowingBetweenEndOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.windowing_between_end_bound")
    public String getWindowingBetweenEndBound() {
        return windowingBetweenEndBound;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.windowing_between_end_bound")
    public void setWindowingBetweenEndBound(String windowingBetweenEndBound) {
        this.windowingBetweenEndBound = windowingBetweenEndBound == null ? null : windowingBetweenEndBound.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.windowing_type")
    public String getWindowingType() {
        return windowingType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.windowing_type")
    public void setWindowingType(String windowingType) {
        this.windowingType = windowingType == null ? null : windowingType.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
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
        SqlOver other = (SqlOver) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getClusterByOid() == null ? other.getClusterByOid() == null : this.getClusterByOid().equals(other.getClusterByOid()))
            && (this.getDistributeByOid() == null ? other.getDistributeByOid() == null : this.getDistributeByOid().equals(other.getDistributeByOid()))
            && (this.getIsExcludeCurrentRow() == null ? other.getIsExcludeCurrentRow() == null : this.getIsExcludeCurrentRow().equals(other.getIsExcludeCurrentRow()))
            && (this.getIsWindowingBetweenEndFollowing() == null ? other.getIsWindowingBetweenEndFollowing() == null : this.getIsWindowingBetweenEndFollowing().equals(other.getIsWindowingBetweenEndFollowing()))
            && (this.getIsWindowingBetweenEndPreceding() == null ? other.getIsWindowingBetweenEndPreceding() == null : this.getIsWindowingBetweenEndPreceding().equals(other.getIsWindowingBetweenEndPreceding()))
            && (this.getIsWindowingPreceding() == null ? other.getIsWindowingPreceding() == null : this.getIsWindowingPreceding().equals(other.getIsWindowingPreceding()))
            && (this.getOfOid() == null ? other.getOfOid() == null : this.getOfOid().equals(other.getOfOid()))
            && (this.getOrderByOid() == null ? other.getOrderByOid() == null : this.getOrderByOid().equals(other.getOrderByOid()))
            && (this.getSortByOid() == null ? other.getSortByOid() == null : this.getSortByOid().equals(other.getSortByOid()))
            && (this.getWindowingBetweenBeginOid() == null ? other.getWindowingBetweenBeginOid() == null : this.getWindowingBetweenBeginOid().equals(other.getWindowingBetweenBeginOid()))
            && (this.getWindowingBetweenBeginBound() == null ? other.getWindowingBetweenBeginBound() == null : this.getWindowingBetweenBeginBound().equals(other.getWindowingBetweenBeginBound()))
            && (this.getWindowingBetweenEndOid() == null ? other.getWindowingBetweenEndOid() == null : this.getWindowingBetweenEndOid().equals(other.getWindowingBetweenEndOid()))
            && (this.getWindowingBetweenEndBound() == null ? other.getWindowingBetweenEndBound() == null : this.getWindowingBetweenEndBound().equals(other.getWindowingBetweenEndBound()))
            && (this.getWindowingType() == null ? other.getWindowingType() == null : this.getWindowingType().equals(other.getWindowingType()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getClusterByOid() == null) ? 0 : getClusterByOid().hashCode());
        result = prime * result + ((getDistributeByOid() == null) ? 0 : getDistributeByOid().hashCode());
        result = prime * result + ((getIsExcludeCurrentRow() == null) ? 0 : getIsExcludeCurrentRow().hashCode());
        result = prime * result + ((getIsWindowingBetweenEndFollowing() == null) ? 0 : getIsWindowingBetweenEndFollowing().hashCode());
        result = prime * result + ((getIsWindowingBetweenEndPreceding() == null) ? 0 : getIsWindowingBetweenEndPreceding().hashCode());
        result = prime * result + ((getIsWindowingPreceding() == null) ? 0 : getIsWindowingPreceding().hashCode());
        result = prime * result + ((getOfOid() == null) ? 0 : getOfOid().hashCode());
        result = prime * result + ((getOrderByOid() == null) ? 0 : getOrderByOid().hashCode());
        result = prime * result + ((getSortByOid() == null) ? 0 : getSortByOid().hashCode());
        result = prime * result + ((getWindowingBetweenBeginOid() == null) ? 0 : getWindowingBetweenBeginOid().hashCode());
        result = prime * result + ((getWindowingBetweenBeginBound() == null) ? 0 : getWindowingBetweenBeginBound().hashCode());
        result = prime * result + ((getWindowingBetweenEndOid() == null) ? 0 : getWindowingBetweenEndOid().hashCode());
        result = prime * result + ((getWindowingBetweenEndBound() == null) ? 0 : getWindowingBetweenEndBound().hashCode());
        result = prime * result + ((getWindowingType() == null) ? 0 : getWindowingType().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", clusterByOid=").append(clusterByOid);
        sb.append(", distributeByOid=").append(distributeByOid);
        sb.append(", isExcludeCurrentRow=").append(isExcludeCurrentRow);
        sb.append(", isWindowingBetweenEndFollowing=").append(isWindowingBetweenEndFollowing);
        sb.append(", isWindowingBetweenEndPreceding=").append(isWindowingBetweenEndPreceding);
        sb.append(", isWindowingPreceding=").append(isWindowingPreceding);
        sb.append(", ofOid=").append(ofOid);
        sb.append(", orderByOid=").append(orderByOid);
        sb.append(", sortByOid=").append(sortByOid);
        sb.append(", windowingBetweenBeginOid=").append(windowingBetweenBeginOid);
        sb.append(", windowingBetweenBeginBound=").append(windowingBetweenBeginBound);
        sb.append(", windowingBetweenEndOid=").append(windowingBetweenEndOid);
        sb.append(", windowingBetweenEndBound=").append(windowingBetweenEndBound);
        sb.append(", windowingType=").append(windowingType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}