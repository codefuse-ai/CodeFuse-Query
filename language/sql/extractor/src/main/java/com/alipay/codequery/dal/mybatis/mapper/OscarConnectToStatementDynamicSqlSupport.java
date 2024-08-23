package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OscarConnectToStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_connect_to_statement")
    public static final OscarConnectToStatement oscarConnectToStatement = new OscarConnectToStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_connect_to_statement.oid")
    public static final SqlColumn<Long> oid = oscarConnectToStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_connect_to_statement.target_oid")
    public static final SqlColumn<Long> targetOid = oscarConnectToStatement.targetOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_connect_to_statement")
    public static final class OscarConnectToStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> targetOid = column("`target_oid`", JDBCType.BIGINT);

        public OscarConnectToStatement() {
            super("oscar_connect_to_statement");
        }
    }
}