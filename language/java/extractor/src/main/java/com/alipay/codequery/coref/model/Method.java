package com.alipay.codequery.coref.model;

import com.alipay.codequery.dal.mybatis.domain.Constructor;


public class Method extends Node {
    public Identifier identifier;
    public Type returnType;
    public String signature;
    public String definitionBody;

    public Method(Long hashId) {
        super(hashId);
    }

    public com.alipay.codequery.dal.mybatis.domain.Method extractMethodDeclaration() {
        return new com.alipay.codequery.dal.mybatis.domain.Method(this.hashId, identifier.name, signature, this.returnType.hashId, parent.hashId, this.location.hashId, this.definitionBody);
    }

    public com.alipay.codequery.dal.mybatis.domain.Constructor extractConstructor() {
        return new Constructor(this.hashId, identifier.name, signature, parent.hashId, this.location.hashId, this.definitionBody);
    }

}
