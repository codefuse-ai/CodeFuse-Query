package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowMasterLogsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_master_logs_statement")
    public static final MySqlShowMasterLogsStatement mySqlShowMasterLogsStatement = new MySqlShowMasterLogsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_master_logs_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowMasterLogsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_master_logs_statement")
    public static final class MySqlShowMasterLogsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlShowMasterLogsStatement() {
            super("my_sql_show_master_logs_statement");
        }
    }
}