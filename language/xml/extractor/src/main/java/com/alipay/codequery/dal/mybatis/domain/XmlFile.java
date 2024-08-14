package com.alipay.codequery.dal.mybatis.domain;

import javax.persistence.*;

@Table(name = "xml_file")
public class XmlFile {
    @Id
    private Integer id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "relative_path")
    private String relativePath;

    public XmlFile(Integer id, String fileName, String relativePath) {
        this.id = id;
        this.fileName = fileName;
        this.relativePath = relativePath;
    }

    public XmlFile() {
        super();
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return file_name
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
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
}