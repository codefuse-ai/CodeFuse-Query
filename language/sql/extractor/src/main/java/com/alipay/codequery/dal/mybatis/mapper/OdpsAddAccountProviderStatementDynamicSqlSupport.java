package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsAddAccountProviderStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_account_provider_statement")
    public static final OdpsAddAccountProviderStatement odpsAddAccountProviderStatement = new OdpsAddAccountProviderStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_account_provider_statement.oid")
    public static final SqlColumn<Long> oid = odpsAddAccountProviderStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_account_provider_statement.provider_oid")
    public static final SqlColumn<Long> providerOid = odpsAddAccountProviderStatement.providerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_account_provider_statement")
    public static final class OdpsAddAccountProviderStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> providerOid = column("`provider_oid`", JDBCType.BIGINT);

        public OdpsAddAccountProviderStatement() {
            super("odps_add_account_provider_statement");
        }
    }
}