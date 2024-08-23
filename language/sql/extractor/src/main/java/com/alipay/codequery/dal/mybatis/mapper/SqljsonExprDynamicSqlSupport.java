package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqljsonExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqljson_expr")
    public static final SqljsonExpr sqljsonExpr = new SqljsonExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sqljson_expr.oid")
    public static final SqlColumn<Long> oid = sqljsonExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sqljson_expr.literal")
    public static final SqlColumn<String> literal = sqljsonExpr.literal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sqljson_expr.value")
    public static final SqlColumn<String> value = sqljsonExpr.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqljson_expr")
    public static final class SqljsonExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> literal = column("`literal`", JDBCType.VARCHAR);

        public final SqlColumn<String> value = column("`value`", JDBCType.VARCHAR);

        public SqljsonExpr() {
            super("sqljson_expr");
        }
    }
}