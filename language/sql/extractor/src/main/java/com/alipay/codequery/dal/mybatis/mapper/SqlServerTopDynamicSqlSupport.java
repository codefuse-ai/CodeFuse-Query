package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlServerTopDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_top")
    public static final SqlServerTop sqlServerTop = new SqlServerTop();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_top.oid")
    public static final SqlColumn<Long> oid = sqlServerTop.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_top.expr_oid")
    public static final SqlColumn<Long> exprOid = sqlServerTop.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_top.is_percent")
    public static final SqlColumn<Integer> isPercent = sqlServerTop.isPercent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_top.is_with_ties")
    public static final SqlColumn<Integer> isWithTies = sqlServerTop.isWithTies;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_top")
    public static final class SqlServerTop extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isPercent = column("`is_percent`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithTies = column("`is_with_ties`", JDBCType.BIGINT);

        public SqlServerTop() {
            super("sql_server_top");
        }
    }
}