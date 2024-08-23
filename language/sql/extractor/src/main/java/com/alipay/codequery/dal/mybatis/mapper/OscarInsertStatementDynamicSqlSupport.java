package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OscarInsertStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    public static final OscarInsertStatement oscarInsertStatement = new OscarInsertStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_insert_statement.oid")
    public static final SqlColumn<Long> oid = oscarInsertStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_insert_statement.is_default_values")
    public static final SqlColumn<Integer> isDefaultValues = oscarInsertStatement.isDefaultValues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_insert_statement.is_on_conflict_do_nothing")
    public static final SqlColumn<Integer> isOnConflictDoNothing = oscarInsertStatement.isOnConflictDoNothing;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_insert_statement.on_conflict_constraint_oid")
    public static final SqlColumn<Long> onConflictConstraintOid = oscarInsertStatement.onConflictConstraintOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_insert_statement.on_conflict_update_where_oid")
    public static final SqlColumn<Long> onConflictUpdateWhereOid = oscarInsertStatement.onConflictUpdateWhereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_insert_statement.on_conflict_where_oid")
    public static final SqlColumn<Long> onConflictWhereOid = oscarInsertStatement.onConflictWhereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_insert_statement.returning_oid")
    public static final SqlColumn<Long> returningOid = oscarInsertStatement.returningOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_insert_statement.values")
    public static final SqlColumn<String> values = oscarInsertStatement.values;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_insert_statement.values_list")
    public static final SqlColumn<String> valuesList = oscarInsertStatement.valuesList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    public static final class OscarInsertStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDefaultValues = column("`is_default_values`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOnConflictDoNothing = column("`is_on_conflict_do_nothing`", JDBCType.BIGINT);

        public final SqlColumn<Long> onConflictConstraintOid = column("`on_conflict_constraint_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> onConflictUpdateWhereOid = column("`on_conflict_update_where_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> onConflictWhereOid = column("`on_conflict_where_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> returningOid = column("`returning_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> values = column("`values`", JDBCType.VARCHAR);

        public final SqlColumn<String> valuesList = column("`values_list`", JDBCType.VARCHAR);

        public OscarInsertStatement() {
            super("oscar_insert_statement");
        }
    }
}