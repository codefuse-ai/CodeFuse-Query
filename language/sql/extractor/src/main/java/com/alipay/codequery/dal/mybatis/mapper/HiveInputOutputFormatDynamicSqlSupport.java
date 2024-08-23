package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HiveInputOutputFormatDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    public static final HiveInputOutputFormat hiveInputOutputFormat = new HiveInputOutputFormat();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_input_output_format.oid")
    public static final SqlColumn<Long> oid = hiveInputOutputFormat.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_input_output_format.input_oid")
    public static final SqlColumn<Long> inputOid = hiveInputOutputFormat.inputOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_input_output_format.output_oid")
    public static final SqlColumn<Long> outputOid = hiveInputOutputFormat.outputOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    public static final class HiveInputOutputFormat extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> inputOid = column("`input_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> outputOid = column("`output_oid`", JDBCType.BIGINT);

        public HiveInputOutputFormat() {
            super("hive_input_output_format");
        }
    }
}