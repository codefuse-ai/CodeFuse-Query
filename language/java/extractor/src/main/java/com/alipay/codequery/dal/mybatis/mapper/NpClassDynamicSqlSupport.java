package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class NpClassDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    public static final NpClass npClass = new NpClass();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: np_class.element_hash_id")
    public static final SqlColumn<Long> elementHashId = npClass.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: np_class.name")
    public static final SqlColumn<String> name = npClass.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: np_class.qualified_name")
    public static final SqlColumn<String> qualifiedName = npClass.qualifiedName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: np_class.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = npClass.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    public static final class NpClass extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> qualifiedName = column("qualified_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public NpClass() {
            super("np_class");
        }
    }
}