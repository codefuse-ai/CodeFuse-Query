package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlArrayDataTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_array_data_type")
    public static final SqlArrayDataType sqlArrayDataType = new SqlArrayDataType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.oid")
    public static final SqlColumn<Long> oid = sqlArrayDataType.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.component_type_oid")
    public static final SqlColumn<Long> componentTypeOid = sqlArrayDataType.componentTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.is_int")
    public static final SqlColumn<Integer> isInt = sqlArrayDataType.isInt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.is_numberic")
    public static final SqlColumn<Integer> isNumberic = sqlArrayDataType.isNumberic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.is_string")
    public static final SqlColumn<Integer> isString = sqlArrayDataType.isString;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.is_with_local_time_zone")
    public static final SqlColumn<Integer> isWithLocalTimeZone = sqlArrayDataType.isWithLocalTimeZone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.name")
    public static final SqlColumn<String> name = sqlArrayDataType.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.with_time_zone")
    public static final SqlColumn<Integer> withTimeZone = sqlArrayDataType.withTimeZone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_array_data_type")
    public static final class SqlArrayDataType extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> componentTypeOid = column("`component_type_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isInt = column("`is_int`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNumberic = column("`is_numberic`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isString = column("`is_string`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithLocalTimeZone = column("`is_with_local_time_zone`", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("`name`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> withTimeZone = column("`with_time_zone`", JDBCType.BIGINT);

        public SqlArrayDataType() {
            super("sql_array_data_type");
        }
    }
}