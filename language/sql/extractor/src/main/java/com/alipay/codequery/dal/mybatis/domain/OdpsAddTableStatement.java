package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OdpsAddTableStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_table_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_table_statement.comment_oid")
    private Long commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_table_statement.is_force")
    private Integer isForce;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_table_statement.table_oid")
    private Long tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_table_statement.to_package_oid")
    private Long toPackageOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    public OdpsAddTableStatement(Long oid, Long commentOid, Integer isForce, Long tableOid, Long toPackageOid) {
        this.oid = oid;
        this.commentOid = commentOid;
        this.isForce = isForce;
        this.tableOid = tableOid;
        this.toPackageOid = toPackageOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    public OdpsAddTableStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_table_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_table_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_table_statement.comment_oid")
    public Long getCommentOid() {
        return commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_table_statement.comment_oid")
    public void setCommentOid(Long commentOid) {
        this.commentOid = commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_table_statement.is_force")
    public Integer getIsForce() {
        return isForce;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_table_statement.is_force")
    public void setIsForce(Integer isForce) {
        this.isForce = isForce;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_table_statement.table_oid")
    public Long getTableOid() {
        return tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_table_statement.table_oid")
    public void setTableOid(Long tableOid) {
        this.tableOid = tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_table_statement.to_package_oid")
    public Long getToPackageOid() {
        return toPackageOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_table_statement.to_package_oid")
    public void setToPackageOid(Long toPackageOid) {
        this.toPackageOid = toPackageOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
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
        OdpsAddTableStatement other = (OdpsAddTableStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCommentOid() == null ? other.getCommentOid() == null : this.getCommentOid().equals(other.getCommentOid()))
            && (this.getIsForce() == null ? other.getIsForce() == null : this.getIsForce().equals(other.getIsForce()))
            && (this.getTableOid() == null ? other.getTableOid() == null : this.getTableOid().equals(other.getTableOid()))
            && (this.getToPackageOid() == null ? other.getToPackageOid() == null : this.getToPackageOid().equals(other.getToPackageOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCommentOid() == null) ? 0 : getCommentOid().hashCode());
        result = prime * result + ((getIsForce() == null) ? 0 : getIsForce().hashCode());
        result = prime * result + ((getTableOid() == null) ? 0 : getTableOid().hashCode());
        result = prime * result + ((getToPackageOid() == null) ? 0 : getToPackageOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", commentOid=").append(commentOid);
        sb.append(", isForce=").append(isForce);
        sb.append(", tableOid=").append(tableOid);
        sb.append(", toPackageOid=").append(toPackageOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}