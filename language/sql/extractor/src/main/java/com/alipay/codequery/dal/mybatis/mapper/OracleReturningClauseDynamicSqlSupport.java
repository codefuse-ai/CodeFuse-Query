package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleReturningClauseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_returning_clause")
    public static final OracleReturningClause oracleReturningClause = new OracleReturningClause();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_returning_clause.oid")
    public static final SqlColumn<Long> oid = oracleReturningClause.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_returning_clause")
    public static final class OracleReturningClause extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public OracleReturningClause() {
            super("oracle_returning_clause");
        }
    }
}