package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDumpStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_dump_statement")
    public static final SqlDumpStatement sqlDumpStatement = new SqlDumpStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_dump_statement.oid")
    public static final SqlColumn<Long> oid = sqlDumpStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_dump_statement.into_oid")
    public static final SqlColumn<Long> intoOid = sqlDumpStatement.intoOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_dump_statement.is_overwrite")
    public static final SqlColumn<Integer> isOverwrite = sqlDumpStatement.isOverwrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_dump_statement.select_oid")
    public static final SqlColumn<Long> selectOid = sqlDumpStatement.selectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_dump_statement")
    public static final class SqlDumpStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> intoOid = column("`into_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOverwrite = column("`is_overwrite`", JDBCType.BIGINT);

        public final SqlColumn<Long> selectOid = column("`select_oid`", JDBCType.BIGINT);

        public SqlDumpStatement() {
            super("sql_dump_statement");
        }
    }
}