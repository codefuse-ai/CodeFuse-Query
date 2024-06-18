package com.alipay.codequery.coref.model;

import lombok.Data;


@Data
public class Node {

    public Location location;
    public String debug_message;
    public Long hashId;
    public Type type;
    public Node parent;

    public Node(Long hashId) {
        this.hashId = hashId;
    }

    public Node() {
    }

}


