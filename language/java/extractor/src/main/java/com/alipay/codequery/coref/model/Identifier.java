package com.alipay.codequery.coref.model;


public class Identifier extends Node {

    public Identifier(String name, Long hashId) {
        super(hashId);
        this.name = name;
        this.hashId = hashId;
    }
    public String name;

    public com.alipay.codequery.dal.mybatis.domain.Identifier extractIdentifier(){
        return new com.alipay.codequery.dal.mybatis.domain.Identifier(this.hashId,this.location.hashId,this.name,this.parent.hashId);
    }
}
