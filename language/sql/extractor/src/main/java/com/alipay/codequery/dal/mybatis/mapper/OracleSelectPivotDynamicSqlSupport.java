package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleSelectPivotDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    public static final OracleSelectPivot oracleSelectPivot = new OracleSelectPivot();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_pivot.oid")
    public static final SqlColumn<Long> oid = oracleSelectPivot.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_pivot.is_xml")
    public static final SqlColumn<Integer> isXml = oracleSelectPivot.isXml;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_pivot.items")
    public static final SqlColumn<String> items = oracleSelectPivot.items;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_pivot.pivot_in")
    public static final SqlColumn<String> pivotIn = oracleSelectPivot.pivotIn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    public static final class OracleSelectPivot extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isXml = column("`is_xml`", JDBCType.BIGINT);

        public final SqlColumn<String> items = column("`items`", JDBCType.VARCHAR);

        public final SqlColumn<String> pivotIn = column("`pivot_in`", JDBCType.VARCHAR);

        public OracleSelectPivot() {
            super("oracle_select_pivot");
        }
    }
}