package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlMatchAgainstExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    public static final SqlMatchAgainstExpr sqlMatchAgainstExpr = new SqlMatchAgainstExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_match_against_expr.oid")
    public static final SqlColumn<Long> oid = sqlMatchAgainstExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_match_against_expr.against_oid")
    public static final SqlColumn<Long> againstOid = sqlMatchAgainstExpr.againstOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_match_against_expr.search_modifier")
    public static final SqlColumn<String> searchModifier = sqlMatchAgainstExpr.searchModifier;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    public static final class SqlMatchAgainstExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> againstOid = column("`against_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> searchModifier = column("`search_modifier`", JDBCType.VARCHAR);

        public SqlMatchAgainstExpr() {
            super("sql_match_against_expr");
        }
    }
}