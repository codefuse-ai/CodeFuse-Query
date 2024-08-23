package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleSelectPivotBaseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot_base")
    public static final OracleSelectPivotBase oracleSelectPivotBase = new OracleSelectPivotBase();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_pivot_base.oid")
    public static final SqlColumn<Long> oid = oracleSelectPivotBase.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot_base")
    public static final class OracleSelectPivotBase extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public OracleSelectPivotBase() {
            super("oracle_select_pivot_base");
        }
    }
}