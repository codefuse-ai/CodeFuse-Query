package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowTableGroupsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_table_groups_statement")
    public static final SqlShowTableGroupsStatement sqlShowTableGroupsStatement = new SqlShowTableGroupsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_table_groups_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowTableGroupsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_table_groups_statement.database_oid")
    public static final SqlColumn<Long> databaseOid = sqlShowTableGroupsStatement.databaseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_table_groups_statement")
    public static final class SqlShowTableGroupsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> databaseOid = column("`database_oid`", JDBCType.BIGINT);

        public SqlShowTableGroupsStatement() {
            super("sql_show_table_groups_statement");
        }
    }
}