package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowAuthorsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_authors_statement")
    public static final MySqlShowAuthorsStatement mySqlShowAuthorsStatement = new MySqlShowAuthorsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_authors_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowAuthorsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_authors_statement")
    public static final class MySqlShowAuthorsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlShowAuthorsStatement() {
            super("my_sql_show_authors_statement");
        }
    }
}