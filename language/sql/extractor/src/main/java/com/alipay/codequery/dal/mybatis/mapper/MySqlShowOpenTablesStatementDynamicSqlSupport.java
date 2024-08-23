package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowOpenTablesStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_open_tables_statement")
    public static final MySqlShowOpenTablesStatement mySqlShowOpenTablesStatement = new MySqlShowOpenTablesStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_open_tables_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowOpenTablesStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_open_tables_statement.database_oid")
    public static final SqlColumn<Long> databaseOid = mySqlShowOpenTablesStatement.databaseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_open_tables_statement.like_oid")
    public static final SqlColumn<Long> likeOid = mySqlShowOpenTablesStatement.likeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_open_tables_statement.where_oid")
    public static final SqlColumn<Long> whereOid = mySqlShowOpenTablesStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_open_tables_statement")
    public static final class MySqlShowOpenTablesStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> databaseOid = column("`database_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> likeOid = column("`like_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public MySqlShowOpenTablesStatement() {
            super("my_sql_show_open_tables_statement");
        }
    }
}