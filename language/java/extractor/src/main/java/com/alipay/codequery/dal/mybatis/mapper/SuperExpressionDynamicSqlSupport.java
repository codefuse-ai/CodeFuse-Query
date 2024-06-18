package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SuperExpressionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression")
    public static final SuperExpression superExpression = new SuperExpression();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: super_expression.element_hash_id")
    public static final SqlColumn<Long> elementHashId = superExpression.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression")
    public static final class SuperExpression extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public SuperExpression() {
            super("super_expression");
        }
    }
}