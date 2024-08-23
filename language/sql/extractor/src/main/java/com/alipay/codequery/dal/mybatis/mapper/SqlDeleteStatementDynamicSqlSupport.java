package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDeleteStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    public static final SqlDeleteStatement sqlDeleteStatement = new SqlDeleteStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_delete_statement.oid")
    public static final SqlColumn<Long> oid = sqlDeleteStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_delete_statement.alias")
    public static final SqlColumn<String> alias = sqlDeleteStatement.alias;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_delete_statement.expr_table_source_oid")
    public static final SqlColumn<Long> exprTableSourceOid = sqlDeleteStatement.exprTableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_delete_statement.from_oid")
    public static final SqlColumn<Long> fromOid = sqlDeleteStatement.fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_delete_statement.is_only")
    public static final SqlColumn<Integer> isOnly = sqlDeleteStatement.isOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_delete_statement.table_name_oid")
    public static final SqlColumn<Long> tableNameOid = sqlDeleteStatement.tableNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_delete_statement.table_source_oid")
    public static final SqlColumn<Long> tableSourceOid = sqlDeleteStatement.tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_delete_statement.using_oid")
    public static final SqlColumn<Long> usingOid = sqlDeleteStatement.usingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_delete_statement.where_oid")
    public static final SqlColumn<Long> whereOid = sqlDeleteStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_delete_statement.with_oid")
    public static final SqlColumn<Long> withOid = sqlDeleteStatement.withOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    public static final class SqlDeleteStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> alias = column("`alias`", JDBCType.VARCHAR);

        public final SqlColumn<Long> exprTableSourceOid = column("`expr_table_source_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fromOid = column("`from_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOnly = column("`is_only`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableNameOid = column("`table_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableSourceOid = column("`table_source_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> usingOid = column("`using_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> withOid = column("`with_oid`", JDBCType.BIGINT);

        public SqlDeleteStatement() {
            super("sql_delete_statement");
        }
    }
}