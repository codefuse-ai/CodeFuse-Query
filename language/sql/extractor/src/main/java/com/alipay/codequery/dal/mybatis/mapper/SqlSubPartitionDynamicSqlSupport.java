package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlSubPartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    public static final SqlSubPartition sqlSubPartition = new SqlSubPartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.oid")
    public static final SqlColumn<Long> oid = sqlSubPartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.comment_oid")
    public static final SqlColumn<Long> commentOid = sqlSubPartition.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.data_directory_oid")
    public static final SqlColumn<Long> dataDirectoryOid = sqlSubPartition.dataDirectoryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.engine_oid")
    public static final SqlColumn<Long> engineOid = sqlSubPartition.engineOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.index_directory_oid")
    public static final SqlColumn<Long> indexDirectoryOid = sqlSubPartition.indexDirectoryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.max_rows_oid")
    public static final SqlColumn<Long> maxRowsOid = sqlSubPartition.maxRowsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.min_rows_oid")
    public static final SqlColumn<Long> minRowsOid = sqlSubPartition.minRowsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.name_oid")
    public static final SqlColumn<Long> nameOid = sqlSubPartition.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.table_space_oid")
    public static final SqlColumn<Long> tableSpaceOid = sqlSubPartition.tableSpaceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.values_oid")
    public static final SqlColumn<Long> valuesOid = sqlSubPartition.valuesOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    public static final class SqlSubPartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dataDirectoryOid = column("`data_directory_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> engineOid = column("`engine_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> indexDirectoryOid = column("`index_directory_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> maxRowsOid = column("`max_rows_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> minRowsOid = column("`min_rows_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableSpaceOid = column("`table_space_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> valuesOid = column("`values_oid`", JDBCType.BIGINT);

        public SqlSubPartition() {
            super("sql_sub_partition");
        }
    }
}