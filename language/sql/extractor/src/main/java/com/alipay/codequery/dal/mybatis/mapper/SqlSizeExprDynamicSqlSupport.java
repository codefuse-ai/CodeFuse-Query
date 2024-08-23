package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlSizeExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_size_expr")
    public static final SqlSizeExpr sqlSizeExpr = new SqlSizeExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_size_expr.oid")
    public static final SqlColumn<Long> oid = sqlSizeExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_size_expr.unit")
    public static final SqlColumn<String> unit = sqlSizeExpr.unit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_size_expr.value_oid")
    public static final SqlColumn<Long> valueOid = sqlSizeExpr.valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_size_expr")
    public static final class SqlSizeExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> unit = column("`unit`", JDBCType.VARCHAR);

        public final SqlColumn<Long> valueOid = column("`value_oid`", JDBCType.BIGINT);

        public SqlSizeExpr() {
            super("sql_size_expr");
        }
    }
}