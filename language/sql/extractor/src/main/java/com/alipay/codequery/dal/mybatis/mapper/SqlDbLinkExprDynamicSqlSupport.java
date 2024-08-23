package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDbLinkExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    public static final SqlDbLinkExpr sqlDbLinkExpr = new SqlDbLinkExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_db_link_expr.oid")
    public static final SqlColumn<Long> oid = sqlDbLinkExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_db_link_expr.db_link")
    public static final SqlColumn<String> dbLink = sqlDbLinkExpr.dbLink;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_db_link_expr.expr_oid")
    public static final SqlColumn<Long> exprOid = sqlDbLinkExpr.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_db_link_expr.resolved_column_oid")
    public static final SqlColumn<Long> resolvedColumnOid = sqlDbLinkExpr.resolvedColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_db_link_expr.simple_name")
    public static final SqlColumn<String> simpleName = sqlDbLinkExpr.simpleName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    public static final class SqlDbLinkExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> dbLink = column("`db_link`", JDBCType.VARCHAR);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> resolvedColumnOid = column("`resolved_column_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> simpleName = column("`simple_name`", JDBCType.VARCHAR);

        public SqlDbLinkExpr() {
            super("sql_db_link_expr");
        }
    }
}