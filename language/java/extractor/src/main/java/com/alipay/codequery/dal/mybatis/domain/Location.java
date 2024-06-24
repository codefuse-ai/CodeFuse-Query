package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class Location implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.file_hash_id")
    private Long fileHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.start_line_number")
    private Integer startLineNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.start_column_number")
    private Integer startColumnNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.end_line_number")
    private Integer endLineNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.end_column_number")
    private Integer endColumnNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    public Location(Long elementHashId, Long fileHashId, Integer startLineNumber, Integer startColumnNumber, Integer endLineNumber, Integer endColumnNumber) {
        this.elementHashId = elementHashId;
        this.fileHashId = fileHashId;
        this.startLineNumber = startLineNumber;
        this.startColumnNumber = startColumnNumber;
        this.endLineNumber = endLineNumber;
        this.endColumnNumber = endColumnNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    public Location() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.file_hash_id")
    public Long getFileHashId() {
        return fileHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.file_hash_id")
    public void setFileHashId(Long fileHashId) {
        this.fileHashId = fileHashId;
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.end_line_number")
    public Integer getEndLineNumber() {
        return endLineNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.end_line_number")
    public void setEndLineNumber(Integer endLineNumber) {
        this.endLineNumber = endLineNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.end_column_number")
    public Integer getEndColumnNumber() {
        return endColumnNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.end_column_number")
    public void setEndColumnNumber(Integer endColumnNumber) {
        this.endColumnNumber = endColumnNumber;
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
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getFileHashId() == null ? other.getFileHashId() == null : this.getFileHashId().equals(other.getFileHashId()))
            && (this.getStartLineNumber() == null ? other.getStartLineNumber() == null : this.getStartLineNumber().equals(other.getStartLineNumber()))
            && (this.getStartColumnNumber() == null ? other.getStartColumnNumber() == null : this.getStartColumnNumber().equals(other.getStartColumnNumber()))
            && (this.getEndLineNumber() == null ? other.getEndLineNumber() == null : this.getEndLineNumber().equals(other.getEndLineNumber()))
            && (this.getEndColumnNumber() == null ? other.getEndColumnNumber() == null : this.getEndColumnNumber().equals(other.getEndColumnNumber()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getFileHashId() == null) ? 0 : getFileHashId().hashCode());
        result = prime * result + ((getStartLineNumber() == null) ? 0 : getStartLineNumber().hashCode());
        result = prime * result + ((getStartColumnNumber() == null) ? 0 : getStartColumnNumber().hashCode());
        result = prime * result + ((getEndLineNumber() == null) ? 0 : getEndLineNumber().hashCode());
        result = prime * result + ((getEndColumnNumber() == null) ? 0 : getEndColumnNumber().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", fileHashId=").append(fileHashId);
        sb.append(", startLineNumber=").append(startLineNumber);
        sb.append(", startColumnNumber=").append(startColumnNumber);
        sb.append(", endLineNumber=").append(endLineNumber);
        sb.append(", endColumnNumber=").append(endColumnNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}