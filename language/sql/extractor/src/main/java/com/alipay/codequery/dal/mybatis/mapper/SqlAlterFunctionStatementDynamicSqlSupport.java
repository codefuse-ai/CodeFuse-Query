package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterFunctionStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    public static final SqlAlterFunctionStatement sqlAlterFunctionStatement = new SqlAlterFunctionStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.oid")
    public static final SqlColumn<Long> oid = sqlAlterFunctionStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.comment_oid")
    public static final SqlColumn<Long> commentOid = sqlAlterFunctionStatement.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.is_contains_sql")
    public static final SqlColumn<Integer> isContainsSql = sqlAlterFunctionStatement.isContainsSql;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.is_debug")
    public static final SqlColumn<Integer> isDebug = sqlAlterFunctionStatement.isDebug;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.is_language_sql")
    public static final SqlColumn<Integer> isLanguageSql = sqlAlterFunctionStatement.isLanguageSql;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.is_reuse_settings")
    public static final SqlColumn<Integer> isReuseSettings = sqlAlterFunctionStatement.isReuseSettings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlAlterFunctionStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.sql_security_oid")
    public static final SqlColumn<Long> sqlSecurityOid = sqlAlterFunctionStatement.sqlSecurityOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    public static final class SqlAlterFunctionStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isContainsSql = column("`is_contains_sql`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDebug = column("`is_debug`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLanguageSql = column("`is_language_sql`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isReuseSettings = column("`is_reuse_settings`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> sqlSecurityOid = column("`sql_security_oid`", JDBCType.BIGINT);

        public SqlAlterFunctionStatement() {
            super("sql_alter_function_statement");
        }
    }
}