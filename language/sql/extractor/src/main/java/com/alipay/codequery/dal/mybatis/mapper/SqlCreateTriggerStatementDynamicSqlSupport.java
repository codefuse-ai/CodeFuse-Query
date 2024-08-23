package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCreateTriggerStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    public static final SqlCreateTriggerStatement sqlCreateTriggerStatement = new SqlCreateTriggerStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.oid")
    public static final SqlColumn<Long> oid = sqlCreateTriggerStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.body_oid")
    public static final SqlColumn<Long> bodyOid = sqlCreateTriggerStatement.bodyOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.definer_oid")
    public static final SqlColumn<Long> definerOid = sqlCreateTriggerStatement.definerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.is_delete")
    public static final SqlColumn<Integer> isDelete = sqlCreateTriggerStatement.isDelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.is_for_each_row")
    public static final SqlColumn<Integer> isForEachRow = sqlCreateTriggerStatement.isForEachRow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.is_insert")
    public static final SqlColumn<Integer> isInsert = sqlCreateTriggerStatement.isInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.is_or_replace")
    public static final SqlColumn<Integer> isOrReplace = sqlCreateTriggerStatement.isOrReplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.is_update")
    public static final SqlColumn<Integer> isUpdate = sqlCreateTriggerStatement.isUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlCreateTriggerStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.on_oid")
    public static final SqlColumn<Long> onOid = sqlCreateTriggerStatement.onOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.trigger_events")
    public static final SqlColumn<String> triggerEvents = sqlCreateTriggerStatement.triggerEvents;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.trigger_type")
    public static final SqlColumn<String> triggerType = sqlCreateTriggerStatement.triggerType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.when_oid")
    public static final SqlColumn<Long> whenOid = sqlCreateTriggerStatement.whenOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    public static final class SqlCreateTriggerStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> bodyOid = column("`body_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> definerOid = column("`definer_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDelete = column("`is_delete`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isForEachRow = column("`is_for_each_row`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isInsert = column("`is_insert`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOrReplace = column("`is_or_replace`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isUpdate = column("`is_update`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> onOid = column("`on_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> triggerEvents = column("`trigger_events`", JDBCType.VARCHAR);

        public final SqlColumn<String> triggerType = column("`trigger_type`", JDBCType.VARCHAR);

        public final SqlColumn<Long> whenOid = column("`when_oid`", JDBCType.BIGINT);

        public SqlCreateTriggerStatement() {
            super("sql_create_trigger_statement");
        }
    }
}