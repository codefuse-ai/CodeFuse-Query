package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlSubqueryTableSourceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_subquery_table_source")
    public static final SqlSubqueryTableSource sqlSubqueryTableSource = new SqlSubqueryTableSource();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_subquery_table_source.oid")
    public static final SqlColumn<Long> oid = sqlSubqueryTableSource.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_subquery_table_source.select_oid")
    public static final SqlColumn<Long> selectOid = sqlSubqueryTableSource.selectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_subquery_table_source")
    public static final class SqlSubqueryTableSource extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> selectOid = column("`select_oid`", JDBCType.BIGINT);

        public SqlSubqueryTableSource() {
            super("sql_subquery_table_source");
        }
    }
}