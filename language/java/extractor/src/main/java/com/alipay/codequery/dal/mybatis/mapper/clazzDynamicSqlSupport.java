package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class clazzDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class")
    public static final clazz clazz = new clazz();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: class.element_hash_id")
    public static final SqlColumn<Long> elementHashId = clazz.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: class.qualified_name")
    public static final SqlColumn<String> qualifiedName = clazz.qualifiedName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: class.identifier_hash_id")
    public static final SqlColumn<Long> identifierHashId = clazz.identifierHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: class.location_hash_id")
    public static final SqlColumn<Long> locationHashId = clazz.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: class.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = clazz.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class")
    public static final class clazz extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> qualifiedName = column("qualified_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> identifierHashId = column("identifier_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public clazz() {
            super("class");
        }
    }
}