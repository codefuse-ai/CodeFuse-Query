package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlServerOutputDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_output")
    public static final SqlServerOutput sqlServerOutput = new SqlServerOutput();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_output.oid")
    public static final SqlColumn<Long> oid = sqlServerOutput.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_output.into_oid")
    public static final SqlColumn<Long> intoOid = sqlServerOutput.intoOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_output")
    public static final class SqlServerOutput extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> intoOid = column("`into_oid`", JDBCType.BIGINT);

        public SqlServerOutput() {
            super("sql_server_output");
        }
    }
}