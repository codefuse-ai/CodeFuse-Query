package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlBetweenExpr implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_between_expr.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_between_expr.begin_expr_oid")
    private Long beginExprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_between_expr.end_expr_oid")
    private Long endExprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_between_expr.is_not")
    private Integer isNot;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_between_expr.test_expr_oid")
    private Long testExprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    public SqlBetweenExpr(Long oid, Long beginExprOid, Long endExprOid, Integer isNot, Long testExprOid) {
        this.oid = oid;
        this.beginExprOid = beginExprOid;
        this.endExprOid = endExprOid;
        this.isNot = isNot;
        this.testExprOid = testExprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    public SqlBetweenExpr() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_between_expr.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_between_expr.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_between_expr.begin_expr_oid")
    public Long getBeginExprOid() {
        return beginExprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_between_expr.begin_expr_oid")
    public void setBeginExprOid(Long beginExprOid) {
        this.beginExprOid = beginExprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_between_expr.end_expr_oid")
    public Long getEndExprOid() {
        return endExprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_between_expr.end_expr_oid")
    public void setEndExprOid(Long endExprOid) {
        this.endExprOid = endExprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_between_expr.is_not")
    public Integer getIsNot() {
        return isNot;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_between_expr.is_not")
    public void setIsNot(Integer isNot) {
        this.isNot = isNot;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_between_expr.test_expr_oid")
    public Long getTestExprOid() {
        return testExprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_between_expr.test_expr_oid")
    public void setTestExprOid(Long testExprOid) {
        this.testExprOid = testExprOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
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
        SqlBetweenExpr other = (SqlBetweenExpr) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getBeginExprOid() == null ? other.getBeginExprOid() == null : this.getBeginExprOid().equals(other.getBeginExprOid()))
            && (this.getEndExprOid() == null ? other.getEndExprOid() == null : this.getEndExprOid().equals(other.getEndExprOid()))
            && (this.getIsNot() == null ? other.getIsNot() == null : this.getIsNot().equals(other.getIsNot()))
            && (this.getTestExprOid() == null ? other.getTestExprOid() == null : this.getTestExprOid().equals(other.getTestExprOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getBeginExprOid() == null) ? 0 : getBeginExprOid().hashCode());
        result = prime * result + ((getEndExprOid() == null) ? 0 : getEndExprOid().hashCode());
        result = prime * result + ((getIsNot() == null) ? 0 : getIsNot().hashCode());
        result = prime * result + ((getTestExprOid() == null) ? 0 : getTestExprOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", beginExprOid=").append(beginExprOid);
        sb.append(", endExprOid=").append(endExprOid);
        sb.append(", isNot=").append(isNot);
        sb.append(", testExprOid=").append(testExprOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}