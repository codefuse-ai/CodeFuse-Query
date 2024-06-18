package com.alipay.codequery.coref.model;


public class Primitive extends Type {

    public String value;

    public Primitive(Long hashId) {
        super(hashId);
    }

    public enum PrimitiveType {
        BYTE,
        CHAR,
        DOUBLE,
        FLOAT,
        INT,
        LONG,
        SHORT,
        BOOLEAN,
        VOID,
        NULL
    }

}
