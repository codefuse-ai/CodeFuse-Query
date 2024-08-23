package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowIndexesStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_indexes_statement")
    public static final SqlShowIndexesStatement sqlShowIndexesStatement = new SqlShowIndexesStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_indexes_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowIndexesStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_indexes_statement.database_oid")
    public static final SqlColumn<Long> databaseOid = sqlShowIndexesStatement.databaseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_indexes_statement.table_oid")
    public static final SqlColumn<Long> tableOid = sqlShowIndexesStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_indexes_statement.type")
    public static final SqlColumn<String> type = sqlShowIndexesStatement.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_indexes_statement.where_oid")
    public static final SqlColumn<Long> whereOid = sqlShowIndexesStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_indexes_statement")
    public static final class SqlShowIndexesStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> databaseOid = column("`database_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public SqlShowIndexesStatement() {
            super("sql_show_indexes_statement");
        }
    }
}