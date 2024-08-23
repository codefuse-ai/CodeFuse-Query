package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlCharExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    public static final MySqlCharExpr mySqlCharExpr = new MySqlCharExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_char_expr.oid")
    public static final SqlColumn<Long> oid = mySqlCharExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_char_expr.charset")
    public static final SqlColumn<String> charset = mySqlCharExpr.charset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_char_expr.collate")
    public static final SqlColumn<String> collate = mySqlCharExpr.collate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_char_expr.type")
    public static final SqlColumn<String> type = mySqlCharExpr.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    public static final class MySqlCharExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> charset = column("`charset`", JDBCType.VARCHAR);

        public final SqlColumn<String> collate = column("`collate`", JDBCType.VARCHAR);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public MySqlCharExpr() {
            super("my_sql_char_expr");
        }
    }
}