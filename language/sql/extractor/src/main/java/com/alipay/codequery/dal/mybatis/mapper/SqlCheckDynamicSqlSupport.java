package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCheckDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_check")
    public static final SqlCheck sqlCheck = new SqlCheck();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_check.oid")
    public static final SqlColumn<Long> oid = sqlCheck.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_check.enforced")
    public static final SqlColumn<Integer> enforced = sqlCheck.enforced;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_check.expr_oid")
    public static final SqlColumn<Long> exprOid = sqlCheck.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_check")
    public static final class SqlCheck extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> enforced = column("`enforced`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public SqlCheck() {
            super("sql_check");
        }
    }
}