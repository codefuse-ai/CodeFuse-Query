package com.alipay.codequery.properties.domain;

import javax.persistence.*;

@Table(name = "comment")
public class Comment {
    @Column(name = "element_oid")
    private Long elementOid;

    private String text;

    @Column(name = "parent_oid")
    private Long parentOid;

    @Column(name = "location_oid")
    private Long locationOid;

    public Comment(Long elementOid, String text, Long parentOid, Long locationOid) {
        this.elementOid = elementOid;
        this.text = text;
        this.parentOid = parentOid;
        this.locationOid = locationOid;
    }

    public Comment() {
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
     * @return text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
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
}