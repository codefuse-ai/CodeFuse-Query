package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlValuesQueryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_values_query")
    public static final SqlValuesQuery sqlValuesQuery = new SqlValuesQuery();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_values_query.oid")
    public static final SqlColumn<Long> oid = sqlValuesQuery.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_values_query")
    public static final class SqlValuesQuery extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlValuesQuery() {
            super("sql_values_query");
        }
    }
}