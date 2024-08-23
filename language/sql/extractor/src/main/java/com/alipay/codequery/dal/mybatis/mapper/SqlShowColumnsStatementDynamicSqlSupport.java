package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowColumnsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    public static final SqlShowColumnsStatement sqlShowColumnsStatement = new SqlShowColumnsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_columns_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowColumnsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_columns_statement.database_oid")
    public static final SqlColumn<Long> databaseOid = sqlShowColumnsStatement.databaseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_columns_statement.is_full")
    public static final SqlColumn<Integer> isFull = sqlShowColumnsStatement.isFull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_columns_statement.like_oid")
    public static final SqlColumn<Long> likeOid = sqlShowColumnsStatement.likeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_columns_statement.table_oid")
    public static final SqlColumn<Long> tableOid = sqlShowColumnsStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_columns_statement.where_oid")
    public static final SqlColumn<Long> whereOid = sqlShowColumnsStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    public static final class SqlShowColumnsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> databaseOid = column("`database_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFull = column("`is_full`", JDBCType.BIGINT);

        public final SqlColumn<Long> likeOid = column("`like_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public SqlShowColumnsStatement() {
            super("sql_show_columns_statement");
        }
    }
}