package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class LocalVariableDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_variable")
    public static final LocalVariable localVariable = new LocalVariable();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_variable.element_hash_id")
    public static final SqlColumn<Long> elementHashId = localVariable.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_variable.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = localVariable.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_variable.location_hash_id")
    public static final SqlColumn<Long> locationHashId = localVariable.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_variable.debug_message")
    public static final SqlColumn<String> debugMessage = localVariable.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_variable.name")
    public static final SqlColumn<String> name = localVariable.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: local_variable.index_order")
    public static final SqlColumn<Integer> indexOrder = localVariable.indexOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_variable")
    public static final class LocalVariable extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> indexOrder = column("index_order", JDBCType.INTEGER);

        public LocalVariable() {
            super("local_variable");
        }
    }
}