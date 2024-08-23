package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDescribeStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    public static final SqlDescribeStatement sqlDescribeStatement = new SqlDescribeStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.oid")
    public static final SqlColumn<Long> oid = sqlDescribeStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.column_oid")
    public static final SqlColumn<Long> columnOid = sqlDescribeStatement.columnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.is_extended")
    public static final SqlColumn<Integer> isExtended = sqlDescribeStatement.isExtended;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.is_formatted")
    public static final SqlColumn<Integer> isFormatted = sqlDescribeStatement.isFormatted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.object_oid")
    public static final SqlColumn<Long> objectOid = sqlDescribeStatement.objectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_describe_statement.object_type")
    public static final SqlColumn<String> objectType = sqlDescribeStatement.objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    public static final class SqlDescribeStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> columnOid = column("`column_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isExtended = column("`is_extended`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFormatted = column("`is_formatted`", JDBCType.BIGINT);

        public final SqlColumn<Long> objectOid = column("`object_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> objectType = column("`object_type`", JDBCType.VARCHAR);

        public SqlDescribeStatement() {
            super("sql_describe_statement");
        }
    }
}