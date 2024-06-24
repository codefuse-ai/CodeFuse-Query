package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ParentDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    public static final Parent parent = new Parent();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: parent.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = parent.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: parent.parent_type")
    public static final SqlColumn<String> parentType = parent.parentType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    public static final class Parent extends SqlTable {
        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> parentType = column("parent_type", JDBCType.VARCHAR);

        public Parent() {
            super("parent");
        }
    }
}