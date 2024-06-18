package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TypeParameterDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    public static final TypeParameter typeParameter = new TypeParameter();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_parameter.element_hash_id")
    public static final SqlColumn<Long> elementHashId = typeParameter.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_parameter.debug_message")
    public static final SqlColumn<String> debugMessage = typeParameter.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_parameter.owner_hash_id")
    public static final SqlColumn<Long> ownerHashId = typeParameter.ownerHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_parameter.index_order")
    public static final SqlColumn<Integer> indexOrder = typeParameter.indexOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_parameter.extends_list_hash_id")
    public static final SqlColumn<Long> extendsListHashId = typeParameter.extendsListHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_parameter.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = typeParameter.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_parameter.location_hash_id")
    public static final SqlColumn<Long> locationHashId = typeParameter.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    public static final class TypeParameter extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public final SqlColumn<Long> ownerHashId = column("owner_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> indexOrder = column("index_order", JDBCType.INTEGER);

        public final SqlColumn<Long> extendsListHashId = column("extends_list_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public TypeParameter() {
            super("type_parameter");
        }
    }
}