package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class LocalClassDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    public static final LocalClass localClass = new LocalClass();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_class.element_hash_id")
    public static final SqlColumn<Long> elementHashId = localClass.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_class.name")
    public static final SqlColumn<String> name = localClass.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_class.debug_message")
    public static final SqlColumn<String> debugMessage = localClass.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_class.location_hash_id")
    public static final SqlColumn<Long> locationHashId = localClass.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_class.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = localClass.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    public static final class LocalClass extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public LocalClass() {
            super("local_class");
        }
    }
}