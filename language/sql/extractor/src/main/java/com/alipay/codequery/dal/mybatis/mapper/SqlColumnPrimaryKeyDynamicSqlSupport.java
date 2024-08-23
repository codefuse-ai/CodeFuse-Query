package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlColumnPrimaryKeyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_primary_key")
    public static final SqlColumnPrimaryKey sqlColumnPrimaryKey = new SqlColumnPrimaryKey();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_primary_key.oid")
    public static final SqlColumn<Long> oid = sqlColumnPrimaryKey.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_primary_key")
    public static final class SqlColumnPrimaryKey extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlColumnPrimaryKey() {
            super("sql_column_primary_key");
        }
    }
}