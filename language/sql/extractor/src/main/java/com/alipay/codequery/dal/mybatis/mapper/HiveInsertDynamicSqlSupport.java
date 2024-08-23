package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HiveInsertDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    public static final HiveInsert hiveInsert = new HiveInsert();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_insert.oid")
    public static final SqlColumn<Long> oid = hiveInsert.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_insert.query_oid")
    public static final SqlColumn<Long> queryOid = hiveInsert.queryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_insert.table_source_oid")
    public static final SqlColumn<Long> tableSourceOid = hiveInsert.tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_insert.values_list")
    public static final SqlColumn<String> valuesList = hiveInsert.valuesList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    public static final class HiveInsert extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> queryOid = column("`query_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableSourceOid = column("`table_source_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> valuesList = column("`values_list`", JDBCType.VARCHAR);

        public HiveInsert() {
            super("hive_insert");
        }
    }
}