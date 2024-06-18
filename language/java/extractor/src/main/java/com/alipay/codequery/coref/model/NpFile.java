package com.alipay.codequery.coref.model;

public class NpFile extends Node {
    public String qualifiedName;
    public String extension;
    public String name;
    public Long projectId;

    public NpFile(Long hashId) {
        super(hashId);
    }

    public com.alipay.codequery.dal.mybatis.domain.NpFile extractNpFile() {
        return new com.alipay.codequery.dal.mybatis.domain.NpFile(hashId, qualifiedName, name, projectId);
    }
}
