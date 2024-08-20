package com.alipay.codequery.properties.dal.mybatis.domain;

import javax.persistence.*;

@Table(name = "container_parent")
public class ContainerParent {
    @Column(name = "child_oid")
    private Long childOid;

    @Column(name = "parent_oid")
    private Long parentOid;

    public ContainerParent(Long childOid, Long parentOid) {
        this.childOid = childOid;
        this.parentOid = parentOid;
    }

    public ContainerParent() {
        super();
    }

    /**
     * @return child_oid
     */
    public Long getChildOid() {
        return childOid;
    }

    /**
     * @param childOid
     */
    public void setChildOid(Long childOid) {
        this.childOid = childOid;
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
}