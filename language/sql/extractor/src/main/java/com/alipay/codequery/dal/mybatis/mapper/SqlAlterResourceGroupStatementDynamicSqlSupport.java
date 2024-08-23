package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterResourceGroupStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_resource_group_statement")
    public static final SqlAlterResourceGroupStatement sqlAlterResourceGroupStatement = new SqlAlterResourceGroupStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_resource_group_statement.oid")
    public static final SqlColumn<Long> oid = sqlAlterResourceGroupStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_resource_group_statement.enable")
    public static final SqlColumn<Integer> enable = sqlAlterResourceGroupStatement.enable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_resource_group_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlAlterResourceGroupStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_resource_group_statement.properties")
    public static final SqlColumn<String> properties = sqlAlterResourceGroupStatement.properties;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_resource_group_statement")
    public static final class SqlAlterResourceGroupStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> enable = column("`enable`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> properties = column("`properties`", JDBCType.VARCHAR);

        public SqlAlterResourceGroupStatement() {
            super("sql_alter_resource_group_statement");
        }
    }
}