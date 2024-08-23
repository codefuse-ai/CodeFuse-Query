package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlBinlogStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_binlog_statement")
    public static final MySqlBinlogStatement mySqlBinlogStatement = new MySqlBinlogStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_binlog_statement.oid")
    public static final SqlColumn<Long> oid = mySqlBinlogStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_binlog_statement.expr_oid")
    public static final SqlColumn<Long> exprOid = mySqlBinlogStatement.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_binlog_statement")
    public static final class MySqlBinlogStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public MySqlBinlogStatement() {
            super("my_sql_binlog_statement");
        }
    }
}