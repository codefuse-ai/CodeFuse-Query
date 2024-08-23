package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlWithSubqueryClauseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    public static final SqlWithSubqueryClause sqlWithSubqueryClause = new SqlWithSubqueryClause();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_with_subquery_clause.oid")
    public static final SqlColumn<Long> oid = sqlWithSubqueryClause.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_with_subquery_clause.entries")
    public static final SqlColumn<String> entries = sqlWithSubqueryClause.entries;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_with_subquery_clause.recursive")
    public static final SqlColumn<Integer> recursive = sqlWithSubqueryClause.recursive;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    public static final class SqlWithSubqueryClause extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> entries = column("`entries`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> recursive = column("`recursive`", JDBCType.BIGINT);

        public SqlWithSubqueryClause() {
            super("sql_with_subquery_clause");
        }
    }
}