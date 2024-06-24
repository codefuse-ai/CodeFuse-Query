package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MethodDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    public static final Method method = new Method();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method.element_hash_id")
    public static final SqlColumn<Long> elementHashId = method.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method.name")
    public static final SqlColumn<String> name = method.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method.signature")
    public static final SqlColumn<String> signature = method.signature;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method.type_hash_id")
    public static final SqlColumn<Long> typeHashId = method.typeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = method.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method.location_hash_id")
    public static final SqlColumn<Long> locationHashId = method.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method.definition_body")
    public static final SqlColumn<String> definitionBody = method.definitionBody;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    public static final class Method extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> signature = column("signature", JDBCType.VARCHAR);

        public final SqlColumn<Long> typeHashId = column("type_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> definitionBody = column("definition_body", JDBCType.VARCHAR);

        public Method() {
            super("method");
        }
    }
}