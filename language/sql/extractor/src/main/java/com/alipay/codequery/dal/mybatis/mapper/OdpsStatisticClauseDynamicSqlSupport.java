package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsStatisticClauseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_statistic_clause")
    public static final OdpsStatisticClause odpsStatisticClause = new OdpsStatisticClause();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_statistic_clause.oid")
    public static final SqlColumn<Long> oid = odpsStatisticClause.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_statistic_clause")
    public static final class OdpsStatisticClause extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public OdpsStatisticClause() {
            super("odps_statistic_clause");
        }
    }
}