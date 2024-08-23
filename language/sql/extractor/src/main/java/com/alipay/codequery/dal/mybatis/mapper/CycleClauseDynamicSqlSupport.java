package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CycleClauseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cycle_clause")
    public static final CycleClause cycleClause = new CycleClause();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cycle_clause.oid")
    public static final SqlColumn<Long> oid = cycleClause.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cycle_clause.default_value_oid")
    public static final SqlColumn<Long> defaultValueOid = cycleClause.defaultValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cycle_clause.mark_oid")
    public static final SqlColumn<Long> markOid = cycleClause.markOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cycle_clause.value_oid")
    public static final SqlColumn<Long> valueOid = cycleClause.valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cycle_clause")
    public static final class CycleClause extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> defaultValueOid = column("`default_value_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> markOid = column("`mark_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> valueOid = column("`value_oid`", JDBCType.BIGINT);

        public CycleClause() {
            super("cycle_clause");
        }
    }
}