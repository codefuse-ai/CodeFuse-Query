package com.alipay.codequery.coref.model;

public class NpClass extends Node {
    public String name;
    public String qualifiedName;

    public NpClass(Long hashId) {
        super(hashId);
    }

    public com.alipay.codequery.dal.mybatis.domain.NpClass extractNpClass() {
        return new com.alipay.codequery.dal.mybatis.domain.NpClass(hashId, name, qualifiedName, parent.hashId);
    }
}
