package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterSystemSetConfigStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_system_set_config_statement")
    public static final SqlAlterSystemSetConfigStatement sqlAlterSystemSetConfigStatement = new SqlAlterSystemSetConfigStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_system_set_config_statement.oid")
    public static final SqlColumn<Long> oid = sqlAlterSystemSetConfigStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_system_set_config_statement")
    public static final class SqlAlterSystemSetConfigStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlAlterSystemSetConfigStatement() {
            super("sql_alter_system_set_config_statement");
        }
    }
}