package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCurrentUserExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_current_user_expr")
    public static final SqlCurrentUserExpr sqlCurrentUserExpr = new SqlCurrentUserExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_current_user_expr.oid")
    public static final SqlColumn<Long> oid = sqlCurrentUserExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_current_user_expr")
    public static final class SqlCurrentUserExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlCurrentUserExpr() {
            super("sql_current_user_expr");
        }
    }
}