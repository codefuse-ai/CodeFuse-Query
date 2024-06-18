package com.alipay.codequery.coref.model;

public class NpMethod extends Node {
    public String name;
    public Type returnType;
    public String signature;

    public NpMethod(Long hashId) {
        super(hashId);
    }

    public com.alipay.codequery.dal.mybatis.domain.NpMethod extractNpMethod() {
        return new com.alipay.codequery.dal.mybatis.domain.NpMethod(this.hashId, name, signature, this.returnType.hashId, parent.hashId);
    }
}
