package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OscarShowStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_show_statement")
    public static final OscarShowStatement oscarShowStatement = new OscarShowStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_show_statement.oid")
    public static final SqlColumn<Long> oid = oscarShowStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_show_statement.expr_oid")
    public static final SqlColumn<Long> exprOid = oscarShowStatement.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_show_statement")
    public static final class OscarShowStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public OscarShowStatement() {
            super("oscar_show_statement");
        }
    }
}