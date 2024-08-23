package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsReadStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_read_statement")
    public static final OdpsReadStatement odpsReadStatement = new OdpsReadStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_read_statement.oid")
    public static final SqlColumn<Long> oid = odpsReadStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_read_statement.row_count_oid")
    public static final SqlColumn<Long> rowCountOid = odpsReadStatement.rowCountOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_read_statement.table_oid")
    public static final SqlColumn<Long> tableOid = odpsReadStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_read_statement")
    public static final class OdpsReadStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> rowCountOid = column("`row_count_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public OdpsReadStatement() {
            super("odps_read_statement");
        }
    }
}