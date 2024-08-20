package com.alipay.codequery.properties.domain;

import javax.persistence.*;

@Table(name = "location")
public class Location {
    @Column(name = "element_oid")
    private Long elementOid;

    @Column(name = "file_oid")
    private Long fileOid;

    @Column(name = "start_line_number")
    private Integer startLineNumber;

    @Column(name = "start_column_number")
    private Integer startColumnNumber;

    @Column(name = "end_line_number")
    private Integer endLineNumber;

    @Column(name = "end_column_number")
    private Integer endColumnNumber;

    public Location(Long elementOid, Long fileOid, Integer startLineNumber, Integer startColumnNumber, Integer endLineNumber, Integer endColumnNumber) {
        this.elementOid = elementOid;
        this.fileOid = fileOid;
        this.startLineNumber = startLineNumber;
        this.startColumnNumber = startColumnNumber;
        this.endLineNumber = endLineNumber;
        this.endColumnNumber = endColumnNumber;
    }

    public Location() {
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
     * @return file_oid
     */
    public Long getFileOid() {
        return fileOid;
    }

    /**
     * @param fileOid
     */
    public void setFileOid(Long fileOid) {
        this.fileOid = fileOid;
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
}