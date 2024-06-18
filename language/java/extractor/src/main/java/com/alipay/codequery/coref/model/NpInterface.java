package com.alipay.codequery.coref.model;

public class NpInterface extends Node {
    public String name;
    public String qualifiedName;
    public String extension;

    public NpInterface(Long hashId) {
        super(hashId);
    }

    public com.alipay.codequery.dal.mybatis.domain.NpInterface extractNpInterface() {
        return new com.alipay.codequery.dal.mybatis.domain.NpInterface(hashId, name, qualifiedName, parent.hashId);
    }
}
