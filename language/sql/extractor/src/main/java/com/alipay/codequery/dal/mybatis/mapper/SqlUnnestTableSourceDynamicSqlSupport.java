package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlUnnestTableSourceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_unnest_table_source")
    public static final SqlUnnestTableSource sqlUnnestTableSource = new SqlUnnestTableSource();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_unnest_table_source.oid")
    public static final SqlColumn<Long> oid = sqlUnnestTableSource.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_unnest_table_source.is_ordinality")
    public static final SqlColumn<Integer> isOrdinality = sqlUnnestTableSource.isOrdinality;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_unnest_table_source")
    public static final class SqlUnnestTableSource extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOrdinality = column("`is_ordinality`", JDBCType.BIGINT);

        public SqlUnnestTableSource() {
            super("sql_unnest_table_source");
        }
    }
}