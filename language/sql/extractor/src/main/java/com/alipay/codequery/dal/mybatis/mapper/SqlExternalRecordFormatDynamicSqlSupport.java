package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlExternalRecordFormatDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    public static final SqlExternalRecordFormat sqlExternalRecordFormat = new SqlExternalRecordFormat();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.oid")
    public static final SqlColumn<Long> oid = sqlExternalRecordFormat.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.badfile")
    public static final SqlColumn<Integer> badfile = sqlExternalRecordFormat.badfile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.collection_items_terminated_by_oid")
    public static final SqlColumn<Long> collectionItemsTerminatedByOid = sqlExternalRecordFormat.collectionItemsTerminatedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.delimited_by_oid")
    public static final SqlColumn<Long> delimitedByOid = sqlExternalRecordFormat.delimitedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.escaped_by_oid")
    public static final SqlColumn<Long> escapedByOid = sqlExternalRecordFormat.escapedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.is_ltrim")
    public static final SqlColumn<Integer> isLtrim = sqlExternalRecordFormat.isLtrim;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.is_missing_field_values_are_null")
    public static final SqlColumn<Integer> isMissingFieldValuesAreNull = sqlExternalRecordFormat.isMissingFieldValuesAreNull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.is_reject_rows_with_all_null_fields")
    public static final SqlColumn<Integer> isRejectRowsWithAllNullFields = sqlExternalRecordFormat.isRejectRowsWithAllNullFields;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.lines_terminated_by_oid")
    public static final SqlColumn<Long> linesTerminatedByOid = sqlExternalRecordFormat.linesTerminatedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.logfile")
    public static final SqlColumn<Integer> logfile = sqlExternalRecordFormat.logfile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.map_keys_terminated_by_oid")
    public static final SqlColumn<Long> mapKeysTerminatedByOid = sqlExternalRecordFormat.mapKeysTerminatedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.null_defined_as_oid")
    public static final SqlColumn<Long> nullDefinedAsOid = sqlExternalRecordFormat.nullDefinedAsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.serde_oid")
    public static final SqlColumn<Long> serdeOid = sqlExternalRecordFormat.serdeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.terminated_by_oid")
    public static final SqlColumn<Long> terminatedByOid = sqlExternalRecordFormat.terminatedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    public static final class SqlExternalRecordFormat extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> badfile = column("`badfile`", JDBCType.BIGINT);

        public final SqlColumn<Long> collectionItemsTerminatedByOid = column("`collection_items_terminated_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> delimitedByOid = column("`delimited_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> escapedByOid = column("`escaped_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLtrim = column("`is_ltrim`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isMissingFieldValuesAreNull = column("`is_missing_field_values_are_null`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRejectRowsWithAllNullFields = column("`is_reject_rows_with_all_null_fields`", JDBCType.BIGINT);

        public final SqlColumn<Long> linesTerminatedByOid = column("`lines_terminated_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> logfile = column("`logfile`", JDBCType.BIGINT);

        public final SqlColumn<Long> mapKeysTerminatedByOid = column("`map_keys_terminated_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nullDefinedAsOid = column("`null_defined_as_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> serdeOid = column("`serde_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> terminatedByOid = column("`terminated_by_oid`", JDBCType.BIGINT);

        public SqlExternalRecordFormat() {
            super("sql_external_record_format");
        }
    }
}