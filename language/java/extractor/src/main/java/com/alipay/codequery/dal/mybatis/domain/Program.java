package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class Program implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: program.program_hash_id")
    private Long programHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: program.absolute_prefix_path")
    private String absolutePrefixPath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    public Program(Long programHashId, String absolutePrefixPath) {
        this.programHashId = programHashId;
        this.absolutePrefixPath = absolutePrefixPath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    public Program() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: program.program_hash_id")
    public Long getProgramHashId() {
        return programHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: program.program_hash_id")
    public void setProgramHashId(Long programHashId) {
        this.programHashId = programHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: program.absolute_prefix_path")
    public String getAbsolutePrefixPath() {
        return absolutePrefixPath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: program.absolute_prefix_path")
    public void setAbsolutePrefixPath(String absolutePrefixPath) {
        this.absolutePrefixPath = absolutePrefixPath == null ? null : absolutePrefixPath.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
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
        Program other = (Program) that;
        return (this.getProgramHashId() == null ? other.getProgramHashId() == null : this.getProgramHashId().equals(other.getProgramHashId()))
            && (this.getAbsolutePrefixPath() == null ? other.getAbsolutePrefixPath() == null : this.getAbsolutePrefixPath().equals(other.getAbsolutePrefixPath()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProgramHashId() == null) ? 0 : getProgramHashId().hashCode());
        result = prime * result + ((getAbsolutePrefixPath() == null) ? 0 : getAbsolutePrefixPath().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", programHashId=").append(programHashId);
        sb.append(", absolutePrefixPath=").append(absolutePrefixPath);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}