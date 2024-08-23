package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HiveLoadDataStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    public static final HiveLoadDataStatement hiveLoadDataStatement = new HiveLoadDataStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.oid")
    public static final SqlColumn<Long> oid = hiveLoadDataStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.format_oid")
    public static final SqlColumn<Long> formatOid = hiveLoadDataStatement.formatOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.inpath_oid")
    public static final SqlColumn<Long> inpathOid = hiveLoadDataStatement.inpathOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.into_oid")
    public static final SqlColumn<Long> intoOid = hiveLoadDataStatement.intoOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.is_local")
    public static final SqlColumn<Integer> isLocal = hiveLoadDataStatement.isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.is_overwrite")
    public static final SqlColumn<Integer> isOverwrite = hiveLoadDataStatement.isOverwrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.row_format_oid")
    public static final SqlColumn<Long> rowFormatOid = hiveLoadDataStatement.rowFormatOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.serde_properties")
    public static final SqlColumn<String> serdeProperties = hiveLoadDataStatement.serdeProperties;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.stored_as_oid")
    public static final SqlColumn<Long> storedAsOid = hiveLoadDataStatement.storedAsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.stored_by_oid")
    public static final SqlColumn<Long> storedByOid = hiveLoadDataStatement.storedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.using_oid")
    public static final SqlColumn<Long> usingOid = hiveLoadDataStatement.usingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    public static final class HiveLoadDataStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> formatOid = column("`format_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> inpathOid = column("`inpath_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> intoOid = column("`into_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLocal = column("`is_local`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOverwrite = column("`is_overwrite`", JDBCType.BIGINT);

        public final SqlColumn<Long> rowFormatOid = column("`row_format_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> serdeProperties = column("`serde_properties`", JDBCType.VARCHAR);

        public final SqlColumn<Long> storedAsOid = column("`stored_as_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> storedByOid = column("`stored_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> usingOid = column("`using_oid`", JDBCType.BIGINT);

        public HiveLoadDataStatement() {
            super("hive_load_data_statement");
        }
    }
}