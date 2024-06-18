package com.alipay.codequery.coref.model;


public class Module extends Node {
    public Module(Long hashId) {
        super(hashId);
    }

    public com.alipay.codequery.dal.mybatis.domain.Module extractModule(){
        return new com.alipay.codequery.dal.mybatis.domain.Module(this.hashId,this.debug_message);
    }
}
