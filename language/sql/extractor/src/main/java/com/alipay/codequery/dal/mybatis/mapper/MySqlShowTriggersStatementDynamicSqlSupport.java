package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowTriggersStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_triggers_statement")
    public static final MySqlShowTriggersStatement mySqlShowTriggersStatement = new MySqlShowTriggersStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_triggers_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowTriggersStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_triggers_statement.database_oid")
    public static final SqlColumn<Long> databaseOid = mySqlShowTriggersStatement.databaseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_triggers_statement.like_oid")
    public static final SqlColumn<Long> likeOid = mySqlShowTriggersStatement.likeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_triggers_statement.where_oid")
    public static final SqlColumn<Long> whereOid = mySqlShowTriggersStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_triggers_statement")
    public static final class MySqlShowTriggersStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> databaseOid = column("`database_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> likeOid = column("`like_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public MySqlShowTriggersStatement() {
            super("my_sql_show_triggers_statement");
        }
    }
}