package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlColumnUniqueKeyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_unique_key")
    public static final SqlColumnUniqueKey sqlColumnUniqueKey = new SqlColumnUniqueKey();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_unique_key.oid")
    public static final SqlColumn<Long> oid = sqlColumnUniqueKey.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_unique_key")
    public static final class SqlColumnUniqueKey extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlColumnUniqueKey() {
            super("sql_column_unique_key");
        }
    }
}