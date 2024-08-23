package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsAddUserStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_user_statement")
    public static final OdpsAddUserStatement odpsAddUserStatement = new OdpsAddUserStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_user_statement.oid")
    public static final SqlColumn<Long> oid = odpsAddUserStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_user_statement.user_oid")
    public static final SqlColumn<Long> userOid = odpsAddUserStatement.userOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_user_statement")
    public static final class OdpsAddUserStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> userOid = column("`user_oid`", JDBCType.BIGINT);

        public OdpsAddUserStatement() {
            super("odps_add_user_statement");
        }
    }
}