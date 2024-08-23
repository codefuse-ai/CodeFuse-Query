package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCreateUserStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_user_statement")
    public static final SqlCreateUserStatement sqlCreateUserStatement = new SqlCreateUserStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_user_statement.oid")
    public static final SqlColumn<Long> oid = sqlCreateUserStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_user_statement.password_oid")
    public static final SqlColumn<Long> passwordOid = sqlCreateUserStatement.passwordOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_user_statement.user_oid")
    public static final SqlColumn<Long> userOid = sqlCreateUserStatement.userOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_user_statement")
    public static final class SqlCreateUserStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> passwordOid = column("`password_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> userOid = column("`user_oid`", JDBCType.BIGINT);

        public SqlCreateUserStatement() {
            super("sql_create_user_statement");
        }
    }
}