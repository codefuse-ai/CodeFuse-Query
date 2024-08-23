/*
 * Automatically Generated From DbTypeEnum.java.j2.
 * Do Not Edit Directly!
 *
 * Ant Group
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.alipay.codequery.coref.sql;

public enum DbTypeEnum {
    
    /**
     * ANTSPARK SQL
     */
    ANTSPARK("antspark"),
    
    /**
     * BLINK SQL
     */
    BLINK("blink"),
    
    /**
     * CLICKHOUSE SQL
     */
    CLICKHOUSE("clickhouse"),
    
    /**
     * DB2 SQL
     */
    DB2("db2"),
    
    /**
     * HIVE SQL
     */
    HIVE("hive"),
    
    /**
     * MYSQL SQL
     */
    MYSQL("mysql"),
    
    /**
     * ODPS SQL
     */
    ODPS("odps"),
    
    /**
     * ORACLE SQL
     */
    ORACLE("oracle"),
    
    /**
     * OSCAR SQL
     */
    OSCAR("oscar"),
    
    /**
     * PHOENIX SQL
     */
    PHOENIX("phoenix"),
    
    /**
     * POSTGRESQL SQL
     */
    POSTGRESQL("postgresql"),
    
    /**
     * PRESTO SQL
     */
    PRESTO("presto"),
    
    /**
     * SQL SQL
     */
    SQL("sql"),
    
    /**
     * SQLSERVER SQL
     */
    SQLSERVER("sqlserver"),
    
    /**
     * OTHER SQL, fallback db type.
     */
    OTHER("other");

    private final String name;

    public String getName() {
        return name;
    }

    DbTypeEnum(String name) {
        this.name = name;
    }

    /**
     * 根据name的值获取枚举类型
     * @param name
     * @return
     */
    public static DbTypeEnum getByName(String name) {
        for (DbTypeEnum aName : values()) {
            if (aName.getName().equalsIgnoreCase(name)) {
                return aName;
            }
        }
        return null;
    }
}