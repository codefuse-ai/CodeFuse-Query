package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleCursorExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_cursor_expr")
    public static final OracleCursorExpr oracleCursorExpr = new OracleCursorExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_cursor_expr.oid")
    public static final SqlColumn<Long> oid = oracleCursorExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_cursor_expr.query_oid")
    public static final SqlColumn<Long> queryOid = oracleCursorExpr.queryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_cursor_expr")
    public static final class OracleCursorExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> queryOid = column("`query_oid`", JDBCType.BIGINT);

        public OracleCursorExpr() {
            super("oracle_cursor_expr");
        }
    }
}