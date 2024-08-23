package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlRefreshMaterializedViewStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_refresh_materialized_view_statement")
    public static final SqlRefreshMaterializedViewStatement sqlRefreshMaterializedViewStatement = new SqlRefreshMaterializedViewStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_refresh_materialized_view_statement.oid")
    public static final SqlColumn<Long> oid = sqlRefreshMaterializedViewStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_refresh_materialized_view_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlRefreshMaterializedViewStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_refresh_materialized_view_statement")
    public static final class SqlRefreshMaterializedViewStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlRefreshMaterializedViewStatement() {
            super("sql_refresh_materialized_view_statement");
        }
    }
}