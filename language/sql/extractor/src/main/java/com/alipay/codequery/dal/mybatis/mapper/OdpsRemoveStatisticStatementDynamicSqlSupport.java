package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsRemoveStatisticStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    public static final OdpsRemoveStatisticStatement odpsRemoveStatisticStatement = new OdpsRemoveStatisticStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_remove_statistic_statement.oid")
    public static final SqlColumn<Long> oid = odpsRemoveStatisticStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_remove_statistic_statement.statistic_clause_oid")
    public static final SqlColumn<Long> statisticClauseOid = odpsRemoveStatisticStatement.statisticClauseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_remove_statistic_statement.table_oid")
    public static final SqlColumn<Long> tableOid = odpsRemoveStatisticStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    public static final class OdpsRemoveStatisticStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> statisticClauseOid = column("`statistic_clause_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public OdpsRemoveStatisticStatement() {
            super("odps_remove_statistic_statement");
        }
    }
}