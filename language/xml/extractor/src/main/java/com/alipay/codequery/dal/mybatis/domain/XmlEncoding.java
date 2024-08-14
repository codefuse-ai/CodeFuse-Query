package com.alipay.codequery.dal.mybatis.domain;

import javax.persistence.*;

@Table(name = "xml_encoding")
public class XmlEncoding {
    @Id
    private Integer id;

    private String encoding;

    public XmlEncoding(Integer id, String encoding) {
        this.id = id;
        this.encoding = encoding;
    }

    public XmlEncoding() {
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
     * @return encoding
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * @param encoding
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding == null ? null : encoding.trim();
    }
}