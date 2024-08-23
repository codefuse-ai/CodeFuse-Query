package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleSelectSubqueryTableSourceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_subquery_table_source")
    public static final OracleSelectSubqueryTableSource oracleSelectSubqueryTableSource = new OracleSelectSubqueryTableSource();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_subquery_table_source.oid")
    public static final SqlColumn<Long> oid = oracleSelectSubqueryTableSource.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_subquery_table_source.pivot_oid")
    public static final SqlColumn<Long> pivotOid = oracleSelectSubqueryTableSource.pivotOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_subquery_table_source")
    public static final class OracleSelectSubqueryTableSource extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> pivotOid = column("`pivot_oid`", JDBCType.BIGINT);

        public OracleSelectSubqueryTableSource() {
            super("oracle_select_subquery_table_source");
        }
    }
}