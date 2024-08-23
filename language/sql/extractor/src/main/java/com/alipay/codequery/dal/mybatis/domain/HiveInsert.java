package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class HiveInsert implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_insert.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_insert.query_oid")
    private Long queryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_insert.table_source_oid")
    private Long tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_insert.values_list")
    private String valuesList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    public HiveInsert(Long oid, Long queryOid, Long tableSourceOid, String valuesList) {
        this.oid = oid;
        this.queryOid = queryOid;
        this.tableSourceOid = tableSourceOid;
        this.valuesList = valuesList;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    public HiveInsert() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_insert.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_insert.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_insert.query_oid")
    public Long getQueryOid() {
        return queryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_insert.query_oid")
    public void setQueryOid(Long queryOid) {
        this.queryOid = queryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_insert.table_source_oid")
    public Long getTableSourceOid() {
        return tableSourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_insert.table_source_oid")
    public void setTableSourceOid(Long tableSourceOid) {
        this.tableSourceOid = tableSourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_insert.values_list")
    public String getValuesList() {
        return valuesList;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_insert.values_list")
    public void setValuesList(String valuesList) {
        this.valuesList = valuesList == null ? null : valuesList.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
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
        HiveInsert other = (HiveInsert) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getQueryOid() == null ? other.getQueryOid() == null : this.getQueryOid().equals(other.getQueryOid()))
            && (this.getTableSourceOid() == null ? other.getTableSourceOid() == null : this.getTableSourceOid().equals(other.getTableSourceOid()))
            && (this.getValuesList() == null ? other.getValuesList() == null : this.getValuesList().equals(other.getValuesList()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getQueryOid() == null) ? 0 : getQueryOid().hashCode());
        result = prime * result + ((getTableSourceOid() == null) ? 0 : getTableSourceOid().hashCode());
        result = prime * result + ((getValuesList() == null) ? 0 : getValuesList().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", queryOid=").append(queryOid);
        sb.append(", tableSourceOid=").append(tableSourceOid);
        sb.append(", valuesList=").append(valuesList);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}