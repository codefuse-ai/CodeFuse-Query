package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCreateFunctionStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    public static final SqlCreateFunctionStatement sqlCreateFunctionStatement = new SqlCreateFunctionStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.oid")
    public static final SqlColumn<Long> oid = sqlCreateFunctionStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.authid_oid")
    public static final SqlColumn<Long> authidOid = sqlCreateFunctionStatement.authidOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.block_oid")
    public static final SqlColumn<Long> blockOid = sqlCreateFunctionStatement.blockOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.comment")
    public static final SqlColumn<String> comment = sqlCreateFunctionStatement.comment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.data_type_oid")
    public static final SqlColumn<Long> dataTypeOid = sqlCreateFunctionStatement.dataTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.definer_oid")
    public static final SqlColumn<Long> definerOid = sqlCreateFunctionStatement.definerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_aggregate")
    public static final SqlColumn<Integer> isAggregate = sqlCreateFunctionStatement.isAggregate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_create")
    public static final SqlColumn<Integer> isCreate = sqlCreateFunctionStatement.isCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_deterministic")
    public static final SqlColumn<Integer> isDeterministic = sqlCreateFunctionStatement.isDeterministic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_if_not_exists")
    public static final SqlColumn<Integer> isIfNotExists = sqlCreateFunctionStatement.isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_or_replace")
    public static final SqlColumn<Integer> isOrReplace = sqlCreateFunctionStatement.isOrReplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_parallel_enable")
    public static final SqlColumn<Integer> isParallelEnable = sqlCreateFunctionStatement.isParallelEnable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_pipelined")
    public static final SqlColumn<Integer> isPipelined = sqlCreateFunctionStatement.isPipelined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_result_cache")
    public static final SqlColumn<Integer> isResultCache = sqlCreateFunctionStatement.isResultCache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_temporary")
    public static final SqlColumn<Integer> isTemporary = sqlCreateFunctionStatement.isTemporary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.java_call_spec")
    public static final SqlColumn<String> javaCallSpec = sqlCreateFunctionStatement.javaCallSpec;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.language")
    public static final SqlColumn<String> language = sqlCreateFunctionStatement.language;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlCreateFunctionStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.return_data_type_oid")
    public static final SqlColumn<Long> returnDataTypeOid = sqlCreateFunctionStatement.returnDataTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.schema")
    public static final SqlColumn<String> schema = sqlCreateFunctionStatement.schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.using_oid")
    public static final SqlColumn<Long> usingOid = sqlCreateFunctionStatement.usingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.wrapped_source")
    public static final SqlColumn<String> wrappedSource = sqlCreateFunctionStatement.wrappedSource;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    public static final class SqlCreateFunctionStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> authidOid = column("`authid_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> blockOid = column("`block_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> comment = column("`comment`", JDBCType.VARCHAR);

        public final SqlColumn<Long> dataTypeOid = column("`data_type_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> definerOid = column("`definer_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isAggregate = column("`is_aggregate`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCreate = column("`is_create`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDeterministic = column("`is_deterministic`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfNotExists = column("`is_if_not_exists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOrReplace = column("`is_or_replace`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isParallelEnable = column("`is_parallel_enable`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isPipelined = column("`is_pipelined`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isResultCache = column("`is_result_cache`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isTemporary = column("`is_temporary`", JDBCType.BIGINT);

        public final SqlColumn<String> javaCallSpec = column("`java_call_spec`", JDBCType.VARCHAR);

        public final SqlColumn<String> language = column("`language`", JDBCType.VARCHAR);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> returnDataTypeOid = column("`return_data_type_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> schema = column("`schema`", JDBCType.VARCHAR);

        public final SqlColumn<Long> usingOid = column("`using_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> wrappedSource = column("`wrapped_source`", JDBCType.VARCHAR);

        public SqlCreateFunctionStatement() {
            super("sql_create_function_statement");
        }
    }
}