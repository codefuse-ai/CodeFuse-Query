package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleSelectJoinDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_join")
    public static final OracleSelectJoin oracleSelectJoin = new OracleSelectJoin();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_join.oid")
    public static final SqlColumn<Long> oid = oracleSelectJoin.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_join.pivot_oid")
    public static final SqlColumn<Long> pivotOid = oracleSelectJoin.pivotOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_join")
    public static final class OracleSelectJoin extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> pivotOid = column("`pivot_oid`", JDBCType.BIGINT);

        public OracleSelectJoin() {
            super("oracle_select_join");
        }
    }
}