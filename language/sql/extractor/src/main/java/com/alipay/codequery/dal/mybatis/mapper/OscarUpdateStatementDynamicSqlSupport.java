package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OscarUpdateStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_update_statement")
    public static final OscarUpdateStatement oscarUpdateStatement = new OscarUpdateStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_update_statement.oid")
    public static final SqlColumn<Long> oid = oscarUpdateStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_update_statement.is_only")
    public static final SqlColumn<Integer> isOnly = oscarUpdateStatement.isOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_update_statement")
    public static final class OscarUpdateStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOnly = column("`is_only`", JDBCType.BIGINT);

        public OscarUpdateStatement() {
            super("oscar_update_statement");
        }
    }
}