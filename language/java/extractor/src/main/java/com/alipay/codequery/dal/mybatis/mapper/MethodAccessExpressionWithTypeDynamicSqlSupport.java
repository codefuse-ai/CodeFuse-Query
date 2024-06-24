package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MethodAccessExpressionWithTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    public static final MethodAccessExpressionWithType methodAccessExpressionWithType = new MethodAccessExpressionWithType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_access_expression_with_type.element_hash_id")
    public static final SqlColumn<Long> elementHashId = methodAccessExpressionWithType.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_access_expression_with_type.type_hash_id")
    public static final SqlColumn<Long> typeHashId = methodAccessExpressionWithType.typeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_access_expression_with_type.referen_method_hash_id")
    public static final SqlColumn<Long> referenMethodHashId = methodAccessExpressionWithType.referenMethodHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_access_expression_with_type.argument_list_hash_id")
    public static final SqlColumn<Long> argumentListHashId = methodAccessExpressionWithType.argumentListHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    public static final class MethodAccessExpressionWithType extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> typeHashId = column("type_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> referenMethodHashId = column("referen_method_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> argumentListHashId = column("argument_list_hash_id", JDBCType.BIGINT);

        public MethodAccessExpressionWithType() {
            super("method_access_expression_with_type");
        }
    }
}