package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlCreateUserStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_user_statement")
    public static final MySqlCreateUserStatement mySqlCreateUserStatement = new MySqlCreateUserStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_user_statement.oid")
    public static final SqlColumn<Long> oid = mySqlCreateUserStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_user_statement.is_if_not_exists")
    public static final SqlColumn<Integer> isIfNotExists = mySqlCreateUserStatement.isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_user_statement.users")
    public static final SqlColumn<String> users = mySqlCreateUserStatement.users;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_user_statement")
    public static final class MySqlCreateUserStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfNotExists = column("`is_if_not_exists`", JDBCType.BIGINT);

        public final SqlColumn<String> users = column("`users`", JDBCType.VARCHAR);

        public MySqlCreateUserStatement() {
            super("my_sql_create_user_statement");
        }
    }
}