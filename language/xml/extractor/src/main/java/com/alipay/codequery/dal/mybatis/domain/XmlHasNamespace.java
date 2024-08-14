package com.alipay.codequery.dal.mybatis.domain;

import javax.persistence.*;

@Table(name = "xml_has_namespace")
public class XmlHasNamespace {
    @Id
    private Integer id;

    @Column(name = "element_id")
    private Integer elementId;

    @Column(name = "namespace_id")
    private Integer namespaceId;

    @Column(name = "container_id")
    private Integer containerId;

    public XmlHasNamespace(Integer id, Integer elementId, Integer namespaceId, Integer containerId) {
        this.id = id;
        this.elementId = elementId;
        this.namespaceId = namespaceId;
        this.containerId = containerId;
    }

    public XmlHasNamespace() {
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
     * @return namespace_id
     */
    public Integer getNamespaceId() {
        return namespaceId;
    }

    /**
     * @param namespaceId
     */
    public void setNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
    }

    /**
     * @return container_id
     */
    public Integer getContainerId() {
        return containerId;
    }

    /**
     * @param containerId
     */
    public void setContainerId(Integer containerId) {
        this.containerId = containerId;
    }
}