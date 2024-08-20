package com.alipay.codequery.properties.domain;

import javax.persistence.*;

@Table(name = "empty_line")
public class EmptyLine {
    @Id
    @Column(name = "element_oid")
    private Long elementOid;

    @Column(name = "location_oid")
    private Long locationOid;

    @Column(name = "file_oid")
    private Long fileOid;

    public EmptyLine(Long elementOid, Long locationOid, Long fileOid) {
        this.elementOid = elementOid;
        this.locationOid = locationOid;
        this.fileOid = fileOid;
    }

    public EmptyLine() {
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
     * @return location_oid
     */
    public Long getLocationOid() {
        return locationOid;
    }

    /**
     * @param locationOid
     */
    public void setLocationOid(Long locationOid) {
        this.locationOid = locationOid;
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
}