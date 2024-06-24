package com.alipay.codequery.coref.model;


public class LocalVariable extends Variable {

    public LocalVariable(Long hashId) {
        super(hashId);
    }

    public com.alipay.codequery.dal.mybatis.domain.LocalVariable extractLocalVariable(){
        return new com.alipay.codequery.dal.mybatis.domain.LocalVariable(this.hashId, this.parent.hashId, this.location.hashId, this.debug_message, this.name, this.index);
    }
}
