package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlSelectQueryBaseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_base")
    public static final SqlSelectQueryBase sqlSelectQueryBase = new SqlSelectQueryBase();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_base.oid")
    public static final SqlColumn<Long> oid = sqlSelectQueryBase.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_base.is_parenthesized")
    public static final SqlColumn<Integer> isParenthesized = sqlSelectQueryBase.isParenthesized;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_base")
    public static final class SqlSelectQueryBase extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isParenthesized = column("`is_parenthesized`", JDBCType.BIGINT);

        public SqlSelectQueryBase() {
            super("sql_select_query_base");
        }
    }
}