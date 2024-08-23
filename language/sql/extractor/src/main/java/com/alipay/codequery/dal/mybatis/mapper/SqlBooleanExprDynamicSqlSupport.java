package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlBooleanExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_boolean_expr")
    public static final SqlBooleanExpr sqlBooleanExpr = new SqlBooleanExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_boolean_expr.oid")
    public static final SqlColumn<Long> oid = sqlBooleanExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_boolean_expr.boolean_value")
    public static final SqlColumn<Integer> booleanValue = sqlBooleanExpr.booleanValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_boolean_expr.value")
    public static final SqlColumn<Integer> value = sqlBooleanExpr.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_boolean_expr")
    public static final class SqlBooleanExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> booleanValue = column("`boolean_value`", JDBCType.BIGINT);

        public final SqlColumn<Integer> value = column("`value`", JDBCType.BIGINT);

        public SqlBooleanExpr() {
            super("sql_boolean_expr");
        }
    }
}