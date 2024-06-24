package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ParameterDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    public static final Parameter parameter = new Parameter();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: parameter.element_hash_id")
    public static final SqlColumn<Long> elementHashId = parameter.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: parameter.name")
    public static final SqlColumn<String> name = parameter.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: parameter.index_order")
    public static final SqlColumn<Integer> indexOrder = parameter.indexOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: parameter.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = parameter.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: parameter.location_hash_id")
    public static final SqlColumn<Long> locationHashId = parameter.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: parameter.debug_message")
    public static final SqlColumn<String> debugMessage = parameter.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: parameter.type_hash_id")
    public static final SqlColumn<Long> typeHashId = parameter.typeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    public static final class Parameter extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> indexOrder = column("index_order", JDBCType.INTEGER);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public final SqlColumn<Long> typeHashId = column("type_hash_id", JDBCType.BIGINT);

        public Parameter() {
            super("parameter");
        }
    }
}