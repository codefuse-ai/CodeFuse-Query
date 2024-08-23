package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlServerRollbackStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_rollback_statement")
    public static final SqlServerRollbackStatement sqlServerRollbackStatement = new SqlServerRollbackStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_rollback_statement.oid")
    public static final SqlColumn<Long> oid = sqlServerRollbackStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_rollback_statement.is_work")
    public static final SqlColumn<Integer> isWork = sqlServerRollbackStatement.isWork;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_rollback_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlServerRollbackStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_rollback_statement")
    public static final class SqlServerRollbackStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWork = column("`is_work`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlServerRollbackStatement() {
            super("sql_server_rollback_statement");
        }
    }
}