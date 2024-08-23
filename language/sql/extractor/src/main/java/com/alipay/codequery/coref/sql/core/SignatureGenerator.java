
package com.alipay.codequery.coref.sql.core;

import com.alibaba.druid.sql.ast.SQLObjectImpl;


public class SignatureGenerator {
    public static String generate(SQLObjectImpl sqlObject) {
        if (sqlObject == null) {
            return "null";
        }

        return String.format("%s:%s:(%d,%d)",
                sqlObject.getClass().getSimpleName(),
                sqlObject,
                sqlObject.getSourceLine(),
                sqlObject.getSourceColumn()
        );
    }
}