package com.alipay.codequery.dal.mybatis.domain;

import javax.persistence.*;

@Table(name = "xml_location")
public class XmlLocation {
    @Id
    private Integer id;

    @Column(name = "start_line_number")
    private Integer startLineNumber;

    @Column(name = "start_column_number")
    private Integer startColumnNumber;

    @Column(name = "end_line_number")
    private Integer endLineNumber;

    @Column(name = "end_column_number")
    private Integer endColumnNumber;

    @Column(name = "file_id")
    private Integer fileId;

    public XmlLocation(Integer id, Integer startLineNumber, Integer startColumnNumber, Integer endLineNumber, Integer endColumnNumber, Integer fileId) {
        this.id = id;
        this.startLineNumber = startLineNumber;
        this.startColumnNumber = startColumnNumber;
        this.endLineNumber = endLineNumber;
        this.endColumnNumber = endColumnNumber;
        this.fileId = fileId;
    }

    public XmlLocation() {
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
     * @return start_line_number
     */
    public Integer getStartLineNumber() {
        return startLineNumber;
    }

    /**
     * @param startLineNumber
     */
    public void setStartLineNumber(Integer startLineNumber) {
        this.startLineNumber = startLineNumber;
    }

    /**
     * @return start_column_number
     */
    public Integer getStartColumnNumber() {
        return startColumnNumber;
    }

    /**
     * @param startColumnNumber
     */
    public void setStartColumnNumber(Integer startColumnNumber) {
        this.startColumnNumber = startColumnNumber;
    }

    /**
     * @return end_line_number
     */
    public Integer getEndLineNumber() {
        return endLineNumber;
    }

    /**
     * @param endLineNumber
     */
    public void setEndLineNumber(Integer endLineNumber) {
        this.endLineNumber = endLineNumber;
    }

    /**
     * @return end_column_number
     */
    public Integer getEndColumnNumber() {
        return endColumnNumber;
    }

    /**
     * @param endColumnNumber
     */
    public void setEndColumnNumber(Integer endColumnNumber) {
        this.endColumnNumber = endColumnNumber;
    }

    /**
     * @return file_id
     */
    public Integer getFileId() {
        return fileId;
    }

    /**
     * @param fileId
     */
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }
}