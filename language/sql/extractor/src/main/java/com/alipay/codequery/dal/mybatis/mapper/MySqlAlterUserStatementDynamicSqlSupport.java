package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlAlterUserStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_user_statement")
    public static final MySqlAlterUserStatement mySqlAlterUserStatement = new MySqlAlterUserStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_user_statement.oid")
    public static final SqlColumn<Long> oid = mySqlAlterUserStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_user_statement.alter_users")
    public static final SqlColumn<String> alterUsers = mySqlAlterUserStatement.alterUsers;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_user_statement.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = mySqlAlterUserStatement.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_user_statement.password_option")
    public static final SqlColumn<String> passwordOption = mySqlAlterUserStatement.passwordOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_user_statement")
    public static final class MySqlAlterUserStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> alterUsers = column("`alter_users`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<String> passwordOption = column("`password_option`", JDBCType.VARCHAR);

        public MySqlAlterUserStatement() {
            super("my_sql_alter_user_statement");
        }
    }
}