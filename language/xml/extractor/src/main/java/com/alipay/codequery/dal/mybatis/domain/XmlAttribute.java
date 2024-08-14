package com.alipay.codequery.dal.mybatis.domain;

import javax.persistence.*;

@Table(name = "xml_attribute")
public class XmlAttribute {
    @Id
    private Integer id;

    @Column(name = "element_id")
    private Integer elementId;

    private String name;

    private String value;

    @Column(name = "index_order")
    private Integer indexOrder;

    @Column(name = "location_id")
    private Integer locationId;

    public XmlAttribute(Integer id, Integer elementId, String name, String value, Integer indexOrder, Integer locationId) {
        this.id = id;
        this.elementId = elementId;
        this.name = name;
        this.value = value;
        this.indexOrder = indexOrder;
        this.locationId = locationId;
    }

    public XmlAttribute() {
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
     * @return element_id
     */
    public Integer getElementId() {
        return elementId;
    }

    /**
     * @param elementId
     */
    public void setElementId(Integer elementId) {
        this.elementId = elementId;
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