package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlTableDataTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    public static final SqlTableDataType sqlTableDataType = new SqlTableDataType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_data_type.oid")
    public static final SqlColumn<Long> oid = sqlTableDataType.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_data_type.is_int")
    public static final SqlColumn<Integer> isInt = sqlTableDataType.isInt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_data_type.is_numberic")
    public static final SqlColumn<Integer> isNumberic = sqlTableDataType.isNumberic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_data_type.is_string")
    public static final SqlColumn<Integer> isString = sqlTableDataType.isString;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_data_type.is_with_local_time_zone")
    public static final SqlColumn<Integer> isWithLocalTimeZone = sqlTableDataType.isWithLocalTimeZone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_data_type.name")
    public static final SqlColumn<String> name = sqlTableDataType.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_data_type.with_time_zone")
    public static final SqlColumn<Integer> withTimeZone = sqlTableDataType.withTimeZone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    public static final class SqlTableDataType extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isInt = column("`is_int`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNumberic = column("`is_numberic`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isString = column("`is_string`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithLocalTimeZone = column("`is_with_local_time_zone`", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("`name`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> withTimeZone = column("`with_time_zone`", JDBCType.BIGINT);

        public SqlTableDataType() {
            super("sql_table_data_type");
        }
    }
}