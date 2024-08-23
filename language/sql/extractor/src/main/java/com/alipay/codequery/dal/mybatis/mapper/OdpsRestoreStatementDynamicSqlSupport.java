package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsRestoreStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_restore_statement")
    public static final OdpsRestoreStatement odpsRestoreStatement = new OdpsRestoreStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_restore_statement.oid")
    public static final SqlColumn<Long> oid = odpsRestoreStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_restore_statement.alias")
    public static final SqlColumn<String> alias = odpsRestoreStatement.alias;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_restore_statement.table_oid")
    public static final SqlColumn<Long> tableOid = odpsRestoreStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_restore_statement.to_oid")
    public static final SqlColumn<Long> toOid = odpsRestoreStatement.toOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_restore_statement")
    public static final class OdpsRestoreStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> alias = column("`alias`", JDBCType.VARCHAR);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toOid = column("`to_oid`", JDBCType.BIGINT);

        public OdpsRestoreStatement() {
            super("odps_restore_statement");
        }
    }
}