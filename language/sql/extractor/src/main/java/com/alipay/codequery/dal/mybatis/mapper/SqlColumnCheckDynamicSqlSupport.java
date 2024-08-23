package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlColumnCheckDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_check")
    public static final SqlColumnCheck sqlColumnCheck = new SqlColumnCheck();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_check.oid")
    public static final SqlColumn<Long> oid = sqlColumnCheck.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_check.enforced")
    public static final SqlColumn<Integer> enforced = sqlColumnCheck.enforced;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_check.expr_oid")
    public static final SqlColumn<Long> exprOid = sqlColumnCheck.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_check")
    public static final class SqlColumnCheck extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> enforced = column("`enforced`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public SqlColumnCheck() {
            super("sql_column_check");
        }
    }
}