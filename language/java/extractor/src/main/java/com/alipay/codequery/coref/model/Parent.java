package com.alipay.codequery.coref.model;

import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
public class Parent extends Node {
    public Long childId;
    public String parentType;

    public Parent(Long hashId) {
        super(hashId);
    }

    public com.alipay.codequery.dal.mybatis.domain.Parent extractParent(){
        return new com.alipay.codequery.dal.mybatis.domain.Parent(this.hashId,this.parentType);

    }
}
