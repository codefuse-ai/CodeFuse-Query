package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDropFunctionStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_function_statement")
    public static final SqlDropFunctionStatement sqlDropFunctionStatement = new SqlDropFunctionStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_function_statement.oid")
    public static final SqlColumn<Long> oid = sqlDropFunctionStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_function_statement.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = sqlDropFunctionStatement.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_function_statement.is_temporary")
    public static final SqlColumn<Integer> isTemporary = sqlDropFunctionStatement.isTemporary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_function_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlDropFunctionStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_function_statement")
    public static final class SqlDropFunctionStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isTemporary = column("`is_temporary`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlDropFunctionStatement() {
            super("sql_drop_function_statement");
        }
    }
}