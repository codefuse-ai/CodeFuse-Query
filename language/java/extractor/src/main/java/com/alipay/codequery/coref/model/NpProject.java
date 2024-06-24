package com.alipay.codequery.coref.model;

public class NpProject extends Node {
    public String extension;
    public String name;

    public NpProject(Long hashId) {
        super(hashId);
    }

    public com.alipay.codequery.dal.mybatis.domain.NpProject extractNpProject() {
        return new com.alipay.codequery.dal.mybatis.domain.NpProject(hashId, extension, name);
    }
}
