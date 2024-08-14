package com.alipay.codequery.dal.mybatis.domain;

import javax.persistence.*;

@Table(name = "xml_element")
public class XmlElement {
    @Id
    private Integer id;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "index_order")
    private Integer indexOrder;

    @Column(name = "location_id")
    private Integer locationId;

    public XmlElement(Integer id, Integer parentId, Integer indexOrder, Integer locationId) {
        this.id = id;
        this.parentId = parentId;
        this.indexOrder = indexOrder;
        this.locationId = locationId;
    }

    public XmlElement() {
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
     * @return parent_id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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