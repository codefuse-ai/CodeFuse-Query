package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlListResourceGroupStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_list_resource_group_statement")
    public static final SqlListResourceGroupStatement sqlListResourceGroupStatement = new SqlListResourceGroupStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_list_resource_group_statement.oid")
    public static final SqlColumn<Long> oid = sqlListResourceGroupStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_list_resource_group_statement")
    public static final class SqlListResourceGroupStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlListResourceGroupStatement() {
            super("sql_list_resource_group_statement");
        }
    }
}