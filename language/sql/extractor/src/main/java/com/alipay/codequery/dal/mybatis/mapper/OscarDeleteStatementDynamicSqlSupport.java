package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OscarDeleteStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_delete_statement")
    public static final OscarDeleteStatement oscarDeleteStatement = new OscarDeleteStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_delete_statement.oid")
    public static final SqlColumn<Long> oid = oscarDeleteStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_delete_statement.alias")
    public static final SqlColumn<String> alias = oscarDeleteStatement.alias;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_delete_statement.is_returning")
    public static final SqlColumn<Integer> isReturning = oscarDeleteStatement.isReturning;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_delete_statement")
    public static final class OscarDeleteStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> alias = column("`alias`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isReturning = column("`is_returning`", JDBCType.BIGINT);

        public OscarDeleteStatement() {
            super("oscar_delete_statement");
        }
    }
}