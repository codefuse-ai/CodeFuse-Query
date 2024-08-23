package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCreateProcedureStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    public static final SqlCreateProcedureStatement sqlCreateProcedureStatement = new SqlCreateProcedureStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.oid")
    public static final SqlColumn<Long> oid = sqlCreateProcedureStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.authid_oid")
    public static final SqlColumn<Long> authidOid = sqlCreateProcedureStatement.authidOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.block_oid")
    public static final SqlColumn<Long> blockOid = sqlCreateProcedureStatement.blockOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.comment_oid")
    public static final SqlColumn<Long> commentOid = sqlCreateProcedureStatement.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.definer_oid")
    public static final SqlColumn<Long> definerOid = sqlCreateProcedureStatement.definerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_contains_sql")
    public static final SqlColumn<Integer> isContainsSql = sqlCreateProcedureStatement.isContainsSql;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_create")
    public static final SqlColumn<Integer> isCreate = sqlCreateProcedureStatement.isCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_deterministic")
    public static final SqlColumn<Integer> isDeterministic = sqlCreateProcedureStatement.isDeterministic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_language_sql")
    public static final SqlColumn<Integer> isLanguageSql = sqlCreateProcedureStatement.isLanguageSql;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_modifies_sql_data")
    public static final SqlColumn<Integer> isModifiesSqlData = sqlCreateProcedureStatement.isModifiesSqlData;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_no_sql")
    public static final SqlColumn<Integer> isNoSql = sqlCreateProcedureStatement.isNoSql;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_or_replace")
    public static final SqlColumn<Integer> isOrReplace = sqlCreateProcedureStatement.isOrReplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_read_sql_data")
    public static final SqlColumn<Integer> isReadSqlData = sqlCreateProcedureStatement.isReadSqlData;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.java_call_spec")
    public static final SqlColumn<String> javaCallSpec = sqlCreateProcedureStatement.javaCallSpec;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlCreateProcedureStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.wrapped_source")
    public static final SqlColumn<String> wrappedSource = sqlCreateProcedureStatement.wrappedSource;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    public static final class SqlCreateProcedureStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> authidOid = column("`authid_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> blockOid = column("`block_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> definerOid = column("`definer_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isContainsSql = column("`is_contains_sql`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCreate = column("`is_create`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDeterministic = column("`is_deterministic`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLanguageSql = column("`is_language_sql`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isModifiesSqlData = column("`is_modifies_sql_data`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNoSql = column("`is_no_sql`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOrReplace = column("`is_or_replace`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isReadSqlData = column("`is_read_sql_data`", JDBCType.BIGINT);

        public final SqlColumn<String> javaCallSpec = column("`java_call_spec`", JDBCType.VARCHAR);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> wrappedSource = column("`wrapped_source`", JDBCType.VARCHAR);

        public SqlCreateProcedureStatement() {
            super("sql_create_procedure_statement");
        }
    }
}