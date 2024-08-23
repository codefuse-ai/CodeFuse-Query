package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDropResourceGroupStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_resource_group_statement")
    public static final SqlDropResourceGroupStatement sqlDropResourceGroupStatement = new SqlDropResourceGroupStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_resource_group_statement.oid")
    public static final SqlColumn<Long> oid = sqlDropResourceGroupStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_resource_group_statement.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = sqlDropResourceGroupStatement.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_resource_group_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlDropResourceGroupStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_resource_group_statement")
    public static final class SqlDropResourceGroupStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlDropResourceGroupStatement() {
            super("sql_drop_resource_group_statement");
        }
    }
}