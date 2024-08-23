package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlDumpStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_dump_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_dump_statement.into_oid")
    private Long intoOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_dump_statement.is_overwrite")
    private Integer isOverwrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_dump_statement.select_oid")
    private Long selectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_dump_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_dump_statement")
    public SqlDumpStatement(Long oid, Long intoOid, Integer isOverwrite, Long selectOid) {
        this.oid = oid;
        this.intoOid = intoOid;
        this.isOverwrite = isOverwrite;
        this.selectOid = selectOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_dump_statement")
    public SqlDumpStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_dump_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_dump_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_dump_statement.into_oid")
    public Long getIntoOid() {
        return intoOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_dump_statement.into_oid")
    public void setIntoOid(Long intoOid) {
        this.intoOid = intoOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_dump_statement.is_overwrite")
    public Integer getIsOverwrite() {
        return isOverwrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_dump_statement.is_overwrite")
    public void setIsOverwrite(Integer isOverwrite) {
        this.isOverwrite = isOverwrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_dump_statement.select_oid")
    public Long getSelectOid() {
        return selectOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_dump_statement.select_oid")
    public void setSelectOid(Long selectOid) {
        this.selectOid = selectOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_dump_statement")
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
        SqlDumpStatement other = (SqlDumpStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIntoOid() == null ? other.getIntoOid() == null : this.getIntoOid().equals(other.getIntoOid()))
            && (this.getIsOverwrite() == null ? other.getIsOverwrite() == null : this.getIsOverwrite().equals(other.getIsOverwrite()))
            && (this.getSelectOid() == null ? other.getSelectOid() == null : this.getSelectOid().equals(other.getSelectOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_dump_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIntoOid() == null) ? 0 : getIntoOid().hashCode());
        result = prime * result + ((getIsOverwrite() == null) ? 0 : getIsOverwrite().hashCode());
        result = prime * result + ((getSelectOid() == null) ? 0 : getSelectOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_dump_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", intoOid=").append(intoOid);
        sb.append(", isOverwrite=").append(isOverwrite);
        sb.append(", selectOid=").append(selectOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}