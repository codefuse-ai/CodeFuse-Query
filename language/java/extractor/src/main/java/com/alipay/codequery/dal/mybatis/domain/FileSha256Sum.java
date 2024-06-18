package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class FileSha256Sum implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file_sha256_sum.file_hash_id")
    private Long fileHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file_sha256_sum.value")
    private String value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    public FileSha256Sum(Long fileHashId, String value) {
        this.fileHashId = fileHashId;
        this.value = value;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    public FileSha256Sum() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file_sha256_sum.file_hash_id")
    public Long getFileHashId() {
        return fileHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file_sha256_sum.file_hash_id")
    public void setFileHashId(Long fileHashId) {
        this.fileHashId = fileHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file_sha256_sum.value")
    public String getValue() {
        return value;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file_sha256_sum.value")
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
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
        FileSha256Sum other = (FileSha256Sum) that;
        return (this.getFileHashId() == null ? other.getFileHashId() == null : this.getFileHashId().equals(other.getFileHashId()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFileHashId() == null) ? 0 : getFileHashId().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fileHashId=").append(fileHashId);
        sb.append(", value=").append(value);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}