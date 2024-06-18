package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ClassInitializerDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    public static final ClassInitializer classInitializer = new ClassInitializer();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: class_initializer.element_hash_id")
    public static final SqlColumn<Long> elementHashId = classInitializer.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: class_initializer.debug_message")
    public static final SqlColumn<String> debugMessage = classInitializer.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: class_initializer.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = classInitializer.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: class_initializer.location_hash_id")
    public static final SqlColumn<Long> locationHashId = classInitializer.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    public static final class ClassInitializer extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public ClassInitializer() {
            super("class_initializer");
        }
    }
}