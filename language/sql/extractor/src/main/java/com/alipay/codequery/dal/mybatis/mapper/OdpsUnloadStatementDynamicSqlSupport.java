package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsUnloadStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    public static final OdpsUnloadStatement odpsUnloadStatement = new OdpsUnloadStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_unload_statement.oid")
    public static final SqlColumn<Long> oid = odpsUnloadStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_unload_statement.from_oid")
    public static final SqlColumn<Long> fromOid = odpsUnloadStatement.fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_unload_statement.location_oid")
    public static final SqlColumn<Long> locationOid = odpsUnloadStatement.locationOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_unload_statement.row_format_oid")
    public static final SqlColumn<Long> rowFormatOid = odpsUnloadStatement.rowFormatOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_unload_statement.stored_as_oid")
    public static final SqlColumn<Long> storedAsOid = odpsUnloadStatement.storedAsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    public static final class OdpsUnloadStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fromOid = column("`from_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> locationOid = column("`location_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> rowFormatOid = column("`row_format_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> storedAsOid = column("`stored_as_oid`", JDBCType.BIGINT);

        public OdpsUnloadStatement() {
            super("odps_unload_statement");
        }
    }
}