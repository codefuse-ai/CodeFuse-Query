package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterProcedureStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_procedure_statement")
    public static final SqlAlterProcedureStatement sqlAlterProcedureStatement = new SqlAlterProcedureStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_procedure_statement.oid")
    public static final SqlColumn<Long> oid = sqlAlterProcedureStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_procedure_statement.comment_oid")
    public static final SqlColumn<Long> commentOid = sqlAlterProcedureStatement.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_procedure_statement.is_compile")
    public static final SqlColumn<Integer> isCompile = sqlAlterProcedureStatement.isCompile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_procedure_statement.is_contains_sql")
    public static final SqlColumn<Integer> isContainsSql = sqlAlterProcedureStatement.isContainsSql;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_procedure_statement.is_language_sql")
    public static final SqlColumn<Integer> isLanguageSql = sqlAlterProcedureStatement.isLanguageSql;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_procedure_statement.is_reuse_settings")
    public static final SqlColumn<Integer> isReuseSettings = sqlAlterProcedureStatement.isReuseSettings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_procedure_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlAlterProcedureStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_procedure_statement.sql_security_oid")
    public static final SqlColumn<Long> sqlSecurityOid = sqlAlterProcedureStatement.sqlSecurityOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_procedure_statement")
    public static final class SqlAlterProcedureStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCompile = column("`is_compile`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isContainsSql = column("`is_contains_sql`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLanguageSql = column("`is_language_sql`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isReuseSettings = column("`is_reuse_settings`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> sqlSecurityOid = column("`sql_security_oid`", JDBCType.BIGINT);

        public SqlAlterProcedureStatement() {
            super("sql_alter_procedure_statement");
        }
    }
}