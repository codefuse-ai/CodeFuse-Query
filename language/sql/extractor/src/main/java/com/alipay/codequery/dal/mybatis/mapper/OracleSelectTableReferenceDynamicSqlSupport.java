package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleSelectTableReferenceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    public static final OracleSelectTableReference oracleSelectTableReference = new OracleSelectTableReference();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_table_reference.oid")
    public static final SqlColumn<Long> oid = oracleSelectTableReference.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_table_reference.is_only")
    public static final SqlColumn<Integer> isOnly = oracleSelectTableReference.isOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_table_reference.partition_oid")
    public static final SqlColumn<Long> partitionOid = oracleSelectTableReference.partitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_table_reference.pivot_oid")
    public static final SqlColumn<Long> pivotOid = oracleSelectTableReference.pivotOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_table_reference.sample_clause_oid")
    public static final SqlColumn<Long> sampleClauseOid = oracleSelectTableReference.sampleClauseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    public static final class OracleSelectTableReference extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOnly = column("`is_only`", JDBCType.BIGINT);

        public final SqlColumn<Long> partitionOid = column("`partition_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> pivotOid = column("`pivot_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> sampleClauseOid = column("`sample_clause_oid`", JDBCType.BIGINT);

        public OracleSelectTableReference() {
            super("oracle_select_table_reference");
        }
    }
}