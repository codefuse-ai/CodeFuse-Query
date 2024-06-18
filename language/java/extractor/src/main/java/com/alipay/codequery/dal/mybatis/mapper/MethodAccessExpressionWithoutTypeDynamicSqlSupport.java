package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MethodAccessExpressionWithoutTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_without_type")
    public static final MethodAccessExpressionWithoutType methodAccessExpressionWithoutType = new MethodAccessExpressionWithoutType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_access_expression_without_type.element_hash_id")
    public static final SqlColumn<Long> elementHashId = methodAccessExpressionWithoutType.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_access_expression_without_type.referen_method_hash_id")
    public static final SqlColumn<Long> referenMethodHashId = methodAccessExpressionWithoutType.referenMethodHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_access_expression_without_type.argument_list_hash_id")
    public static final SqlColumn<Long> argumentListHashId = methodAccessExpressionWithoutType.argumentListHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_without_type")
    public static final class MethodAccessExpressionWithoutType extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> referenMethodHashId = column("referen_method_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> argumentListHashId = column("argument_list_hash_id", JDBCType.BIGINT);

        public MethodAccessExpressionWithoutType() {
            super("method_access_expression_without_type");
        }
    }
}