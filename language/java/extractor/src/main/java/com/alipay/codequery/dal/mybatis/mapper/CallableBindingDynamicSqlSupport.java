package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CallableBindingDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    public static final CallableBinding callableBinding = new CallableBinding();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_binding.caller_hash_id")
    public static final SqlColumn<Long> callerHashId = callableBinding.callerHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_binding.callee_hash_id")
    public static final SqlColumn<Long> calleeHashId = callableBinding.calleeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    public static final class CallableBinding extends SqlTable {
        public final SqlColumn<Long> callerHashId = column("caller_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> calleeHashId = column("callee_hash_id", JDBCType.BIGINT);

        public CallableBinding() {
            super("callable_binding");
        }
    }
}