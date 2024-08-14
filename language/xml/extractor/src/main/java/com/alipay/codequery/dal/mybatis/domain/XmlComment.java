package com.alipay.codequery.dal.mybatis.domain;

import javax.persistence.*;

@Table(name = "xml_comment")
public class XmlComment {
    @Id
    private Integer id;

    private String text;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "location_id")
    private Integer locationId;

    public XmlComment(Integer id, String text, Integer parentId, Integer locationId) {
        this.id = id;
        this.text = text;
        this.parentId = parentId;
        this.locationId = locationId;
    }

    public XmlComment() {
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