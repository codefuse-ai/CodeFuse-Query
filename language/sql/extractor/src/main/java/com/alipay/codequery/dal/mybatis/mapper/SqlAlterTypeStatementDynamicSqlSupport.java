package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTypeStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    public static final SqlAlterTypeStatement sqlAlterTypeStatement = new SqlAlterTypeStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.oid")
    public static final SqlColumn<Long> oid = sqlAlterTypeStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.is_body")
    public static final SqlColumn<Integer> isBody = sqlAlterTypeStatement.isBody;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.is_compile")
    public static final SqlColumn<Integer> isCompile = sqlAlterTypeStatement.isCompile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.is_debug")
    public static final SqlColumn<Integer> isDebug = sqlAlterTypeStatement.isDebug;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.is_reuse_settings")
    public static final SqlColumn<Integer> isReuseSettings = sqlAlterTypeStatement.isReuseSettings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlAlterTypeStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    public static final class SqlAlterTypeStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isBody = column("`is_body`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCompile = column("`is_compile`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDebug = column("`is_debug`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isReuseSettings = column("`is_reuse_settings`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlAlterTypeStatement() {
            super("sql_alter_type_statement");
        }
    }
}