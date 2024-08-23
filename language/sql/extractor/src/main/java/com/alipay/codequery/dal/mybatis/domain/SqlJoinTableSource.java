package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlJoinTableSource implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.condition_oid")
    private Long conditionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.is_asof")
    private Integer isAsof;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.is_global")
    private Integer isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.is_natural")
    private Integer isNatural;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.join_type")
    private String joinType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.left_oid")
    private Long leftOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.right_oid")
    private Long rightOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.udj")
    private String udj;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    public SqlJoinTableSource(Long oid, Long conditionOid, Integer isAsof, Integer isGlobal, Integer isNatural, String joinType, Long leftOid, Long rightOid, String udj) {
        this.oid = oid;
        this.conditionOid = conditionOid;
        this.isAsof = isAsof;
        this.isGlobal = isGlobal;
        this.isNatural = isNatural;
        this.joinType = joinType;
        this.leftOid = leftOid;
        this.rightOid = rightOid;
        this.udj = udj;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    public SqlJoinTableSource() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.condition_oid")
    public Long getConditionOid() {
        return conditionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.condition_oid")
    public void setConditionOid(Long conditionOid) {
        this.conditionOid = conditionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.is_asof")
    public Integer getIsAsof() {
        return isAsof;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.is_asof")
    public void setIsAsof(Integer isAsof) {
        this.isAsof = isAsof;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.is_global")
    public Integer getIsGlobal() {
        return isGlobal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.is_global")
    public void setIsGlobal(Integer isGlobal) {
        this.isGlobal = isGlobal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.is_natural")
    public Integer getIsNatural() {
        return isNatural;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.is_natural")
    public void setIsNatural(Integer isNatural) {
        this.isNatural = isNatural;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.join_type")
    public String getJoinType() {
        return joinType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.join_type")
    public void setJoinType(String joinType) {
        this.joinType = joinType == null ? null : joinType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.left_oid")
    public Long getLeftOid() {
        return leftOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.left_oid")
    public void setLeftOid(Long leftOid) {
        this.leftOid = leftOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.right_oid")
    public Long getRightOid() {
        return rightOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.right_oid")
    public void setRightOid(Long rightOid) {
        this.rightOid = rightOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.udj")
    public String getUdj() {
        return udj;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.udj")
    public void setUdj(String udj) {
        this.udj = udj == null ? null : udj.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
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
        SqlJoinTableSource other = (SqlJoinTableSource) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getConditionOid() == null ? other.getConditionOid() == null : this.getConditionOid().equals(other.getConditionOid()))
            && (this.getIsAsof() == null ? other.getIsAsof() == null : this.getIsAsof().equals(other.getIsAsof()))
            && (this.getIsGlobal() == null ? other.getIsGlobal() == null : this.getIsGlobal().equals(other.getIsGlobal()))
            && (this.getIsNatural() == null ? other.getIsNatural() == null : this.getIsNatural().equals(other.getIsNatural()))
            && (this.getJoinType() == null ? other.getJoinType() == null : this.getJoinType().equals(other.getJoinType()))
            && (this.getLeftOid() == null ? other.getLeftOid() == null : this.getLeftOid().equals(other.getLeftOid()))
            && (this.getRightOid() == null ? other.getRightOid() == null : this.getRightOid().equals(other.getRightOid()))
            && (this.getUdj() == null ? other.getUdj() == null : this.getUdj().equals(other.getUdj()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getConditionOid() == null) ? 0 : getConditionOid().hashCode());
        result = prime * result + ((getIsAsof() == null) ? 0 : getIsAsof().hashCode());
        result = prime * result + ((getIsGlobal() == null) ? 0 : getIsGlobal().hashCode());
        result = prime * result + ((getIsNatural() == null) ? 0 : getIsNatural().hashCode());
        result = prime * result + ((getJoinType() == null) ? 0 : getJoinType().hashCode());
        result = prime * result + ((getLeftOid() == null) ? 0 : getLeftOid().hashCode());
        result = prime * result + ((getRightOid() == null) ? 0 : getRightOid().hashCode());
        result = prime * result + ((getUdj() == null) ? 0 : getUdj().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", conditionOid=").append(conditionOid);
        sb.append(", isAsof=").append(isAsof);
        sb.append(", isGlobal=").append(isGlobal);
        sb.append(", isNatural=").append(isNatural);
        sb.append(", joinType=").append(joinType);
        sb.append(", leftOid=").append(leftOid);
        sb.append(", rightOid=").append(rightOid);
        sb.append(", udj=").append(udj);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}