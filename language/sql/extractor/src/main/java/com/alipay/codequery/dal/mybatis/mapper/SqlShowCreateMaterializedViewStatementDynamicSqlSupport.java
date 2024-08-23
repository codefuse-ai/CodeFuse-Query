package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowCreateMaterializedViewStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_create_materialized_view_statement")
    public static final SqlShowCreateMaterializedViewStatement sqlShowCreateMaterializedViewStatement = new SqlShowCreateMaterializedViewStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_create_materialized_view_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowCreateMaterializedViewStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_create_materialized_view_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlShowCreateMaterializedViewStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_create_materialized_view_statement")
    public static final class SqlShowCreateMaterializedViewStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlShowCreateMaterializedViewStatement() {
            super("sql_show_create_materialized_view_statement");
        }
    }
}