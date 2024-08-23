package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlSelectGroupByClause implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.having_oid")
    private Long havingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.hint_oid")
    private Long hintOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.is_distinct")
    private Integer isDistinct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.is_paren")
    private Integer isParen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.is_with_cube")
    private Integer isWithCube;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.is_with_roll_up")
    private Integer isWithRollUp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    public SqlSelectGroupByClause(Long oid, Long havingOid, Long hintOid, Integer isDistinct, Integer isParen, Integer isWithCube, Integer isWithRollUp) {
        this.oid = oid;
        this.havingOid = havingOid;
        this.hintOid = hintOid;
        this.isDistinct = isDistinct;
        this.isParen = isParen;
        this.isWithCube = isWithCube;
        this.isWithRollUp = isWithRollUp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    public SqlSelectGroupByClause() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.having_oid")
    public Long getHavingOid() {
        return havingOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.having_oid")
    public void setHavingOid(Long havingOid) {
        this.havingOid = havingOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.hint_oid")
    public Long getHintOid() {
        return hintOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.hint_oid")
    public void setHintOid(Long hintOid) {
        this.hintOid = hintOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.is_distinct")
    public Integer getIsDistinct() {
        return isDistinct;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.is_distinct")
    public void setIsDistinct(Integer isDistinct) {
        this.isDistinct = isDistinct;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.is_paren")
    public Integer getIsParen() {
        return isParen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.is_paren")
    public void setIsParen(Integer isParen) {
        this.isParen = isParen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.is_with_cube")
    public Integer getIsWithCube() {
        return isWithCube;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.is_with_cube")
    public void setIsWithCube(Integer isWithCube) {
        this.isWithCube = isWithCube;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.is_with_roll_up")
    public Integer getIsWithRollUp() {
        return isWithRollUp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.is_with_roll_up")
    public void setIsWithRollUp(Integer isWithRollUp) {
        this.isWithRollUp = isWithRollUp;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
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
        SqlSelectGroupByClause other = (SqlSelectGroupByClause) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getHavingOid() == null ? other.getHavingOid() == null : this.getHavingOid().equals(other.getHavingOid()))
            && (this.getHintOid() == null ? other.getHintOid() == null : this.getHintOid().equals(other.getHintOid()))
            && (this.getIsDistinct() == null ? other.getIsDistinct() == null : this.getIsDistinct().equals(other.getIsDistinct()))
            && (this.getIsParen() == null ? other.getIsParen() == null : this.getIsParen().equals(other.getIsParen()))
            && (this.getIsWithCube() == null ? other.getIsWithCube() == null : this.getIsWithCube().equals(other.getIsWithCube()))
            && (this.getIsWithRollUp() == null ? other.getIsWithRollUp() == null : this.getIsWithRollUp().equals(other.getIsWithRollUp()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getHavingOid() == null) ? 0 : getHavingOid().hashCode());
        result = prime * result + ((getHintOid() == null) ? 0 : getHintOid().hashCode());
        result = prime * result + ((getIsDistinct() == null) ? 0 : getIsDistinct().hashCode());
        result = prime * result + ((getIsParen() == null) ? 0 : getIsParen().hashCode());
        result = prime * result + ((getIsWithCube() == null) ? 0 : getIsWithCube().hashCode());
        result = prime * result + ((getIsWithRollUp() == null) ? 0 : getIsWithRollUp().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", havingOid=").append(havingOid);
        sb.append(", hintOid=").append(hintOid);
        sb.append(", isDistinct=").append(isDistinct);
        sb.append(", isParen=").append(isParen);
        sb.append(", isWithCube=").append(isWithCube);
        sb.append(", isWithRollUp=").append(isWithRollUp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}