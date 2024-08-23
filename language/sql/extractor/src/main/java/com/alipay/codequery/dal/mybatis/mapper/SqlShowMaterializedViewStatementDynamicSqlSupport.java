package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowMaterializedViewStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_materialized_view_statement")
    public static final SqlShowMaterializedViewStatement sqlShowMaterializedViewStatement = new SqlShowMaterializedViewStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_materialized_view_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowMaterializedViewStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_materialized_view_statement.like_oid")
    public static final SqlColumn<Long> likeOid = sqlShowMaterializedViewStatement.likeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_materialized_view_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlShowMaterializedViewStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_materialized_view_statement")
    public static final class SqlShowMaterializedViewStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> likeOid = column("`like_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlShowMaterializedViewStatement() {
            super("sql_show_materialized_view_statement");
        }
    }
}