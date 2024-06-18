package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EnumConstantDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    public static final EnumConstant enumConstant = new EnumConstant();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: enum_constant.element_hash_id")
    public static final SqlColumn<Long> elementHashId = enumConstant.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: enum_constant.name")
    public static final SqlColumn<String> name = enumConstant.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: enum_constant.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = enumConstant.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: enum_constant.location_hash_id")
    public static final SqlColumn<Long> locationHashId = enumConstant.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: enum_constant.debug_message")
    public static final SqlColumn<String> debugMessage = enumConstant.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    public static final class EnumConstant extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public EnumConstant() {
            super("enum_constant");
        }
    }
}