package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class Location implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.file_oid")
    private Long fileOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.start_line_number")
    private Integer startLineNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.start_column_number")
    private Integer startColumnNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    public Location(Long oid, Long fileOid, Integer startLineNumber, Integer startColumnNumber) {
        this.oid = oid;
        this.fileOid = fileOid;
        this.startLineNumber = startLineNumber;
        this.startColumnNumber = startColumnNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    public Location() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.file_oid")
    public Long getFileOid() {
        return fileOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.file_oid")
    public void setFileOid(Long fileOid) {
        this.fileOid = fileOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.start_line_number")
    public Integer getStartLineNumber() {
        return startLineNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.start_line_number")
    public void setStartLineNumber(Integer startLineNumber) {
        this.startLineNumber = startLineNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.start_column_number")
    public Integer getStartColumnNumber() {
        return startColumnNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.start_column_number")
    public void setStartColumnNumber(Integer startColumnNumber) {
        this.startColumnNumber = startColumnNumber;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
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
        Location other = (Location) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getFileOid() == null ? other.getFileOid() == null : this.getFileOid().equals(other.getFileOid()))
            && (this.getStartLineNumber() == null ? other.getStartLineNumber() == null : this.getStartLineNumber().equals(other.getStartLineNumber()))
            && (this.getStartColumnNumber() == null ? other.getStartColumnNumber() == null : this.getStartColumnNumber().equals(other.getStartColumnNumber()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getFileOid() == null) ? 0 : getFileOid().hashCode());
        result = prime * result + ((getStartLineNumber() == null) ? 0 : getStartLineNumber().hashCode());
        result = prime * result + ((getStartColumnNumber() == null) ? 0 : getStartColumnNumber().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", fileOid=").append(fileOid);
        sb.append(", startLineNumber=").append(startLineNumber);
        sb.append(", startColumnNumber=").append(startColumnNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}