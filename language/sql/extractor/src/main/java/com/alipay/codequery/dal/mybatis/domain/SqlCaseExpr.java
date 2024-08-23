package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlCaseExpr implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_case_expr.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_case_expr.else_expr_oid")
    private Long elseExprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_case_expr.items")
    private String items;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_case_expr.value_expr_oid")
    private Long valueExprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    public SqlCaseExpr(Long oid, Long elseExprOid, String items, Long valueExprOid) {
        this.oid = oid;
        this.elseExprOid = elseExprOid;
        this.items = items;
        this.valueExprOid = valueExprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    public SqlCaseExpr() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_case_expr.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_case_expr.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_case_expr.else_expr_oid")
    public Long getElseExprOid() {
        return elseExprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_case_expr.else_expr_oid")
    public void setElseExprOid(Long elseExprOid) {
        this.elseExprOid = elseExprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_case_expr.items")
    public String getItems() {
        return items;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_case_expr.items")
    public void setItems(String items) {
        this.items = items == null ? null : items.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_case_expr.value_expr_oid")
    public Long getValueExprOid() {
        return valueExprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_case_expr.value_expr_oid")
    public void setValueExprOid(Long valueExprOid) {
        this.valueExprOid = valueExprOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
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
        SqlCaseExpr other = (SqlCaseExpr) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getElseExprOid() == null ? other.getElseExprOid() == null : this.getElseExprOid().equals(other.getElseExprOid()))
            && (this.getItems() == null ? other.getItems() == null : this.getItems().equals(other.getItems()))
            && (this.getValueExprOid() == null ? other.getValueExprOid() == null : this.getValueExprOid().equals(other.getValueExprOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getElseExprOid() == null) ? 0 : getElseExprOid().hashCode());
        result = prime * result + ((getItems() == null) ? 0 : getItems().hashCode());
        result = prime * result + ((getValueExprOid() == null) ? 0 : getValueExprOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", elseExprOid=").append(elseExprOid);
        sb.append(", items=").append(items);
        sb.append(", valueExprOid=").append(valueExprOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}