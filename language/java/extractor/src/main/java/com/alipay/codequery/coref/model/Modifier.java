package com.alipay.codequery.coref.model;

import com.alipay.codequery.dal.mybatis.domain.ModifierList;


public class Modifier extends Node {
    String PUBLIC = "public";
    String PROTECTED = "protected";
    String PRIVATE = "private";
    String PACKAGE_LOCAL = "packageLocal";
    String STATIC = "static";
    String ABSTRACT = "abstract";
    String FINAL = "final";
    String NATIVE = "native";
    String SYNCHRONIZED = "synchronized";
    String STRICTFP = "strictfp";
    String TRANSIENT = "transient";
    String VOLATILE = "volatile";
    String DEFAULT = "default";
    String OPEN = "open";
    String TRANSITIVE = "transitive";
    String SEALED = "sealed";
    String NON_SEALED = "non-sealed";

    String[] MODIFIERS = {
        PUBLIC, PROTECTED, PRIVATE, STATIC, ABSTRACT, FINAL, NATIVE, SYNCHRONIZED, STRICTFP, TRANSIENT, VOLATILE, DEFAULT, OPEN, TRANSITIVE, SEALED, NON_SEALED
    };

    public Modifier(Long hashId) {
        super(hashId);
    }

    public String name;

    public com.alipay.codequery.dal.mybatis.domain.Modifier extractModifier(){
        return new com.alipay.codequery.dal.mybatis.domain.Modifier(this.hashId, name,this.parent.hashId,this.location.hashId);
    }

    public ModifierList extractModifierList(){
        return new ModifierList(this.hashId,this.parent.hashId,this.location.hashId);
    }
}
