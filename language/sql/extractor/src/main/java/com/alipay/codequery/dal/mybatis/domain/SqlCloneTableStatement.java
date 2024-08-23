package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlCloneTableStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.from_oid")
    private Long fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.is_if_exists_ignore")
    private Integer isIfExistsIgnore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.is_if_exists_overwrite")
    private Integer isIfExistsOverwrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.to_name_oid")
    private Long toNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.to_oid")
    private Long toOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_clone_table_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_clone_table_statement")
    public SqlCloneTableStatement(Long oid, Long fromOid, Integer isIfExistsIgnore, Integer isIfExistsOverwrite, Long toNameOid, Long toOid) {
        this.oid = oid;
        this.fromOid = fromOid;
        this.isIfExistsIgnore = isIfExistsIgnore;
        this.isIfExistsOverwrite = isIfExistsOverwrite;
        this.toNameOid = toNameOid;
        this.toOid = toOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_clone_table_statement")
    public SqlCloneTableStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.from_oid")
    public Long getFromOid() {
        return fromOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.from_oid")
    public void setFromOid(Long fromOid) {
        this.fromOid = fromOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.is_if_exists_ignore")
    public Integer getIsIfExistsIgnore() {
        return isIfExistsIgnore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.is_if_exists_ignore")
    public void setIsIfExistsIgnore(Integer isIfExistsIgnore) {
        this.isIfExistsIgnore = isIfExistsIgnore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.is_if_exists_overwrite")
    public Integer getIsIfExistsOverwrite() {
        return isIfExistsOverwrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.is_if_exists_overwrite")
    public void setIsIfExistsOverwrite(Integer isIfExistsOverwrite) {
        this.isIfExistsOverwrite = isIfExistsOverwrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.to_name_oid")
    public Long getToNameOid() {
        return toNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.to_name_oid")
    public void setToNameOid(Long toNameOid) {
        this.toNameOid = toNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.to_oid")
    public Long getToOid() {
        return toOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.to_oid")
    public void setToOid(Long toOid) {
        this.toOid = toOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_clone_table_statement")
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
        SqlCloneTableStatement other = (SqlCloneTableStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getFromOid() == null ? other.getFromOid() == null : this.getFromOid().equals(other.getFromOid()))
            && (this.getIsIfExistsIgnore() == null ? other.getIsIfExistsIgnore() == null : this.getIsIfExistsIgnore().equals(other.getIsIfExistsIgnore()))
            && (this.getIsIfExistsOverwrite() == null ? other.getIsIfExistsOverwrite() == null : this.getIsIfExistsOverwrite().equals(other.getIsIfExistsOverwrite()))
            && (this.getToNameOid() == null ? other.getToNameOid() == null : this.getToNameOid().equals(other.getToNameOid()))
            && (this.getToOid() == null ? other.getToOid() == null : this.getToOid().equals(other.getToOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_clone_table_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getFromOid() == null) ? 0 : getFromOid().hashCode());
        result = prime * result + ((getIsIfExistsIgnore() == null) ? 0 : getIsIfExistsIgnore().hashCode());
        result = prime * result + ((getIsIfExistsOverwrite() == null) ? 0 : getIsIfExistsOverwrite().hashCode());
        result = prime * result + ((getToNameOid() == null) ? 0 : getToNameOid().hashCode());
        result = prime * result + ((getToOid() == null) ? 0 : getToOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_clone_table_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", fromOid=").append(fromOid);
        sb.append(", isIfExistsIgnore=").append(isIfExistsIgnore);
        sb.append(", isIfExistsOverwrite=").append(isIfExistsOverwrite);
        sb.append(", toNameOid=").append(toNameOid);
        sb.append(", toOid=").append(toOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}