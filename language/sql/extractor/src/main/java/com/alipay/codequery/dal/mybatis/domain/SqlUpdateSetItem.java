package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlUpdateSetItem implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_set_item.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_set_item.column_oid")
    private Long columnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_set_item.value_oid")
    private Long valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_update_set_item")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_update_set_item")
    public SqlUpdateSetItem(Long oid, Long columnOid, Long valueOid) {
        this.oid = oid;
        this.columnOid = columnOid;
        this.valueOid = valueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_update_set_item")
    public SqlUpdateSetItem() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_set_item.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_set_item.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_set_item.column_oid")
    public Long getColumnOid() {
        return columnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_set_item.column_oid")
    public void setColumnOid(Long columnOid) {
        this.columnOid = columnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_set_item.value_oid")
    public Long getValueOid() {
        return valueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_set_item.value_oid")
    public void setValueOid(Long valueOid) {
        this.valueOid = valueOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_update_set_item")
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
        SqlUpdateSetItem other = (SqlUpdateSetItem) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getColumnOid() == null ? other.getColumnOid() == null : this.getColumnOid().equals(other.getColumnOid()))
            && (this.getValueOid() == null ? other.getValueOid() == null : this.getValueOid().equals(other.getValueOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_update_set_item")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getColumnOid() == null) ? 0 : getColumnOid().hashCode());
        result = prime * result + ((getValueOid() == null) ? 0 : getValueOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_update_set_item")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", columnOid=").append(columnOid);
        sb.append(", valueOid=").append(valueOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}