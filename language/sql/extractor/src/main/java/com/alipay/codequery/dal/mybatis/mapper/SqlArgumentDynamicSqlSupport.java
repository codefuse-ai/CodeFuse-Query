package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlArgumentDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_argument")
    public static final SqlArgument sqlArgument = new SqlArgument();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_argument.oid")
    public static final SqlColumn<Long> oid = sqlArgument.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_argument.expr_oid")
    public static final SqlColumn<Long> exprOid = sqlArgument.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_argument.type")
    public static final SqlColumn<String> type = sqlArgument.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_argument")
    public static final class SqlArgument extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public SqlArgument() {
            super("sql_argument");
        }
    }
}