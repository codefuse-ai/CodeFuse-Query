package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsCreateTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_create_table_statement")
    public static final OdpsCreateTableStatement odpsCreateTableStatement = new OdpsCreateTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_create_table_statement.oid")
    public static final SqlColumn<Long> oid = odpsCreateTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_create_table_statement.lifecycle_oid")
    public static final SqlColumn<Long> lifecycleOid = odpsCreateTableStatement.lifecycleOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_create_table_statement.like_oid")
    public static final SqlColumn<Long> likeOid = odpsCreateTableStatement.likeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_create_table_statement.stored_by_oid")
    public static final SqlColumn<Long> storedByOid = odpsCreateTableStatement.storedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_create_table_statement")
    public static final class OdpsCreateTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> lifecycleOid = column("`lifecycle_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> likeOid = column("`like_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> storedByOid = column("`stored_by_oid`", JDBCType.BIGINT);

        public OdpsCreateTableStatement() {
            super("odps_create_table_statement");
        }
    }
}