package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlAssignItem implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_assign_item.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_assign_item.target_oid")
    private Long targetOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_assign_item.value_oid")
    private Long valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_assign_item")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_assign_item")
    public SqlAssignItem(Long oid, Long targetOid, Long valueOid) {
        this.oid = oid;
        this.targetOid = targetOid;
        this.valueOid = valueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_assign_item")
    public SqlAssignItem() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_assign_item.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_assign_item.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_assign_item.target_oid")
    public Long getTargetOid() {
        return targetOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_assign_item.target_oid")
    public void setTargetOid(Long targetOid) {
        this.targetOid = targetOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_assign_item.value_oid")
    public Long getValueOid() {
        return valueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_assign_item.value_oid")
    public void setValueOid(Long valueOid) {
        this.valueOid = valueOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_assign_item")
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
        SqlAssignItem other = (SqlAssignItem) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getTargetOid() == null ? other.getTargetOid() == null : this.getTargetOid().equals(other.getTargetOid()))
            && (this.getValueOid() == null ? other.getValueOid() == null : this.getValueOid().equals(other.getValueOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_assign_item")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getTargetOid() == null) ? 0 : getTargetOid().hashCode());
        result = prime * result + ((getValueOid() == null) ? 0 : getValueOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_assign_item")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", targetOid=").append(targetOid);
        sb.append(", valueOid=").append(valueOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}