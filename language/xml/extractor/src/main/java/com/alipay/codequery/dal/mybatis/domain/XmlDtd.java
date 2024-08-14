package com.alipay.codequery.dal.mybatis.domain;

import javax.persistence.*;

@Table(name = "xml_dtd")
public class XmlDtd {
    @Id
    private Integer id;

    private String root;

    @Column(name = "public_id")
    private String publicId;

    @Column(name = "system_id")
    private String systemId;

    @Column(name = "location_id")
    private Integer locationId;

    public XmlDtd(Integer id, String root, String publicId, String systemId, Integer locationId) {
        this.id = id;
        this.root = root;
        this.publicId = publicId;
        this.systemId = systemId;
        this.locationId = locationId;
    }

    public XmlDtd() {
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
     * @return root
     */
    public String getRoot() {
        return root;
    }

    /**
     * @param root
     */
    public void setRoot(String root) {
        this.root = root == null ? null : root.trim();
    }

    /**
     * @return public_id
     */
    public String getPublicId() {
        return publicId;
    }

    /**
     * @param publicId
     */
    public void setPublicId(String publicId) {
        this.publicId = publicId == null ? null : publicId.trim();
    }

    /**
     * @return system_id
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * @param systemId
     */
    public void setSystemId(String systemId) {
        this.systemId = systemId == null ? null : systemId.trim();
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