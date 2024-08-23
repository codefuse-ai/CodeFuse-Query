package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HiveCreateFunctionStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    public static final HiveCreateFunctionStatement hiveCreateFunctionStatement = new HiveCreateFunctionStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.oid")
    public static final SqlColumn<Long> oid = hiveCreateFunctionStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.class_name_oid")
    public static final SqlColumn<Long> classNameOid = hiveCreateFunctionStatement.classNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.code")
    public static final SqlColumn<String> code = hiveCreateFunctionStatement.code;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.is_declare")
    public static final SqlColumn<Integer> isDeclare = hiveCreateFunctionStatement.isDeclare;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.location_oid")
    public static final SqlColumn<Long> locationOid = hiveCreateFunctionStatement.locationOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.resource_type")
    public static final SqlColumn<String> resourceType = hiveCreateFunctionStatement.resourceType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.symbol_oid")
    public static final SqlColumn<Long> symbolOid = hiveCreateFunctionStatement.symbolOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    public static final class HiveCreateFunctionStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> classNameOid = column("`class_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> code = column("`code`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isDeclare = column("`is_declare`", JDBCType.BIGINT);

        public final SqlColumn<Long> locationOid = column("`location_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> resourceType = column("`resource_type`", JDBCType.VARCHAR);

        public final SqlColumn<Long> symbolOid = column("`symbol_oid`", JDBCType.BIGINT);

        public HiveCreateFunctionStatement() {
            super("hive_create_function_statement");
        }
    }
}