package com.alipay.codequery.dal.mybatis.domain;

import javax.persistence.*;

@Table(name = "xml_namespace")
public class XmlNamespace {
    @Id
    private Integer id;

    @Column(name = "prefix_name")
    private String prefixName;

    private String url;

    @Column(name = "location_id")
    private Integer locationId;

    public XmlNamespace(Integer id, String prefixName, String url, Integer locationId) {
        this.id = id;
        this.prefixName = prefixName;
        this.url = url;
        this.locationId = locationId;
    }

    public XmlNamespace() {
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
     * @return prefix_name
     */
    public String getPrefixName() {
        return prefixName;
    }

    /**
     * @param prefixName
     */
    public void setPrefixName(String prefixName) {
        this.prefixName = prefixName == null ? null : prefixName.trim();
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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