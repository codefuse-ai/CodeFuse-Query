package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PhoenixStatementImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: phoenix_statement_impl")
    public static final PhoenixStatementImpl phoenixStatementImpl = new PhoenixStatementImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: phoenix_statement_impl.oid")
    public static final SqlColumn<Long> oid = phoenixStatementImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: phoenix_statement_impl")
    public static final class PhoenixStatementImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public PhoenixStatementImpl() {
            super("phoenix_statement_impl");
        }
    }
}