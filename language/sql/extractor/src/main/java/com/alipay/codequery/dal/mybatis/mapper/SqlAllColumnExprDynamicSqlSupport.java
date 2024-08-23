package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAllColumnExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_all_column_expr")
    public static final SqlAllColumnExpr sqlAllColumnExpr = new SqlAllColumnExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_all_column_expr.oid")
    public static final SqlColumn<Long> oid = sqlAllColumnExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_all_column_expr.resolved_table_source_oid")
    public static final SqlColumn<Long> resolvedTableSourceOid = sqlAllColumnExpr.resolvedTableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_all_column_expr")
    public static final class SqlAllColumnExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> resolvedTableSourceOid = column("`resolved_table_source_oid`", JDBCType.BIGINT);

        public SqlAllColumnExpr() {
            super("sql_all_column_expr");
        }
    }
}