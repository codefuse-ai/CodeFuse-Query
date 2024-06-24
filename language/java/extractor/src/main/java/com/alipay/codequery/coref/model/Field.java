package com.alipay.codequery.coref.model;

import com.alipay.codequery.dal.mybatis.domain.EnumConstant;


public class Field extends Variable {

    public Field(Long hashId) {
        super(hashId);
    }

    public com.alipay.codequery.dal.mybatis.domain.Field extractField() {
        return new com.alipay.codequery.dal.mybatis.domain.Field(this.hashId, this.name, this.parent.hashId, this.debug_message, this.location.hashId);
    }

    public EnumConstant extractEnumConstant() {
        return new EnumConstant(this.hashId, this.name, this.parent.hashId, this.location.hashId, this.debug_message);
    }
}
