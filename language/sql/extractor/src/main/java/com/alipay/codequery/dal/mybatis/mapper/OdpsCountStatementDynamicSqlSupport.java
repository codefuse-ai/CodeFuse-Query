package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsCountStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_count_statement")
    public static final OdpsCountStatement odpsCountStatement = new OdpsCountStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_count_statement.oid")
    public static final SqlColumn<Long> oid = odpsCountStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_count_statement.table_oid")
    public static final SqlColumn<Long> tableOid = odpsCountStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_count_statement")
    public static final class OdpsCountStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public OdpsCountStatement() {
            super("odps_count_statement");
        }
    }
}