package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlDescribeStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.column_oid")
    private Long columnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.is_extended")
    private Integer isExtended;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.is_formatted")
    private Integer isFormatted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.object_oid")
    private Long objectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.object_type")
    private String objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    public SqlDescribeStatement(Long oid, Long columnOid, Integer isExtended, Integer isFormatted, Long objectOid, String objectType) {
        this.oid = oid;
        this.columnOid = columnOid;
        this.isExtended = isExtended;
        this.isFormatted = isFormatted;
        this.objectOid = objectOid;
        this.objectType = objectType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    public SqlDescribeStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.column_oid")
    public Long getColumnOid() {
        return columnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.column_oid")
    public void setColumnOid(Long columnOid) {
        this.columnOid = columnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.is_extended")
    public Integer getIsExtended() {
        return isExtended;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.is_extended")
    public void setIsExtended(Integer isExtended) {
        this.isExtended = isExtended;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.is_formatted")
    public Integer getIsFormatted() {
        return isFormatted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.is_formatted")
    public void setIsFormatted(Integer isFormatted) {
        this.isFormatted = isFormatted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.object_oid")
    public Long getObjectOid() {
        return objectOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.object_oid")
    public void setObjectOid(Long objectOid) {
        this.objectOid = objectOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.object_type")
    public String getObjectType() {
        return objectType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.object_type")
    public void setObjectType(String objectType) {
        this.objectType = objectType == null ? null : objectType.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
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
        SqlDescribeStatement other = (SqlDescribeStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getColumnOid() == null ? other.getColumnOid() == null : this.getColumnOid().equals(other.getColumnOid()))
            && (this.getIsExtended() == null ? other.getIsExtended() == null : this.getIsExtended().equals(other.getIsExtended()))
            && (this.getIsFormatted() == null ? other.getIsFormatted() == null : this.getIsFormatted().equals(other.getIsFormatted()))
            && (this.getObjectOid() == null ? other.getObjectOid() == null : this.getObjectOid().equals(other.getObjectOid()))
            && (this.getObjectType() == null ? other.getObjectType() == null : this.getObjectType().equals(other.getObjectType()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getColumnOid() == null) ? 0 : getColumnOid().hashCode());
        result = prime * result + ((getIsExtended() == null) ? 0 : getIsExtended().hashCode());
        result = prime * result + ((getIsFormatted() == null) ? 0 : getIsFormatted().hashCode());
        result = prime * result + ((getObjectOid() == null) ? 0 : getObjectOid().hashCode());
        result = prime * result + ((getObjectType() == null) ? 0 : getObjectType().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", columnOid=").append(columnOid);
        sb.append(", isExtended=").append(isExtended);
        sb.append(", isFormatted=").append(isFormatted);
        sb.append(", objectOid=").append(objectOid);
        sb.append(", objectType=").append(objectType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}