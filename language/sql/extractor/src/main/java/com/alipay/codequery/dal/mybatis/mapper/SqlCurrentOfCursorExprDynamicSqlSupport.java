package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCurrentOfCursorExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_current_of_cursor_expr")
    public static final SqlCurrentOfCursorExpr sqlCurrentOfCursorExpr = new SqlCurrentOfCursorExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_current_of_cursor_expr.oid")
    public static final SqlColumn<Long> oid = sqlCurrentOfCursorExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_current_of_cursor_expr.cursor_name_oid")
    public static final SqlColumn<Long> cursorNameOid = sqlCurrentOfCursorExpr.cursorNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_current_of_cursor_expr")
    public static final class SqlCurrentOfCursorExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> cursorNameOid = column("`cursor_name_oid`", JDBCType.BIGINT);

        public SqlCurrentOfCursorExpr() {
            super("sql_current_of_cursor_expr");
        }
    }
}