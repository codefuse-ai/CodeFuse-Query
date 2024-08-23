package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DrdsBaselineStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_baseline_statement")
    public static final DrdsBaselineStatement drdsBaselineStatement = new DrdsBaselineStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_baseline_statement.oid")
    public static final SqlColumn<Long> oid = drdsBaselineStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_baseline_statement.baseline_ids")
    public static final SqlColumn<String> baselineIds = drdsBaselineStatement.baselineIds;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_baseline_statement.operation")
    public static final SqlColumn<String> operation = drdsBaselineStatement.operation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_baseline_statement.select_oid")
    public static final SqlColumn<Long> selectOid = drdsBaselineStatement.selectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_baseline_statement")
    public static final class DrdsBaselineStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> baselineIds = column("`baseline_ids`", JDBCType.VARCHAR);

        public final SqlColumn<String> operation = column("`operation`", JDBCType.VARCHAR);

        public final SqlColumn<Long> selectOid = column("`select_oid`", JDBCType.BIGINT);

        public DrdsBaselineStatement() {
            super("drds_baseline_statement");
        }
    }
}