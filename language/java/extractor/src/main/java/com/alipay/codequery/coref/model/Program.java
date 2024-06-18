package com.alipay.codequery.coref.model;

import java.util.ArrayList;
import java.util.List;


public class Program extends Node {

    public List<Node> list = new ArrayList<Node>();

    // FIXME: the correct concept is root.
    // FIXME: rootdir should be in some table like Debug/Job Information
    public String prefix = "";

    public Program(Long hashId) {
        super(hashId);
    }

    public com.alipay.codequery.dal.mybatis.domain.Program extractProgram(){
        return new com.alipay.codequery.dal.mybatis.domain.Program(this.hashId, this.prefix);
    }
}
