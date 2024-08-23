package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowTablesStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_tables_statement")
    public static final SqlShowTablesStatement sqlShowTablesStatement = new SqlShowTablesStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_tables_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowTablesStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_tables_statement.database_oid")
    public static final SqlColumn<Long> databaseOid = sqlShowTablesStatement.databaseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_tables_statement.from_oid")
    public static final SqlColumn<Long> fromOid = sqlShowTablesStatement.fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_tables_statement.is_extended")
    public static final SqlColumn<Integer> isExtended = sqlShowTablesStatement.isExtended;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_tables_statement.is_full")
    public static final SqlColumn<Integer> isFull = sqlShowTablesStatement.isFull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_tables_statement.like_oid")
    public static final SqlColumn<Long> likeOid = sqlShowTablesStatement.likeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_tables_statement.where_oid")
    public static final SqlColumn<Long> whereOid = sqlShowTablesStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_tables_statement")
    public static final class SqlShowTablesStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> databaseOid = column("`database_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fromOid = column("`from_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isExtended = column("`is_extended`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFull = column("`is_full`", JDBCType.BIGINT);

        public final SqlColumn<Long> likeOid = column("`like_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public SqlShowTablesStatement() {
            super("sql_show_tables_statement");
        }
    }
}