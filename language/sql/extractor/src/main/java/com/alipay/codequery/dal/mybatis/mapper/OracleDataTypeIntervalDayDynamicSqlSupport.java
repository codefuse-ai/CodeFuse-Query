package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleDataTypeIntervalDayDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    public static final OracleDataTypeIntervalDay oracleDataTypeIntervalDay = new OracleDataTypeIntervalDay();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_data_type_interval_day.oid")
    public static final SqlColumn<Long> oid = oracleDataTypeIntervalDay.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_data_type_interval_day.is_to_second")
    public static final SqlColumn<Integer> isToSecond = oracleDataTypeIntervalDay.isToSecond;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    public static final class OracleDataTypeIntervalDay extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isToSecond = column("`is_to_second`", JDBCType.BIGINT);

        public OracleDataTypeIntervalDay() {
            super("oracle_data_type_interval_day");
        }
    }
}