package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlExprHintDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_hint")
    public static final SqlExprHint sqlExprHint = new SqlExprHint();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_expr_hint.oid")
    public static final SqlColumn<Long> oid = sqlExprHint.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_expr_hint.expr_oid")
    public static final SqlColumn<Long> exprOid = sqlExprHint.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_hint")
    public static final class SqlExprHint extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public SqlExprHint() {
            super("sql_expr_hint");
        }
    }
}