package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowEnginesStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_engines_statement")
    public static final MySqlShowEnginesStatement mySqlShowEnginesStatement = new MySqlShowEnginesStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_engines_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowEnginesStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_engines_statement.is_storage")
    public static final SqlColumn<Integer> isStorage = mySqlShowEnginesStatement.isStorage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_engines_statement")
    public static final class MySqlShowEnginesStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isStorage = column("`is_storage`", JDBCType.BIGINT);

        public MySqlShowEnginesStatement() {
            super("my_sql_show_engines_statement");
        }
    }
}