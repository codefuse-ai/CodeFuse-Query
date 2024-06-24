package com.alipay.codequery.coref.model;

import com.alipay.codequery.dal.mybatis.domain.Array;


public class Variable extends Node{

    public Identifier identifier;
    public String name;
    public int index;

    public Variable(Long hashId) {
        super(hashId);
    }

    public Array extractArray(){
        return new Array(this.hashId, this.name);
    }
}
