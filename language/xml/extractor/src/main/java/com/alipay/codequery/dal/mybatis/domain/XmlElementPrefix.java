package com.alipay.codequery.dal.mybatis.domain;

import javax.persistence.*;

@Table(name = "xml_element_prefix")
public class XmlElementPrefix {
    @Id
    private Integer id;

    private String name;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "location_id")
    private Integer locationId;

    public XmlElementPrefix(Integer id, String name, Integer parentId, Integer locationId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.locationId = locationId;
    }

    public XmlElementPrefix() {
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