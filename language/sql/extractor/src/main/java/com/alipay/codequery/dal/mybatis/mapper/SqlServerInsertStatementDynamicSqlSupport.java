package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlServerInsertStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_insert_statement")
    public static final SqlServerInsertStatement sqlServerInsertStatement = new SqlServerInsertStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_insert_statement.oid")
    public static final SqlColumn<Long> oid = sqlServerInsertStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_insert_statement.is_default_values")
    public static final SqlColumn<Integer> isDefaultValues = sqlServerInsertStatement.isDefaultValues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_insert_statement.output_oid")
    public static final SqlColumn<Long> outputOid = sqlServerInsertStatement.outputOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_insert_statement.top_oid")
    public static final SqlColumn<Long> topOid = sqlServerInsertStatement.topOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_insert_statement")
    public static final class SqlServerInsertStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDefaultValues = column("`is_default_values`", JDBCType.BIGINT);

        public final SqlColumn<Long> outputOid = column("`output_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> topOid = column("`top_oid`", JDBCType.BIGINT);

        public SqlServerInsertStatement() {
            super("sql_server_insert_statement");
        }
    }
}