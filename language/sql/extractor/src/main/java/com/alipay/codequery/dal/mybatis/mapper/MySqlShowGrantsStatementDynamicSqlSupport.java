package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowGrantsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_grants_statement")
    public static final MySqlShowGrantsStatement mySqlShowGrantsStatement = new MySqlShowGrantsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_grants_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowGrantsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_grants_statement")
    public static final class MySqlShowGrantsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlShowGrantsStatement() {
            super("my_sql_show_grants_statement");
        }
    }
}