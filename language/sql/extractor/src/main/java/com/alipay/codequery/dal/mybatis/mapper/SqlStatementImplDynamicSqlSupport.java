package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlStatementImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_statement_impl")
    public static final SqlStatementImpl sqlStatementImpl = new SqlStatementImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_statement_impl.oid")
    public static final SqlColumn<Long> oid = sqlStatementImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_statement_impl.is_after_semi")
    public static final SqlColumn<Integer> isAfterSemi = sqlStatementImpl.isAfterSemi;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_statement_impl")
    public static final class SqlStatementImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isAfterSemi = column("`is_after_semi`", JDBCType.BIGINT);

        public SqlStatementImpl() {
            super("sql_statement_impl");
        }
    }
}