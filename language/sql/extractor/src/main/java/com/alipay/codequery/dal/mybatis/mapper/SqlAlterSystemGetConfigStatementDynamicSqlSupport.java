package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterSystemGetConfigStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_system_get_config_statement")
    public static final SqlAlterSystemGetConfigStatement sqlAlterSystemGetConfigStatement = new SqlAlterSystemGetConfigStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_system_get_config_statement.oid")
    public static final SqlColumn<Long> oid = sqlAlterSystemGetConfigStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_system_get_config_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlAlterSystemGetConfigStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_system_get_config_statement")
    public static final class SqlAlterSystemGetConfigStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlAlterSystemGetConfigStatement() {
            super("sql_alter_system_get_config_statement");
        }
    }
}