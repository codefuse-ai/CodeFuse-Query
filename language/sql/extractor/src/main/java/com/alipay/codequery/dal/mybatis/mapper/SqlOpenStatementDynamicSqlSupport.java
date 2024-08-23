package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlOpenStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    public static final SqlOpenStatement sqlOpenStatement = new SqlOpenStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_open_statement.oid")
    public static final SqlColumn<Long> oid = sqlOpenStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_open_statement.cursor_name_oid")
    public static final SqlColumn<Long> cursorNameOid = sqlOpenStatement.cursorNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_open_statement.for_oid")
    public static final SqlColumn<Long> forOid = sqlOpenStatement.forOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    public static final class SqlOpenStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> cursorNameOid = column("`cursor_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> forOid = column("`for_oid`", JDBCType.BIGINT);

        public SqlOpenStatement() {
            super("sql_open_statement");
        }
    }
}