package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ExceptionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: exception")
    public static final Exception exception = new Exception();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: exception.element_hash_id")
    public static final SqlColumn<Long> elementHashId = exception.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: exception.type_hash_id")
    public static final SqlColumn<Long> typeHashId = exception.typeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: exception.callable_hash_id")
    public static final SqlColumn<Long> callableHashId = exception.callableHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: exception.name")
    public static final SqlColumn<String> name = exception.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: exception")
    public static final class Exception extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> typeHashId = column("type_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> callableHashId = column("callable_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public Exception() {
            super("exception");
        }
    }
}