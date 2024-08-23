package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowBroadcastsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_broadcasts_statement")
    public static final MySqlShowBroadcastsStatement mySqlShowBroadcastsStatement = new MySqlShowBroadcastsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_broadcasts_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowBroadcastsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_broadcasts_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = mySqlShowBroadcastsStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_broadcasts_statement.order_by_oid")
    public static final SqlColumn<Long> orderByOid = mySqlShowBroadcastsStatement.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_broadcasts_statement.where_oid")
    public static final SqlColumn<Long> whereOid = mySqlShowBroadcastsStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_broadcasts_statement")
    public static final class MySqlShowBroadcastsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public MySqlShowBroadcastsStatement() {
            super("my_sql_show_broadcasts_statement");
        }
    }
}