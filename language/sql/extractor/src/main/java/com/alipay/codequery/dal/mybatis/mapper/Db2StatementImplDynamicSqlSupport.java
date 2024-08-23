package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class Db2StatementImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_statement_impl")
    public static final Db2StatementImpl db2StatementImpl = new Db2StatementImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_statement_impl.oid")
    public static final SqlColumn<Long> oid = db2StatementImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_statement_impl")
    public static final class Db2StatementImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public Db2StatementImpl() {
            super("db2_statement_impl");
        }
    }
}