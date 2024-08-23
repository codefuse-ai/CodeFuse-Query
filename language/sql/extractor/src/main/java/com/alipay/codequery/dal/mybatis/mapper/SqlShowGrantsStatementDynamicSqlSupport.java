package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowGrantsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_grants_statement")
    public static final SqlShowGrantsStatement sqlShowGrantsStatement = new SqlShowGrantsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_grants_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowGrantsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_grants_statement.on_oid")
    public static final SqlColumn<Long> onOid = sqlShowGrantsStatement.onOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_grants_statement.user_oid")
    public static final SqlColumn<Long> userOid = sqlShowGrantsStatement.userOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_grants_statement")
    public static final class SqlShowGrantsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> onOid = column("`on_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> userOid = column("`user_oid`", JDBCType.BIGINT);

        public SqlShowGrantsStatement() {
            super("sql_show_grants_statement");
        }
    }
}