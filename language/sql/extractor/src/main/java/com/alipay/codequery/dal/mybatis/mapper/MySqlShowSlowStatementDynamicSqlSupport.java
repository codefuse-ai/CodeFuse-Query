package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowSlowStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    public static final MySqlShowSlowStatement mySqlShowSlowStatement = new MySqlShowSlowStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_slow_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowSlowStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_slow_statement.is_full")
    public static final SqlColumn<Integer> isFull = mySqlShowSlowStatement.isFull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_slow_statement.is_physical")
    public static final SqlColumn<Integer> isPhysical = mySqlShowSlowStatement.isPhysical;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_slow_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = mySqlShowSlowStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_slow_statement.order_by_oid")
    public static final SqlColumn<Long> orderByOid = mySqlShowSlowStatement.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_slow_statement.where_oid")
    public static final SqlColumn<Long> whereOid = mySqlShowSlowStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    public static final class MySqlShowSlowStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFull = column("`is_full`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isPhysical = column("`is_physical`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public MySqlShowSlowStatement() {
            super("my_sql_show_slow_statement");
        }
    }
}