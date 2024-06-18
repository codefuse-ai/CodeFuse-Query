package com.alipay.codequery.coref.model;


public class File extends Containers{

    public String qualifiedName;
    public String extension;
    public String name;
    public Program program;
    public Location.NumberOfLines numberOfLines;

    public com.alipay.codequery.dal.mybatis.domain.File extractFile(){
        return new com.alipay.codequery.dal.mybatis.domain.File(this.hashId,this.qualifiedName,this.extension,this.name, this.numberOfLines.hashId);
    }

    public File(Long hashId) {
        super(hashId);
    }


}
