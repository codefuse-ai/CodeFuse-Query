package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsQueryAliasStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    public static final OdpsQueryAliasStatement odpsQueryAliasStatement = new OdpsQueryAliasStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_query_alias_statement.oid")
    public static final SqlColumn<Long> oid = odpsQueryAliasStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_query_alias_statement.is_cache")
    public static final SqlColumn<Integer> isCache = odpsQueryAliasStatement.isCache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_query_alias_statement.statement_oid")
    public static final SqlColumn<Long> statementOid = odpsQueryAliasStatement.statementOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_query_alias_statement.variant")
    public static final SqlColumn<String> variant = odpsQueryAliasStatement.variant;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    public static final class OdpsQueryAliasStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCache = column("`is_cache`", JDBCType.BIGINT);

        public final SqlColumn<Long> statementOid = column("`statement_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> variant = column("`variant`", JDBCType.VARCHAR);

        public OdpsQueryAliasStatement() {
            super("odps_query_alias_statement");
        }
    }
}