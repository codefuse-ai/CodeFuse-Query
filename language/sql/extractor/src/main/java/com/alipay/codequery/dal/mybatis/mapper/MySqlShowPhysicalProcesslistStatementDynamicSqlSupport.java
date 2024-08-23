package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowPhysicalProcesslistStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_physical_processlist_statement")
    public static final MySqlShowPhysicalProcesslistStatement mySqlShowPhysicalProcesslistStatement = new MySqlShowPhysicalProcesslistStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_physical_processlist_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowPhysicalProcesslistStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_physical_processlist_statement.is_full")
    public static final SqlColumn<Integer> isFull = mySqlShowPhysicalProcesslistStatement.isFull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_physical_processlist_statement")
    public static final class MySqlShowPhysicalProcesslistStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFull = column("`is_full`", JDBCType.BIGINT);

        public MySqlShowPhysicalProcesslistStatement() {
            super("my_sql_show_physical_processlist_statement");
        }
    }
}