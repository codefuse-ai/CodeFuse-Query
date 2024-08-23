package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlStructDataTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_struct_data_type")
    public static final SqlStructDataType sqlStructDataType = new SqlStructDataType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_struct_data_type.oid")
    public static final SqlColumn<Long> oid = sqlStructDataType.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_struct_data_type.fields")
    public static final SqlColumn<String> fields = sqlStructDataType.fields;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_struct_data_type.is_int")
    public static final SqlColumn<Integer> isInt = sqlStructDataType.isInt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_struct_data_type.is_numberic")
    public static final SqlColumn<Integer> isNumberic = sqlStructDataType.isNumberic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_struct_data_type.is_string")
    public static final SqlColumn<Integer> isString = sqlStructDataType.isString;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_struct_data_type.is_with_local_time_zone")
    public static final SqlColumn<Integer> isWithLocalTimeZone = sqlStructDataType.isWithLocalTimeZone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_struct_data_type.name")
    public static final SqlColumn<String> name = sqlStructDataType.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_struct_data_type.with_time_zone")
    public static final SqlColumn<Integer> withTimeZone = sqlStructDataType.withTimeZone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_struct_data_type")
    public static final class SqlStructDataType extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> fields = column("`fields`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isInt = column("`is_int`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNumberic = column("`is_numberic`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isString = column("`is_string`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithLocalTimeZone = column("`is_with_local_time_zone`", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("`name`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> withTimeZone = column("`with_time_zone`", JDBCType.BIGINT);

        public SqlStructDataType() {
            super("sql_struct_data_type");
        }
    }
}