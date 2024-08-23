package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleSelectUnPivot implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_un_pivot.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_un_pivot.nulls_include_type")
    private String nullsIncludeType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_un_pivot.pivot_in")
    private String pivotIn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    public OracleSelectUnPivot(Long oid, String nullsIncludeType, String pivotIn) {
        this.oid = oid;
        this.nullsIncludeType = nullsIncludeType;
        this.pivotIn = pivotIn;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    public OracleSelectUnPivot() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_un_pivot.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_un_pivot.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_un_pivot.nulls_include_type")
    public String getNullsIncludeType() {
        return nullsIncludeType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_un_pivot.nulls_include_type")
    public void setNullsIncludeType(String nullsIncludeType) {
        this.nullsIncludeType = nullsIncludeType == null ? null : nullsIncludeType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_un_pivot.pivot_in")
    public String getPivotIn() {
        return pivotIn;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_un_pivot.pivot_in")
    public void setPivotIn(String pivotIn) {
        this.pivotIn = pivotIn == null ? null : pivotIn.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
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
        OracleSelectUnPivot other = (OracleSelectUnPivot) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getNullsIncludeType() == null ? other.getNullsIncludeType() == null : this.getNullsIncludeType().equals(other.getNullsIncludeType()))
            && (this.getPivotIn() == null ? other.getPivotIn() == null : this.getPivotIn().equals(other.getPivotIn()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getNullsIncludeType() == null) ? 0 : getNullsIncludeType().hashCode());
        result = prime * result + ((getPivotIn() == null) ? 0 : getPivotIn().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", nullsIncludeType=").append(nullsIncludeType);
        sb.append(", pivotIn=").append(pivotIn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}