package com.alipay.codequery.coref.model;

import com.alipay.codequery.dal.mybatis.domain.*;
import com.alipay.codequery.dal.mybatis.domain.Primitive;

import java.util.ArrayList;


public class Type extends Node {
    public String name;
    public String qualifiedName;
    public int isInferred;
    public Node innermostComponentReferenceElement;

    public Type(Long hashId) {
        this.hashId = hashId;
    }

    public ReferenceType extractReferenceType(){
        return new ReferenceType(this.hashId, this.name,this.qualifiedName);
    }
    public TypeElement extractTypeElement(){
        return new TypeElement( this.hashId,this.type.hashId,this.debug_message,this.parent.hashId,this.location.hashId);
    }
    public enum PrimitiveType {
        BYTE ("byte", 1),
        CHAR ("char", 2),
        DOUBLE ("double", 3),
        FLOAT ("float", 4),
        INT ("int", 5),
        LONG ("long", 6),
        SHORT ("short", 7),
        BOOLEAN("boolean", 8),
        VOID ("void", 9),
        NULL ("null", 10);
        public String name;
        public int index;

        public static ArrayList<PrimitiveType> values =new ArrayList<>();

        PrimitiveType(String name, int index){
            this.name = name;
            this.index = index;
        }

        public Primitive extractPrimitive(){
            return new Primitive(this.index, this.name);
        }

        static {
            for (PrimitiveType value : PrimitiveType.values()) {
                    PrimitiveType.values.add(value);
            }
        }
    }

    public static class TypeLiteral extends Type {
        public Type type;
        public Type typeElement;

        public TypeLiteral(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.dal.mybatis.domain.TypeLiteral extractTypeLiteral(){
            return new com.alipay.codequery.dal.mybatis.domain.TypeLiteral(this.hashId, this.typeElement.hashId, this.type.hashId);
        }

    }

    public static class TypeParameter extends Type {
        public Node owner;
        public Node extendsList;
        public int index;

        public TypeParameter(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.dal.mybatis.domain.TypeParameter extractTypeParameter(){
            return new com.alipay.codequery.dal.mybatis.domain.TypeParameter(this.hashId,this.debug_message,this.owner.hashId,this.index,this.extendsList.hashId, this.parent.hashId,this.location.hashId);
        }

    }
}
