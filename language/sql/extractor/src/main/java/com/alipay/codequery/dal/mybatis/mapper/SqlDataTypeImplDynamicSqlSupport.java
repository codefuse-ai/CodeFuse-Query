package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDataTypeImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    public static final SqlDataTypeImpl sqlDataTypeImpl = new SqlDataTypeImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.oid")
    public static final SqlColumn<Long> oid = sqlDataTypeImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.index_by_oid")
    public static final SqlColumn<Long> indexByOid = sqlDataTypeImpl.indexByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_int")
    public static final SqlColumn<Integer> isInt = sqlDataTypeImpl.isInt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_numberic")
    public static final SqlColumn<Integer> isNumberic = sqlDataTypeImpl.isNumberic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_string")
    public static final SqlColumn<Integer> isString = sqlDataTypeImpl.isString;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_unsigned")
    public static final SqlColumn<Integer> isUnsigned = sqlDataTypeImpl.isUnsigned;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_with_local_time_zone")
    public static final SqlColumn<Integer> isWithLocalTimeZone = sqlDataTypeImpl.isWithLocalTimeZone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_zerofill")
    public static final SqlColumn<Integer> isZerofill = sqlDataTypeImpl.isZerofill;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.name")
    public static final SqlColumn<String> name = sqlDataTypeImpl.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.with_time_zone")
    public static final SqlColumn<Integer> withTimeZone = sqlDataTypeImpl.withTimeZone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    public static final class SqlDataTypeImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> indexByOid = column("`index_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isInt = column("`is_int`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNumberic = column("`is_numberic`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isString = column("`is_string`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isUnsigned = column("`is_unsigned`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithLocalTimeZone = column("`is_with_local_time_zone`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isZerofill = column("`is_zerofill`", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("`name`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> withTimeZone = column("`with_time_zone`", JDBCType.BIGINT);

        public SqlDataTypeImpl() {
            super("sql_data_type_impl");
        }
    }
}