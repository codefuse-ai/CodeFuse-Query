package com.alipay.codequery.coref.model;

public class Constructor extends Method {
    public int isConstructor;

    public Constructor(int id, Long hashId) {
        super(hashId);
    }

    public com.alipay.codequery.dal.mybatis.domain.Constructor extractConstructor(){
        return new com.alipay.codequery.dal.mybatis.domain.Constructor(this.hashId, this.identifier.name, this.signature,this.parent.hashId,this.location.hashId, this.definitionBody);
    }
}
