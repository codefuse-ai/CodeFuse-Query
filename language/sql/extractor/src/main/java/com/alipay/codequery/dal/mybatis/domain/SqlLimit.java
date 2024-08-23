package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlLimit implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_limit.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_limit.offset_oid")
    private Long offsetOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_limit.row_count_oid")
    private Long rowCountOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_limit")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_limit")
    public SqlLimit(Long oid, Long offsetOid, Long rowCountOid) {
        this.oid = oid;
        this.offsetOid = offsetOid;
        this.rowCountOid = rowCountOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_limit")
    public SqlLimit() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_limit.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_limit.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_limit.offset_oid")
    public Long getOffsetOid() {
        return offsetOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_limit.offset_oid")
    public void setOffsetOid(Long offsetOid) {
        this.offsetOid = offsetOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_limit.row_count_oid")
    public Long getRowCountOid() {
        return rowCountOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_limit.row_count_oid")
    public void setRowCountOid(Long rowCountOid) {
        this.rowCountOid = rowCountOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_limit")
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
        SqlLimit other = (SqlLimit) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getOffsetOid() == null ? other.getOffsetOid() == null : this.getOffsetOid().equals(other.getOffsetOid()))
            && (this.getRowCountOid() == null ? other.getRowCountOid() == null : this.getRowCountOid().equals(other.getRowCountOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_limit")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getOffsetOid() == null) ? 0 : getOffsetOid().hashCode());
        result = prime * result + ((getRowCountOid() == null) ? 0 : getRowCountOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_limit")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", offsetOid=").append(offsetOid);
        sb.append(", rowCountOid=").append(rowCountOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}