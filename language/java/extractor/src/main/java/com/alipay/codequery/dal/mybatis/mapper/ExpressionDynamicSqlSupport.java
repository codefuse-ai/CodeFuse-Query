package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ExpressionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression")
    public static final Expression expression = new Expression();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression.element_hash_id")
    public static final SqlColumn<Long> elementHashId = expression.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression.name")
    public static final SqlColumn<String> name = expression.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = expression.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression.index_order")
    public static final SqlColumn<Integer> indexOrder = expression.indexOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression.location_hash_id")
    public static final SqlColumn<Long> locationHashId = expression.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression.debug_message")
    public static final SqlColumn<String> debugMessage = expression.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression")
    public static final class Expression extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> indexOrder = column("index_order", JDBCType.INTEGER);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public Expression() {
            super("expression");
        }
    }
}