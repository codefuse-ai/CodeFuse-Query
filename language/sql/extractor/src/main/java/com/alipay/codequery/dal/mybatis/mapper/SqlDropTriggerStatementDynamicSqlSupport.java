package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDropTriggerStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_trigger_statement")
    public static final SqlDropTriggerStatement sqlDropTriggerStatement = new SqlDropTriggerStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_trigger_statement.oid")
    public static final SqlColumn<Long> oid = sqlDropTriggerStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_trigger_statement.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = sqlDropTriggerStatement.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_trigger_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlDropTriggerStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_trigger_statement")
    public static final class SqlDropTriggerStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlDropTriggerStatement() {
            super("sql_drop_trigger_statement");
        }
    }
}