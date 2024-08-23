package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlCreateEventStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    public static final MySqlCreateEventStatement mySqlCreateEventStatement = new MySqlCreateEventStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_event_statement.oid")
    public static final SqlColumn<Long> oid = mySqlCreateEventStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_event_statement.comment_oid")
    public static final SqlColumn<Long> commentOid = mySqlCreateEventStatement.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_event_statement.definer_oid")
    public static final SqlColumn<Long> definerOid = mySqlCreateEventStatement.definerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_event_statement.enable")
    public static final SqlColumn<Integer> enable = mySqlCreateEventStatement.enable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_event_statement.event_body_oid")
    public static final SqlColumn<Long> eventBodyOid = mySqlCreateEventStatement.eventBodyOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_event_statement.is_disable_on_slave")
    public static final SqlColumn<Integer> isDisableOnSlave = mySqlCreateEventStatement.isDisableOnSlave;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_event_statement.is_if_not_exists")
    public static final SqlColumn<Integer> isIfNotExists = mySqlCreateEventStatement.isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_event_statement.is_on_completion_preserve")
    public static final SqlColumn<Integer> isOnCompletionPreserve = mySqlCreateEventStatement.isOnCompletionPreserve;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_event_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlCreateEventStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_event_statement.rename_to_oid")
    public static final SqlColumn<Long> renameToOid = mySqlCreateEventStatement.renameToOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_event_statement.schedule_oid")
    public static final SqlColumn<Long> scheduleOid = mySqlCreateEventStatement.scheduleOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    public static final class MySqlCreateEventStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> definerOid = column("`definer_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> enable = column("`enable`", JDBCType.BIGINT);

        public final SqlColumn<Long> eventBodyOid = column("`event_body_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDisableOnSlave = column("`is_disable_on_slave`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfNotExists = column("`is_if_not_exists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOnCompletionPreserve = column("`is_on_completion_preserve`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> renameToOid = column("`rename_to_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> scheduleOid = column("`schedule_oid`", JDBCType.BIGINT);

        public MySqlCreateEventStatement() {
            super("my_sql_create_event_statement");
        }
    }
}