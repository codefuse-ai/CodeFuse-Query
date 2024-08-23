package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleDataTypeIntervalYearDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_year")
    public static final OracleDataTypeIntervalYear oracleDataTypeIntervalYear = new OracleDataTypeIntervalYear();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_data_type_interval_year.oid")
    public static final SqlColumn<Long> oid = oracleDataTypeIntervalYear.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_year")
    public static final class OracleDataTypeIntervalYear extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public OracleDataTypeIntervalYear() {
            super("oracle_data_type_interval_year");
        }
    }
}