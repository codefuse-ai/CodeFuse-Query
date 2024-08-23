package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleCreateTypeStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    public static final OracleCreateTypeStatement oracleCreateTypeStatement = new OracleCreateTypeStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.oid")
    public static final SqlColumn<Long> oid = oracleCreateTypeStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.auth_id_oid")
    public static final SqlColumn<Long> authIdOid = oracleCreateTypeStatement.authIdOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.instantiable")
    public static final SqlColumn<Integer> instantiable = oracleCreateTypeStatement.instantiable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_body")
    public static final SqlColumn<Integer> isBody = oracleCreateTypeStatement.isBody;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_final")
    public static final SqlColumn<Integer> isFinal = oracleCreateTypeStatement.isFinal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_force")
    public static final SqlColumn<Integer> isForce = oracleCreateTypeStatement.isForce;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_object")
    public static final SqlColumn<Integer> isObject = oracleCreateTypeStatement.isObject;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_or_replace")
    public static final SqlColumn<Integer> isOrReplace = oracleCreateTypeStatement.isOrReplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_paren")
    public static final SqlColumn<Integer> isParen = oracleCreateTypeStatement.isParen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.name_oid")
    public static final SqlColumn<Long> nameOid = oracleCreateTypeStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.oid_oid")
    public static final SqlColumn<Long> oidOid = oracleCreateTypeStatement.oidOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.table_of_oid")
    public static final SqlColumn<Long> tableOfOid = oracleCreateTypeStatement.tableOfOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.under_oid")
    public static final SqlColumn<Long> underOid = oracleCreateTypeStatement.underOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.varray_data_type_oid")
    public static final SqlColumn<Long> varrayDataTypeOid = oracleCreateTypeStatement.varrayDataTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.varray_size_limit_oid")
    public static final SqlColumn<Long> varraySizeLimitOid = oracleCreateTypeStatement.varraySizeLimitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.wrapped_source")
    public static final SqlColumn<String> wrappedSource = oracleCreateTypeStatement.wrappedSource;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    public static final class OracleCreateTypeStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> authIdOid = column("`auth_id_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> instantiable = column("`instantiable`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isBody = column("`is_body`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFinal = column("`is_final`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isForce = column("`is_force`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isObject = column("`is_object`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOrReplace = column("`is_or_replace`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isParen = column("`is_paren`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> oidOid = column("`oid_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOfOid = column("`table_of_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> underOid = column("`under_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> varrayDataTypeOid = column("`varray_data_type_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> varraySizeLimitOid = column("`varray_size_limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> wrappedSource = column("`wrapped_source`", JDBCType.VARCHAR);

        public OracleCreateTypeStatement() {
            super("oracle_create_type_statement");
        }
    }
}