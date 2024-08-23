package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsStatementImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_statement_impl")
    public static final OdpsStatementImpl odpsStatementImpl = new OdpsStatementImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_statement_impl.oid")
    public static final SqlColumn<Long> oid = odpsStatementImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_statement_impl")
    public static final class OdpsStatementImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public OdpsStatementImpl() {
            super("odps_statement_impl");
        }
    }
}