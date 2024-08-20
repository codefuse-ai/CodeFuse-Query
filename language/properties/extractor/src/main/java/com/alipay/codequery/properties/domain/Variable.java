package com.alipay.codequery.properties.domain;

import javax.persistence.*;

@Table(name = "variable")
public class Variable {
    @Column(name = "element_oid")
    private Long elementOid;

    @Column(name = "parent_oid")
    private Long parentOid;

    @Column(name = "start_index")
    private Integer startIndex;

    private String name;

    @Column(name = "printable_text")
    private String printableText;

    public Variable(Long elementOid, Long parentOid, Integer startIndex, String name, String printableText) {
        this.elementOid = elementOid;
        this.parentOid = parentOid;
        this.startIndex = startIndex;
        this.name = name;
        this.printableText = printableText;
    }

    public Variable() {
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
     * @return start_index
     */
    public Integer getStartIndex() {
        return startIndex;
    }

    /**
     * @param startIndex
     */
    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
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
}