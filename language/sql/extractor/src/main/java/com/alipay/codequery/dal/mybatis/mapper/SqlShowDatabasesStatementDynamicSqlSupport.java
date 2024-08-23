package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowDatabasesStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_databases_statement")
    public static final SqlShowDatabasesStatement sqlShowDatabasesStatement = new SqlShowDatabasesStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_databases_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowDatabasesStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_databases_statement.database_oid")
    public static final SqlColumn<Long> databaseOid = sqlShowDatabasesStatement.databaseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_databases_statement.is_extra")
    public static final SqlColumn<Integer> isExtra = sqlShowDatabasesStatement.isExtra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_databases_statement.is_full")
    public static final SqlColumn<Integer> isFull = sqlShowDatabasesStatement.isFull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_databases_statement.is_physical")
    public static final SqlColumn<Integer> isPhysical = sqlShowDatabasesStatement.isPhysical;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_databases_statement.like_oid")
    public static final SqlColumn<Long> likeOid = sqlShowDatabasesStatement.likeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_databases_statement.where_oid")
    public static final SqlColumn<Long> whereOid = sqlShowDatabasesStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_databases_statement")
    public static final class SqlShowDatabasesStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> databaseOid = column("`database_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isExtra = column("`is_extra`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFull = column("`is_full`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isPhysical = column("`is_physical`", JDBCType.BIGINT);

        public final SqlColumn<Long> likeOid = column("`like_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public SqlShowDatabasesStatement() {
            super("sql_show_databases_statement");
        }
    }
}