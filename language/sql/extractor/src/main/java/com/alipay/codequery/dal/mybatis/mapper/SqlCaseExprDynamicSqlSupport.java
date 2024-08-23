package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCaseExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    public static final SqlCaseExpr sqlCaseExpr = new SqlCaseExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_case_expr.oid")
    public static final SqlColumn<Long> oid = sqlCaseExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_case_expr.else_expr_oid")
    public static final SqlColumn<Long> elseExprOid = sqlCaseExpr.elseExprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_case_expr.items")
    public static final SqlColumn<String> items = sqlCaseExpr.items;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_case_expr.value_expr_oid")
    public static final SqlColumn<Long> valueExprOid = sqlCaseExpr.valueExprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    public static final class SqlCaseExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> elseExprOid = column("`else_expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> items = column("`items`", JDBCType.VARCHAR);

        public final SqlColumn<Long> valueExprOid = column("`value_expr_oid`", JDBCType.BIGINT);

        public SqlCaseExpr() {
            super("sql_case_expr");
        }
    }
}