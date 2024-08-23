package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlMapDataTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_map_data_type")
    public static final SqlMapDataType sqlMapDataType = new SqlMapDataType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_map_data_type.oid")
    public static final SqlColumn<Long> oid = sqlMapDataType.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_map_data_type.is_int")
    public static final SqlColumn<Integer> isInt = sqlMapDataType.isInt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_map_data_type.is_numberic")
    public static final SqlColumn<Integer> isNumberic = sqlMapDataType.isNumberic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_map_data_type.is_string")
    public static final SqlColumn<Integer> isString = sqlMapDataType.isString;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_map_data_type.is_with_local_time_zone")
    public static final SqlColumn<Integer> isWithLocalTimeZone = sqlMapDataType.isWithLocalTimeZone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_map_data_type.key_type_oid")
    public static final SqlColumn<Long> keyTypeOid = sqlMapDataType.keyTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_map_data_type.name")
    public static final SqlColumn<String> name = sqlMapDataType.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_map_data_type.value_type_oid")
    public static final SqlColumn<Long> valueTypeOid = sqlMapDataType.valueTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_map_data_type.with_time_zone")
    public static final SqlColumn<Integer> withTimeZone = sqlMapDataType.withTimeZone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_map_data_type")
    public static final class SqlMapDataType extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isInt = column("`is_int`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNumberic = column("`is_numberic`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isString = column("`is_string`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithLocalTimeZone = column("`is_with_local_time_zone`", JDBCType.BIGINT);

        public final SqlColumn<Long> keyTypeOid = column("`key_type_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("`name`", JDBCType.VARCHAR);

        public final SqlColumn<Long> valueTypeOid = column("`value_type_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> withTimeZone = column("`with_time_zone`", JDBCType.BIGINT);

        public SqlMapDataType() {
            super("sql_map_data_type");
        }
    }
}