package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FieldDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: field")
    public static final Field field = new Field();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: field.element_hash_id")
    public static final SqlColumn<Long> elementHashId = field.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: field.name")
    public static final SqlColumn<String> name = field.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: field.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = field.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: field.debug_message")
    public static final SqlColumn<String> debugMessage = field.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: field.location_hash_id")
    public static final SqlColumn<Long> locationHashId = field.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: field")
    public static final class Field extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public Field() {
            super("field");
        }
    }
}