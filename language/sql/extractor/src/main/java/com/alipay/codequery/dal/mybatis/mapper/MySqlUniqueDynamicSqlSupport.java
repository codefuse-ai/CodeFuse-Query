package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlUniqueDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    public static final MySqlUnique mySqlUnique = new MySqlUnique();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.oid")
    public static final SqlColumn<Long> oid = mySqlUnique.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.db_partition_by_oid")
    public static final SqlColumn<Long> dbPartitionByOid = mySqlUnique.dbPartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.is_global")
    public static final SqlColumn<Integer> isGlobal = mySqlUnique.isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.is_local")
    public static final SqlColumn<Integer> isLocal = mySqlUnique.isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.table_partition_by_oid")
    public static final SqlColumn<Long> tablePartitionByOid = mySqlUnique.tablePartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.table_partitions_oid")
    public static final SqlColumn<Long> tablePartitionsOid = mySqlUnique.tablePartitionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    public static final class MySqlUnique extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dbPartitionByOid = column("`db_partition_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isGlobal = column("`is_global`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLocal = column("`is_local`", JDBCType.BIGINT);

        public final SqlColumn<Long> tablePartitionByOid = column("`table_partition_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tablePartitionsOid = column("`table_partitions_oid`", JDBCType.BIGINT);

        public MySqlUnique() {
            super("my_sql_unique");
        }
    }
}