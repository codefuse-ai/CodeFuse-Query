package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class File implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.relative_path")
    private String relativePath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.extension")
    private String extension;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.corpus_oid")
    private Long corpusOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    public File(Long oid, String relativePath, String extension, String name, Long corpusOid) {
        this.oid = oid;
        this.relativePath = relativePath;
        this.extension = extension;
        this.name = name;
        this.corpusOid = corpusOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    public File() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.relative_path")
    public String getRelativePath() {
        return relativePath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.relative_path")
    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath == null ? null : relativePath.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.extension")
    public String getExtension() {
        return extension;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.extension")
    public void setExtension(String extension) {
        this.extension = extension == null ? null : extension.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.corpus_oid")
    public Long getCorpusOid() {
        return corpusOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.corpus_oid")
    public void setCorpusOid(Long corpusOid) {
        this.corpusOid = corpusOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
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
        File other = (File) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getRelativePath() == null ? other.getRelativePath() == null : this.getRelativePath().equals(other.getRelativePath()))
            && (this.getExtension() == null ? other.getExtension() == null : this.getExtension().equals(other.getExtension()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCorpusOid() == null ? other.getCorpusOid() == null : this.getCorpusOid().equals(other.getCorpusOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getRelativePath() == null) ? 0 : getRelativePath().hashCode());
        result = prime * result + ((getExtension() == null) ? 0 : getExtension().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCorpusOid() == null) ? 0 : getCorpusOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", relativePath=").append(relativePath);
        sb.append(", extension=").append(extension);
        sb.append(", name=").append(name);
        sb.append(", corpusOid=").append(corpusOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}