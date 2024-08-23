package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlServerUpdateStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_update_statement")
    public static final SqlServerUpdateStatement sqlServerUpdateStatement = new SqlServerUpdateStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_update_statement.oid")
    public static final SqlColumn<Long> oid = sqlServerUpdateStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_update_statement.output_oid")
    public static final SqlColumn<Long> outputOid = sqlServerUpdateStatement.outputOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_update_statement.top_oid")
    public static final SqlColumn<Long> topOid = sqlServerUpdateStatement.topOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_update_statement")
    public static final class SqlServerUpdateStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> outputOid = column("`output_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> topOid = column("`top_oid`", JDBCType.BIGINT);

        public SqlServerUpdateStatement() {
            super("sql_server_update_statement");
        }
    }
}