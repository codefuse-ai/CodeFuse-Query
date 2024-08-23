package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlBuildTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    public static final SqlBuildTableStatement sqlBuildTableStatement = new SqlBuildTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_build_table_statement.oid")
    public static final SqlColumn<Long> oid = sqlBuildTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_build_table_statement.is_force")
    public static final SqlColumn<Integer> isForce = sqlBuildTableStatement.isForce;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_build_table_statement.is_with_split")
    public static final SqlColumn<Integer> isWithSplit = sqlBuildTableStatement.isWithSplit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_build_table_statement.table_oid")
    public static final SqlColumn<Long> tableOid = sqlBuildTableStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_build_table_statement.version_oid")
    public static final SqlColumn<Long> versionOid = sqlBuildTableStatement.versionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    public static final class SqlBuildTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isForce = column("`is_force`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithSplit = column("`is_with_split`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> versionOid = column("`version_oid`", JDBCType.BIGINT);

        public SqlBuildTableStatement() {
            super("sql_build_table_statement");
        }
    }
}