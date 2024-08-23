package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowErrorsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_errors_statement")
    public static final SqlShowErrorsStatement sqlShowErrorsStatement = new SqlShowErrorsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_errors_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowErrorsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_errors_statement")
    public static final class SqlShowErrorsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlShowErrorsStatement() {
            super("sql_show_errors_statement");
        }
    }
}