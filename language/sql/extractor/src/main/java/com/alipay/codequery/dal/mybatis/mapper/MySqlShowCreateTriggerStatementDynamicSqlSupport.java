package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowCreateTriggerStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_create_trigger_statement")
    public static final MySqlShowCreateTriggerStatement mySqlShowCreateTriggerStatement = new MySqlShowCreateTriggerStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_create_trigger_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowCreateTriggerStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_create_trigger_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlShowCreateTriggerStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_create_trigger_statement")
    public static final class MySqlShowCreateTriggerStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public MySqlShowCreateTriggerStatement() {
            super("my_sql_show_create_trigger_statement");
        }
    }
}