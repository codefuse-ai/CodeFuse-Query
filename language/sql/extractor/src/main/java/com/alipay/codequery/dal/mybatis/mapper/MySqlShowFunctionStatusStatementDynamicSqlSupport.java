package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowFunctionStatusStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_function_status_statement")
    public static final MySqlShowFunctionStatusStatement mySqlShowFunctionStatusStatement = new MySqlShowFunctionStatusStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_function_status_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowFunctionStatusStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_function_status_statement.like_oid")
    public static final SqlColumn<Long> likeOid = mySqlShowFunctionStatusStatement.likeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_function_status_statement.where_oid")
    public static final SqlColumn<Long> whereOid = mySqlShowFunctionStatusStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_function_status_statement")
    public static final class MySqlShowFunctionStatusStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> likeOid = column("`like_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public MySqlShowFunctionStatusStatement() {
            super("my_sql_show_function_status_statement");
        }
    }
}