package com.alipay.codequery.util;


public class IdGenerator {
    private static int idCount = 0;

    public static int nextID() {
        return idCount++;
    }
}