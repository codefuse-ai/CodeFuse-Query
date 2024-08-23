package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlBackupStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_backup_statement")
    public static final SqlBackupStatement sqlBackupStatement = new SqlBackupStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_backup_statement.oid")
    public static final SqlColumn<Long> oid = sqlBackupStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_backup_statement.action_oid")
    public static final SqlColumn<Long> actionOid = sqlBackupStatement.actionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_backup_statement.type_oid")
    public static final SqlColumn<Long> typeOid = sqlBackupStatement.typeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_backup_statement")
    public static final class SqlBackupStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> actionOid = column("`action_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> typeOid = column("`type_oid`", JDBCType.BIGINT);

        public SqlBackupStatement() {
            super("sql_backup_statement");
        }
    }
}