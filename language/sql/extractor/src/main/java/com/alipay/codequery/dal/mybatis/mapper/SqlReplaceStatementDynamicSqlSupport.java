package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlReplaceStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    public static final SqlReplaceStatement sqlReplaceStatement = new SqlReplaceStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.oid")
    public static final SqlColumn<Long> oid = sqlReplaceStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.hints_size")
    public static final SqlColumn<Integer> hintsSize = sqlReplaceStatement.hintsSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.is_delayed")
    public static final SqlColumn<Integer> isDelayed = sqlReplaceStatement.isDelayed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.is_low_priority")
    public static final SqlColumn<Integer> isLowPriority = sqlReplaceStatement.isLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.query_oid")
    public static final SqlColumn<Long> queryOid = sqlReplaceStatement.queryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.table_name_oid")
    public static final SqlColumn<Long> tableNameOid = sqlReplaceStatement.tableNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.table_source_oid")
    public static final SqlColumn<Long> tableSourceOid = sqlReplaceStatement.tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.values_list")
    public static final SqlColumn<String> valuesList = sqlReplaceStatement.valuesList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    public static final class SqlReplaceStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> hintsSize = column("`hints_size`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDelayed = column("`is_delayed`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLowPriority = column("`is_low_priority`", JDBCType.BIGINT);

        public final SqlColumn<Long> queryOid = column("`query_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableNameOid = column("`table_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableSourceOid = column("`table_source_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> valuesList = column("`values_list`", JDBCType.VARCHAR);

        public SqlReplaceStatement() {
            super("sql_replace_statement");
        }
    }
}