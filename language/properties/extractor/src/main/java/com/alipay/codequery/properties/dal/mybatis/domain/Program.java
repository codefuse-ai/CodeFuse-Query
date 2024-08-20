package com.alipay.codequery.properties.dal.mybatis.domain;

import javax.persistence.*;

@Table(name = "program")
public class Program {
    @Column(name = "element_oid")
    private Long elementOid;

    @Column(name = "absolute_path_prefix")
    private String absolutePathPrefix;

    public Program(Long elementOid, String absolutePathPrefix) {
        this.elementOid = elementOid;
        this.absolutePathPrefix = absolutePathPrefix;
    }

    public Program() {
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
     * @return absolute_path_prefix
     */
    public String getAbsolutePathPrefix() {
        return absolutePathPrefix;
    }

    /**
     * @param absolutePathPrefix
     */
    public void setAbsolutePathPrefix(String absolutePathPrefix) {
        this.absolutePathPrefix = absolutePathPrefix == null ? null : absolutePathPrefix.trim();
    }
}