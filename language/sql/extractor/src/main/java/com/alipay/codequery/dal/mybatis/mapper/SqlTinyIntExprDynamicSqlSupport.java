package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlTinyIntExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_tiny_int_expr")
    public static final SqlTinyIntExpr sqlTinyIntExpr = new SqlTinyIntExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_tiny_int_expr.oid")
    public static final SqlColumn<Long> oid = sqlTinyIntExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_tiny_int_expr.number")
    public static final SqlColumn<String> number = sqlTinyIntExpr.number;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_tiny_int_expr.value")
    public static final SqlColumn<Integer> value = sqlTinyIntExpr.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_tiny_int_expr")
    public static final class SqlTinyIntExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> number = column("`number`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> value = column("`value`", JDBCType.BIGINT);

        public SqlTinyIntExpr() {
            super("sql_tiny_int_expr");
        }
    }
}