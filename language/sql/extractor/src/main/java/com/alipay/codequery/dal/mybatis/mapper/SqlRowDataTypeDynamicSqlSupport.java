package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlRowDataTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    public static final SqlRowDataType sqlRowDataType = new SqlRowDataType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_row_data_type.oid")
    public static final SqlColumn<Long> oid = sqlRowDataType.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_row_data_type.fields")
    public static final SqlColumn<String> fields = sqlRowDataType.fields;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_row_data_type.is_int")
    public static final SqlColumn<Integer> isInt = sqlRowDataType.isInt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_row_data_type.is_numberic")
    public static final SqlColumn<Integer> isNumberic = sqlRowDataType.isNumberic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_row_data_type.is_string")
    public static final SqlColumn<Integer> isString = sqlRowDataType.isString;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_row_data_type.is_with_local_time_zone")
    public static final SqlColumn<Integer> isWithLocalTimeZone = sqlRowDataType.isWithLocalTimeZone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_row_data_type.name")
    public static final SqlColumn<String> name = sqlRowDataType.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_row_data_type.with_time_zone")
    public static final SqlColumn<Integer> withTimeZone = sqlRowDataType.withTimeZone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    public static final class SqlRowDataType extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> fields = column("`fields`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isInt = column("`is_int`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNumberic = column("`is_numberic`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isString = column("`is_string`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithLocalTimeZone = column("`is_with_local_time_zone`", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("`name`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> withTimeZone = column("`with_time_zone`", JDBCType.BIGINT);

        public SqlRowDataType() {
            super("sql_row_data_type");
        }
    }
}