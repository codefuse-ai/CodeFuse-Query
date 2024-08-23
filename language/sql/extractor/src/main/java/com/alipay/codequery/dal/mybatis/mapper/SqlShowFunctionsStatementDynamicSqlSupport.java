package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowFunctionsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_functions_statement")
    public static final SqlShowFunctionsStatement sqlShowFunctionsStatement = new SqlShowFunctionsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_functions_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowFunctionsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_functions_statement.like_oid")
    public static final SqlColumn<Long> likeOid = sqlShowFunctionsStatement.likeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_functions_statement")
    public static final class SqlShowFunctionsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> likeOid = column("`like_oid`", JDBCType.BIGINT);

        public SqlShowFunctionsStatement() {
            super("sql_show_functions_statement");
        }
    }
}