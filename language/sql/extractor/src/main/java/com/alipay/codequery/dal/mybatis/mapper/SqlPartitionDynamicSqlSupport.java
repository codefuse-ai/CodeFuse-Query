package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlPartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    public static final SqlPartition sqlPartition = new SqlPartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition.oid")
    public static final SqlColumn<Long> oid = sqlPartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition.comment_oid")
    public static final SqlColumn<Long> commentOid = sqlPartition.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition.data_directory_oid")
    public static final SqlColumn<Long> dataDirectoryOid = sqlPartition.dataDirectoryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition.engine_oid")
    public static final SqlColumn<Long> engineOid = sqlPartition.engineOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition.index_directory_oid")
    public static final SqlColumn<Long> indexDirectoryOid = sqlPartition.indexDirectoryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition.is_segment_creation_deferred")
    public static final SqlColumn<Integer> isSegmentCreationDeferred = sqlPartition.isSegmentCreationDeferred;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition.is_segment_creation_immediate")
    public static final SqlColumn<Integer> isSegmentCreationImmediate = sqlPartition.isSegmentCreationImmediate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition.lob_storage")
    public static final SqlColumn<String> lobStorage = sqlPartition.lobStorage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition.locality_oid")
    public static final SqlColumn<Long> localityOid = sqlPartition.localityOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition.max_rows_oid")
    public static final SqlColumn<Long> maxRowsOid = sqlPartition.maxRowsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition.min_rows_oid")
    public static final SqlColumn<Long> minRowsOid = sqlPartition.minRowsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition.name_oid")
    public static final SqlColumn<Long> nameOid = sqlPartition.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition.sub_partitions_count_oid")
    public static final SqlColumn<Long> subPartitionsCountOid = sqlPartition.subPartitionsCountOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition.values_oid")
    public static final SqlColumn<Long> valuesOid = sqlPartition.valuesOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    public static final class SqlPartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dataDirectoryOid = column("`data_directory_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> engineOid = column("`engine_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> indexDirectoryOid = column("`index_directory_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSegmentCreationDeferred = column("`is_segment_creation_deferred`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSegmentCreationImmediate = column("`is_segment_creation_immediate`", JDBCType.BIGINT);

        public final SqlColumn<String> lobStorage = column("`lob_storage`", JDBCType.VARCHAR);

        public final SqlColumn<Long> localityOid = column("`locality_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> maxRowsOid = column("`max_rows_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> minRowsOid = column("`min_rows_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> subPartitionsCountOid = column("`sub_partitions_count_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> valuesOid = column("`values_oid`", JDBCType.BIGINT);

        public SqlPartition() {
            super("sql_partition");
        }
    }
}