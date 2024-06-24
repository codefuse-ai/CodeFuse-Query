package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ConstructorDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor")
    public static final Constructor constructor = new Constructor();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: constructor.element_hash_id")
    public static final SqlColumn<Long> elementHashId = constructor.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: constructor.name")
    public static final SqlColumn<String> name = constructor.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: constructor.signature")
    public static final SqlColumn<String> signature = constructor.signature;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: constructor.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = constructor.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: constructor.location_hash_id")
    public static final SqlColumn<Long> locationHashId = constructor.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: constructor.definition_body")
    public static final SqlColumn<String> definitionBody = constructor.definitionBody;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor")
    public static final class Constructor extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> signature = column("signature", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> definitionBody = column("definition_body", JDBCType.VARCHAR);

        public Constructor() {
            super("constructor");
        }
    }
}