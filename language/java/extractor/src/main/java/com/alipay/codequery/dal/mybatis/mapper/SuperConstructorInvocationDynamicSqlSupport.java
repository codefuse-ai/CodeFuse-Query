package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SuperConstructorInvocationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_constructor_invocation")
    public static final SuperConstructorInvocation superConstructorInvocation = new SuperConstructorInvocation();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: super_constructor_invocation.element_hash_id")
    public static final SqlColumn<Long> elementHashId = superConstructorInvocation.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_constructor_invocation")
    public static final class SuperConstructorInvocation extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public SuperConstructorInvocation() {
            super("super_constructor_invocation");
        }
    }
}