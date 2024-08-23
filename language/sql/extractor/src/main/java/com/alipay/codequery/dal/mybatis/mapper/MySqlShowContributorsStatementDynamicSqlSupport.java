package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowContributorsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_contributors_statement")
    public static final MySqlShowContributorsStatement mySqlShowContributorsStatement = new MySqlShowContributorsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_contributors_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowContributorsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_contributors_statement")
    public static final class MySqlShowContributorsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlShowContributorsStatement() {
            super("my_sql_show_contributors_statement");
        }
    }
}