package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsAddStatisticStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_statistic_statement")
    public static final OdpsAddStatisticStatement odpsAddStatisticStatement = new OdpsAddStatisticStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_statistic_statement.oid")
    public static final SqlColumn<Long> oid = odpsAddStatisticStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_statistic_statement.statistic_clause_oid")
    public static final SqlColumn<Long> statisticClauseOid = odpsAddStatisticStatement.statisticClauseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_statistic_statement.table_oid")
    public static final SqlColumn<Long> tableOid = odpsAddStatisticStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_statistic_statement")
    public static final class OdpsAddStatisticStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> statisticClauseOid = column("`statistic_clause_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public OdpsAddStatisticStatement() {
            super("odps_add_statistic_statement");
        }
    }
}