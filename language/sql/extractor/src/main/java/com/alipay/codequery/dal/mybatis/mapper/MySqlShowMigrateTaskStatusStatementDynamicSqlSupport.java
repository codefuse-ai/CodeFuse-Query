package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowMigrateTaskStatusStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_migrate_task_status_statement")
    public static final MySqlShowMigrateTaskStatusStatement mySqlShowMigrateTaskStatusStatement = new MySqlShowMigrateTaskStatusStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_migrate_task_status_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowMigrateTaskStatusStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_migrate_task_status_statement.where_oid")
    public static final SqlColumn<Long> whereOid = mySqlShowMigrateTaskStatusStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_migrate_task_status_statement")
    public static final class MySqlShowMigrateTaskStatusStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public MySqlShowMigrateTaskStatusStatement() {
            super("my_sql_show_migrate_task_status_statement");
        }
    }
}