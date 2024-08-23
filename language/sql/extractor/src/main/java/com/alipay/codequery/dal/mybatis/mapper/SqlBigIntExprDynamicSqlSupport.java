package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlBigIntExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_big_int_expr")
    public static final SqlBigIntExpr sqlBigIntExpr = new SqlBigIntExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_big_int_expr.oid")
    public static final SqlColumn<Long> oid = sqlBigIntExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_big_int_expr.number")
    public static final SqlColumn<String> number = sqlBigIntExpr.number;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_big_int_expr.value")
    public static final SqlColumn<String> value = sqlBigIntExpr.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_big_int_expr")
    public static final class SqlBigIntExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> number = column("`number`", JDBCType.VARCHAR);

        public final SqlColumn<String> value = column("`value`", JDBCType.VARCHAR);

        public SqlBigIntExpr() {
            super("sql_big_int_expr");
        }
    }
}