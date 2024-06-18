package com.alipay.codequery.coref.model;


public class Parameter extends Variable {
    public int index;

    public Parameter(Long hashId) {
        super(hashId);
    }

    public com.alipay.codequery.dal.mybatis.domain.Parameter extractParameter() {
        return new com.alipay.codequery.dal.mybatis.domain.Parameter(this.hashId, this.name, this.index, this.parent.hashId, this.location.hashId, this.debug_message, this.type.hashId);
    }
}
