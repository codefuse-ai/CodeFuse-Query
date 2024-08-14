package com.alipay.codequery.dal.mybatis.domain;

import javax.persistence.*;

@Table(name = "xml_character")
public class XmlCharacter {
    @Id
    private Integer id;

    private String text;

    private Integer parentid;

    @Column(name = "index_order")
    private Integer indexOrder;

    @Column(name = "is_cdata")
    private Integer isCdata;

    @Column(name = "location_id")
    private Integer locationId;

    public XmlCharacter(Integer id, String text, Integer parentid, Integer indexOrder, Integer isCdata, Integer locationId) {
        this.id = id;
        this.text = text;
        this.parentid = parentid;
        this.indexOrder = indexOrder;
        this.isCdata = isCdata;
        this.locationId = locationId;
    }

    public XmlCharacter() {
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
     * @return parentid
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * @param parentid
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * @return index_order
     */
    public Integer getIndexOrder() {
        return indexOrder;
    }

    /**
     * @param indexOrder
     */
    public void setIndexOrder(Integer indexOrder) {
        this.indexOrder = indexOrder;
    }

    /**
     * @return is_cdata
     */
    public Integer getIsCdata() {
        return isCdata;
    }

    /**
     * @param isCdata
     */
    public void setIsCdata(Integer isCdata) {
        this.isCdata = isCdata;
    }

    /**
     * @return location_id
     */
    public Integer getLocationId() {
        return locationId;
    }

    /**
     * @param locationId
     */
    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }
}