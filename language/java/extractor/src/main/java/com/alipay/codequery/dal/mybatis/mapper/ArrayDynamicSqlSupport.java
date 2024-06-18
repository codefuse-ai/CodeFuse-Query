package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ArrayDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array")
    public static final Array array = new Array();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array.element_hash_id")
    public static final SqlColumn<Long> elementHashId = array.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array.name")
    public static final SqlColumn<String> name = array.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array")
    public static final class Array extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public Array() {
            super("array");
        }
    }
}