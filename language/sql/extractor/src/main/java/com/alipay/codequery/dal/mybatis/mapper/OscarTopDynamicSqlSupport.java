package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OscarTopDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_top")
    public static final OscarTop oscarTop = new OscarTop();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_top.oid")
    public static final SqlColumn<Long> oid = oscarTop.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_top.expr_oid")
    public static final SqlColumn<Long> exprOid = oscarTop.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_top.is_percent")
    public static final SqlColumn<Integer> isPercent = oscarTop.isPercent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_top.is_with_ties")
    public static final SqlColumn<Integer> isWithTies = oscarTop.isWithTies;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_top")
    public static final class OscarTop extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isPercent = column("`is_percent`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithTies = column("`is_with_ties`", JDBCType.BIGINT);

        public OscarTop() {
            super("oscar_top");
        }
    }
}