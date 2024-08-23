package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlLoopStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_loop_statement")
    public static final SqlLoopStatement sqlLoopStatement = new SqlLoopStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_loop_statement.oid")
    public static final SqlColumn<Long> oid = sqlLoopStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_loop_statement.label_name")
    public static final SqlColumn<String> labelName = sqlLoopStatement.labelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_loop_statement")
    public static final class SqlLoopStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> labelName = column("`label_name`", JDBCType.VARCHAR);

        public SqlLoopStatement() {
            super("sql_loop_statement");
        }
    }
}