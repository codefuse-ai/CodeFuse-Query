package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PgFunctionTableSourceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_function_table_source")
    public static final PgFunctionTableSource pgFunctionTableSource = new PgFunctionTableSource();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_function_table_source.oid")
    public static final SqlColumn<Long> oid = pgFunctionTableSource.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_function_table_source")
    public static final class PgFunctionTableSource extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public PgFunctionTableSource() {
            super("pg_function_table_source");
        }
    }
}