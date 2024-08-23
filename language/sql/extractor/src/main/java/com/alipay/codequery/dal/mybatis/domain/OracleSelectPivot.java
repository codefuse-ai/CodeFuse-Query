package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleSelectPivot implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_pivot.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_pivot.is_xml")
    private Integer isXml;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_pivot.items")
    private String items;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_pivot.pivot_in")
    private String pivotIn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    public OracleSelectPivot(Long oid, Integer isXml, String items, String pivotIn) {
        this.oid = oid;
        this.isXml = isXml;
        this.items = items;
        this.pivotIn = pivotIn;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    public OracleSelectPivot() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_pivot.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_pivot.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_pivot.is_xml")
    public Integer getIsXml() {
        return isXml;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_pivot.is_xml")
    public void setIsXml(Integer isXml) {
        this.isXml = isXml;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_pivot.items")
    public String getItems() {
        return items;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_pivot.items")
    public void setItems(String items) {
        this.items = items == null ? null : items.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_pivot.pivot_in")
    public String getPivotIn() {
        return pivotIn;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_pivot.pivot_in")
    public void setPivotIn(String pivotIn) {
        this.pivotIn = pivotIn == null ? null : pivotIn.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
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
        OracleSelectPivot other = (OracleSelectPivot) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsXml() == null ? other.getIsXml() == null : this.getIsXml().equals(other.getIsXml()))
            && (this.getItems() == null ? other.getItems() == null : this.getItems().equals(other.getItems()))
            && (this.getPivotIn() == null ? other.getPivotIn() == null : this.getPivotIn().equals(other.getPivotIn()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsXml() == null) ? 0 : getIsXml().hashCode());
        result = prime * result + ((getItems() == null) ? 0 : getItems().hashCode());
        result = prime * result + ((getPivotIn() == null) ? 0 : getPivotIn().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isXml=").append(isXml);
        sb.append(", items=").append(items);
        sb.append(", pivotIn=").append(pivotIn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}