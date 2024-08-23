package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowDatabaseStatusStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_database_status_statement")
    public static final MySqlShowDatabaseStatusStatement mySqlShowDatabaseStatusStatement = new MySqlShowDatabaseStatusStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_database_status_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowDatabaseStatusStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_database_status_statement.is_full")
    public static final SqlColumn<Integer> isFull = mySqlShowDatabaseStatusStatement.isFull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_database_status_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = mySqlShowDatabaseStatusStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_database_status_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlShowDatabaseStatusStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_database_status_statement.order_by_oid")
    public static final SqlColumn<Long> orderByOid = mySqlShowDatabaseStatusStatement.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_database_status_statement.where_oid")
    public static final SqlColumn<Long> whereOid = mySqlShowDatabaseStatusStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_database_status_statement")
    public static final class MySqlShowDatabaseStatusStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFull = column("`is_full`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public MySqlShowDatabaseStatusStatement() {
            super("my_sql_show_database_status_statement");
        }
    }
}