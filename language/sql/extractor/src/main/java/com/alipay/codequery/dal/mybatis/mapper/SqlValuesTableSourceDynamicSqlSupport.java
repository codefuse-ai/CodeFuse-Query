package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlValuesTableSourceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_values_table_source")
    public static final SqlValuesTableSource sqlValuesTableSource = new SqlValuesTableSource();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_values_table_source.oid")
    public static final SqlColumn<Long> oid = sqlValuesTableSource.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_values_table_source.is_parenthesized")
    public static final SqlColumn<Integer> isParenthesized = sqlValuesTableSource.isParenthesized;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_values_table_source")
    public static final class SqlValuesTableSource extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isParenthesized = column("`is_parenthesized`", JDBCType.BIGINT);

        public SqlValuesTableSource() {
            super("sql_values_table_source");
        }
    }
}