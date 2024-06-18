package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class File implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.qualified_name")
    private String qualifiedName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.extension")
    private String extension;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.number_of_lines_hash_id")
    private Long numberOfLinesHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    public File(Long elementHashId, String qualifiedName, String extension, String name, Long numberOfLinesHashId) {
        this.elementHashId = elementHashId;
        this.qualifiedName = qualifiedName;
        this.extension = extension;
        this.name = name;
        this.numberOfLinesHashId = numberOfLinesHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    public File() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.qualified_name")
    public String getQualifiedName() {
        return qualifiedName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.qualified_name")
    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName == null ? null : qualifiedName.trim();
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.number_of_lines_hash_id")
    public Long getNumberOfLinesHashId() {
        return numberOfLinesHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.number_of_lines_hash_id")
    public void setNumberOfLinesHashId(Long numberOfLinesHashId) {
        this.numberOfLinesHashId = numberOfLinesHashId;
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
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getQualifiedName() == null ? other.getQualifiedName() == null : this.getQualifiedName().equals(other.getQualifiedName()))
            && (this.getExtension() == null ? other.getExtension() == null : this.getExtension().equals(other.getExtension()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getNumberOfLinesHashId() == null ? other.getNumberOfLinesHashId() == null : this.getNumberOfLinesHashId().equals(other.getNumberOfLinesHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getQualifiedName() == null) ? 0 : getQualifiedName().hashCode());
        result = prime * result + ((getExtension() == null) ? 0 : getExtension().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getNumberOfLinesHashId() == null) ? 0 : getNumberOfLinesHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", qualifiedName=").append(qualifiedName);
        sb.append(", extension=").append(extension);
        sb.append(", name=").append(name);
        sb.append(", numberOfLinesHashId=").append(numberOfLinesHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}