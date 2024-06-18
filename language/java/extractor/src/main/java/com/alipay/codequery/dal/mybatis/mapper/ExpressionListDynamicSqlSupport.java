package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ExpressionListDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list")
    public static final ExpressionList expressionList = new ExpressionList();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression_list.element_hash_id")
    public static final SqlColumn<Long> elementHashId = expressionList.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression_list.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = expressionList.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression_list.location_hash_id")
    public static final SqlColumn<Long> locationHashId = expressionList.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression_list.debug_message")
    public static final SqlColumn<String> debugMessage = expressionList.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression_list.size")
    public static final SqlColumn<Integer> size = expressionList.size;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list")
    public static final class ExpressionList extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public final SqlColumn<Integer> size = column("size", JDBCType.INTEGER);

        public ExpressionList() {
            super("expression_list");
        }
    }
}