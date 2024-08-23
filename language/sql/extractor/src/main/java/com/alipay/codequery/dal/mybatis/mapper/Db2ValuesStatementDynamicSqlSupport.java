package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class Db2ValuesStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_values_statement")
    public static final Db2ValuesStatement db2ValuesStatement = new Db2ValuesStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_values_statement.oid")
    public static final SqlColumn<Long> oid = db2ValuesStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_values_statement.expr_oid")
    public static final SqlColumn<Long> exprOid = db2ValuesStatement.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_values_statement")
    public static final class Db2ValuesStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public Db2ValuesStatement() {
            super("db2_values_statement");
        }
    }
}