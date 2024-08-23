package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlFlashbackExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_flashback_expr")
    public static final SqlFlashbackExpr sqlFlashbackExpr = new SqlFlashbackExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_flashback_expr.oid")
    public static final SqlColumn<Long> oid = sqlFlashbackExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_flashback_expr.expr_oid")
    public static final SqlColumn<Long> exprOid = sqlFlashbackExpr.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_flashback_expr.type")
    public static final SqlColumn<String> type = sqlFlashbackExpr.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_flashback_expr")
    public static final class SqlFlashbackExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public SqlFlashbackExpr() {
            super("sql_flashback_expr");
        }
    }
}