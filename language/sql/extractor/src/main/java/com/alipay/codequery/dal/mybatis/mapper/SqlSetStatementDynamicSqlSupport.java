package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlSetStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_set_statement")
    public static final SqlSetStatement sqlSetStatement = new SqlSetStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_set_statement.oid")
    public static final SqlColumn<Long> oid = sqlSetStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_set_statement.option")
    public static final SqlColumn<String> option = sqlSetStatement.option;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_set_statement")
    public static final class SqlSetStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> option = column("`option`", JDBCType.VARCHAR);

        public SqlSetStatement() {
            super("sql_set_statement");
        }
    }
}