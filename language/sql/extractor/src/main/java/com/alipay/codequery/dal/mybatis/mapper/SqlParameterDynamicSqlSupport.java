package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlParameterDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    public static final SqlParameter sqlParameter = new SqlParameter();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.oid")
    public static final SqlColumn<Long> oid = sqlParameter.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.cursor_name_oid")
    public static final SqlColumn<Long> cursorNameOid = sqlParameter.cursorNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.data_type_oid")
    public static final SqlColumn<Long> dataTypeOid = sqlParameter.dataTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.default_value_oid")
    public static final SqlColumn<Long> defaultValueOid = sqlParameter.defaultValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.is_constant")
    public static final SqlColumn<Integer> isConstant = sqlParameter.isConstant;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.is_map")
    public static final SqlColumn<Integer> isMap = sqlParameter.isMap;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.is_member")
    public static final SqlColumn<Integer> isMember = sqlParameter.isMember;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.is_no_copy")
    public static final SqlColumn<Integer> isNoCopy = sqlParameter.isNoCopy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.is_order")
    public static final SqlColumn<Integer> isOrder = sqlParameter.isOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.name_oid")
    public static final SqlColumn<Long> nameOid = sqlParameter.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.param_type")
    public static final SqlColumn<String> paramType = sqlParameter.paramType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    public static final class SqlParameter extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> cursorNameOid = column("`cursor_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dataTypeOid = column("`data_type_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> defaultValueOid = column("`default_value_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isConstant = column("`is_constant`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isMap = column("`is_map`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isMember = column("`is_member`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNoCopy = column("`is_no_copy`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOrder = column("`is_order`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> paramType = column("`param_type`", JDBCType.VARCHAR);

        public SqlParameter() {
            super("sql_parameter");
        }
    }
}