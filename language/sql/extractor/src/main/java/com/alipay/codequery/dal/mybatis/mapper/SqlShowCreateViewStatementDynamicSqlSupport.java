package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowCreateViewStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_create_view_statement")
    public static final SqlShowCreateViewStatement sqlShowCreateViewStatement = new SqlShowCreateViewStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_create_view_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowCreateViewStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_create_view_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlShowCreateViewStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_create_view_statement")
    public static final class SqlShowCreateViewStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlShowCreateViewStatement() {
            super("sql_show_create_view_statement");
        }
    }
}