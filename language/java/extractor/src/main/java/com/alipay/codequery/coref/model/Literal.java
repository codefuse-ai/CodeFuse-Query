package com.alipay.codequery.coref.model;


import com.alipay.codequery.dal.mybatis.domain.StringLiteral;

public class Literal extends Expression {

    public Literal(Long hashId) {
        super(hashId);
    }

    public Object value;
    public String type;

    public StringLiteral extractLiteral() {
        return new StringLiteral(this.hashId, this.value.toString());
    }
}
