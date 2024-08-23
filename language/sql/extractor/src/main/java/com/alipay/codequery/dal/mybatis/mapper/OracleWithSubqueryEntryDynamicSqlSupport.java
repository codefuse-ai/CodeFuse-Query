package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleWithSubqueryEntryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    public static final OracleWithSubqueryEntry oracleWithSubqueryEntry = new OracleWithSubqueryEntry();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_with_subquery_entry.oid")
    public static final SqlColumn<Long> oid = oracleWithSubqueryEntry.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_with_subquery_entry.cycle_clause_oid")
    public static final SqlColumn<Long> cycleClauseOid = oracleWithSubqueryEntry.cycleClauseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_with_subquery_entry.search_clause_oid")
    public static final SqlColumn<Long> searchClauseOid = oracleWithSubqueryEntry.searchClauseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    public static final class OracleWithSubqueryEntry extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> cycleClauseOid = column("`cycle_clause_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> searchClauseOid = column("`search_clause_oid`", JDBCType.BIGINT);

        public OracleWithSubqueryEntry() {
            super("oracle_with_subquery_entry");
        }
    }
}