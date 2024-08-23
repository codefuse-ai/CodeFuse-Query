package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAdhocTableSourceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_adhoc_table_source")
    public static final SqlAdhocTableSource sqlAdhocTableSource = new SqlAdhocTableSource();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_adhoc_table_source.oid")
    public static final SqlColumn<Long> oid = sqlAdhocTableSource.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_adhoc_table_source.definition_oid")
    public static final SqlColumn<Long> definitionOid = sqlAdhocTableSource.definitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_adhoc_table_source")
    public static final class SqlAdhocTableSource extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> definitionOid = column("`definition_oid`", JDBCType.BIGINT);

        public SqlAdhocTableSource() {
            super("sql_adhoc_table_source");
        }
    }
}