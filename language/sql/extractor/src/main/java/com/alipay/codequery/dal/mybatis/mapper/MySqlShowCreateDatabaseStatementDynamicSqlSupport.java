package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowCreateDatabaseStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_create_database_statement")
    public static final MySqlShowCreateDatabaseStatement mySqlShowCreateDatabaseStatement = new MySqlShowCreateDatabaseStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_create_database_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowCreateDatabaseStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_create_database_statement.database_oid")
    public static final SqlColumn<Long> databaseOid = mySqlShowCreateDatabaseStatement.databaseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_create_database_statement.is_if_not_exists")
    public static final SqlColumn<Integer> isIfNotExists = mySqlShowCreateDatabaseStatement.isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_create_database_statement")
    public static final class MySqlShowCreateDatabaseStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> databaseOid = column("`database_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfNotExists = column("`is_if_not_exists`", JDBCType.BIGINT);

        public MySqlShowCreateDatabaseStatement() {
            super("my_sql_show_create_database_statement");
        }
    }
}