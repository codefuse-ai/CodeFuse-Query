package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OraclePipeRowStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_pipe_row_statement")
    public static final OraclePipeRowStatement oraclePipeRowStatement = new OraclePipeRowStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_pipe_row_statement.oid")
    public static final SqlColumn<Long> oid = oraclePipeRowStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_pipe_row_statement")
    public static final class OraclePipeRowStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public OraclePipeRowStatement() {
            super("oracle_pipe_row_statement");
        }
    }
}