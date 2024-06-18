package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class NewExpressionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: new_expression")
    public static final NewExpression newExpression = new NewExpression();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: new_expression.element_hash_id")
    public static final SqlColumn<Long> elementHashId = newExpression.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: new_expression.reference_hash_id")
    public static final SqlColumn<Long> referenceHashId = newExpression.referenceHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: new_expression.type_hash_id")
    public static final SqlColumn<Long> typeHashId = newExpression.typeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: new_expression")
    public static final class NewExpression extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> referenceHashId = column("reference_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> typeHashId = column("type_hash_id", JDBCType.BIGINT);

        public NewExpression() {
            super("new_expression");
        }
    }
}