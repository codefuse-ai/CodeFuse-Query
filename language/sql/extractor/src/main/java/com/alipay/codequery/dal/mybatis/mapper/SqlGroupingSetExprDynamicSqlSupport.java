package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlGroupingSetExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grouping_set_expr")
    public static final SqlGroupingSetExpr sqlGroupingSetExpr = new SqlGroupingSetExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grouping_set_expr.oid")
    public static final SqlColumn<Long> oid = sqlGroupingSetExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grouping_set_expr")
    public static final class SqlGroupingSetExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlGroupingSetExpr() {
            super("sql_grouping_set_expr");
        }
    }
}