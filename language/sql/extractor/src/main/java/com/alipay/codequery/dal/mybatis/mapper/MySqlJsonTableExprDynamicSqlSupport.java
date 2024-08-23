package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlJsonTableExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    public static final MySqlJsonTableExpr mySqlJsonTableExpr = new MySqlJsonTableExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_json_table_expr.oid")
    public static final SqlColumn<Long> oid = mySqlJsonTableExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_json_table_expr.columns")
    public static final SqlColumn<String> columns = mySqlJsonTableExpr.columns;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_json_table_expr.expr_oid")
    public static final SqlColumn<Long> exprOid = mySqlJsonTableExpr.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_json_table_expr.path_oid")
    public static final SqlColumn<Long> pathOid = mySqlJsonTableExpr.pathOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    public static final class MySqlJsonTableExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> columns = column("`columns`", JDBCType.VARCHAR);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> pathOid = column("`path_oid`", JDBCType.BIGINT);

        public MySqlJsonTableExpr() {
            super("my_sql_json_table_expr");
        }
    }
}