package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlUnionQueryTableSourceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query_table_source")
    public static final SqlUnionQueryTableSource sqlUnionQueryTableSource = new SqlUnionQueryTableSource();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query_table_source.oid")
    public static final SqlColumn<Long> oid = sqlUnionQueryTableSource.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query_table_source.union_oid")
    public static final SqlColumn<Long> unionOid = sqlUnionQueryTableSource.unionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query_table_source")
    public static final class SqlUnionQueryTableSource extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> unionOid = column("`union_oid`", JDBCType.BIGINT);

        public SqlUnionQueryTableSource() {
            super("sql_union_query_table_source");
        }
    }
}