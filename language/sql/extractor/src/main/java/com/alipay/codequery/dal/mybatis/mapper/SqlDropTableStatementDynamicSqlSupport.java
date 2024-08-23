package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDropTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    public static final SqlDropTableStatement sqlDropTableStatement = new SqlDropTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_table_statement.oid")
    public static final SqlColumn<Long> oid = sqlDropTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_table_statement.is_cascade")
    public static final SqlColumn<Integer> isCascade = sqlDropTableStatement.isCascade;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_table_statement.is_drop_partition")
    public static final SqlColumn<Integer> isDropPartition = sqlDropTableStatement.isDropPartition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_table_statement.is_external")
    public static final SqlColumn<Integer> isExternal = sqlDropTableStatement.isExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_table_statement.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = sqlDropTableStatement.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_table_statement.is_purge")
    public static final SqlColumn<Integer> isPurge = sqlDropTableStatement.isPurge;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_table_statement.is_restrict")
    public static final SqlColumn<Integer> isRestrict = sqlDropTableStatement.isRestrict;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_table_statement.is_temporary")
    public static final SqlColumn<Integer> isTemporary = sqlDropTableStatement.isTemporary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_table_statement.where_oid")
    public static final SqlColumn<Long> whereOid = sqlDropTableStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    public static final class SqlDropTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCascade = column("`is_cascade`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDropPartition = column("`is_drop_partition`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isExternal = column("`is_external`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isPurge = column("`is_purge`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRestrict = column("`is_restrict`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isTemporary = column("`is_temporary`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public SqlDropTableStatement() {
            super("sql_drop_table_statement");
        }
    }
}