package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsRemoveUserStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_user_statement")
    public static final OdpsRemoveUserStatement odpsRemoveUserStatement = new OdpsRemoveUserStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_remove_user_statement.oid")
    public static final SqlColumn<Long> oid = odpsRemoveUserStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_remove_user_statement.user_oid")
    public static final SqlColumn<Long> userOid = odpsRemoveUserStatement.userOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_user_statement")
    public static final class OdpsRemoveUserStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> userOid = column("`user_oid`", JDBCType.BIGINT);

        public OdpsRemoveUserStatement() {
            super("odps_remove_user_statement");
        }
    }
}