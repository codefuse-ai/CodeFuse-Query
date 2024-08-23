package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsExstoreStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_exstore_statement")
    public static final OdpsExstoreStatement odpsExstoreStatement = new OdpsExstoreStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_exstore_statement.oid")
    public static final SqlColumn<Long> oid = odpsExstoreStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_exstore_statement.table_oid")
    public static final SqlColumn<Long> tableOid = odpsExstoreStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_exstore_statement")
    public static final class OdpsExstoreStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public OdpsExstoreStatement() {
            super("odps_exstore_statement");
        }
    }
}