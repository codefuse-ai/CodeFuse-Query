package com.alipay.codequery.properties.domain;

import javax.persistence.*;

@Table(name = "folder")
public class Folder {
    @Column(name = "element_oid")
    private Long elementOid;

    @Column(name = "relative_path")
    private String relativePath;

    private String name;

    @Column(name = "parent_oid")
    private Long parentOid;

    public Folder(Long elementOid, String relativePath, String name, Long parentOid) {
        this.elementOid = elementOid;
        this.relativePath = relativePath;
        this.name = name;
        this.parentOid = parentOid;
    }

    public Folder() {
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

    /**
     * @return parent_oid
     */
    public Long getParentOid() {
        return parentOid;
    }

    /**
     * @param parentOid
     */
    public void setParentOid(Long parentOid) {
        this.parentOid = parentOid;
    }
}