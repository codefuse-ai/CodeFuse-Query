package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowTableStatusStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_table_status_statement")
    public static final MySqlShowTableStatusStatement mySqlShowTableStatusStatement = new MySqlShowTableStatusStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_table_status_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowTableStatusStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_table_status_statement.database_oid")
    public static final SqlColumn<Long> databaseOid = mySqlShowTableStatusStatement.databaseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_table_status_statement.like_oid")
    public static final SqlColumn<Long> likeOid = mySqlShowTableStatusStatement.likeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_table_status_statement.table_group_oid")
    public static final SqlColumn<Long> tableGroupOid = mySqlShowTableStatusStatement.tableGroupOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_table_status_statement.where_oid")
    public static final SqlColumn<Long> whereOid = mySqlShowTableStatusStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_table_status_statement")
    public static final class MySqlShowTableStatusStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> databaseOid = column("`database_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> likeOid = column("`like_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableGroupOid = column("`table_group_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public MySqlShowTableStatusStatement() {
            super("my_sql_show_table_status_statement");
        }
    }
}