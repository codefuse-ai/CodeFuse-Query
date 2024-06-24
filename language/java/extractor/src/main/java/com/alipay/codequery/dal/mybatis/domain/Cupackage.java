package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class Cupackage implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cupackage.file_hash_id")
    private Long fileHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cupackage.package_hash_id")
    private Long packageHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    public Cupackage(Long fileHashId, Long packageHashId) {
        this.fileHashId = fileHashId;
        this.packageHashId = packageHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    public Cupackage() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cupackage.file_hash_id")
    public Long getFileHashId() {
        return fileHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cupackage.file_hash_id")
    public void setFileHashId(Long fileHashId) {
        this.fileHashId = fileHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cupackage.package_hash_id")
    public Long getPackageHashId() {
        return packageHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cupackage.package_hash_id")
    public void setPackageHashId(Long packageHashId) {
        this.packageHashId = packageHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
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
        Cupackage other = (Cupackage) that;
        return (this.getFileHashId() == null ? other.getFileHashId() == null : this.getFileHashId().equals(other.getFileHashId()))
            && (this.getPackageHashId() == null ? other.getPackageHashId() == null : this.getPackageHashId().equals(other.getPackageHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFileHashId() == null) ? 0 : getFileHashId().hashCode());
        result = prime * result + ((getPackageHashId() == null) ? 0 : getPackageHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fileHashId=").append(fileHashId);
        sb.append(", packageHashId=").append(packageHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}