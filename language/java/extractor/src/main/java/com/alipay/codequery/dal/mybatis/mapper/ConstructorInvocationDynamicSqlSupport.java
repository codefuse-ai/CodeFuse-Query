package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ConstructorInvocationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    public static final ConstructorInvocation constructorInvocation = new ConstructorInvocation();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: constructor_invocation.element_hash_id")
    public static final SqlColumn<Long> elementHashId = constructorInvocation.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: constructor_invocation.class_reference_hash_id")
    public static final SqlColumn<Long> classReferenceHashId = constructorInvocation.classReferenceHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    public static final class ConstructorInvocation extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> classReferenceHashId = column("class_reference_hash_id", JDBCType.BIGINT);

        public ConstructorInvocation() {
            super("constructor_invocation");
        }
    }
}