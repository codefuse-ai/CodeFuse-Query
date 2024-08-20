package com.alipay.codequery.properties.dal.mybatis.domain;

import javax.persistence.*;

@Table(name = "file")
public class File {
    @Column(name = "element_oid")
    private Long elementOid;

    @Column(name = "relative_path")
    private String relativePath;

    private String extension;

    private String name;

    public File(Long elementOid, String relativePath, String extension, String name) {
        this.elementOid = elementOid;
        this.relativePath = relativePath;
        this.extension = extension;
        this.name = name;
    }

    public File() {
        super();
    }

    /**
     * @return element_oid
     */
    public Long getElementOid() {
        return elementOid;
    }

    /**
     * @param elementOid
     */
    public void setElementOid(Long elementOid) {
        this.elementOid = elementOid;
    }

    /**
     * @return relative_path
     */
    public String getRelativePath() {
        return relativePath;
    }

    /**
     * @param relativePath
     */
    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath == null ? null : relativePath.trim();
    }

    /**
     * @return extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * @param extension
     */
    public void setExtension(String extension) {
        this.extension = extension == null ? null : extension.trim();
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}