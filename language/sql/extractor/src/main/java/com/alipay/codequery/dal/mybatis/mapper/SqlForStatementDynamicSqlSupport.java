package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlForStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_for_statement")
    public static final SqlForStatement sqlForStatement = new SqlForStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_for_statement.oid")
    public static final SqlColumn<Long> oid = sqlForStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_for_statement.index_oid")
    public static final SqlColumn<Long> indexOid = sqlForStatement.indexOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_for_statement.range_oid")
    public static final SqlColumn<Long> rangeOid = sqlForStatement.rangeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_for_statement")
    public static final class SqlForStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> indexOid = column("`index_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> rangeOid = column("`range_oid`", JDBCType.BIGINT);

        public SqlForStatement() {
            super("sql_for_statement");
        }
    }
}