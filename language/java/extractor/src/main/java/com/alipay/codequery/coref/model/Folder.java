package com.alipay.codequery.coref.model;


public class Folder extends Containers{
    public String qualifiedName;
    public String name;

    public Folder(Long hashId) {
        super(hashId);
    }

    public com.alipay.codequery.dal.mybatis.domain.Folder extractFolder(){
        return new com.alipay.codequery.dal.mybatis.domain.Folder(this.hashId,this.qualifiedName,this.name, this.parent.hashId);
    }
}
