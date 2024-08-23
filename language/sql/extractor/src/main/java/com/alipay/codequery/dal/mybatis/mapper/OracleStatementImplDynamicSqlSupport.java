package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleStatementImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_statement_impl")
    public static final OracleStatementImpl oracleStatementImpl = new OracleStatementImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_statement_impl.oid")
    public static final SqlColumn<Long> oid = oracleStatementImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_statement_impl")
    public static final class OracleStatementImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public OracleStatementImpl() {
            super("oracle_statement_impl");
        }
    }
}