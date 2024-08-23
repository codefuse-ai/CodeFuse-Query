package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OdpsShowChangelogsStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_changelogs_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_changelogs_statement.id_oid")
    private Long idOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_changelogs_statement.is_tables")
    private Integer isTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_changelogs_statement.table_oid")
    private Long tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_changelogs_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_changelogs_statement")
    public OdpsShowChangelogsStatement(Long oid, Long idOid, Integer isTables, Long tableOid) {
        this.oid = oid;
        this.idOid = idOid;
        this.isTables = isTables;
        this.tableOid = tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_changelogs_statement")
    public OdpsShowChangelogsStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_changelogs_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_changelogs_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_changelogs_statement.id_oid")
    public Long getIdOid() {
        return idOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_changelogs_statement.id_oid")
    public void setIdOid(Long idOid) {
        this.idOid = idOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_changelogs_statement.is_tables")
    public Integer getIsTables() {
        return isTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_changelogs_statement.is_tables")
    public void setIsTables(Integer isTables) {
        this.isTables = isTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_changelogs_statement.table_oid")
    public Long getTableOid() {
        return tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_changelogs_statement.table_oid")
    public void setTableOid(Long tableOid) {
        this.tableOid = tableOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_changelogs_statement")
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
        OdpsShowChangelogsStatement other = (OdpsShowChangelogsStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIdOid() == null ? other.getIdOid() == null : this.getIdOid().equals(other.getIdOid()))
            && (this.getIsTables() == null ? other.getIsTables() == null : this.getIsTables().equals(other.getIsTables()))
            && (this.getTableOid() == null ? other.getTableOid() == null : this.getTableOid().equals(other.getTableOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_changelogs_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIdOid() == null) ? 0 : getIdOid().hashCode());
        result = prime * result + ((getIsTables() == null) ? 0 : getIsTables().hashCode());
        result = prime * result + ((getTableOid() == null) ? 0 : getTableOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_changelogs_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", idOid=").append(idOid);
        sb.append(", isTables=").append(isTables);
        sb.append(", tableOid=").append(tableOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}