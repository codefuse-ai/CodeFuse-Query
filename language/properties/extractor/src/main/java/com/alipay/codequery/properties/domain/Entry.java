package com.alipay.codequery.properties.domain;

import javax.persistence.*;

@Table(name = "entry")
public class Entry {
    @Column(name = "element_oid")
    private Long elementOid;

    private String key;

    private String value;

    @Column(name = "printable_text")
    private String printableText;

    @Column(name = "location_oid")
    private Long locationOid;

    public Entry(Long elementOid, String key, String value, String printableText, Long locationOid) {
        this.elementOid = elementOid;
        this.key = key;
        this.value = value;
        this.printableText = printableText;
        this.locationOid = locationOid;
    }

    public Entry() {
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
     * @return key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key
     */
    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    /**
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * @return printable_text
     */
    public String getPrintableText() {
        return printableText;
    }

    /**
     * @param printableText
     */
    public void setPrintableText(String printableText) {
        this.printableText = printableText == null ? null : printableText.trim();
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