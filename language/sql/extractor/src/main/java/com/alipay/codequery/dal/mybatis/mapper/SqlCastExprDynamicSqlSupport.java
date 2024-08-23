package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCastExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_cast_expr")
    public static final SqlCastExpr sqlCastExpr = new SqlCastExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cast_expr.oid")
    public static final SqlColumn<Long> oid = sqlCastExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cast_expr.data_type_oid")
    public static final SqlColumn<Long> dataTypeOid = sqlCastExpr.dataTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cast_expr.expr_oid")
    public static final SqlColumn<Long> exprOid = sqlCastExpr.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cast_expr.is_try")
    public static final SqlColumn<Integer> isTry = sqlCastExpr.isTry;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_cast_expr")
    public static final class SqlCastExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dataTypeOid = column("`data_type_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isTry = column("`is_try`", JDBCType.BIGINT);

        public SqlCastExpr() {
            super("sql_cast_expr");
        }
    }
}